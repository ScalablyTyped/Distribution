package typings.dhtmlxscheduler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchedulerEnterprise extends js.Object {
  /**
    * Creates a new instance of Scheduler
    */
  def getSchedulerInstance(): SchedulerStatic = js.native
}

object SchedulerEnterprise {
  @scala.inline
  def apply(getSchedulerInstance: () => SchedulerStatic): SchedulerEnterprise = {
    val __obj = js.Dynamic.literal(getSchedulerInstance = js.Any.fromFunction0(getSchedulerInstance))
    __obj.asInstanceOf[SchedulerEnterprise]
  }
  @scala.inline
  implicit class SchedulerEnterpriseOps[Self <: SchedulerEnterprise] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGetSchedulerInstance(value: () => SchedulerStatic): Self = this.set("getSchedulerInstance", js.Any.fromFunction0(value))
  }
  
}

