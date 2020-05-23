package typings.firefoxWebextBrowser.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorOccurred extends js.Object {
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
  /** The ID of the tab in which the frame is. */
  var tabId: Double
  /**
    * The URL currently associated with this frame, if the frame identified by the frameId existed at one point in
    * the given tab. The fact that an URL is associated with a given frameId does not imply that the corresponding
    * frame still exists.
    */
  var url: String
}

object ErrorOccurred {
  @scala.inline
  def apply(
    frameId: Double,
    parentFrameId: Double,
    tabId: Double,
    url: String,
    errorOccurred: js.UndefOr[Boolean] = js.undefined
  ): ErrorOccurred = {
    val __obj = js.Dynamic.literal(frameId = frameId.asInstanceOf[js.Any], parentFrameId = parentFrameId.asInstanceOf[js.Any], tabId = tabId.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    if (!js.isUndefined(errorOccurred)) __obj.updateDynamic("errorOccurred")(errorOccurred.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorOccurred]
  }
}

