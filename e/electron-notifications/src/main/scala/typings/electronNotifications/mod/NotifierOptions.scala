package typings.electronNotifications.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotifierOptions extends js.Object {
  /** One or two buttons to display on the right of the notification. */
  var buttons: js.UndefOr[js.Array[String]] = js.native
  /** The absolute URL of a icon displayed to the left of the text. */
  var icon: js.UndefOr[String] = js.native
  /** A message to display under the title. */
  var message: js.UndefOr[String] = js.native
}

object NotifierOptions {
  @scala.inline
  def apply(): NotifierOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotifierOptions]
  }
  @scala.inline
  implicit class NotifierOptionsOps[Self <: NotifierOptions] (val x: Self) extends AnyVal {
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
    def setButtonsVarargs(value: String*): Self = this.set("buttons", js.Array(value :_*))
    @scala.inline
    def setButtons(value: js.Array[String]): Self = this.set("buttons", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteButtons: Self = this.set("buttons", js.undefined)
    @scala.inline
    def setIcon(value: String): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
  }
  
}

