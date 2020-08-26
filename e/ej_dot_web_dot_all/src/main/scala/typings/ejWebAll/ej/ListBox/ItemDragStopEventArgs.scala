package typings.ejWebAll.ej.ListBox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ItemDragStopEventArgs extends js.Object {
  /** Set this option to true to cancel the event.
    */
  var cancel: js.UndefOr[Boolean] = js.native
  /** The Datasource of the listbox.
    */
  var data: js.UndefOr[js.Any] = js.native
  /** List itemâ€™s index.
    */
  var index: js.UndefOr[Double] = js.native
  /** Boolean value based on whether the list item is checked or not.
    */
  var isChecked: js.UndefOr[Boolean] = js.native
  /** Boolean value based on whether the list item is enabled or not.
    */
  var isEnabled: js.UndefOr[Boolean] = js.native
  /** Boolean value based on whether the list item is selected or not.
    */
  var isSelected: js.UndefOr[Boolean] = js.native
  /** Instance of the listbox model object.
    */
  var model: js.UndefOr[Model] = js.native
  /** List itemâ€™s text (label).
    */
  var text: js.UndefOr[String] = js.native
  /** Name of the event.
    */
  var `type`: js.UndefOr[String] = js.native
  /** List itemâ€™s value.
    */
  var value: js.UndefOr[String] = js.native
}

object ItemDragStopEventArgs {
  @scala.inline
  def apply(): ItemDragStopEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ItemDragStopEventArgs]
  }
  @scala.inline
  implicit class ItemDragStopEventArgsOps[Self <: ItemDragStopEventArgs] (val x: Self) extends AnyVal {
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
    def setCancel(value: Boolean): Self = this.set("cancel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCancel: Self = this.set("cancel", js.undefined)
    @scala.inline
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
    @scala.inline
    def setIsChecked(value: Boolean): Self = this.set("isChecked", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsChecked: Self = this.set("isChecked", js.undefined)
    @scala.inline
    def setIsEnabled(value: Boolean): Self = this.set("isEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsEnabled: Self = this.set("isEnabled", js.undefined)
    @scala.inline
    def setIsSelected(value: Boolean): Self = this.set("isSelected", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsSelected: Self = this.set("isSelected", js.undefined)
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
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

