package typings
package firefoxDashWebextDashBrowserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ErrorOccurred extends js.Object {
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
  /** The ID of the tab in which the frame is. */
  var tabId: scala.Double
  /**
    * The URL currently associated with this frame, if the frame identified by the frameId existed at one point in
    * the given tab. The fact that an URL is associated with a given frameId does not imply that the corresponding
    * frame still exists.
    */
  var url: java.lang.String
}

object Anon_ErrorOccurred {
  @scala.inline
  def apply(
    frameId: scala.Double,
    parentFrameId: scala.Double,
    tabId: scala.Double,
    url: java.lang.String,
    errorOccurred: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_ErrorOccurred = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("frameId")(frameId)
    __obj.updateDynamic("parentFrameId")(parentFrameId)
    __obj.updateDynamic("tabId")(tabId)
    __obj.updateDynamic("url")(url)
    if (!js.isUndefined(errorOccurred)) __obj.updateDynamic("errorOccurred")(errorOccurred)
    __obj.asInstanceOf[Anon_ErrorOccurred]
  }
}

