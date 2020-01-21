package typings.firefoxWebextBrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSourceFrameId extends js.Object {
  /**
    * The ID of the frame with sourceTabId in which the navigation is triggered. 0 indicates the main frame.
    */
  var sourceFrameId: Double
  /** The ID of the process runs the renderer for the source tab. */
  var sourceProcessId: Double
  /** The ID of the tab in which the navigation is triggered. */
  var sourceTabId: Double
  /** The ID of the tab in which the url is opened */
  var tabId: Double
  /** The time when the browser was about to create a new view, in milliseconds since the epoch. */
  var timeStamp: Double
  /** The URL to be opened in the new window. */
  var url: String
}

object AnonSourceFrameId {
  @scala.inline
  def apply(
    sourceFrameId: Double,
    sourceProcessId: Double,
    sourceTabId: Double,
    tabId: Double,
    timeStamp: Double,
    url: String
  ): AnonSourceFrameId = {
    val __obj = js.Dynamic.literal(sourceFrameId = sourceFrameId.asInstanceOf[js.Any], sourceProcessId = sourceProcessId.asInstanceOf[js.Any], sourceTabId = sourceTabId.asInstanceOf[js.Any], tabId = tabId.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonSourceFrameId]
  }
}

