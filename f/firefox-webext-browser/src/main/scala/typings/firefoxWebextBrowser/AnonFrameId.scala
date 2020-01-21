package typings.firefoxWebextBrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFrameId extends js.Object {
  /** The ID of the frame in the given tab. */
  var frameId: Double
  /** The ID of the process runs the renderer for this tab. */
  var processId: js.UndefOr[Double] = js.undefined
  /** The ID of the tab in which the frame is. */
  var tabId: Double
}

object AnonFrameId {
  @scala.inline
  def apply(frameId: Double, tabId: Double, processId: Int | Double = null): AnonFrameId = {
    val __obj = js.Dynamic.literal(frameId = frameId.asInstanceOf[js.Any], tabId = tabId.asInstanceOf[js.Any])
    if (processId != null) __obj.updateDynamic("processId")(processId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFrameId]
  }
}

