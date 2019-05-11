package typings
package atGoogleDashCloudPubsubLib.buildSrcSubscriberMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubscriberOptions extends js.Object {
  var ackDeadline: js.UndefOr[scala.Double] = js.undefined
  var batching: js.UndefOr[atGoogleDashCloudPubsubLib.buildSrcMessageDashQueuesMod.BatchOptions] = js.undefined
  var flowControl: js.UndefOr[atGoogleDashCloudPubsubLib.buildSrcLeaseDashManagerMod.FlowControlOptions] = js.undefined
  var streamingOptions: js.UndefOr[atGoogleDashCloudPubsubLib.buildSrcMessageDashStreamMod.MessageStreamOptions] = js.undefined
}

object SubscriberOptions {
  @scala.inline
  def apply(
    ackDeadline: scala.Int | scala.Double = null,
    batching: atGoogleDashCloudPubsubLib.buildSrcMessageDashQueuesMod.BatchOptions = null,
    flowControl: atGoogleDashCloudPubsubLib.buildSrcLeaseDashManagerMod.FlowControlOptions = null,
    streamingOptions: atGoogleDashCloudPubsubLib.buildSrcMessageDashStreamMod.MessageStreamOptions = null
  ): SubscriberOptions = {
    val __obj = js.Dynamic.literal()
    if (ackDeadline != null) __obj.updateDynamic("ackDeadline")(ackDeadline.asInstanceOf[js.Any])
    if (batching != null) __obj.updateDynamic("batching")(batching)
    if (flowControl != null) __obj.updateDynamic("flowControl")(flowControl)
    if (streamingOptions != null) __obj.updateDynamic("streamingOptions")(streamingOptions)
    __obj.asInstanceOf[SubscriberOptions]
  }
}

