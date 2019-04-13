package typings
package atGoogleDashCloudPubsubLib.atGoogleDashCloudPubsubMod.SubscriptionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PushConfig extends js.Object {
  // https://cloud.google.com/pubsub/docs/reference/rest/v1/projects.subscriptions#pushconfig
  var attributes: js.UndefOr[PushConfigAttributes] = js.undefined
  var pushEndpoint: js.UndefOr[java.lang.String] = js.undefined
}

object PushConfig {
  @scala.inline
  def apply(attributes: PushConfigAttributes = null, pushEndpoint: java.lang.String = null): PushConfig = {
    val __obj = js.Dynamic.literal()
    if (attributes != null) __obj.updateDynamic("attributes")(attributes)
    if (pushEndpoint != null) __obj.updateDynamic("pushEndpoint")(pushEndpoint)
    __obj.asInstanceOf[PushConfig]
  }
}

