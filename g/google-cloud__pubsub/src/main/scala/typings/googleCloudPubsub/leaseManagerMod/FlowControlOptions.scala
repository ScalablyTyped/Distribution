package typings.googleCloudPubsub.leaseManagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlowControlOptions extends js.Object {
  var allowExcessMessages: js.UndefOr[Boolean] = js.undefined
  var maxBytes: js.UndefOr[Double] = js.undefined
  var maxExtension: js.UndefOr[Double] = js.undefined
  var maxMessages: js.UndefOr[Double] = js.undefined
}

object FlowControlOptions {
  @scala.inline
  def apply(
    allowExcessMessages: js.UndefOr[Boolean] = js.undefined,
    maxBytes: js.UndefOr[Double] = js.undefined,
    maxExtension: js.UndefOr[Double] = js.undefined,
    maxMessages: js.UndefOr[Double] = js.undefined
  ): FlowControlOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowExcessMessages)) __obj.updateDynamic("allowExcessMessages")(allowExcessMessages.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxBytes)) __obj.updateDynamic("maxBytes")(maxBytes.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxExtension)) __obj.updateDynamic("maxExtension")(maxExtension.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxMessages)) __obj.updateDynamic("maxMessages")(maxMessages.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowControlOptions]
  }
}

