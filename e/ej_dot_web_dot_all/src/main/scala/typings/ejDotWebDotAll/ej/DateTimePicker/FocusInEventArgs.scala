package typings.ejDotWebDotAll.ej.DateTimePicker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FocusInEventArgs extends js.Object {
  /** returns the TimePicker model
    */
  var model: js.UndefOr[Model] = js.undefined
  /** returns the name of the event
    */
  var `type`: js.UndefOr[String] = js.undefined
  /** returns the datetime value, which is in text box
    */
  var value: js.UndefOr[String] = js.undefined
}

object FocusInEventArgs {
  @scala.inline
  def apply(model: Model = null, `type`: String = null, value: String = null): FocusInEventArgs = {
    val __obj = js.Dynamic.literal()
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[FocusInEventArgs]
  }
}

