package typings.firefoxWebextBrowser.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ErrorOccurred extends js.Object {
  /**
    * True if the last navigation in this frame was interrupted by an error, i.e. the onErrorOccurred event fired.
    */
  var errorOccurred: js.UndefOr[Boolean] = js.native
  /**
    * The ID of the frame. 0 indicates that this is the main frame; a positive value indicates the ID of a
    * subframe.
    */
  var frameId: Double = js.native
  /** ID of frame that wraps the frame. Set to -1 of no parent frame exists. */
  var parentFrameId: Double = js.native
  /** The ID of the tab in which the frame is. */
  var tabId: Double = js.native
  /**
    * The URL currently associated with this frame, if the frame identified by the frameId existed at one point in
    * the given tab. The fact that an URL is associated with a given frameId does not imply that the corresponding
    * frame still exists.
    */
  var url: String = js.native
}

object ErrorOccurred {
  @scala.inline
  def apply(frameId: Double, parentFrameId: Double, tabId: Double, url: String): ErrorOccurred = {
    val __obj = js.Dynamic.literal(frameId = frameId.asInstanceOf[js.Any], parentFrameId = parentFrameId.asInstanceOf[js.Any], tabId = tabId.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorOccurred]
  }
  @scala.inline
  implicit class ErrorOccurredOps[Self <: ErrorOccurred] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFrameId(value: Double): Self = this.set("frameId", value.asInstanceOf[js.Any])
    @scala.inline
    def setParentFrameId(value: Double): Self = this.set("parentFrameId", value.asInstanceOf[js.Any])
    @scala.inline
    def setTabId(value: Double): Self = this.set("tabId", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def setErrorOccurred(value: Boolean): Self = this.set("errorOccurred", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrorOccurred: Self = this.set("errorOccurred", js.undefined)
  }
  
}

