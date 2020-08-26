package typings.ejWebAll.ej.TimePicker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FocusOutEventArgs extends js.Object {
  /** returns the TimePicker model
    */
  var model: js.UndefOr[Model] = js.native
  /** returns the previously selected time value
    */
  var prevTime: js.UndefOr[String] = js.native
  /** returns the name of the event
    */
  var `type`: js.UndefOr[String] = js.native
  /** returns the current time value
    */
  var value: js.UndefOr[String] = js.native
}

object FocusOutEventArgs {
  @scala.inline
  def apply(): FocusOutEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FocusOutEventArgs]
  }
  @scala.inline
  implicit class FocusOutEventArgsOps[Self <: FocusOutEventArgs] (val x: Self) extends AnyVal {
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
    def setPrevTime(value: String): Self = this.set("prevTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrevTime: Self = this.set("prevTime", js.undefined)
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

