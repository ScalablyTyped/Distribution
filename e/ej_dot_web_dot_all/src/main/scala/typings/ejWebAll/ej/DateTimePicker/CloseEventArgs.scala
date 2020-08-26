package typings.ejWebAll.ej.DateTimePicker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CloseEventArgs extends js.Object {
  /** returns the TimePicker model
    */
  var model: js.UndefOr[Model] = js.native
  /** returns the previously selected date time value
    */
  var prevDateTime: js.UndefOr[String] = js.native
  /** returns the name of the event
    */
  var `type`: js.UndefOr[String] = js.native
  /** returns the modified datetime value
    */
  var value: js.UndefOr[String] = js.native
}

object CloseEventArgs {
  @scala.inline
  def apply(): CloseEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CloseEventArgs]
  }
  @scala.inline
  implicit class CloseEventArgsOps[Self <: CloseEventArgs] (val x: Self) extends AnyVal {
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
    def setPrevDateTime(value: String): Self = this.set("prevDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrevDateTime: Self = this.set("prevDateTime", js.undefined)
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

