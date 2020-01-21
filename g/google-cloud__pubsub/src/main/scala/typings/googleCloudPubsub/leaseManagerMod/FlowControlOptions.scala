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
    maxBytes: Int | Double = null,
    maxExtension: Int | Double = null,
    maxMessages: Int | Double = null
  ): FlowControlOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowExcessMessages)) __obj.updateDynamic("allowExcessMessages")(allowExcessMessages.asInstanceOf[js.Any])
    if (maxBytes != null) __obj.updateDynamic("maxBytes")(maxBytes.asInstanceOf[js.Any])
    if (maxExtension != null) __obj.updateDynamic("maxExtension")(maxExtension.asInstanceOf[js.Any])
    if (maxMessages != null) __obj.updateDynamic("maxMessages")(maxMessages.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowControlOptions]
  }
}

