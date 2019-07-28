package typings.firefoxDashWebextDashBrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ErrorOccurred extends js.Object {
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

object Anon_ErrorOccurred {
  @scala.inline
  def apply(
    frameId: Double,
    parentFrameId: Double,
    tabId: Double,
    url: String,
    errorOccurred: js.UndefOr[Boolean] = js.undefined
  ): Anon_ErrorOccurred = {
    val __obj = js.Dynamic.literal(frameId = frameId, parentFrameId = parentFrameId, tabId = tabId, url = url)
    if (!js.isUndefined(errorOccurred)) __obj.updateDynamic("errorOccurred")(errorOccurred)
    __obj.asInstanceOf[Anon_ErrorOccurred]
  }
}

