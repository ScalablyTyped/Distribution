package typings.firefoxDashWebextDashBrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Error extends js.Object {
  /**
    * The error description.
    * @deprecated Unsupported on Firefox at this time.
    */
  var error: js.UndefOr[String] = js.undefined
  /**
    * 0 indicates the navigation happens in the tab content window; a positive value indicates navigation in a
    * subframe. Frame IDs are unique within a tab.
    */
  var frameId: Double
  /**
    * The ID of the process runs the renderer for this tab.
    * @deprecated Unsupported on Firefox at this time.
    */
  var processId: js.UndefOr[Double] = js.undefined
  /** The ID of the tab in which the navigation occurs. */
  var tabId: Double
  /** The time when the error occurred, in milliseconds since the epoch. */
  var timeStamp: Double
  var url: String
}

object Anon_Error {
  @scala.inline
  def apply(
    frameId: Double,
    tabId: Double,
    timeStamp: Double,
    url: String,
    error: String = null,
    processId: Int | Double = null
  ): Anon_Error = {
    val __obj = js.Dynamic.literal(frameId = frameId.asInstanceOf[js.Any], tabId = tabId.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (processId != null) __obj.updateDynamic("processId")(processId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Error]
  }
}

