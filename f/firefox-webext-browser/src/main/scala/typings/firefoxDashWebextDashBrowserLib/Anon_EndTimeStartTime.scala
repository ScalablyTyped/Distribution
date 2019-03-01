package typings
package firefoxDashWebextDashBrowserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EndTimeStartTime extends js.Object {
  /** Items added to history before this date. */
  var endTime: firefoxDashWebextDashBrowserLib.browserNs.extensionTypesNs.Date
  /** Items added to history after this date. */
  var startTime: firefoxDashWebextDashBrowserLib.browserNs.extensionTypesNs.Date
}

object Anon_EndTimeStartTime {
  @scala.inline
  def apply(
    endTime: firefoxDashWebextDashBrowserLib.browserNs.extensionTypesNs.Date,
    startTime: firefoxDashWebextDashBrowserLib.browserNs.extensionTypesNs.Date
  ): Anon_EndTimeStartTime = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("endTime")(endTime.asInstanceOf[js.Any])
    __obj.updateDynamic("startTime")(startTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_EndTimeStartTime]
  }
}

