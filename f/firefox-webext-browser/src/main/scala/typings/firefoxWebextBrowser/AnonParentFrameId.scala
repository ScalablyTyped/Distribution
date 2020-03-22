package typings.firefoxWebextBrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonParentFrameId extends js.Object {
  /**
    * True if the last navigation in this frame was interrupted by an error, i.e. the onErrorOccurred event fired.
    */
  var errorOccurred: js.UndefOr[Boolean] = js.undefined
  /**
    * The ID of the frame. 0 indicates that this is the main frame; a positive value indicates the ID of a
    * subframe.
    */
  var frameId: Double
  /** ID of frame that wraps the frame. Set to -1 of no parent frame exists. */
  var parentFrameId: Double
  /**
    * The ID of the process runs the renderer for this tab.
    * @deprecated Unsupported on Firefox at this time.
    */
  var processId: js.UndefOr[Double] = js.undefined
  /** The ID of the tab in which the frame is. */
  var tabId: Double
  /** The URL currently associated with this frame. */
  var url: String
}

object AnonParentFrameId {
  @scala.inline
  def apply(
    frameId: Double,
    parentFrameId: Double,
    tabId: Double,
    url: String,
    errorOccurred: js.UndefOr[Boolean] = js.undefined,
    processId: Int | Double = null
  ): AnonParentFrameId = {
    val __obj = js.Dynamic.literal(frameId = frameId.asInstanceOf[js.Any], parentFrameId = parentFrameId.asInstanceOf[js.Any], tabId = tabId.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    if (!js.isUndefined(errorOccurred)) __obj.updateDynamic("errorOccurred")(errorOccurred.asInstanceOf[js.Any])
    if (processId != null) __obj.updateDynamic("processId")(processId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonParentFrameId]
  }
}

