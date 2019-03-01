package typings
package firefoxDashWebextDashBrowserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FrameIdParentFrameId extends js.Object {
  /**
    * 0 indicates the navigation happens in the tab content window; a positive value indicates navigation in a
    * subframe. Frame IDs are unique for a given tab and process.
    */
  var frameId: scala.Double
  /** ID of frame that wraps the frame. Set to -1 of no parent frame exists. */
  var parentFrameId: scala.Double
  /**
    * The ID of the process runs the renderer for this tab.
    * @deprecated Unsupported on Firefox at this time.
    */
  var processId: js.UndefOr[scala.Double] = js.undefined
  /** The ID of the tab in which the navigation is about to occur. */
  var tabId: scala.Double
  /** The time when the browser was about to start the navigation, in milliseconds since the epoch. */
  var timeStamp: scala.Double
  var url: java.lang.String
}

object Anon_FrameIdParentFrameId {
  @scala.inline
  def apply(
    frameId: scala.Double,
    parentFrameId: scala.Double,
    tabId: scala.Double,
    timeStamp: scala.Double,
    url: java.lang.String,
    processId: scala.Int | scala.Double = null
  ): Anon_FrameIdParentFrameId = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("frameId")(frameId)
    __obj.updateDynamic("parentFrameId")(parentFrameId)
    __obj.updateDynamic("tabId")(tabId)
    __obj.updateDynamic("timeStamp")(timeStamp)
    __obj.updateDynamic("url")(url)
    if (processId != null) __obj.updateDynamic("processId")(processId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_FrameIdParentFrameId]
  }
}

