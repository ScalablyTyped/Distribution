package typings.googleCloudPubsub.messageStreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageStreamOptions extends js.Object {
  var highWaterMark: js.UndefOr[Double] = js.undefined
  var maxStreams: js.UndefOr[Double] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
}

object MessageStreamOptions {
  @scala.inline
  def apply(
    highWaterMark: js.UndefOr[Double] = js.undefined,
    maxStreams: js.UndefOr[Double] = js.undefined,
    timeout: js.UndefOr[Double] = js.undefined
  ): MessageStreamOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(highWaterMark)) __obj.updateDynamic("highWaterMark")(highWaterMark.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxStreams)) __obj.updateDynamic("maxStreams")(maxStreams.get.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageStreamOptions]
  }
}

