package typings.diff2html

import typings.diff2html.libRematchMod.MatcherFn
import typings.diff2html.libRenderUtilsMod.CSSLineClass
import typings.diff2html.libRenderUtilsMod.RenderConfig
import typings.diff2html.libTypesMod.DiffBlock
import typings.diff2html.libTypesMod.DiffFile
import typings.diff2html.libTypesMod.DiffLine
import typings.diff2html.libTypesMod.DiffLineContent
import typings.diff2html.libTypesMod.DiffLineContext
import typings.diff2html.libTypesMod.DiffLineDeleted
import typings.diff2html.libTypesMod.DiffLineInserted
import typings.diff2html.libTypesMod.DiffStyleType
import typings.diff2html.libTypesMod.LineMatchingType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSideBySideRendererMod {
  
  @JSImport("diff2html/lib/side-by-side-renderer", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with SideBySideRenderer {
    def this(hoganUtils: typings.diff2html.libHoganjsUtilsMod.default) = this()
    def this(hoganUtils: typings.diff2html.libHoganjsUtilsMod.default, config: SideBySideRendererConfig) = this()
  }
  
  object defaultSideBySideRendererConfig {
    
    @JSImport("diff2html/lib/side-by-side-renderer", "defaultSideBySideRendererConfig")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("diff2html/lib/side-by-side-renderer", "defaultSideBySideRendererConfig.diffStyle")
    @js.native
    def diffStyle: DiffStyleType = js.native
    inline def diffStyle_=(x: DiffStyleType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("diffStyle")(x.asInstanceOf[js.Any])
    
    @JSImport("diff2html/lib/side-by-side-renderer", "defaultSideBySideRendererConfig.matchWordsThreshold")
    @js.native
    def matchWordsThreshold: Double = js.native
    inline def matchWordsThreshold_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("matchWordsThreshold")(x.asInstanceOf[js.Any])
    
    @JSImport("diff2html/lib/side-by-side-renderer", "defaultSideBySideRendererConfig.matching")
    @js.native
    def matching: LineMatchingType = js.native
    
    @JSImport("diff2html/lib/side-by-side-renderer", "defaultSideBySideRendererConfig.matchingMaxComparisons")
    @js.native
    def matchingMaxComparisons: Double = js.native
    inline def matchingMaxComparisons_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("matchingMaxComparisons")(x.asInstanceOf[js.Any])
    
    inline def matching_=(x: LineMatchingType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("matching")(x.asInstanceOf[js.Any])
    
    @JSImport("diff2html/lib/side-by-side-renderer", "defaultSideBySideRendererConfig.maxLineLengthHighlight")
    @js.native
    def maxLineLengthHighlight: Double = js.native
    inline def maxLineLengthHighlight_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("maxLineLengthHighlight")(x.asInstanceOf[js.Any])
    
    @JSImport("diff2html/lib/side-by-side-renderer", "defaultSideBySideRendererConfig.maxLineSizeInBlockForComparison")
    @js.native
    def maxLineSizeInBlockForComparison: Double = js.native
    inline def maxLineSizeInBlockForComparison_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("maxLineSizeInBlockForComparison")(x.asInstanceOf[js.Any])
    
    @JSImport("diff2html/lib/side-by-side-renderer", "defaultSideBySideRendererConfig.renderNothingWhenEmpty")
    @js.native
    def renderNothingWhenEmpty: Boolean = js.native
    inline def renderNothingWhenEmpty_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("renderNothingWhenEmpty")(x.asInstanceOf[js.Any])
  }
  
  type DiffLineGroups = js.Array[
    js.Tuple3[
      js.Array[DiffLineContext & DiffLineContent], 
      js.Array[DiffLineDeleted & DiffLineContent], 
      js.Array[DiffLineInserted & DiffLineContent]
    ]
  ]
  
  trait DiffPreparedLine extends StObject {
    
    var content: String
    
    var number: Double
    
    var prefix: String
    
    var `type`: CSSLineClass
  }
  object DiffPreparedLine {
    
    inline def apply(content: String, number: Double, prefix: String, `type`: CSSLineClass): DiffPreparedLine = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[DiffPreparedLine]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DiffPreparedLine] (val x: Self) extends AnyVal {
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setNumber(value: Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setType(value: CSSLineClass): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait FileHtml extends StObject {
    
    var left: String
    
    var right: String
  }
  object FileHtml {
    
    inline def apply(left: String, right: String): FileHtml = {
      val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
      __obj.asInstanceOf[FileHtml]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FileHtml] (val x: Self) extends AnyVal {
      
      inline def setLeft(value: String): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setRight(value: String): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SideBySideRenderer extends StObject {
    
    def applyLineGroupping(block: DiffBlock): DiffLineGroups = js.native
    
    def applyRematchMatching(oldLines: js.Array[DiffLine], newLines: js.Array[DiffLine], matcher: MatcherFn[DiffLine]): js.Array[js.Array[js.Array[DiffLine]]] = js.native
    
    /* private */ val config: Any = js.native
    
    def generateEmptyDiff(): FileHtml = js.native
    
    def generateFileHtml(file: DiffFile): FileHtml = js.native
    
    def generateLineHtml(): FileHtml = js.native
    def generateLineHtml(oldLine: Unit, newLine: DiffPreparedLine): FileHtml = js.native
    def generateLineHtml(oldLine: DiffPreparedLine): FileHtml = js.native
    def generateLineHtml(oldLine: DiffPreparedLine, newLine: DiffPreparedLine): FileHtml = js.native
    
    def generateSingleHtml(): String = js.native
    def generateSingleHtml(line: DiffPreparedLine): String = js.native
    
    /* private */ val hoganUtils: Any = js.native
    
    def makeFileDiffHtml(file: DiffFile, diffs: FileHtml): String = js.native
    
    def makeHeaderHtml(blockHeader: String): String = js.native
    def makeHeaderHtml(blockHeader: String, file: DiffFile): String = js.native
    
    def processChangedLines(isCombined: Boolean, oldLines: js.Array[DiffLine], newLines: js.Array[DiffLine]): FileHtml = js.native
    
    def render(diffFiles: js.Array[DiffFile]): String = js.native
  }
  
  trait SideBySideRendererConfig
    extends StObject
       with RenderConfig {
    
    var matchingMaxComparisons: js.UndefOr[Double] = js.undefined
    
    var maxLineSizeInBlockForComparison: js.UndefOr[Double] = js.undefined
    
    var renderNothingWhenEmpty: js.UndefOr[Boolean] = js.undefined
  }
  object SideBySideRendererConfig {
    
    inline def apply(): SideBySideRendererConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SideBySideRendererConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SideBySideRendererConfig] (val x: Self) extends AnyVal {
      
      inline def setMatchingMaxComparisons(value: Double): Self = StObject.set(x, "matchingMaxComparisons", value.asInstanceOf[js.Any])
      
      inline def setMatchingMaxComparisonsUndefined: Self = StObject.set(x, "matchingMaxComparisons", js.undefined)
      
      inline def setMaxLineSizeInBlockForComparison(value: Double): Self = StObject.set(x, "maxLineSizeInBlockForComparison", value.asInstanceOf[js.Any])
      
      inline def setMaxLineSizeInBlockForComparisonUndefined: Self = StObject.set(x, "maxLineSizeInBlockForComparison", js.undefined)
      
      inline def setRenderNothingWhenEmpty(value: Boolean): Self = StObject.set(x, "renderNothingWhenEmpty", value.asInstanceOf[js.Any])
      
      inline def setRenderNothingWhenEmptyUndefined: Self = StObject.set(x, "renderNothingWhenEmpty", js.undefined)
    }
  }
}
