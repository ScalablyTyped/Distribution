package typings
package ejDotWebDotAllLib.ejNs.DateTimePickerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenEventArgs extends js.Object {
  /** returns the TimePicker model
    */
  var model: js.UndefOr[Model] = js.undefined
  /** returns the previously selected date time value
    */
  var prevDateTime: js.UndefOr[java.lang.String] = js.undefined
  /** returns the name of the event
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  /** returns the modified datetime value
    */
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object OpenEventArgs {
  @scala.inline
  def apply(
    model: Model = null,
    prevDateTime: java.lang.String = null,
    `type`: java.lang.String = null,
    value: java.lang.String = null
  ): OpenEventArgs = {
    val __obj = js.Dynamic.literal()
    if (model != null) __obj.updateDynamic("model")(model)
    if (prevDateTime != null) __obj.updateDynamic("prevDateTime")(prevDateTime)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[OpenEventArgs]
  }
}

