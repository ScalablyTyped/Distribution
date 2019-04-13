package typings
package atGoogleDashCloudPubsubLib.atGoogleDashCloudPubsubMod.PubSubNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubscriptionOptions extends js.Object {
  var flowControl: js.UndefOr[atGoogleDashCloudPubsubLib.Anon_MaxBytes] = js.undefined
  var maxConnections: js.UndefOr[scala.Double] = js.undefined
}

object SubscriptionOptions {
  @scala.inline
  def apply(
    flowControl: atGoogleDashCloudPubsubLib.Anon_MaxBytes = null,
    maxConnections: scala.Int | scala.Double = null
  ): SubscriptionOptions = {
    val __obj = js.Dynamic.literal()
    if (flowControl != null) __obj.updateDynamic("flowControl")(flowControl)
    if (maxConnections != null) __obj.updateDynamic("maxConnections")(maxConnections.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscriptionOptions]
  }
}

