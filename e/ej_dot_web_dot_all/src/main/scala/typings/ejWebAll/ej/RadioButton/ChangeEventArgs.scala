package typings.ejWebAll.ej.RadioButton

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChangeEventArgs extends js.Object {
  /** if the event should be canceled; otherwise, false.
    */
  var cancel: js.UndefOr[Boolean] = js.native
  /** returns true if element is checked, otherwise returns false
    */
  var isChecked: js.UndefOr[Boolean] = js.native
  /** returns true if change event triggered by interaction, otherwise returns false
    */
  var isInteraction: js.UndefOr[Boolean] = js.native
  /** returns the RadioButton model
    */
  var model: js.UndefOr[Model] = js.native
  /** returns the name of the event
    */
  var `type`: js.UndefOr[String] = js.native
}

object ChangeEventArgs {
  @scala.inline
  def apply(): ChangeEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChangeEventArgs]
  }
  @scala.inline
  implicit class ChangeEventArgsOps[Self <: ChangeEventArgs] (val x: Self) extends AnyVal {
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
    def setIsChecked(value: Boolean): Self = this.set("isChecked", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsChecked: Self = this.set("isChecked", js.undefined)
    @scala.inline
    def setIsInteraction(value: Boolean): Self = this.set("isInteraction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsInteraction: Self = this.set("isInteraction", js.undefined)
    @scala.inline
    def setModel(value: Model): Self = this.set("model", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModel: Self = this.set("model", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

