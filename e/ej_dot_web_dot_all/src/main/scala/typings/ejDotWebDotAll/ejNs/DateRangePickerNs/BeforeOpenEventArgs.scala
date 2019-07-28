package typings.ejDotWebDotAll.ejNs.DateRangePickerNs

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BeforeOpenEventArgs extends js.Object {
  /** Set to true when the event has to be canceled, else false.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** returns the DateRangePicker popup.
    */
  var element: js.UndefOr[HTMLElement] = js.undefined
  /** returns the event parameters from DateRangePicker.
    */
  var events: js.UndefOr[js.Any] = js.undefined
  /** returns the DateRangePicker model.
    */
  var model: js.UndefOr[typings.ejDotWebDotAll.ejNs.DateRangePickerNs.Model] = js.undefined
  /** returns the name of the event.
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object BeforeOpenEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[Boolean] = js.undefined,
    element: HTMLElement = null,
    events: js.Any = null,
    model: typings.ejDotWebDotAll.ejNs.DateRangePickerNs.Model = null,
    `type`: String = null
  ): BeforeOpenEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (element != null) __obj.updateDynamic("element")(element)
    if (events != null) __obj.updateDynamic("events")(events)
    if (model != null) __obj.updateDynamic("model")(model)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[BeforeOpenEventArgs]
  }
}

