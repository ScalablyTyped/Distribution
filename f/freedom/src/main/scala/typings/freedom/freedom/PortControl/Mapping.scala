package typings.freedom.freedom.PortControl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Mapping extends js.Object {
  var errInfo: js.UndefOr[String] = js.undefined
  var externalIp: js.UndefOr[String] = js.undefined
  var externalPort: Double
  var internalIp: String
  var internalPort: Double
  var lifetime: Double
  var nonce: js.UndefOr[js.Array[Double]] = js.undefined
  var protocol: String
  var timeoutId: js.UndefOr[Double] = js.undefined
}

object Mapping {
  @scala.inline
  def apply(
    externalPort: Double,
    internalIp: String,
    internalPort: Double,
    lifetime: Double,
    protocol: String,
    errInfo: String = null,
    externalIp: String = null,
    nonce: js.Array[Double] = null,
    timeoutId: Int | Double = null
  ): Mapping = {
    val __obj = js.Dynamic.literal(externalPort = externalPort.asInstanceOf[js.Any], internalIp = internalIp.asInstanceOf[js.Any], internalPort = internalPort.asInstanceOf[js.Any], lifetime = lifetime.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any])
    if (errInfo != null) __obj.updateDynamic("errInfo")(errInfo.asInstanceOf[js.Any])
    if (externalIp != null) __obj.updateDynamic("externalIp")(externalIp.asInstanceOf[js.Any])
    if (nonce != null) __obj.updateDynamic("nonce")(nonce.asInstanceOf[js.Any])
    if (timeoutId != null) __obj.updateDynamic("timeoutId")(timeoutId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mapping]
  }
}

