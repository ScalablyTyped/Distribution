package typings.dockerode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PortBinding extends js.Object {
  var HostIp: js.UndefOr[String] = js.native
  var HostPort: js.UndefOr[String] = js.native
}

object PortBinding {
  @scala.inline
  def apply(): PortBinding = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PortBinding]
  }
  @scala.inline
  implicit class PortBindingOps[Self <: PortBinding] (val x: Self) extends AnyVal {
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
    def setHostIp(value: String): Self = this.set("HostIp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHostIp: Self = this.set("HostIp", js.undefined)
    @scala.inline
    def setHostPort(value: String): Self = this.set("HostPort", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHostPort: Self = this.set("HostPort", js.undefined)
  }
  
}

