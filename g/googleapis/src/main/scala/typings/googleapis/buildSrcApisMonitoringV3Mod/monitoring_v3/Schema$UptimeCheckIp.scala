package typings.googleapis.buildSrcApisMonitoringV3Mod.monitoring_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains the region, location, and list of IP addresses where checkers in
  * the location run from.
  */
@js.native
trait Schema$UptimeCheckIp extends js.Object {
  /**
    * The IP address from which the uptime check originates. This is a full IP
    * address (not an IP address range). Most IP addresses, as of this
    * publication, are in IPv4 format; however, one should not rely on the IP
    * addresses being in IPv4 format indefinitely and should support
    * interpreting this field in either IPv4 or IPv6 format.
    */
  var ipAddress: js.UndefOr[String] = js.native
  /**
    * A more specific location within the region that typically encodes a
    * particular city/town/metro (and its containing state/province or country)
    * within the broader umbrella region category.
    */
  var location: js.UndefOr[String] = js.native
  /**
    * A broad region category in which the IP address is located.
    */
  var region: js.UndefOr[String] = js.native
}

object Schema$UptimeCheckIp {
  @scala.inline
  def apply(ipAddress: String = null, location: String = null, region: String = null): Schema$UptimeCheckIp = {
    val __obj = js.Dynamic.literal()
    if (ipAddress != null) __obj.updateDynamic("ipAddress")(ipAddress.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (region != null) __obj.updateDynamic("region")(region.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$UptimeCheckIp]
  }
}

