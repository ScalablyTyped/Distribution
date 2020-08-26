package typings.gapiClientCompute.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPProtocol extends js.Object {
  /**
    * The IP protocol to which this rule applies. The protocol type is required when creating a firewall rule. This value can either be one of the following
    * well known protocol strings (tcp, udp, icmp, esp, ah, ipip, sctp), or the IP protocol number.
    */
  var IPProtocol: js.UndefOr[String] = js.native
  /**
    * An optional list of ports to which this rule applies. This field is only applicable for UDP or TCP protocol. Each entry must be either an integer or a
    * range. If not specified, this rule applies to connections through any port.
    *
    * Example inputs include: ["22"], ["80","443"], and ["12345-12349"].
    */
  var ports: js.UndefOr[js.Array[String]] = js.native
}

object IPProtocol {
  @scala.inline
  def apply(): IPProtocol = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPProtocol]
  }
  @scala.inline
  implicit class IPProtocolOps[Self <: IPProtocol] (val x: Self) extends AnyVal {
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
    def setIPProtocol(value: String): Self = this.set("IPProtocol", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIPProtocol: Self = this.set("IPProtocol", js.undefined)
    @scala.inline
    def setPortsVarargs(value: String*): Self = this.set("ports", js.Array(value :_*))
    @scala.inline
    def setPorts(value: js.Array[String]): Self = this.set("ports", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePorts: Self = this.set("ports", js.undefined)
  }
  
}

