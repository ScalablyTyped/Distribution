package typings.diff2html

import typings.diff2html.anon.DiffStyle
import typings.diff2html.mod.Diff2HtmlConfig
import typings.diff2html.typesMod.DiffFile
import typings.diff2html.typesMod.DiffStyleType
import typings.diff2html.typesMod.LineMatchingType
import typings.diff2html.typesMod.OutputFormatType
import typings.highlightJs.HLJSApi
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object diff2htmlUiBaseMod {
  
  @JSImport("diff2html/lib/ui/js/diff2html-ui-base", "Diff2HtmlUI")
  @js.native
  class Diff2HtmlUI protected () extends StObject {
    def this(target: HTMLElement) = this()
    def this(target: HTMLElement, diffInput: String) = this()
    def this(target: HTMLElement, diffInput: js.Array[DiffFile]) = this()
    def this(target: HTMLElement, diffInput: String, config: Diff2HtmlUIConfig) = this()
    def this(target: HTMLElement, diffInput: js.Array[DiffFile], config: Diff2HtmlUIConfig) = this()
    def this(target: HTMLElement, diffInput: Unit, config: Diff2HtmlUIConfig) = this()
    def this(target: HTMLElement, diffInput: String, config: Unit, hljs: HLJSApi) = this()
    def this(target: HTMLElement, diffInput: String, config: Diff2HtmlUIConfig, hljs: HLJSApi) = this()
    def this(target: HTMLElement, diffInput: js.Array[DiffFile], config: Unit, hljs: HLJSApi) = this()
    def this(target: HTMLElement, diffInput: js.Array[DiffFile], config: Diff2HtmlUIConfig, hljs: HLJSApi) = this()
    def this(target: HTMLElement, diffInput: Unit, config: Unit, hljs: HLJSApi) = this()
    def this(target: HTMLElement, diffInput: Unit, config: Diff2HtmlUIConfig, hljs: HLJSApi) = this()
    
    val config: DiffStyle = js.native
    
    var currentSelectionColumnId: Double = js.native
    
    val diffHtml: String = js.native
    
    def draw(): Unit = js.native
    
    def fileListToggle(startVisible: Boolean): Unit = js.native
    
    /* private */ var getHashTag: js.Any = js.native
    
    def highlightCode(): Unit = js.native
    
    val hljs: HLJSApi | Null = js.native
    
    /* private */ var instanceOfHighlightResult: js.Any = js.native
    
    /* private */ var isElement: js.Any = js.native
    
    def smartSelection(): Unit = js.native
    
    def synchronisedScroll(): Unit = js.native
    
    val targetElement: HTMLElement = js.native
  }
  
  object defaultDiff2HtmlUIConfig {
    
    @JSImport("diff2html/lib/ui/js/diff2html-ui-base", "defaultDiff2HtmlUIConfig")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("diff2html/lib/ui/js/diff2html-ui-base", "defaultDiff2HtmlUIConfig.diffStyle")
    @js.native
    def diffStyle: DiffStyleType = js.native
    inline def diffStyle_=(x: DiffStyleType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("diffStyle")(x.asInstanceOf[js.Any])
    
    @JSImport("diff2html/lib/ui/js/diff2html-ui-base", "defaultDiff2HtmlUIConfig.drawFileList")
    @js.native
    def drawFileList: Boolean = js.native
    inline def drawFileList_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("drawFileList")(x.asInstanceOf[js.Any])
    
    @JSImport("diff2html/lib/ui/js/diff2html-ui-base", "defaultDiff2HtmlUIConfig.fileListStartVisible")
    @js.native
    def fileListStartVisible: Boolean = js.native
    inline def fileListStartVisible_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fileListStartVisible")(x.asInstanceOf[js.Any])
    
    @JSImport("diff2html/lib/ui/js/diff2html-ui-base", "defaultDiff2HtmlUIConfig.fileListToggle")
    @js.native
    def fileListToggle: Boolean = js.native
    inline def fileListToggle_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fileListToggle")(x.asInstanceOf[js.Any])
    
    @JSImport("diff2html/lib/ui/js/diff2html-ui-base", "defaultDiff2HtmlUIConfig.highlight")
    @js.native
    def highlight: Boolean = js.native
    inline def highlight_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("highlight")(x.asInstanceOf[js.Any])
    
    @JSImport("diff2html/lib/ui/js/diff2html-ui-base", "defaultDiff2HtmlUIConfig.matchWordsThreshold")
    @js.native
    def matchWordsThreshold: Double = js.native
    inline def matchWordsThreshold_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("matchWordsThreshold")(x.asInstanceOf[js.Any])
    
    @JSImport("diff2html/lib/ui/js/diff2html-ui-base", "defaultDiff2HtmlUIConfig.matching")
    @js.native
    def matching: LineMatchingType = js.native
    
    @JSImport("diff2html/lib/ui/js/diff2html-ui-base", "defaultDiff2HtmlUIConfig.matchingMaxComparisons")
    @js.native
    def matchingMaxComparisons: Double = js.native
    inline def matchingMaxComparisons_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("matchingMaxComparisons")(x.asInstanceOf[js.Any])
    
    inline def matching_=(x: LineMatchingType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("matching")(x.asInstanceOf[js.Any])
    
    @JSImport("diff2html/lib/ui/js/diff2html-ui-base", "defaultDiff2HtmlUIConfig.maxLineLengthHighlight")
    @js.native
    def maxLineLengthHighlight: Double = js.native
    inline def maxLineLengthHighlight_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("maxLineLengthHighlight")(x.asInstanceOf[js.Any])
    
    @JSImport("diff2html/lib/ui/js/diff2html-ui-base", "defaultDiff2HtmlUIConfig.maxLineSizeInBlockForComparison")
    @js.native
    def maxLineSizeInBlockForComparison: Double = js.native
    inline def maxLineSizeInBlockForComparison_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("maxLineSizeInBlockForComparison")(x.asInstanceOf[js.Any])
    
    @JSImport("diff2html/lib/ui/js/diff2html-ui-base", "defaultDiff2HtmlUIConfig.outputFormat")
    @js.native
    def outputFormat: OutputFormatType = js.native
    inline def outputFormat_=(x: OutputFormatType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("outputFormat")(x.asInstanceOf[js.Any])
    
    @JSImport("diff2html/lib/ui/js/diff2html-ui-base", "defaultDiff2HtmlUIConfig.renderNothingWhenEmpty")
    @js.native
    def renderNothingWhenEmpty: Boolean = js.native
    inline def renderNothingWhenEmpty_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("renderNothingWhenEmpty")(x.asInstanceOf[js.Any])
    
    @JSImport("diff2html/lib/ui/js/diff2html-ui-base", "defaultDiff2HtmlUIConfig.smartSelection")
    @js.native
    def smartSelection: Boolean = js.native
    inline def smartSelection_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("smartSelection")(x.asInstanceOf[js.Any])
    
    @JSImport("diff2html/lib/ui/js/diff2html-ui-base", "defaultDiff2HtmlUIConfig.synchronisedScroll")
    @js.native
    def synchronisedScroll: Boolean = js.native
    inline def synchronisedScroll_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("synchronisedScroll")(x.asInstanceOf[js.Any])
  }
  
  trait Diff2HtmlUIConfig
    extends StObject
       with Diff2HtmlConfig {
    
    var fileListStartVisible: js.UndefOr[Boolean] = js.undefined
    
    var fileListToggle: js.UndefOr[Boolean] = js.undefined
    
    var highlight: js.UndefOr[Boolean] = js.undefined
    
    var smartSelection: js.UndefOr[Boolean] = js.undefined
    
    var synchronisedScroll: js.UndefOr[Boolean] = js.undefined
  }
  object Diff2HtmlUIConfig {
    
    inline def apply(): Diff2HtmlUIConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Diff2HtmlUIConfig]
    }
    
    extension [Self <: Diff2HtmlUIConfig](x: Self) {
      
      inline def setFileListStartVisible(value: Boolean): Self = StObject.set(x, "fileListStartVisible", value.asInstanceOf[js.Any])
      
      inline def setFileListStartVisibleUndefined: Self = StObject.set(x, "fileListStartVisible", js.undefined)
      
      inline def setFileListToggle(value: Boolean): Self = StObject.set(x, "fileListToggle", value.asInstanceOf[js.Any])
      
      inline def setFileListToggleUndefined: Self = StObject.set(x, "fileListToggle", js.undefined)
      
      inline def setHighlight(value: Boolean): Self = StObject.set(x, "highlight", value.asInstanceOf[js.Any])
      
      inline def setHighlightUndefined: Self = StObject.set(x, "highlight", js.undefined)
      
      inline def setSmartSelection(value: Boolean): Self = StObject.set(x, "smartSelection", value.asInstanceOf[js.Any])
      
      inline def setSmartSelectionUndefined: Self = StObject.set(x, "smartSelection", js.undefined)
      
      inline def setSynchronisedScroll(value: Boolean): Self = StObject.set(x, "synchronisedScroll", value.asInstanceOf[js.Any])
      
      inline def setSynchronisedScrollUndefined: Self = StObject.set(x, "synchronisedScroll", js.undefined)
    }
  }
}
