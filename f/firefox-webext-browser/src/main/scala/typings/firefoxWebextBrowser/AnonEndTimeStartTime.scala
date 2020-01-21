package typings.firefoxWebextBrowser

import typings.firefoxWebextBrowser.browser.extensionTypes.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEndTimeStartTime extends js.Object {
  /** Items added to history before this date. */
  var endTime: Date
  /** Items added to history after this date. */
  var startTime: Date
}

object AnonEndTimeStartTime {
  @scala.inline
  def apply(endTime: Date, startTime: Date): AnonEndTimeStartTime = {
    val __obj = js.Dynamic.literal(endTime = endTime.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonEndTimeStartTime]
  }
}

