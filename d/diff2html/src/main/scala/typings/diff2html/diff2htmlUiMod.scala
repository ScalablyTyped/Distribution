package typings.diff2html

import typings.diff2html.diff2htmlUiBaseMod.Diff2HtmlUIConfig
import typings.diff2html.typesMod.DiffFile
import typings.diff2html.typesMod.DiffStyleType
import typings.diff2html.typesMod.LineMatchingType
import typings.diff2html.typesMod.OutputFormatType
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("diff2html/lib/ui/js/diff2html-ui", JSImport.Namespace)
@js.native
object diff2htmlUiMod extends js.Object {
  
  @js.native
  class Diff2HtmlUI protected ()
    extends typings.diff2html.diff2htmlUiBaseMod.Diff2HtmlUI {
    def this(target: HTMLElement) = this()
    def this(target: HTMLElement, diffInput: String) = this()
    def this(target: HTMLElement, diffInput: js.Array[DiffFile]) = this()
    def this(target: HTMLElement, diffInput: js.UndefOr[scala.Nothing], config: Diff2HtmlUIConfig) = this()
    def this(target: HTMLElement, diffInput: String, config: Diff2HtmlUIConfig) = this()
    def this(target: HTMLElement, diffInput: js.Array[DiffFile], config: Diff2HtmlUIConfig) = this()
  }
  
  @js.native
  object defaultDiff2HtmlUIConfig extends js.Object {
    
    var diffStyle: DiffStyleType = js.native
    
    var drawFileList: Boolean = js.native
    
    var fileListStartVisible: Boolean = js.native
    
    var fileListToggle: Boolean = js.native
    
    var highlight: Boolean = js.native
    
    var matchWordsThreshold: Double = js.native
    
    var matching: LineMatchingType = js.native
    
    var matchingMaxComparisons: Double = js.native
    
    var maxLineLengthHighlight: Double = js.native
    
    var maxLineSizeInBlockForComparison: Double = js.native
    
    var outputFormat: OutputFormatType = js.native
    
    var renderNothingWhenEmpty: Boolean = js.native
    
    var smartSelection: Boolean = js.native
    
    var synchronisedScroll: Boolean = js.native
  }
}
