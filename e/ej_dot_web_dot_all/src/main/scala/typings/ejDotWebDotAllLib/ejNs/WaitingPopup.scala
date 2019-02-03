package typings
package ejDotWebDotAllLib.ejNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.WaitingPopup")
@js.native
class WaitingPopup protected () extends Widget {
  def this(element: ejDotWebDotAllLib.JQuery) = this()
  def this(element: stdLib.Element) = this()
  def this(element: ejDotWebDotAllLib.JQuery, options: ejDotWebDotAllLib.ejNs.WaitingPopupNs.Model) = this()
  def this(element: stdLib.Element, options: ejDotWebDotAllLib.ejNs.WaitingPopupNs.Model) = this()
  var defaults: ejDotWebDotAllLib.ejNs.WaitingPopupNs.Model = js.native
  @JSName("model")
  var model_WaitingPopup: ejDotWebDotAllLib.ejNs.WaitingPopupNs.Model = js.native
  /** To hide the waiting popup
    * @returns {void}
    */
  def hide(): scala.Unit = js.native
  /** Refreshes the WaitingPopup control by resetting the pop-up panel position and content position
    * @returns {void}
    */
  def refresh(): scala.Unit = js.native
  /** To show the waiting popup
    * @returns {void}
    */
  def show(): scala.Unit = js.native
}

/* static members */
@JSGlobal("ej.WaitingPopup")
@js.native
object WaitingPopup extends js.Object {
  var Locale: js.Any = js.native
  var fn: ejDotWebDotAllLib.ejNs.WaitingPopup = js.native
}

