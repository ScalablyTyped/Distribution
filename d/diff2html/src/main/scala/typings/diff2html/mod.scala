package typings.diff2html

import typings.diff2html.diffParserMod.DiffParserConfig
import typings.diff2html.hoganjsUtilsMod.HoganJsUtilsConfig
import typings.diff2html.lineByLineRendererMod.LineByLineRendererConfig
import typings.diff2html.typesMod.DiffFile
import typings.diff2html.typesMod.DiffStyleType
import typings.diff2html.typesMod.LineMatchingType
import typings.diff2html.typesMod.OutputFormatType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object defaultDiff2HtmlConfig {
    
    @JSImport("diff2html", "defaultDiff2HtmlConfig")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("diff2html", "defaultDiff2HtmlConfig.diffStyle")
    @js.native
    def diffStyle: DiffStyleType = js.native
    @scala.inline
    def diffStyle_=(x: DiffStyleType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("diffStyle")(x.asInstanceOf[js.Any])
    
    @JSImport("diff2html", "defaultDiff2HtmlConfig.drawFileList")
    @js.native
    def drawFileList: Boolean = js.native
    @scala.inline
    def drawFileList_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("drawFileList")(x.asInstanceOf[js.Any])
    
    @JSImport("diff2html", "defaultDiff2HtmlConfig.matchWordsThreshold")
    @js.native
    def matchWordsThreshold: Double = js.native
    @scala.inline
    def matchWordsThreshold_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("matchWordsThreshold")(x.asInstanceOf[js.Any])
    
    @JSImport("diff2html", "defaultDiff2HtmlConfig.matching")
    @js.native
    def matching: LineMatchingType = js.native
    
    @JSImport("diff2html", "defaultDiff2HtmlConfig.matchingMaxComparisons")
    @js.native
    def matchingMaxComparisons: Double = js.native
    @scala.inline
    def matchingMaxComparisons_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("matchingMaxComparisons")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def matching_=(x: LineMatchingType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("matching")(x.asInstanceOf[js.Any])
    
    @JSImport("diff2html", "defaultDiff2HtmlConfig.maxLineLengthHighlight")
    @js.native
    def maxLineLengthHighlight: Double = js.native
    @scala.inline
    def maxLineLengthHighlight_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("maxLineLengthHighlight")(x.asInstanceOf[js.Any])
    
    @JSImport("diff2html", "defaultDiff2HtmlConfig.maxLineSizeInBlockForComparison")
    @js.native
    def maxLineSizeInBlockForComparison: Double = js.native
    @scala.inline
    def maxLineSizeInBlockForComparison_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("maxLineSizeInBlockForComparison")(x.asInstanceOf[js.Any])
    
    @JSImport("diff2html", "defaultDiff2HtmlConfig.outputFormat")
    @js.native
    def outputFormat: OutputFormatType = js.native
    @scala.inline
    def outputFormat_=(x: OutputFormatType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("outputFormat")(x.asInstanceOf[js.Any])
    
    @JSImport("diff2html", "defaultDiff2HtmlConfig.renderNothingWhenEmpty")
    @js.native
    def renderNothingWhenEmpty: Boolean = js.native
    @scala.inline
    def renderNothingWhenEmpty_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("renderNothingWhenEmpty")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("diff2html", "html")
  @js.native
  def html(diffInput: String): String = js.native
  @JSImport("diff2html", "html")
  @js.native
  def html(diffInput: String, configuration: Diff2HtmlConfig): String = js.native
  @JSImport("diff2html", "html")
  @js.native
  def html(diffInput: js.Array[DiffFile]): String = js.native
  @JSImport("diff2html", "html")
  @js.native
  def html(diffInput: js.Array[DiffFile], configuration: Diff2HtmlConfig): String = js.native
  
  @JSImport("diff2html", "parse")
  @js.native
  def parse(diffInput: String): js.Array[DiffFile] = js.native
  @JSImport("diff2html", "parse")
  @js.native
  def parse(diffInput: String, configuration: Diff2HtmlConfig): js.Array[DiffFile] = js.native
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.diff2html.renderUtilsMod.RenderConfig because Already inherited
  - typings.diff2html.sideBySideRendererMod.SideBySideRendererConfig because var conflicts: diffStyle, matchWordsThreshold, matching, matchingMaxComparisons, maxLineLengthHighlight, maxLineSizeInBlockForComparison, renderNothingWhenEmpty. Inlined  */ @js.native
  trait Diff2HtmlConfig
    extends LineByLineRendererConfig
       with DiffParserConfig
       with HoganJsUtilsConfig {
    
    var drawFileList: js.UndefOr[Boolean] = js.native
    
    var outputFormat: js.UndefOr[OutputFormatType] = js.native
  }
  object Diff2HtmlConfig {
    
    @scala.inline
    def apply(): Diff2HtmlConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Diff2HtmlConfig]
    }
    
    @scala.inline
    implicit class Diff2HtmlConfigMutableBuilder[Self <: Diff2HtmlConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDrawFileList(value: Boolean): Self = StObject.set(x, "drawFileList", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDrawFileListUndefined: Self = StObject.set(x, "drawFileList", js.undefined)
      
      @scala.inline
      def setOutputFormat(value: OutputFormatType): Self = StObject.set(x, "outputFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutputFormatUndefined: Self = StObject.set(x, "outputFormat", js.undefined)
    }
  }
}
