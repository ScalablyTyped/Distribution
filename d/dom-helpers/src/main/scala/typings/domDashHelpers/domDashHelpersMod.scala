package typings.domDashHelpers

import typings.domDashHelpers.utilRequestAnimationFrameMod.DomHelpersRaf
import typings.std.Document
import typings.std.Element
import typings.std.Node
import typings.std.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dom-helpers", JSImport.Namespace)
@js.native
object domDashHelpersMod extends js.Object {
  @JSName("activeElement")
  var activeElement_Original: js.Function1[/* doc */ js.UndefOr[Document], Element] = js.native
  var default: (/* import warning: ImportType.apply Failed type conversion: typeof events */ js.Any) with Anon_ActiveElement = js.native
  @JSName("ownerDocument")
  var ownerDocument_Original: js.Function1[/* node */ js.UndefOr[Node | Null], Document] = js.native
  @JSName("ownerWindow")
  var ownerWindow_Original: js.Function1[/* node */ js.UndefOr[Node | Null], Window] = js.native
  @JSName("requestAnimationFrame")
  var requestAnimationFrame_Original: DomHelpersRaf = js.native
  var style: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof _style */ js.Any = js.native
  def activeElement(): Element = js.native
  def activeElement(doc: Document): Element = js.native
  def ownerDocument(): Document = js.native
  def ownerDocument(node: Node): Document = js.native
  def ownerWindow(): Window = js.native
  def ownerWindow(node: Node): Window = js.native
  /**
    * Returns an ID for canceling
    */
  def requestAnimationFrame(callback: js.Function0[Unit]): Double = js.native
}

