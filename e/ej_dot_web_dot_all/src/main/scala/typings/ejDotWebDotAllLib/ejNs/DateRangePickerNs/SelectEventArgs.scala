package typings
package ejDotWebDotAllLib.ejNs.DateRangePickerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectEventArgs extends js.Object {
  /** Set to true when the event has to be canceled, else false.
    */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** returns the current date value.
    */
  var endDate: js.UndefOr[js.Any] = js.undefined
  /** returns the DateRangePicker model.
    */
  var model: js.UndefOr[Model] = js.undefined
  /** returns the selected date object.
    */
  var startDate: js.UndefOr[js.Any] = js.undefined
  /** returns the name of the event.
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object SelectEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[scala.Boolean] = js.undefined,
    endDate: js.Any = null,
    model: Model = null,
    startDate: js.Any = null,
    `type`: java.lang.String = null
  ): SelectEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (endDate != null) __obj.updateDynamic("endDate")(endDate)
    if (model != null) __obj.updateDynamic("model")(model)
    if (startDate != null) __obj.updateDynamic("startDate")(startDate)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[SelectEventArgs]
  }
}

