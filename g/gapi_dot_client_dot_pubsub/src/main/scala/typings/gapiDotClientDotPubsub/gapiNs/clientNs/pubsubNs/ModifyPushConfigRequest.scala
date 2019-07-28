package typings.gapiDotClientDotPubsub.gapiNs.clientNs.pubsubNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModifyPushConfigRequest extends js.Object {
  /**
    * The push configuration for future deliveries.
    *
    * An empty `pushConfig` indicates that the Pub/Sub system should
    * stop pushing messages from the given subscription and allow
    * messages to be pulled and acknowledged - effectively pausing
    * the subscription if `Pull` or `StreamingPull` is not called.
    */
  var pushConfig: js.UndefOr[PushConfig] = js.undefined
}

object ModifyPushConfigRequest {
  @scala.inline
  def apply(pushConfig: PushConfig = null): ModifyPushConfigRequest = {
    val __obj = js.Dynamic.literal()
    if (pushConfig != null) __obj.updateDynamic("pushConfig")(pushConfig)
    __obj.asInstanceOf[ModifyPushConfigRequest]
  }
}

