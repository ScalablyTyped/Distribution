package typings.googleCloudPubsub.messageBatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchPublishOptions extends js.Object {
  var maxBytes: js.UndefOr[Double] = js.undefined
  var maxMessages: js.UndefOr[Double] = js.undefined
  var maxMilliseconds: js.UndefOr[Double] = js.undefined
}

object BatchPublishOptions {
  @scala.inline
  def apply(
    maxBytes: js.UndefOr[Double] = js.undefined,
    maxMessages: js.UndefOr[Double] = js.undefined,
    maxMilliseconds: js.UndefOr[Double] = js.undefined
  ): BatchPublishOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(maxBytes)) __obj.updateDynamic("maxBytes")(maxBytes.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxMessages)) __obj.updateDynamic("maxMessages")(maxMessages.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxMilliseconds)) __obj.updateDynamic("maxMilliseconds")(maxMilliseconds.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchPublishOptions]
  }
}

