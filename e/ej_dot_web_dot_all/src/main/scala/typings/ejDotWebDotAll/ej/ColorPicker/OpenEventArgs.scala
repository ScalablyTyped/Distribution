package typings.ejDotWebDotAll.ej.ColorPicker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenEventArgs extends js.Object {
  /** returns the color picker model
    */
  var model: js.UndefOr[typings.ejDotWebDotAll.ej.ColorPicker.Model] = js.undefined
  /** returns the name of the event
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object OpenEventArgs {
  @scala.inline
  def apply(model: typings.ejDotWebDotAll.ej.ColorPicker.Model = null, `type`: String = null): OpenEventArgs = {
    val __obj = js.Dynamic.literal()
    if (model != null) __obj.updateDynamic("model")(model)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[OpenEventArgs]
  }
}

