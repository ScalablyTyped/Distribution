package typings
package firefoxDashWebextDashBrowserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FrameId extends js.Object {
  /** The ID of the frame in the given tab. */
  var frameId: scala.Double
  /** The ID of the process runs the renderer for this tab. */
  var processId: js.UndefOr[scala.Double] = js.undefined
  /** The ID of the tab in which the frame is. */
  var tabId: scala.Double
}

object Anon_FrameId {
  @scala.inline
  def apply(frameId: scala.Double, tabId: scala.Double, processId: scala.Int | scala.Double = null): Anon_FrameId = {
    val __obj = js.Dynamic.literal(frameId = frameId, tabId = tabId)
    if (processId != null) __obj.updateDynamic("processId")(processId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_FrameId]
  }
}

