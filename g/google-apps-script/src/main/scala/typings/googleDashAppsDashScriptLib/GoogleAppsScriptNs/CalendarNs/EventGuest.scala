package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.CalendarNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventGuest extends js.Object {
  def getAdditionalGuests(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  def getEmail(): java.lang.String
  def getGuestStatus(): GuestStatus
  def getName(): java.lang.String
  def getStatus(): java.lang.String
}

object EventGuest {
  @scala.inline
  def apply(
    getAdditionalGuests: js.Function0[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer],
    getEmail: js.Function0[java.lang.String],
    getGuestStatus: js.Function0[GuestStatus],
    getName: js.Function0[java.lang.String],
    getStatus: js.Function0[java.lang.String]
  ): EventGuest = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getAdditionalGuests")(getAdditionalGuests)
    __obj.updateDynamic("getEmail")(getEmail)
    __obj.updateDynamic("getGuestStatus")(getGuestStatus)
    __obj.updateDynamic("getName")(getName)
    __obj.updateDynamic("getStatus")(getStatus)
    __obj.asInstanceOf[EventGuest]
  }
}

