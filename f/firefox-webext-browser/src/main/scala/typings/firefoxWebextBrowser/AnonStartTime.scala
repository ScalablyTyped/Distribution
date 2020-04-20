package typings.firefoxWebextBrowser

import typings.firefoxWebextBrowser.browser.extensionTypes.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonStartTime extends js.Object {
  /** Items added to history before this date. */
  var endTime: Date
  /** Items added to history after this date. */
  var startTime: Date
}

object AnonStartTime {
  @scala.inline
  def apply(endTime: Date, startTime: Date): AnonStartTime = {
    val __obj = js.Dynamic.literal(endTime = endTime.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonStartTime]
  }
}

