package typings.firefoxDashWebextDashBrowser

import typings.firefoxDashWebextDashBrowser.browser.extensionTypes.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EndTimeStartTime extends js.Object {
  /** Items added to history before this date. */
  var endTime: Date
  /** Items added to history after this date. */
  var startTime: Date
}

object Anon_EndTimeStartTime {
  @scala.inline
  def apply(endTime: Date, startTime: Date): Anon_EndTimeStartTime = {
    val __obj = js.Dynamic.literal(endTime = endTime.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_EndTimeStartTime]
  }
}

