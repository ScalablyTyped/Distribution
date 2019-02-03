package typings
package domDashHelpersLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_ActiveElementCallback extends js.Object {
  @JSName("activeElement")
  var activeElement_Original: js.Function1[/* doc */ js.UndefOr[stdLib.Document], stdLib.Element] = js.native
  var default: (/* import warning: ImportType.apply Failed type conversion: typeof events */ js.Any) with Anon_ActiveElement = js.native
  @JSName("ownerDocument")
  var ownerDocument_Original: js.Function1[/* node */ js.UndefOr[stdLib.Node | scala.Null], stdLib.Document] = js.native
  @JSName("ownerWindow")
  var ownerWindow_Original: js.Function1[/* node */ js.UndefOr[stdLib.Node | scala.Null], stdLib.Window] = js.native
  @JSName("requestAnimationFrame")
  var requestAnimationFrame_Original: domDashHelpersLib.utilRequestAnimationFrameMod.DomHelpersRaf = js.native
  var style: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof _style */ js.Any = js.native
  def activeElement(): stdLib.Element = js.native
  def activeElement(doc: stdLib.Document): stdLib.Element = js.native
  def ownerDocument(): stdLib.Document = js.native
  def ownerDocument(node: stdLib.Node): stdLib.Document = js.native
  def ownerWindow(): stdLib.Window = js.native
  def ownerWindow(node: stdLib.Node): stdLib.Window = js.native
  /**
    * Returns an ID for canceling
    */
  def requestAnimationFrame(callback: js.Function0[scala.Unit]): scala.Double = js.native
}

