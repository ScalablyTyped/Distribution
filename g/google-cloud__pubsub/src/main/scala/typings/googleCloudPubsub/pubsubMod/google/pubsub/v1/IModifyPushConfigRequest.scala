package typings.googleCloudPubsub.pubsubMod.google.pubsub.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a ModifyPushConfigRequest. */
trait IModifyPushConfigRequest extends js.Object {
  /** ModifyPushConfigRequest pushConfig */
  var pushConfig: js.UndefOr[IPushConfig | Null] = js.undefined
  /** ModifyPushConfigRequest subscription */
  var subscription: js.UndefOr[String | Null] = js.undefined
}

object IModifyPushConfigRequest {
  @scala.inline
  def apply(pushConfig: IPushConfig = null, subscription: String = null): IModifyPushConfigRequest = {
    val __obj = js.Dynamic.literal()
    if (pushConfig != null) __obj.updateDynamic("pushConfig")(pushConfig.asInstanceOf[js.Any])
    if (subscription != null) __obj.updateDynamic("subscription")(subscription.asInstanceOf[js.Any])
    __obj.asInstanceOf[IModifyPushConfigRequest]
  }
}

