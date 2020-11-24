package typings.diff2html.diff2htmlUiBaseMod

import typings.diff2html.anon.DiffStyle
import typings.diff2html.typesMod.DiffFile
import typings.highlightJs.HLJSApi
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("diff2html/lib/ui/js/diff2html-ui-base", "Diff2HtmlUI")
@js.native
class Diff2HtmlUI protected () extends js.Object {
  def this(target: HTMLElement) = this()
  def this(target: HTMLElement, diffInput: String) = this()
  def this(target: HTMLElement, diffInput: js.Array[DiffFile]) = this()
  def this(target: HTMLElement, diffInput: js.UndefOr[scala.Nothing], config: Diff2HtmlUIConfig) = this()
  def this(target: HTMLElement, diffInput: String, config: Diff2HtmlUIConfig) = this()
  def this(target: HTMLElement, diffInput: js.Array[DiffFile], config: Diff2HtmlUIConfig) = this()
  def this(
    target: HTMLElement,
    diffInput: js.UndefOr[scala.Nothing],
    config: js.UndefOr[scala.Nothing],
    hljs: HLJSApi
  ) = this()
  def this(
    target: HTMLElement,
    diffInput: js.UndefOr[scala.Nothing],
    config: Diff2HtmlUIConfig,
    hljs: HLJSApi
  ) = this()
  def this(target: HTMLElement, diffInput: String, config: js.UndefOr[scala.Nothing], hljs: HLJSApi) = this()
  def this(target: HTMLElement, diffInput: String, config: Diff2HtmlUIConfig, hljs: HLJSApi) = this()
  def this(
    target: HTMLElement,
    diffInput: js.Array[DiffFile],
    config: js.UndefOr[scala.Nothing],
    hljs: HLJSApi
  ) = this()
  def this(target: HTMLElement, diffInput: js.Array[DiffFile], config: Diff2HtmlUIConfig, hljs: HLJSApi) = this()
  
  val config: DiffStyle = js.native
  
  var currentSelectionColumnId: Double = js.native
  
  val diffHtml: String = js.native
  
  def draw(): Unit = js.native
  
  def fileListToggle(startVisible: Boolean): Unit = js.native
  
  var getHashTag: js.Any = js.native
  
  def highlightCode(): Unit = js.native
  
  val hljs: HLJSApi | Null = js.native
  
  var instanceOfHighlightResult: js.Any = js.native
  
  var isElement: js.Any = js.native
  
  def smartSelection(): Unit = js.native
  
  def synchronisedScroll(): Unit = js.native
  
  val targetElement: HTMLElement = js.native
}
