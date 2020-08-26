package typings.googleVisualization.google.visualization

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ErrorEventObject extends js.Object {
  var detailedMessage: js.UndefOr[String] = js.native
  var id: String = js.native
  var message: String = js.native
  var options: js.UndefOr[js.Any] = js.native
}

object ErrorEventObject {
  @scala.inline
  def apply(id: String, message: String): ErrorEventObject = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorEventObject]
  }
  @scala.inline
  implicit class ErrorEventObjectOps[Self <: ErrorEventObject] (val x: Self) extends AnyVal {
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def setDetailedMessage(value: String): Self = this.set("detailedMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDetailedMessage: Self = this.set("detailedMessage", js.undefined)
    @scala.inline
    def setOptions(value: js.Any): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
  }
  
}

