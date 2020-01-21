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
    maxMessages: Int | Double = null,
    maxMilliseconds: Int | Double = null
  ): BatchOptions = {
    val __obj = js.Dynamic.literal()
    if (callOptions != null) __obj.updateDynamic("callOptions")(callOptions.asInstanceOf[js.Any])
    if (maxMessages != null) __obj.updateDynamic("maxMessages")(maxMessages.asInstanceOf[js.Any])
    if (maxMilliseconds != null) __obj.updateDynamic("maxMilliseconds")(maxMilliseconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchOptions]
  }
}

