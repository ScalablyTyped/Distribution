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
    getDayOfWeek: js.Function0[DayOfWeekString],
    getEndHour: js.Function0[scala.Double],
    getEndMinute: js.Function0[scala.Double],
    getStartHour: js.Function0[scala.Double],
    getStartMinute: js.Function0[scala.Double]
  ): ExtensionSchedule = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getDayOfWeek")(getDayOfWeek)
    __obj.updateDynamic("getEndHour")(getEndHour)
    __obj.updateDynamic("getEndMinute")(getEndMinute)
    __obj.updateDynamic("getStartHour")(getStartHour)
    __obj.updateDynamic("getStartMinute")(getStartMinute)
    __obj.asInstanceOf[ExtensionSchedule]
  }
}

