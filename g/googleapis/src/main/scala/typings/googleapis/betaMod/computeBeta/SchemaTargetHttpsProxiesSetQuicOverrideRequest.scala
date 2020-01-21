package typings.googleapis.betaMod.computeBeta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaTargetHttpsProxiesSetQuicOverrideRequest extends js.Object {
  /**
    * QUIC policy for the TargetHttpsProxy resource.
    */
  var quicOverride: js.UndefOr[String] = js.native
}

object SchemaTargetHttpsProxiesSetQuicOverrideRequest {
  @scala.inline
  def apply(quicOverride: String = null): SchemaTargetHttpsProxiesSetQuicOverrideRequest = {
    val __obj = js.Dynamic.literal()
    if (quicOverride != null) __obj.updateDynamic("quicOverride")(quicOverride.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaTargetHttpsProxiesSetQuicOverrideRequest]
  }
}

