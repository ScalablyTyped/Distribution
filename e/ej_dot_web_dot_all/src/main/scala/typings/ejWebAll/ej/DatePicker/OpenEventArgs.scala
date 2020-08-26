package typings.ejWebAll.ej.DatePicker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OpenEventArgs extends js.Object {
  /** returns the current date object.
    */
  var date: js.UndefOr[js.Any] = js.native
  /** returns the DatePicker model.
    */
  var model: js.UndefOr[Model] = js.native
  /** returns the previously selected value.
    */
  var prevDate: js.UndefOr[String] = js.native
  /** returns the name of the event
    */
  var `type`: js.UndefOr[String] = js.native
  /** returns the current date value.
    */
  var value: js.UndefOr[String] = js.native
}

object OpenEventArgs {
  @scala.inline
  def apply(): OpenEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OpenEventArgs]
  }
  @scala.inline
  implicit class OpenEventArgsOps[Self <: OpenEventArgs] (val x: Self) extends AnyVal {
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
    def setDate(value: js.Any): Self = this.set("date", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDate: Self = this.set("date", js.undefined)
    @scala.inline
    def setModel(value: Model): Self = this.set("model", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModel: Self = this.set("model", js.undefined)
    @scala.inline
    def setPrevDate(value: String): Self = this.set("prevDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrevDate: Self = this.set("prevDate", js.undefined)
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

