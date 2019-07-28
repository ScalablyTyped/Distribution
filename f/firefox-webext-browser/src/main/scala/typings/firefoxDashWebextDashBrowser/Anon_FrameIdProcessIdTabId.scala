package typings.firefoxDashWebextDashBrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FrameIdProcessIdTabId extends js.Object {
  /**
    * 0 indicates the navigation happens in the tab content window; a positive value indicates navigation in a
    * subframe. Frame IDs are unique within a tab.
    */
  var frameId: Double
  /**
    * The ID of the process runs the renderer for this tab.
    * @deprecated Unsupported on Firefox at this time.
    */
  var processId: js.UndefOr[Double] = js.undefined
  /** The ID of the tab in which the navigation occurs. */
  var tabId: Double
  /** The time when the document finished loading, in milliseconds since the epoch. */
  var timeStamp: Double
  var url: String
}

object Anon_FrameIdProcessIdTabId {
  @scala.inline
  def apply(frameId: Double, tabId: Double, timeStamp: Double, url: String, processId: Int | Double = null): Anon_FrameIdProcessIdTabId = {
    val __obj = js.Dynamic.literal(frameId = frameId, tabId = tabId, timeStamp = timeStamp, url = url)
    if (processId != null) __obj.updateDynamic("processId")(processId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_FrameIdProcessIdTabId]
  }
}

