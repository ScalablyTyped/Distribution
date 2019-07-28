package typings.firefoxDashWebextDashBrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FrameIdNumber extends js.Object {
  /** Send a message to a specific frame identified by `frameId` instead of all frames in the tab. */
  var frameId: js.UndefOr[Double] = js.undefined
}

object Anon_FrameIdNumber {
  @scala.inline
  def apply(frameId: Int | Double = null): Anon_FrameIdNumber = {
    val __obj = js.Dynamic.literal()
    if (frameId != null) __obj.updateDynamic("frameId")(frameId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_FrameIdNumber]
  }
}

