package typings
package atGoogleDashCloudPubsubLib.atGoogleDashCloudPubsubMod.PubSubNs.PubSubNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateSubscriptionOptions extends js.Object {
  var flowControl: js.UndefOr[atGoogleDashCloudPubsubLib.Anon_MaxBytes] = js.undefined
  var gaxOpts: js.UndefOr[atGoogleDashCloudPubsubLib.atGoogleDashCloudPubsubMod.PubSubNs.GAXNs.CallOptions] = js.undefined
  var messageRetentionDuration: js.UndefOr[scala.Double | stdLib.Date] = js.undefined
  var pushEndpoint: js.UndefOr[java.lang.String] = js.undefined
  var retainAckedMessages: js.UndefOr[scala.Boolean] = js.undefined
}

object CreateSubscriptionOptions {
  @scala.inline
  def apply(
    flowControl: atGoogleDashCloudPubsubLib.Anon_MaxBytes = null,
    gaxOpts: atGoogleDashCloudPubsubLib.atGoogleDashCloudPubsubMod.PubSubNs.GAXNs.CallOptions = null,
    messageRetentionDuration: scala.Double | stdLib.Date = null,
    pushEndpoint: java.lang.String = null,
    retainAckedMessages: js.UndefOr[scala.Boolean] = js.undefined
  ): CreateSubscriptionOptions = {
    val __obj = js.Dynamic.literal()
    if (flowControl != null) __obj.updateDynamic("flowControl")(flowControl)
    if (gaxOpts != null) __obj.updateDynamic("gaxOpts")(gaxOpts)
    if (messageRetentionDuration != null) __obj.updateDynamic("messageRetentionDuration")(messageRetentionDuration.asInstanceOf[js.Any])
    if (pushEndpoint != null) __obj.updateDynamic("pushEndpoint")(pushEndpoint)
    if (!js.isUndefined(retainAckedMessages)) __obj.updateDynamic("retainAckedMessages")(retainAckedMessages)
    __obj.asInstanceOf[CreateSubscriptionOptions]
  }
}

