package typings.firebaseInstallations.errorsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServerErrorData extends js.Object {
  var serverCode: Double = js.native
  var serverMessage: String = js.native
  var serverStatus: String = js.native
}

object ServerErrorData {
  @scala.inline
  def apply(serverCode: Double, serverMessage: String, serverStatus: String): ServerErrorData = {
    val __obj = js.Dynamic.literal(serverCode = serverCode.asInstanceOf[js.Any], serverMessage = serverMessage.asInstanceOf[js.Any], serverStatus = serverStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerErrorData]
  }
  @scala.inline
  implicit class ServerErrorDataOps[Self <: ServerErrorData] (val x: Self) extends AnyVal {
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
    def setServerCode(value: Double): Self = this.set("serverCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setServerMessage(value: String): Self = this.set("serverMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def setServerStatus(value: String): Self = this.set("serverStatus", value.asInstanceOf[js.Any])
  }
  
}

