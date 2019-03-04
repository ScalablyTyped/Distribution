package typings
package domDashMediacaptureDashRecordLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BlobEventInit
  extends stdLib.EventInit {
  var data: stdLib.Blob
  var timecode: js.UndefOr[scala.Double] = js.undefined
}

object BlobEventInit {
  @scala.inline
  def apply(
    data: stdLib.Blob,
    bubbles: js.UndefOr[scala.Boolean] = js.undefined,
    cancelable: js.UndefOr[scala.Boolean] = js.undefined,
    composed: js.UndefOr[scala.Boolean] = js.undefined,
    timecode: scala.Int | scala.Double = null
  ): BlobEventInit = {
    val __obj = js.Dynamic.literal(data = data)
    if (!js.isUndefined(bubbles)) __obj.updateDynamic("bubbles")(bubbles)
    if (!js.isUndefined(cancelable)) __obj.updateDynamic("cancelable")(cancelable)
    if (!js.isUndefined(composed)) __obj.updateDynamic("composed")(composed)
    if (timecode != null) __obj.updateDynamic("timecode")(timecode.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlobEventInit]
  }
}

