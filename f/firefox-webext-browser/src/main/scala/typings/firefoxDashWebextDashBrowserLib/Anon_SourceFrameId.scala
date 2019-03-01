package typings
package firefoxDashWebextDashBrowserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_SourceFrameId extends js.Object {
  /**
    * The ID of the frame with sourceTabId in which the navigation is triggered. 0 indicates the main frame.
    */
  var sourceFrameId: scala.Double
  /** The ID of the process runs the renderer for the source tab. */
  var sourceProcessId: scala.Double
  /** The ID of the tab in which the navigation is triggered. */
  var sourceTabId: scala.Double
  /** The ID of the tab in which the url is opened */
  var tabId: scala.Double
  /** The time when the browser was about to create a new view, in milliseconds since the epoch. */
  var timeStamp: scala.Double
  /** The URL to be opened in the new window. */
  var url: java.lang.String
}

object Anon_SourceFrameId {
  @scala.inline
  def apply(
    sourceFrameId: scala.Double,
    sourceProcessId: scala.Double,
    sourceTabId: scala.Double,
    tabId: scala.Double,
    timeStamp: scala.Double,
    url: java.lang.String
  ): Anon_SourceFrameId = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("sourceFrameId")(sourceFrameId)
    __obj.updateDynamic("sourceProcessId")(sourceProcessId)
    __obj.updateDynamic("sourceTabId")(sourceTabId)
    __obj.updateDynamic("tabId")(tabId)
    __obj.updateDynamic("timeStamp")(timeStamp)
    __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[Anon_SourceFrameId]
  }
}

