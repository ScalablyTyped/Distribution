package typings.diff2html

import typings.diff2html.libDiffParserMod.DiffParserConfig
import typings.diff2html.libHoganjsUtilsMod.HoganJsUtilsConfig
import typings.diff2html.libLineByLineRendererMod.LineByLineRendererConfig
import typings.diff2html.libTypesMod.DiffFile
import typings.diff2html.libTypesMod.DiffStyleType
import typings.diff2html.libTypesMod.LineMatchingType
import typings.diff2html.libTypesMod.OutputFormatType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("diff2html", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object defaultDiff2HtmlConfig {
    
    @JSImport("diff2html", "defaultDiff2HtmlConfig")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("diff2html", "defaultDiff2HtmlConfig.diffStyle")
    @js.native
    def diffStyle: DiffStyleType = js.native
    inline def diffStyle_=(x: DiffStyleType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("diffStyle")(x.asInstanceOf[js.Any])
    
    @JSImport("diff2html", "defaultDiff2HtmlConfig.drawFileList")
    @js.native
    def drawFileList: Boolean = js.native
    inline def drawFileList_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("drawFileList")(x.asInstanceOf[js.Any])
    
    @JSImport("diff2html", "defaultDiff2HtmlConfig.matchWordsThreshold")
    @js.native
    def matchWordsThreshold: Double = js.native
    inline def matchWordsThreshold_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("matchWordsThreshold")(x.asInstanceOf[js.Any])
    
    @JSImport("diff2html", "defaultDiff2HtmlConfig.matching")
    @js.native
    def matching: LineMatchingType = js.native
    
    @JSImport("diff2html", "defaultDiff2HtmlConfig.matchingMaxComparisons")
    @js.native
    def matchingMaxComparisons: Double = js.native
    inline def matchingMaxComparisons_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("matchingMaxComparisons")(x.asInstanceOf[js.Any])
    
    inline def matching_=(x: LineMatchingType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("matching")(x.asInstanceOf[js.Any])
    
    @JSImport("diff2html", "defaultDiff2HtmlConfig.maxLineLengthHighlight")
    @js.native
    def maxLineLengthHighlight: Double = js.native
    inline def maxLineLengthHighlight_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("maxLineLengthHighlight")(x.asInstanceOf[js.Any])
    
    @JSImport("diff2html", "defaultDiff2HtmlConfig.maxLineSizeInBlockForComparison")
    @js.native
    def maxLineSizeInBlockForComparison: Double = js.native
    inline def maxLineSizeInBlockForComparison_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("maxLineSizeInBlockForComparison")(x.asInstanceOf[js.Any])
    
    @JSImport("diff2html", "defaultDiff2HtmlConfig.outputFormat")
    @js.native
    def outputFormat: OutputFormatType = js.native
    inline def outputFormat_=(x: OutputFormatType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("outputFormat")(x.asInstanceOf[js.Any])
    
    @JSImport("diff2html", "defaultDiff2HtmlConfig.renderNothingWhenEmpty")
    @js.native
    def renderNothingWhenEmpty: Boolean = js.native
    inline def renderNothingWhenEmpty_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("renderNothingWhenEmpty")(x.asInstanceOf[js.Any])
  }
  
  inline def html(diffInput: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("html")(diffInput.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def html(diffInput: String, configuration: Diff2HtmlConfig): String = (^.asInstanceOf[js.Dynamic].applyDynamic("html")(diffInput.asInstanceOf[js.Any], configuration.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def html(diffInput: js.Array[DiffFile]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("html")(diffInput.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def html(diffInput: js.Array[DiffFile], configuration: Diff2HtmlConfig): String = (^.asInstanceOf[js.Dynamic].applyDynamic("html")(diffInput.asInstanceOf[js.Any], configuration.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def parse(diffInput: String): js.Array[DiffFile] = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(diffInput.asInstanceOf[js.Any]).asInstanceOf[js.Array[DiffFile]]
  inline def parse(diffInput: String, configuration: Diff2HtmlConfig): js.Array[DiffFile] = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(diffInput.asInstanceOf[js.Any], configuration.asInstanceOf[js.Any])).asInstanceOf[js.Array[DiffFile]]
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.diff2html.libRenderUtilsMod.RenderConfig because Already inherited
  - typings.diff2html.libSideBySideRendererMod.SideBySideRendererConfig because var conflicts: diffStyle, matchWordsThreshold, matching, matchingMaxComparisons, maxLineLengthHighlight, maxLineSizeInBlockForComparison, renderNothingWhenEmpty. Inlined  */ trait Diff2HtmlConfig
    extends StObject
       with DiffParserConfig
       with LineByLineRendererConfig
       with HoganJsUtilsConfig {
    
    var drawFileList: js.UndefOr[Boolean] = js.undefined
    
    var outputFormat: js.UndefOr[OutputFormatType] = js.undefined
  }
  object Diff2HtmlConfig {
    
    inline def apply(): Diff2HtmlConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Diff2HtmlConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Diff2HtmlConfig] (val x: Self) extends AnyVal {
      
      inline def setDrawFileList(value: Boolean): Self = StObject.set(x, "drawFileList", value.asInstanceOf[js.Any])
      
      inline def setDrawFileListUndefined: Self = StObject.set(x, "drawFileList", js.undefined)
      
      inline def setOutputFormat(value: OutputFormatType): Self = StObject.set(x, "outputFormat", value.asInstanceOf[js.Any])
      
      inline def setOutputFormatUndefined: Self = StObject.set(x, "outputFormat", js.undefined)
    }
  }
}
