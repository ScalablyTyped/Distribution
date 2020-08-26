package typings.dispatchr.mod

import typings.dispatchr.anon.ActionName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DispatcherError extends js.Object {
  var message: String = js.native
  var meta: ActionName = js.native
  var `type`: String = js.native
}

object DispatcherError {
  @scala.inline
  def apply(message: String, meta: ActionName, `type`: String): DispatcherError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DispatcherError]
  }
  @scala.inline
  implicit class DispatcherErrorOps[Self <: DispatcherError] (val x: Self) extends AnyVal {
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
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def setMeta(value: ActionName): Self = this.set("meta", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

