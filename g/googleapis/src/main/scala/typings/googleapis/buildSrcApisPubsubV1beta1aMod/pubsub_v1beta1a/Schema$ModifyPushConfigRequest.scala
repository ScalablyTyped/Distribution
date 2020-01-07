package typings.googleapis.buildSrcApisPubsubV1beta1aMod.pubsub_v1beta1a

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request for the ModifyPushConfig method.
  */
@js.native
trait Schema$ModifyPushConfigRequest extends js.Object {
  /**
    * An empty &lt;code&gt;push_config&lt;/code&gt; indicates that the Pub/Sub
    * system should pause pushing messages from the given subscription.
    */
  var pushConfig: js.UndefOr[Schema$PushConfig] = js.native
  /**
    * The name of the subscription.
    */
  var subscription: js.UndefOr[String] = js.native
}

object Schema$ModifyPushConfigRequest {
  @scala.inline
  def apply(pushConfig: Schema$PushConfig = null, subscription: String = null): Schema$ModifyPushConfigRequest = {
    val __obj = js.Dynamic.literal()
    if (pushConfig != null) __obj.updateDynamic("pushConfig")(pushConfig.asInstanceOf[js.Any])
    if (subscription != null) __obj.updateDynamic("subscription")(subscription.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ModifyPushConfigRequest]
  }
}

