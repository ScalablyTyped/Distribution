package typings.dockerode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* tslint:disable:interface-name */
@js.native
trait IPAMConfig extends js.Object {
  var IPv4Address: js.UndefOr[String] = js.native
  var IPv6Address: js.UndefOr[String] = js.native
  var LinkLocalIPs: js.UndefOr[js.Array[String]] = js.native
}

object IPAMConfig {
  @scala.inline
  def apply(): IPAMConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPAMConfig]
  }
  @scala.inline
  implicit class IPAMConfigOps[Self <: IPAMConfig] (val x: Self) extends AnyVal {
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
    def setIPv4Address(value: String): Self = this.set("IPv4Address", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIPv4Address: Self = this.set("IPv4Address", js.undefined)
    @scala.inline
    def setIPv6Address(value: String): Self = this.set("IPv6Address", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIPv6Address: Self = this.set("IPv6Address", js.undefined)
    @scala.inline
    def setLinkLocalIPsVarargs(value: String*): Self = this.set("LinkLocalIPs", js.Array(value :_*))
    @scala.inline
    def setLinkLocalIPs(value: js.Array[String]): Self = this.set("LinkLocalIPs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLinkLocalIPs: Self = this.set("LinkLocalIPs", js.undefined)
  }
  
}

