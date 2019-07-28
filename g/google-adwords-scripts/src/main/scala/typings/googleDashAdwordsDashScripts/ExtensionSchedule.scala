package typings.googleDashAdwordsDashScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Video
// Non-entity
trait ExtensionSchedule extends js.Object {
  def getDayOfWeek(): DayOfWeekString
  def getEndHour(): Double
  def getEndMinute(): Double
  def getStartHour(): Double
  def getStartMinute(): Double
}

object ExtensionSchedule {
  @scala.inline
  def apply(
    getDayOfWeek: () => DayOfWeekString,
    getEndHour: () => Double,
    getEndMinute: () => Double,
    getStartHour: () => Double,
    getStartMinute: () => Double
  ): ExtensionSchedule = {
    val __obj = js.Dynamic.literal(getDayOfWeek = js.Any.fromFunction0(getDayOfWeek), getEndHour = js.Any.fromFunction0(getEndHour), getEndMinute = js.Any.fromFunction0(getEndMinute), getStartHour = js.Any.fromFunction0(getStartHour), getStartMinute = js.Any.fromFunction0(getStartMinute))
  
    __obj.asInstanceOf[ExtensionSchedule]
  }
}

