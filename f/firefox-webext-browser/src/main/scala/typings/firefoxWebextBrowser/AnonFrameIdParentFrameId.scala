package typings.firefoxWebextBrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFrameIdParentFrameId extends js.Object {
  /**
    * 0 indicates the navigation happens in the tab content window; a positive value indicates navigation in a
    * subframe. Frame IDs are unique for a given tab and process.
    */
  var frameId: Double
  /** ID of frame that wraps the frame. Set to -1 of no parent frame exists. */
  var parentFrameId: Double
  /**
    * The ID of the process runs the renderer for this tab.
    * @deprecated Unsupported on Firefox at this time.
    */
  var processId: js.UndefOr[Double] = js.undefined
  /** The ID of the tab in which the navigation is about to occur. */
  var tabId: Double
  /** The time when the browser was about to start the navigation, in milliseconds since the epoch. */
  var timeStamp: Double
  var url: String
}

object AnonFrameIdParentFrameId {
  @scala.inline
  def apply(
    frameId: Double,
    parentFrameId: Double,
    tabId: Double,
    timeStamp: Double,
    url: String,
    processId: Int | Double = null
  ): AnonFrameIdParentFrameId = {
    val __obj = js.Dynamic.literal(frameId = frameId.asInstanceOf[js.Any], parentFrameId = parentFrameId.asInstanceOf[js.Any], tabId = tabId.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    if (processId != null) __obj.updateDynamic("processId")(processId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFrameIdParentFrameId]
  }
}

