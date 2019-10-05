package typings.ejDotWebDotAll.ej.DateTimePicker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FocusInEventArgs extends js.Object {
  /** returns the TimePicker model
    */
  var model: js.UndefOr[typings.ejDotWebDotAll.ej.DateTimePicker.Model] = js.undefined
  /** returns the name of the event
    */
  var `type`: js.UndefOr[String] = js.undefined
  /** returns the datetime value, which is in text box
    */
  var value: js.UndefOr[String] = js.undefined
}

object FocusInEventArgs {
  @scala.inline
  def apply(
    model: typings.ejDotWebDotAll.ej.DateTimePicker.Model = null,
    `type`: String = null,
    value: String = null
  ): FocusInEventArgs = {
    val __obj = js.Dynamic.literal()
    if (model != null) __obj.updateDynamic("model")(model)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[FocusInEventArgs]
  }
}

