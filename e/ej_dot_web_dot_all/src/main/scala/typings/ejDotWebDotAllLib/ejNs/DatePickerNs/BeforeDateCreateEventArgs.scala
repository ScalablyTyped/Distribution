package typings
package ejDotWebDotAllLib.ejNs.DatePickerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BeforeDateCreateEventArgs extends js.Object {
  /** Set to true when the event has to be canceled, else false.
    */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** returns the currently created date object.
    */
  var date: js.UndefOr[js.Any] = js.undefined
  /** returns the current DOM object of the date from the Calendar.
    */
  var element: js.UndefOr[stdLib.HTMLElement] = js.undefined
  /** returns the DatePicker model.
    */
  var model: js.UndefOr[Model] = js.undefined
  /** returns the name of the event.
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  /** returns the currently created date as string type.
    */
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object BeforeDateCreateEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[scala.Boolean] = js.undefined,
    date: js.Any = null,
    element: stdLib.HTMLElement = null,
    model: Model = null,
    `type`: java.lang.String = null,
    value: java.lang.String = null
  ): BeforeDateCreateEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (date != null) __obj.updateDynamic("date")(date)
    if (element != null) __obj.updateDynamic("element")(element)
    if (model != null) __obj.updateDynamic("model")(model)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[BeforeDateCreateEventArgs]
  }
}

