package typings.domMediacaptureRecord

import typings.std.Blob
import typings.std.EventInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BlobEventInit extends EventInit {
  var data: Blob
  var timecode: js.UndefOr[Double] = js.undefined
}

object BlobEventInit {
  @scala.inline
  def apply(
    data: Blob,
    bubbles: js.UndefOr[Boolean] = js.undefined,
    cancelable: js.UndefOr[Boolean] = js.undefined,
    composed: js.UndefOr[Boolean] = js.undefined,
    timecode: js.UndefOr[Double] = js.undefined
  ): BlobEventInit = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    if (!js.isUndefined(bubbles)) __obj.updateDynamic("bubbles")(bubbles.get.asInstanceOf[js.Any])
    if (!js.isUndefined(cancelable)) __obj.updateDynamic("cancelable")(cancelable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(composed)) __obj.updateDynamic("composed")(composed.get.asInstanceOf[js.Any])
    if (!js.isUndefined(timecode)) __obj.updateDynamic("timecode")(timecode.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlobEventInit]
  }
}

