package typings.ejDotWebDotAll.ej.ComboBox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilteringEventArgs extends js.Object {
  /** Instance of the combobox model object.
    */
  var model: js.UndefOr[Model] = js.undefined
  /** text of the combobox.
    */
  var text: js.UndefOr[String] = js.undefined
  /** Name of the event.
    */
  var `type`: js.UndefOr[String] = js.undefined
  /** Function used to update the filtering value.
    */
  var updateData: js.UndefOr[js.Any] = js.undefined
}

object FilteringEventArgs {
  @scala.inline
  def apply(model: Model = null, text: String = null, `type`: String = null, updateData: js.Any = null): FilteringEventArgs = {
    val __obj = js.Dynamic.literal()
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (updateData != null) __obj.updateDynamic("updateData")(updateData.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilteringEventArgs]
  }
}

