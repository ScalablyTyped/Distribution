package typings.googleapis.buildSrcApisPubsubV1Mod.pubsub_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request for the ModifyPushConfig method.
  */
@js.native
trait Schema$ModifyPushConfigRequest extends js.Object {
  /**
    * The push configuration for future deliveries.  An empty `pushConfig`
    * indicates that the Pub/Sub system should stop pushing messages from the
    * given subscription and allow messages to be pulled and acknowledged -
    * effectively pausing the subscription if `Pull` or `StreamingPull` is not
    * called.
    */
  var pushConfig: js.UndefOr[Schema$PushConfig] = js.native
}

object Schema$ModifyPushConfigRequest {
  @scala.inline
  def apply(pushConfig: Schema$PushConfig = null): Schema$ModifyPushConfigRequest = {
    val __obj = js.Dynamic.literal()
    if (pushConfig != null) __obj.updateDynamic("pushConfig")(pushConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ModifyPushConfigRequest]
  }
}

