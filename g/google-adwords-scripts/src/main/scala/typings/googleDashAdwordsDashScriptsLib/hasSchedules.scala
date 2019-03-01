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
  def apply(
    getSchedules: js.Function0[ExtensionSchedule],
    setSchedules: js.Function1[ExtensionScheduleInput, scala.Unit]
  ): hasSchedules = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getSchedules")(getSchedules)
    __obj.updateDynamic("setSchedules")(setSchedules)
    __obj.asInstanceOf[hasSchedules]
  }
}

