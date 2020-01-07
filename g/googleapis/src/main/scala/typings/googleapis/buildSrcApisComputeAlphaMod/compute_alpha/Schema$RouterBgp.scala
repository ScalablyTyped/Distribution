package typings.googleapis.buildSrcApisComputeAlphaMod.compute_alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$RouterBgp extends js.Object {
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
  var advertisedIpRanges: js.UndefOr[js.Array[Schema$RouterAdvertisedIpRange]] = js.native
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

object Schema$RouterBgp {
  @scala.inline
  def apply(
    advertiseMode: String = null,
    advertisedGroups: js.Array[String] = null,
    advertisedIpRanges: js.Array[Schema$RouterAdvertisedIpRange] = null,
    asn: Int | Double = null,
    keepaliveInterval: Int | Double = null
  ): Schema$RouterBgp = {
    val __obj = js.Dynamic.literal()
    if (advertiseMode != null) __obj.updateDynamic("advertiseMode")(advertiseMode.asInstanceOf[js.Any])
    if (advertisedGroups != null) __obj.updateDynamic("advertisedGroups")(advertisedGroups.asInstanceOf[js.Any])
    if (advertisedIpRanges != null) __obj.updateDynamic("advertisedIpRanges")(advertisedIpRanges.asInstanceOf[js.Any])
    if (asn != null) __obj.updateDynamic("asn")(asn.asInstanceOf[js.Any])
    if (keepaliveInterval != null) __obj.updateDynamic("keepaliveInterval")(keepaliveInterval.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$RouterBgp]
  }
}

