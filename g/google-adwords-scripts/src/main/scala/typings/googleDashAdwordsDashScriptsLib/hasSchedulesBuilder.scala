package typings
package googleDashAdwordsDashScriptsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait hasSchedulesBuilder[B] extends js.Object {
  def withSchedules(schedules: ExtensionScheduleInput): B
}

object hasSchedulesBuilder {
  @scala.inline
  def apply[B](withSchedules: js.Function1[ExtensionScheduleInput, B]): hasSchedulesBuilder[B] = {
    val __obj = js.Dynamic.literal(withSchedules = withSchedules)
  
    __obj.asInstanceOf[hasSchedulesBuilder[B]]
  }
}

