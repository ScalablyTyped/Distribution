package typings
package firefoxDashWebextDashBrowserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Error extends js.Object {
  /**
    * The error description.
    * @deprecated Unsupported on Firefox at this time.
    */
  var error: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 0 indicates the navigation happens in the tab content window; a positive value indicates navigation in a
    * subframe. Frame IDs are unique within a tab.
    */
  var frameId: scala.Double
  /**
    * The ID of the process runs the renderer for this tab.
    * @deprecated Unsupported on Firefox at this time.
    */
  var processId: js.UndefOr[scala.Double] = js.undefined
  /** The ID of the tab in which the navigation occurs. */
  var tabId: scala.Double
  /** The time when the error occurred, in milliseconds since the epoch. */
  var timeStamp: scala.Double
  var url: java.lang.String
}

object Anon_Error {
  @scala.inline
  def apply(
    frameId: scala.Double,
    tabId: scala.Double,
    timeStamp: scala.Double,
    url: java.lang.String,
    error: java.lang.String = null,
    processId: scala.Int | scala.Double = null
  ): Anon_Error = {
    val __obj = js.Dynamic.literal(frameId = frameId, tabId = tabId, timeStamp = timeStamp, url = url)
    if (error != null) __obj.updateDynamic("error")(error)
    if (processId != null) __obj.updateDynamic("processId")(processId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Error]
  }
}

