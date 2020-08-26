package typings.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaRouterBgp extends js.Object {
  /**
    * User-specified flag to indicate which mode to use for advertisement.
    */
  var advertiseMode: js.UndefOr[String] = js.native
  /**
    * User-specified list of prefix groups to advertise in custom mode. This
    * field can only be populated if advertise_mode is CUSTOM and is advertised
    * to all peers of the router. These groups will be advertised in addition
    * to any specified prefixes. Leave this field blank to advertise no custom
    * groups.
    */
  var advertisedGroups: js.UndefOr[js.Array[String]] = js.native
  /**
    * User-specified list of individual IP ranges to advertise in custom mode.
    * This field can only be populated if advertise_mode is CUSTOM and is
    * advertised to all peers of the router. These IP ranges will be advertised
    * in addition to any specified groups. Leave this field blank to advertise
    * no custom IP ranges.
    */
  var advertisedIpRanges: js.UndefOr[js.Array[SchemaRouterAdvertisedIpRange]] = js.native
  /**
    * Local BGP Autonomous System Number (ASN). Must be an RFC6996 private ASN,
    * either 16-bit or 32-bit. The value will be fixed for this router
    * resource. All VPN tunnels that link to this router will have the same
    * local ASN.
    */
  var asn: js.UndefOr[Double] = js.native
  /**
    * The interval in seconds between BGP keepalive messages that are sent to
    * the peer. Hold time is three times the interval at which keepalive
    * messages are sent, and the hold time is the maximum number of seconds
    * allowed to elapse between successive keepalive messages that BGP receives
    * from a peer. BGP will use the smaller of either the local hold time value
    * or the peer?s hold time value as the hold time for the BGP connection
    * between the two peers. If set, this value must be between 1 and 120. The
    * default is 20.
    */
  var keepaliveInterval: js.UndefOr[Double] = js.native
}

object SchemaRouterBgp {
  @scala.inline
  def apply(): SchemaRouterBgp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRouterBgp]
  }
  @scala.inline
  implicit class SchemaRouterBgpOps[Self <: SchemaRouterBgp] (val x: Self) extends AnyVal {
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
    def setAdvertiseMode(value: String): Self = this.set("advertiseMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdvertiseMode: Self = this.set("advertiseMode", js.undefined)
    @scala.inline
    def setAdvertisedGroupsVarargs(value: String*): Self = this.set("advertisedGroups", js.Array(value :_*))
    @scala.inline
    def setAdvertisedGroups(value: js.Array[String]): Self = this.set("advertisedGroups", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdvertisedGroups: Self = this.set("advertisedGroups", js.undefined)
    @scala.inline
    def setAdvertisedIpRangesVarargs(value: SchemaRouterAdvertisedIpRange*): Self = this.set("advertisedIpRanges", js.Array(value :_*))
    @scala.inline
    def setAdvertisedIpRanges(value: js.Array[SchemaRouterAdvertisedIpRange]): Self = this.set("advertisedIpRanges", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdvertisedIpRanges: Self = this.set("advertisedIpRanges", js.undefined)
    @scala.inline
    def setAsn(value: Double): Self = this.set("asn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAsn: Self = this.set("asn", js.undefined)
    @scala.inline
    def setKeepaliveInterval(value: Double): Self = this.set("keepaliveInterval", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeepaliveInterval: Self = this.set("keepaliveInterval", js.undefined)
  }
  
}

