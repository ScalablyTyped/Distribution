package typings.googleapis.buildSrcApisSqladminV1beta4Mod.sqladmin_v1beta4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Database instance IP Mapping.
  */
@js.native
trait Schema$IpMapping extends js.Object {
  /**
    * The IP address assigned.
    */
  var ipAddress: js.UndefOr[String] = js.native
  /**
    * The due time for this IP to be retired in RFC 3339 format, for example
    * 2012-11-15T16:19:00.094Z. This field is only available when the IP is
    * scheduled to be retired.
    */
  var timeToRetire: js.UndefOr[String] = js.native
  /**
    * The type of this IP address. A PRIMARY address is an address that can
    * accept incoming connections. An OUTGOING address is the source address of
    * connections originating from the instance, if supported.
    */
  var `type`: js.UndefOr[String] = js.native
}

object Schema$IpMapping {
  @scala.inline
  def apply(ipAddress: String = null, timeToRetire: String = null, `type`: String = null): Schema$IpMapping = {
    val __obj = js.Dynamic.literal()
    if (ipAddress != null) __obj.updateDynamic("ipAddress")(ipAddress.asInstanceOf[js.Any])
    if (timeToRetire != null) __obj.updateDynamic("timeToRetire")(timeToRetire.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$IpMapping]
  }
}

