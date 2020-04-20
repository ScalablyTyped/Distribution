package typings.dhtmlxscheduler

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
  def apply(getSchedulerInstance: () => SchedulerStatic): SchedulerEnterprise = {
    val __obj = js.Dynamic.literal(getSchedulerInstance = js.Any.fromFunction0(getSchedulerInstance))
    __obj.asInstanceOf[SchedulerEnterprise]
  }
}

