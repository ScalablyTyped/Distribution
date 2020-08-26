package typings.ejWebAll.ej.DateTimePicker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ButtonText extends js.Object {
  /** Sets the text for the Done button inside the datetime popup.
    */
  var done: js.UndefOr[String] = js.native
  /** Sets the text for the Now button inside the datetime popup.
    */
  var timeNow: js.UndefOr[String] = js.native
  /** Sets the header text for the Time dropdown.
    */
  var timeTitle: js.UndefOr[String] = js.native
  /** Sets the text for the Today button inside the datetime popup.
    */
  var today: js.UndefOr[String] = js.native
}

object ButtonText {
  @scala.inline
  def apply(): ButtonText = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ButtonText]
  }
  @scala.inline
  implicit class ButtonTextOps[Self <: ButtonText] (val x: Self) extends AnyVal {
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
    def setDone(value: String): Self = this.set("done", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDone: Self = this.set("done", js.undefined)
    @scala.inline
    def setTimeNow(value: String): Self = this.set("timeNow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeNow: Self = this.set("timeNow", js.undefined)
    @scala.inline
    def setTimeTitle(value: String): Self = this.set("timeTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeTitle: Self = this.set("timeTitle", js.undefined)
    @scala.inline
    def setToday(value: String): Self = this.set("today", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToday: Self = this.set("today", js.undefined)
  }
  
}

