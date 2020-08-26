package typings.dockerode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Port extends js.Object {
  var IP: String = js.native
  var PrivatePort: Double = js.native
  var PublicPort: Double = js.native
  var Type: String = js.native
}

object Port {
  @scala.inline
  def apply(IP: String, PrivatePort: Double, PublicPort: Double, Type: String): Port = {
    val __obj = js.Dynamic.literal(IP = IP.asInstanceOf[js.Any], PrivatePort = PrivatePort.asInstanceOf[js.Any], PublicPort = PublicPort.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[Port]
  }
  @scala.inline
  implicit class PortOps[Self <: Port] (val x: Self) extends AnyVal {
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
    def setIP(value: String): Self = this.set("IP", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrivatePort(value: Double): Self = this.set("PrivatePort", value.asInstanceOf[js.Any])
    @scala.inline
    def setPublicPort(value: Double): Self = this.set("PublicPort", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("Type", value.asInstanceOf[js.Any])
  }
  
}

