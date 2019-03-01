package typings
package ejDotWebDotAllLib.ejNs.DateRangePickerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BeforeCloseEventArgs extends js.Object {
  /** Set to true when the event has to be canceled, else false.
    */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** returns the DateRangePicker popup.
    */
  var element: js.UndefOr[stdLib.HTMLElement] = js.undefined
  /** returns the event parameters from DateRangePicker.
    */
  var events: js.UndefOr[js.Any] = js.undefined
  /** returns the DateRangePicker model
    */
  var model: js.UndefOr[Model] = js.undefined
  /** returns the name of the event.
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object BeforeCloseEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[scala.Boolean] = js.undefined,
    element: stdLib.HTMLElement = null,
    events: js.Any = null,
    model: Model = null,
    `type`: java.lang.String = null
  ): BeforeCloseEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (element != null) __obj.updateDynamic("element")(element)
    if (events != null) __obj.updateDynamic("events")(events)
    if (model != null) __obj.updateDynamic("model")(model)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[BeforeCloseEventArgs]
  }
}

