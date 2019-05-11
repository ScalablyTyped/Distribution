package typings
package atGoogleDashCloudPubsubLib.buildSrcLeaseDashManagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlowControlOptions extends js.Object {
  var allowExcessMessages: js.UndefOr[scala.Boolean] = js.undefined
  var maxBytes: js.UndefOr[scala.Double] = js.undefined
  var maxExtension: js.UndefOr[scala.Double] = js.undefined
  var maxMessages: js.UndefOr[scala.Double] = js.undefined
}

object FlowControlOptions {
  @scala.inline
  def apply(
    allowExcessMessages: js.UndefOr[scala.Boolean] = js.undefined,
    maxBytes: scala.Int | scala.Double = null,
    maxExtension: scala.Int | scala.Double = null,
    maxMessages: scala.Int | scala.Double = null
  ): FlowControlOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowExcessMessages)) __obj.updateDynamic("allowExcessMessages")(allowExcessMessages)
    if (maxBytes != null) __obj.updateDynamic("maxBytes")(maxBytes.asInstanceOf[js.Any])
    if (maxExtension != null) __obj.updateDynamic("maxExtension")(maxExtension.asInstanceOf[js.Any])
    if (maxMessages != null) __obj.updateDynamic("maxMessages")(maxMessages.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowControlOptions]
  }
}

