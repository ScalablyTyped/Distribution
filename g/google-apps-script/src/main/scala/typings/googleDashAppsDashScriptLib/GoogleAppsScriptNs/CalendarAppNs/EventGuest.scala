package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.CalendarAppNs

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
    getAdditionalGuests: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    getEmail: () => java.lang.String,
    getGuestStatus: () => GuestStatus,
    getName: () => java.lang.String,
    getStatus: () => java.lang.String
  ): EventGuest = {
    val __obj = js.Dynamic.literal(getAdditionalGuests = js.Any.fromFunction0(getAdditionalGuests), getEmail = js.Any.fromFunction0(getEmail), getGuestStatus = js.Any.fromFunction0(getGuestStatus), getName = js.Any.fromFunction0(getName), getStatus = js.Any.fromFunction0(getStatus))
  
    __obj.asInstanceOf[EventGuest]
  }
}

