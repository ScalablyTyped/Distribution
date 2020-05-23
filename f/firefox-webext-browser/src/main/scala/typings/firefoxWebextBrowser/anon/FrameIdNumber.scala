package typings.firefoxWebextBrowser.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FrameIdNumber extends js.Object {
  /** Send a message to a specific frame identified by `frameId` instead of all frames in the tab. */
  var frameId: js.UndefOr[Double] = js.undefined
}

object FrameIdNumber {
  @scala.inline
  def apply(frameId: js.UndefOr[Double] = js.undefined): FrameIdNumber = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(frameId)) __obj.updateDynamic("frameId")(frameId.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[FrameIdNumber]
  }
}

