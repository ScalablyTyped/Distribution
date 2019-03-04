package typings
package dhtmlxschedulerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SchedulerEnterprise extends js.Object {
  /**
  	 * Creates a new instance of Scheduler
  	 */
  def getSchedulerInstance(): SchedulerStatic
}

object SchedulerEnterprise {
  @scala.inline
  def apply(getSchedulerInstance: js.Function0[SchedulerStatic]): SchedulerEnterprise = {
    val __obj = js.Dynamic.literal(getSchedulerInstance = getSchedulerInstance)
  
    __obj.asInstanceOf[SchedulerEnterprise]
  }
}

