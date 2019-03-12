package typings
package googleDashAdwordsDashScriptsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait hasSchedules extends js.Object {
  def getSchedules(): ExtensionSchedule
  def setSchedules(schedules: ExtensionScheduleInput): scala.Unit
}

object hasSchedules {
  @scala.inline
  def apply(getSchedules: () => ExtensionSchedule, setSchedules: ExtensionScheduleInput => scala.Unit): hasSchedules = {
    val __obj = js.Dynamic.literal(getSchedules = js.Any.fromFunction0(getSchedules), setSchedules = js.Any.fromFunction1(setSchedules))
  
    __obj.asInstanceOf[hasSchedules]
  }
}

