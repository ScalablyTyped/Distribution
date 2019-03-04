package typings
package freedomLib.freedomNs.PortControlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Mapping extends js.Object {
  var errInfo: js.UndefOr[java.lang.String] = js.undefined
  var externalIp: js.UndefOr[java.lang.String] = js.undefined
  var externalPort: scala.Double
  var internalIp: java.lang.String
  var internalPort: scala.Double
  var lifetime: scala.Double
  var nonce: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var protocol: java.lang.String
  var timeoutId: js.UndefOr[scala.Double] = js.undefined
}

object Mapping {
  @scala.inline
  def apply(
    externalPort: scala.Double,
    internalIp: java.lang.String,
    internalPort: scala.Double,
    lifetime: scala.Double,
    protocol: java.lang.String,
    errInfo: java.lang.String = null,
    externalIp: java.lang.String = null,
    nonce: js.Array[scala.Double] = null,
    timeoutId: scala.Int | scala.Double = null
  ): Mapping = {
    val __obj = js.Dynamic.literal(externalPort = externalPort, internalIp = internalIp, internalPort = internalPort, lifetime = lifetime, protocol = protocol)
    if (errInfo != null) __obj.updateDynamic("errInfo")(errInfo)
    if (externalIp != null) __obj.updateDynamic("externalIp")(externalIp)
    if (nonce != null) __obj.updateDynamic("nonce")(nonce)
    if (timeoutId != null) __obj.updateDynamic("timeoutId")(timeoutId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mapping]
  }
}

