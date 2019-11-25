package typings.domDashMediacaptureDashRecord

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
    timecode: Int | Double = null
  ): BlobEventInit = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    if (!js.isUndefined(bubbles)) __obj.updateDynamic("bubbles")(bubbles.asInstanceOf[js.Any])
    if (!js.isUndefined(cancelable)) __obj.updateDynamic("cancelable")(cancelable.asInstanceOf[js.Any])
    if (!js.isUndefined(composed)) __obj.updateDynamic("composed")(composed.asInstanceOf[js.Any])
    if (timecode != null) __obj.updateDynamic("timecode")(timecode.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlobEventInit]
  }
}

