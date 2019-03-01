package typings
package firefoxDashWebextDashBrowserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ErrorOccurredFrameId extends js.Object {
  /**
    * True if the last navigation in this frame was interrupted by an error, i.e. the onErrorOccurred event fired.
    */
  var errorOccurred: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The ID of the frame. 0 indicates that this is the main frame; a positive value indicates the ID of a
    * subframe.
    */
  var frameId: scala.Double
  /** ID of frame that wraps the frame. Set to -1 of no parent frame exists. */
  var parentFrameId: scala.Double
  /**
    * The ID of the process runs the renderer for this tab.
    * @deprecated Unsupported on Firefox at this time.
    */
  var processId: js.UndefOr[scala.Double] = js.undefined
  /** The ID of the tab in which the frame is. */
  var tabId: scala.Double
  /** The URL currently associated with this frame. */
  var url: java.lang.String
}

object Anon_ErrorOccurredFrameId {
  @scala.inline
  def apply(
    frameId: scala.Double,
    parentFrameId: scala.Double,
    tabId: scala.Double,
    url: java.lang.String,
    errorOccurred: js.UndefOr[scala.Boolean] = js.undefined,
    processId: scala.Int | scala.Double = null
  ): Anon_ErrorOccurredFrameId = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("frameId")(frameId)
    __obj.updateDynamic("parentFrameId")(parentFrameId)
    __obj.updateDynamic("tabId")(tabId)
    __obj.updateDynamic("url")(url)
    if (!js.isUndefined(errorOccurred)) __obj.updateDynamic("errorOccurred")(errorOccurred)
    if (processId != null) __obj.updateDynamic("processId")(processId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ErrorOccurredFrameId]
  }
}

