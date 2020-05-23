package typings.googleCloudPubsub.messageQueuesMod

import typings.googleGax.gaxMod.CallOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchOptions extends js.Object {
  var callOptions: js.UndefOr[CallOptions] = js.undefined
  var maxMessages: js.UndefOr[Double] = js.undefined
  var maxMilliseconds: js.UndefOr[Double] = js.undefined
}

object BatchOptions {
  @scala.inline
  def apply(
    callOptions: CallOptions = null,
    maxMessages: js.UndefOr[Double] = js.undefined,
    maxMilliseconds: js.UndefOr[Double] = js.undefined
  ): BatchOptions = {
    val __obj = js.Dynamic.literal()
    if (callOptions != null) __obj.updateDynamic("callOptions")(callOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(maxMessages)) __obj.updateDynamic("maxMessages")(maxMessages.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxMilliseconds)) __obj.updateDynamic("maxMilliseconds")(maxMilliseconds.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchOptions]
  }
}

