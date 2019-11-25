package typings.ejDotWebDotAll.ej.DateTimePicker

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BeforeCloseEventArgs extends js.Object {
  /** Set to true when the event has to be canceled, else false.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** returns the DateTimePicker popup.
    */
  var element: js.UndefOr[HTMLElement] = js.undefined
  /** returns the event parameters from DateTimePicker.
    */
  var events: js.UndefOr[js.Any] = js.undefined
  /** returns the DateTimePicker model.
    */
  var model: js.UndefOr[typings.ejDotWebDotAll.ej.DateTimePicker.Model] = js.undefined
  /** returns the name of the event.
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object BeforeCloseEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[Boolean] = js.undefined,
    element: HTMLElement = null,
    events: js.Any = null,
    model: typings.ejDotWebDotAll.ej.DateTimePicker.Model = null,
    `type`: String = null
  ): BeforeCloseEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BeforeCloseEventArgs]
  }
}

