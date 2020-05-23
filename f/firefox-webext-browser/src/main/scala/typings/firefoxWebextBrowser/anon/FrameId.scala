package typings.firefoxWebextBrowser.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FrameId extends js.Object {
  /** The ID of the frame in the given tab. */
  var frameId: Double
  /** The ID of the process runs the renderer for this tab. */
  var processId: js.UndefOr[Double] = js.undefined
  /** The ID of the tab in which the frame is. */
  var tabId: Double
}

object FrameId {
  @scala.inline
  def apply(frameId: Double, tabId: Double, processId: js.UndefOr[Double] = js.undefined): FrameId = {
    val __obj = js.Dynamic.literal(frameId = frameId.asInstanceOf[js.Any], tabId = tabId.asInstanceOf[js.Any])
    if (!js.isUndefined(processId)) __obj.updateDynamic("processId")(processId.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[FrameId]
  }
}

