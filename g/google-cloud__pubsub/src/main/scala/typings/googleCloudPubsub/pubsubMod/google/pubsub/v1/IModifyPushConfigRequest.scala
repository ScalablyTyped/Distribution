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
  def apply(
    pushConfig: js.UndefOr[Null | IPushConfig] = js.undefined,
    subscription: js.UndefOr[Null | String] = js.undefined
  ): IModifyPushConfigRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(pushConfig)) __obj.updateDynamic("pushConfig")(pushConfig.asInstanceOf[js.Any])
    if (!js.isUndefined(subscription)) __obj.updateDynamic("subscription")(subscription.asInstanceOf[js.Any])
    __obj.asInstanceOf[IModifyPushConfigRequest]
  }
}

