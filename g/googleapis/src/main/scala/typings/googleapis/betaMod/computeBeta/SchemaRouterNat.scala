package typings.googleapis.betaMod.computeBeta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a Nat resource. It enables the VMs within the specified
  * subnetworks to access Internet without external IP addresses. It specifies
  * a list of subnetworks (and the ranges within) that want to use NAT.
  * Customers can also provide the external IPs that would be used for NAT. GCP
  * would auto-allocate ephemeral IPs if no external IPs are provided.
  */
@js.native
trait SchemaRouterNat extends js.Object {
  /**
    * Timeout (in seconds) for ICMP connections. Defaults to 30s if not set.
    */
  var icmpIdleTimeoutSec: js.UndefOr[Double] = js.native
  /**
    * Configure logging on this NAT.
    */
  var logConfig: js.UndefOr[SchemaRouterNatLogConfig] = js.native
  /**
    * Minimum number of ports allocated to a VM from this NAT config. If not
    * set, a default number of ports is allocated to a VM. This gets rounded up
    * to the nearest power of 2. Eg. if the value of this field is 50, at least
    * 64 ports will be allocated to a VM.
    */
  var minPortsPerVm: js.UndefOr[Double] = js.native
  /**
    * Unique name of this Nat service. The name must be 1-63 characters long
    * and comply with RFC1035.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Specify the NatIpAllocateOption. If it is AUTO_ONLY, then nat_ip should
    * be empty.
    */
  var natIpAllocateOption: js.UndefOr[String] = js.native
  /**
    * A list of URLs of the IP resources used for this Nat service. These IPs
    * must be valid static external IP addresses assigned to the project.
    * max_length is subject to change post alpha.
    */
  var natIps: js.UndefOr[js.Array[String]] = js.native
  /**
    * Specify the Nat option. If this field contains
    * ALL_SUBNETWORKS_ALL_IP_RANGES or ALL_SUBNETWORKS_ALL_PRIMARY_IP_RANGES,
    * then there should not be any other Router.Nat section in any Router for
    * this network in this region.
    */
  var sourceSubnetworkIpRangesToNat: js.UndefOr[String] = js.native
  /**
    * A list of Subnetwork resources whose traffic should be translated by NAT
    * Gateway. It is used only when LIST_OF_SUBNETWORKS is selected for the
    * SubnetworkIpRangeToNatOption above.
    */
  var subnetworks: js.UndefOr[js.Array[SchemaRouterNatSubnetworkToNat]] = js.native
  /**
    * Timeout (in seconds) for TCP established connections. Defaults to 1200s
    * if not set.
    */
  var tcpEstablishedIdleTimeoutSec: js.UndefOr[Double] = js.native
  /**
    * Timeout (in seconds) for TCP transitory connections. Defaults to 30s if
    * not set.
    */
  var tcpTransitoryIdleTimeoutSec: js.UndefOr[Double] = js.native
  /**
    * Timeout (in seconds) for UDP connections. Defaults to 30s if not set.
    */
  var udpIdleTimeoutSec: js.UndefOr[Double] = js.native
}

object SchemaRouterNat {
  @scala.inline
  def apply(): SchemaRouterNat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRouterNat]
  }
  @scala.inline
  implicit class SchemaRouterNatOps[Self <: SchemaRouterNat] (val x: Self) extends AnyVal {
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
    def setIcmpIdleTimeoutSec(value: Double): Self = this.set("icmpIdleTimeoutSec", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcmpIdleTimeoutSec: Self = this.set("icmpIdleTimeoutSec", js.undefined)
    @scala.inline
    def setLogConfig(value: SchemaRouterNatLogConfig): Self = this.set("logConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogConfig: Self = this.set("logConfig", js.undefined)
    @scala.inline
    def setMinPortsPerVm(value: Double): Self = this.set("minPortsPerVm", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinPortsPerVm: Self = this.set("minPortsPerVm", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setNatIpAllocateOption(value: String): Self = this.set("natIpAllocateOption", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNatIpAllocateOption: Self = this.set("natIpAllocateOption", js.undefined)
    @scala.inline
    def setNatIpsVarargs(value: String*): Self = this.set("natIps", js.Array(value :_*))
    @scala.inline
    def setNatIps(value: js.Array[String]): Self = this.set("natIps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNatIps: Self = this.set("natIps", js.undefined)
    @scala.inline
    def setSourceSubnetworkIpRangesToNat(value: String): Self = this.set("sourceSubnetworkIpRangesToNat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceSubnetworkIpRangesToNat: Self = this.set("sourceSubnetworkIpRangesToNat", js.undefined)
    @scala.inline
    def setSubnetworksVarargs(value: SchemaRouterNatSubnetworkToNat*): Self = this.set("subnetworks", js.Array(value :_*))
    @scala.inline
    def setSubnetworks(value: js.Array[SchemaRouterNatSubnetworkToNat]): Self = this.set("subnetworks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubnetworks: Self = this.set("subnetworks", js.undefined)
    @scala.inline
    def setTcpEstablishedIdleTimeoutSec(value: Double): Self = this.set("tcpEstablishedIdleTimeoutSec", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTcpEstablishedIdleTimeoutSec: Self = this.set("tcpEstablishedIdleTimeoutSec", js.undefined)
    @scala.inline
    def setTcpTransitoryIdleTimeoutSec(value: Double): Self = this.set("tcpTransitoryIdleTimeoutSec", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTcpTransitoryIdleTimeoutSec: Self = this.set("tcpTransitoryIdleTimeoutSec", js.undefined)
    @scala.inline
    def setUdpIdleTimeoutSec(value: Double): Self = this.set("udpIdleTimeoutSec", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUdpIdleTimeoutSec: Self = this.set("udpIdleTimeoutSec", js.undefined)
  }
  
}

