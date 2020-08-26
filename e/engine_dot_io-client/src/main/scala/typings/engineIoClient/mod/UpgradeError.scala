package typings.engineIoClient.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpgradeError extends Error {
  var transport: String = js.native
}

object UpgradeError {
  @scala.inline
  def apply(message: String, name: String, transport: String): UpgradeError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], transport = transport.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpgradeError]
  }
  @scala.inline
  implicit class UpgradeErrorOps[Self <: UpgradeError] (val x: Self) extends AnyVal {
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
    def setTransport(value: String): Self = this.set("transport", value.asInstanceOf[js.Any])
  }
  
}

