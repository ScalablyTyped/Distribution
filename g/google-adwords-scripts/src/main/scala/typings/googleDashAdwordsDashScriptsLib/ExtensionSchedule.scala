package typings
package googleDashAdwordsDashScriptsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Video
// Non-entity
trait ExtensionSchedule extends js.Object {
  def getDayOfWeek(): DayOfWeekString
  def getEndHour(): scala.Double
  def getEndMinute(): scala.Double
  def getStartHour(): scala.Double
  def getStartMinute(): scala.Double
}

object ExtensionSchedule {
  @scala.inline
  def apply(
    getDayOfWeek: () => DayOfWeekString,
    getEndHour: () => scala.Double,
    getEndMinute: () => scala.Double,
    getStartHour: () => scala.Double,
    getStartMinute: () => scala.Double
  ): ExtensionSchedule = {
    val __obj = js.Dynamic.literal(getDayOfWeek = js.Any.fromFunction0(getDayOfWeek), getEndHour = js.Any.fromFunction0(getEndHour), getEndMinute = js.Any.fromFunction0(getEndMinute), getStartHour = js.Any.fromFunction0(getStartHour), getStartMinute = js.Any.fromFunction0(getStartMinute))
  
    __obj.asInstanceOf[ExtensionSchedule]
  }
}

