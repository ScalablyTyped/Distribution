package typings.ejDotWebDotAll.ejNs

import typings.ejDotWebDotAll.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.WaitingPopup")
@js.native
class WaitingPopup protected () extends Widget {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: typings.ejDotWebDotAll.ejNs.WaitingPopupNs.Model) = this()
  def this(element: Element, options: typings.ejDotWebDotAll.ejNs.WaitingPopupNs.Model) = this()
  var defaults: typings.ejDotWebDotAll.ejNs.WaitingPopupNs.Model = js.native
  @JSName("model")
  var model_WaitingPopup: typings.ejDotWebDotAll.ejNs.WaitingPopupNs.Model = js.native
  /** To hide the waiting popup
    * @returns {void}
    */
  def hide(): Unit = js.native
  /** Refreshes the WaitingPopup control by resetting the pop-up panel position and content position
    * @returns {void}
    */
  def refresh(): Unit = js.native
  /** To show the waiting popup
    * @returns {void}
    */
  def show(): Unit = js.native
}

/* static members */
@JSGlobal("ej.WaitingPopup")
@js.native
object WaitingPopup extends js.Object {
  var Locale: js.Any = js.native
  var fn: WaitingPopup = js.native
}

