package typings.diff2html

import typings.diff2html.rematchMod.MatcherFn
import typings.diff2html.renderUtilsMod.CSSLineClass
import typings.diff2html.renderUtilsMod.RenderConfig
import typings.diff2html.typesMod.DiffBlock
import typings.diff2html.typesMod.DiffFile
import typings.diff2html.typesMod.DiffLine
import typings.diff2html.typesMod.DiffLineContent
import typings.diff2html.typesMod.DiffLineContext
import typings.diff2html.typesMod.DiffLineDeleted
import typings.diff2html.typesMod.DiffLineInserted
import typings.diff2html.typesMod.DiffStyleType
import typings.diff2html.typesMod.LineMatchingType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lineByLineRendererMod {
  
  @JSImport("diff2html/lib/line-by-line-renderer", JSImport.Default)
  @js.native
  class default protected () extends LineByLineRenderer {
    def this(hoganUtils: typings.diff2html.hoganjsUtilsMod.default) = this()
    def this(hoganUtils: typings.diff2html.hoganjsUtilsMod.default, config: LineByLineRendererConfig) = this()
  }
  
  object defaultLineByLineRendererConfig {
    
    @JSImport("diff2html/lib/line-by-line-renderer", "defaultLineByLineRendererConfig")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("diff2html/lib/line-by-line-renderer", "defaultLineByLineRendererConfig.diffStyle")
    @js.native
    def diffStyle: DiffStyleType = js.native
    @scala.inline
    def diffStyle_=(x: DiffStyleType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("diffStyle")(x.asInstanceOf[js.Any])
    
    @JSImport("diff2html/lib/line-by-line-renderer", "defaultLineByLineRendererConfig.matchWordsThreshold")
    @js.native
    def matchWordsThreshold: Double = js.native
    @scala.inline
    def matchWordsThreshold_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("matchWordsThreshold")(x.asInstanceOf[js.Any])
    
    @JSImport("diff2html/lib/line-by-line-renderer", "defaultLineByLineRendererConfig.matching")
    @js.native
    def matching: LineMatchingType = js.native
    
    @JSImport("diff2html/lib/line-by-line-renderer", "defaultLineByLineRendererConfig.matchingMaxComparisons")
    @js.native
    def matchingMaxComparisons: Double = js.native
    @scala.inline
    def matchingMaxComparisons_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("matchingMaxComparisons")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def matching_=(x: LineMatchingType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("matching")(x.asInstanceOf[js.Any])
    
    @JSImport("diff2html/lib/line-by-line-renderer", "defaultLineByLineRendererConfig.maxLineLengthHighlight")
    @js.native
    def maxLineLengthHighlight: Double = js.native
    @scala.inline
    def maxLineLengthHighlight_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("maxLineLengthHighlight")(x.asInstanceOf[js.Any])
    
    @JSImport("diff2html/lib/line-by-line-renderer", "defaultLineByLineRendererConfig.maxLineSizeInBlockForComparison")
    @js.native
    def maxLineSizeInBlockForComparison: Double = js.native
    @scala.inline
    def maxLineSizeInBlockForComparison_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("maxLineSizeInBlockForComparison")(x.asInstanceOf[js.Any])
    
    @JSImport("diff2html/lib/line-by-line-renderer", "defaultLineByLineRendererConfig.renderNothingWhenEmpty")
    @js.native
    def renderNothingWhenEmpty: Boolean = js.native
    @scala.inline
    def renderNothingWhenEmpty_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("renderNothingWhenEmpty")(x.asInstanceOf[js.Any])
  }
  
  type DiffLineGroups = js.Array[
    js.Tuple3[
      js.Array[DiffLineContext with DiffLineContent], 
      js.Array[DiffLineDeleted with DiffLineContent], 
      js.Array[DiffLineInserted with DiffLineContent]
    ]
  ]
  
  @js.native
  trait DiffPreparedLine extends StObject {
    
    var content: String = js.native
    
    var newNumber: js.UndefOr[Double] = js.native
    
    var oldNumber: js.UndefOr[Double] = js.native
    
    var prefix: String = js.native
    
    var `type`: CSSLineClass = js.native
  }
  object DiffPreparedLine {
    
    @scala.inline
    def apply(content: String, prefix: String, `type`: CSSLineClass): DiffPreparedLine = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[DiffPreparedLine]
    }
    
    @scala.inline
    implicit class DiffPreparedLineMutableBuilder[Self <: DiffPreparedLine] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNewNumber(value: Double): Self = StObject.set(x, "newNumber", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNewNumberUndefined: Self = StObject.set(x, "newNumber", js.undefined)
      
      @scala.inline
      def setOldNumber(value: Double): Self = StObject.set(x, "oldNumber", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOldNumberUndefined: Self = StObject.set(x, "oldNumber", js.undefined)
      
      @scala.inline
      def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: CSSLineClass): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FileHtml extends StObject {
    
    var left: String = js.native
    
    var right: String = js.native
  }
  object FileHtml {
    
    @scala.inline
    def apply(left: String, right: String): FileHtml = {
      val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
      __obj.asInstanceOf[FileHtml]
    }
    
    @scala.inline
    implicit class FileHtmlMutableBuilder[Self <: FileHtml] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLeft(value: String): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRight(value: String): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait LineByLineRenderer extends StObject {
    
    def applyLineGroupping(block: DiffBlock): DiffLineGroups = js.native
    
    def applyRematchMatching(oldLines: js.Array[DiffLine], newLines: js.Array[DiffLine], matcher: MatcherFn[DiffLine]): js.Array[js.Array[js.Array[DiffLine]]] = js.native
    
    val config: js.Any = js.native
    
    def generateEmptyDiff(): String = js.native
    
    def generateFileHtml(file: DiffFile): String = js.native
    
    def generateLineHtml(): FileHtml = js.native
    def generateLineHtml(oldLine: js.UndefOr[scala.Nothing], newLine: DiffPreparedLine): FileHtml = js.native
    def generateLineHtml(oldLine: DiffPreparedLine): FileHtml = js.native
    def generateLineHtml(oldLine: DiffPreparedLine, newLine: DiffPreparedLine): FileHtml = js.native
    
    def generateSingleLineHtml(): String = js.native
    def generateSingleLineHtml(line: DiffPreparedLine): String = js.native
    
    val hoganUtils: js.Any = js.native
    
    def makeFileDiffHtml(file: DiffFile, diffs: String): String = js.native
    
    def processChangedLines(isCombined: Boolean, oldLines: js.Array[DiffLine], newLines: js.Array[DiffLine]): FileHtml = js.native
    
    def render(diffFiles: js.Array[DiffFile]): String = js.native
  }
  
  @js.native
  trait LineByLineRendererConfig extends RenderConfig {
    
    var matchingMaxComparisons: js.UndefOr[Double] = js.native
    
    var maxLineSizeInBlockForComparison: js.UndefOr[Double] = js.native
    
    var renderNothingWhenEmpty: js.UndefOr[Boolean] = js.native
  }
  object LineByLineRendererConfig {
    
    @scala.inline
    def apply(): LineByLineRendererConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LineByLineRendererConfig]
    }
    
    @scala.inline
    implicit class LineByLineRendererConfigMutableBuilder[Self <: LineByLineRendererConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMatchingMaxComparisons(value: Double): Self = StObject.set(x, "matchingMaxComparisons", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMatchingMaxComparisonsUndefined: Self = StObject.set(x, "matchingMaxComparisons", js.undefined)
      
      @scala.inline
      def setMaxLineSizeInBlockForComparison(value: Double): Self = StObject.set(x, "maxLineSizeInBlockForComparison", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxLineSizeInBlockForComparisonUndefined: Self = StObject.set(x, "maxLineSizeInBlockForComparison", js.undefined)
      
      @scala.inline
      def setRenderNothingWhenEmpty(value: Boolean): Self = StObject.set(x, "renderNothingWhenEmpty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenderNothingWhenEmptyUndefined: Self = StObject.set(x, "renderNothingWhenEmpty", js.undefined)
    }
  }
}
