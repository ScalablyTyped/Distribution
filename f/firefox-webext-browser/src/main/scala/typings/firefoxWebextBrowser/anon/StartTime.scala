package typings.firefoxWebextBrowser.anon

import typings.firefoxWebextBrowser.browser.extensionTypes.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartTime extends js.Object {
  /** Items added to history before this date. */
  var endTime: Date
  /** Items added to history after this date. */
  var startTime: Date
}

object StartTime {
  @scala.inline
  def apply(endTime: Date, startTime: Date): StartTime = {
    val __obj = js.Dynamic.literal(endTime = endTime.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartTime]
  }
}

