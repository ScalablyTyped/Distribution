package typings.ejDotWebDotAll.ej.TimePicker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateEventArgs extends js.Object {
  /** returns the TimePicker model
    */
  var model: js.UndefOr[typings.ejDotWebDotAll.ej.TimePicker.Model] = js.undefined
  /** returns the name of the event
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object CreateEventArgs {
  @scala.inline
  def apply(model: typings.ejDotWebDotAll.ej.TimePicker.Model = null, `type`: String = null): CreateEventArgs = {
    val __obj = js.Dynamic.literal()
    if (model != null) __obj.updateDynamic("model")(model)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[CreateEventArgs]
  }
}

