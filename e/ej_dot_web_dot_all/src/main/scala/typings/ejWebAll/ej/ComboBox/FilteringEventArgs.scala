package typings.ejWebAll.ej.ComboBox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FilteringEventArgs extends js.Object {
  /** Instance of the combobox model object.
    */
  var model: js.UndefOr[Model] = js.native
  /** text of the combobox.
    */
  var text: js.UndefOr[String] = js.native
  /** Name of the event.
    */
  var `type`: js.UndefOr[String] = js.native
  /** Function used to update the filtering value.
    */
  var updateData: js.UndefOr[js.Any] = js.native
}

object FilteringEventArgs {
  @scala.inline
  def apply(): FilteringEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilteringEventArgs]
  }
  @scala.inline
  implicit class FilteringEventArgsOps[Self <: FilteringEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setModel(value: Model): Self = this.set("model", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModel: Self = this.set("model", js.undefined)
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setUpdateData(value: js.Any): Self = this.set("updateData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdateData: Self = this.set("updateData", js.undefined)
  }
  
}

