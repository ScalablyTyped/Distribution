package typings.diff2html

import typings.diff2html.diff2htmlUiBaseMod.Diff2HtmlUIConfig
import typings.diff2html.typesMod.DiffFile
import typings.diff2html.typesMod.DiffStyleType
import typings.diff2html.typesMod.LineMatchingType
import typings.diff2html.typesMod.OutputFormatType
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object diff2htmlUiMod {
  
  @JSImport("diff2html/lib/ui/js/diff2html-ui", "Diff2HtmlUI")
  @js.native
  class Diff2HtmlUI protected ()
    extends typings.diff2html.diff2htmlUiBaseMod.Diff2HtmlUI {
    def this(target: HTMLElement) = this()
    def this(target: HTMLElement, diffInput: String) = this()
    def this(target: HTMLElement, diffInput: js.Array[DiffFile]) = this()
    def this(target: HTMLElement, diffInput: String, config: Diff2HtmlUIConfig) = this()
    def this(target: HTMLElement, diffInput: js.Array[DiffFile], config: Diff2HtmlUIConfig) = this()
    def this(target: HTMLElement, diffInput: Unit, config: Diff2HtmlUIConfig) = this()
  }
  
  object defaultDiff2HtmlUIConfig {
    
    @JSImport("diff2html/lib/ui/js/diff2html-ui", "defaultDiff2HtmlUIConfig")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("diff2html/lib/ui/js/diff2html-ui", "defaultDiff2HtmlUIConfig.diffStyle")
    @js.native
    def diffStyle: DiffStyleType = js.native
    inline def diffStyle_=(x: DiffStyleType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("diffStyle")(x.asInstanceOf[js.Any])
    
    @JSImport("diff2html/lib/ui/js/diff2html-ui", "defaultDiff2HtmlUIConfig.drawFileList")
    @js.native
    def drawFileList: Boolean = js.native
    inline def drawFileList_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("drawFileList")(x.asInstanceOf[js.Any])
    
    @JSImport("diff2html/lib/ui/js/diff2html-ui", "defaultDiff2HtmlUIConfig.fileListStartVisible")
    @js.native
    def fileListStartVisible: Boolean = js.native
    inline def fileListStartVisible_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fileListStartVisible")(x.asInstanceOf[js.Any])
    
    @JSImport("diff2html/lib/ui/js/diff2html-ui", "defaultDiff2HtmlUIConfig.fileListToggle")
    @js.native
    def fileListToggle: Boolean = js.native
    inline def fileListToggle_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fileListToggle")(x.asInstanceOf[js.Any])
    
    @JSImport("diff2html/lib/ui/js/diff2html-ui", "defaultDiff2HtmlUIConfig.highlight")
    @js.native
    def highlight: Boolean = js.native
    inline def highlight_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("highlight")(x.asInstanceOf[js.Any])
    
    @JSImport("diff2html/lib/ui/js/diff2html-ui", "defaultDiff2HtmlUIConfig.matchWordsThreshold")
    @js.native
    def matchWordsThreshold: Double = js.native
    inline def matchWordsThreshold_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("matchWordsThreshold")(x.asInstanceOf[js.Any])
    
    @JSImport("diff2html/lib/ui/js/diff2html-ui", "defaultDiff2HtmlUIConfig.matching")
    @js.native
    def matching: LineMatchingType = js.native
    
    @JSImport("diff2html/lib/ui/js/diff2html-ui", "defaultDiff2HtmlUIConfig.matchingMaxComparisons")
    @js.native
    def matchingMaxComparisons: Double = js.native
    inline def matchingMaxComparisons_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("matchingMaxComparisons")(x.asInstanceOf[js.Any])
    
    inline def matching_=(x: LineMatchingType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("matching")(x.asInstanceOf[js.Any])
    
    @JSImport("diff2html/lib/ui/js/diff2html-ui", "defaultDiff2HtmlUIConfig.maxLineLengthHighlight")
    @js.native
    def maxLineLengthHighlight: Double = js.native
    inline def maxLineLengthHighlight_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("maxLineLengthHighlight")(x.asInstanceOf[js.Any])
    
    @JSImport("diff2html/lib/ui/js/diff2html-ui", "defaultDiff2HtmlUIConfig.maxLineSizeInBlockForComparison")
    @js.native
    def maxLineSizeInBlockForComparison: Double = js.native
    inline def maxLineSizeInBlockForComparison_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("maxLineSizeInBlockForComparison")(x.asInstanceOf[js.Any])
    
    @JSImport("diff2html/lib/ui/js/diff2html-ui", "defaultDiff2HtmlUIConfig.outputFormat")
    @js.native
    def outputFormat: OutputFormatType = js.native
    inline def outputFormat_=(x: OutputFormatType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("outputFormat")(x.asInstanceOf[js.Any])
    
    @JSImport("diff2html/lib/ui/js/diff2html-ui", "defaultDiff2HtmlUIConfig.renderNothingWhenEmpty")
    @js.native
    def renderNothingWhenEmpty: Boolean = js.native
    inline def renderNothingWhenEmpty_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("renderNothingWhenEmpty")(x.asInstanceOf[js.Any])
    
    @JSImport("diff2html/lib/ui/js/diff2html-ui", "defaultDiff2HtmlUIConfig.smartSelection")
    @js.native
    def smartSelection: Boolean = js.native
    inline def smartSelection_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("smartSelection")(x.asInstanceOf[js.Any])
    
    @JSImport("diff2html/lib/ui/js/diff2html-ui", "defaultDiff2HtmlUIConfig.synchronisedScroll")
    @js.native
    def synchronisedScroll: Boolean = js.native
    inline def synchronisedScroll_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("synchronisedScroll")(x.asInstanceOf[js.Any])
  }
}
