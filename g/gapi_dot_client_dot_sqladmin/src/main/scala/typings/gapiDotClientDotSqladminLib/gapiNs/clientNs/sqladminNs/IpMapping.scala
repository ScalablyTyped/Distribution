package typings
package gapiDotClientDotSqladminLib.gapiNs.clientNs.sqladminNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IpMapping extends js.Object {
  /** The IP address assigned. */
  var ipAddress: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The due time for this IP to be retired in RFC 3339 format, for example 2012-11-15T16:19:00.094Z. This field is only available when the IP is scheduled
    * to be retired.
    */
  var timeToRetire: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The type of this IP address. A PRIMARY address is an address that can accept incoming connections. An OUTGOING address is the source address of
    * connections originating from the instance, if supported.
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

