package typings.ejDotWebDotAll.ej.DatePicker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChangeEventArgs extends js.Object {
  /** returns the DatePicker model.
    */
  var model: js.UndefOr[Model] = js.undefined
  /** returns the previously selected value.
    */
  var prevDate: js.UndefOr[String] = js.undefined
  /** returns the name of the event.
    */
  var `type`: js.UndefOr[String] = js.undefined
  /** returns the DatePicker input value.
    */
  var value: js.UndefOr[String] = js.undefined
}

object ChangeEventArgs {
  @scala.inline
  def apply(model: Model = null, prevDate: String = null, `type`: String = null, value: String = null): ChangeEventArgs = {
    val __obj = js.Dynamic.literal()
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (prevDate != null) __obj.updateDynamic("prevDate")(prevDate.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangeEventArgs]
  }
}

