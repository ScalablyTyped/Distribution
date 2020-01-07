package typings.googleapis.buildSrcApisComputeBetaMod.compute_beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$TargetHttpsProxiesSetQuicOverrideRequest extends js.Object {
  /**
    * QUIC policy for the TargetHttpsProxy resource.
    */
  var quicOverride: js.UndefOr[String] = js.native
}

object Schema$TargetHttpsProxiesSetQuicOverrideRequest {
  @scala.inline
  def apply(quicOverride: String = null): Schema$TargetHttpsProxiesSetQuicOverrideRequest = {
    val __obj = js.Dynamic.literal()
    if (quicOverride != null) __obj.updateDynamic("quicOverride")(quicOverride.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$TargetHttpsProxiesSetQuicOverrideRequest]
  }
}

