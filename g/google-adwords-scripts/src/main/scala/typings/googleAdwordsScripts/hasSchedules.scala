package typings.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait hasSchedules extends js.Object {
  
  def getSchedules(): ExtensionSchedule = js.native
  
  def setSchedules(schedules: ExtensionScheduleInput): Unit = js.native
}
object hasSchedules {
  
  @scala.inline
  def apply(getSchedules: () => ExtensionSchedule, setSchedules: ExtensionScheduleInput => Unit): hasSchedules = {
    val __obj = js.Dynamic.literal(getSchedules = js.Any.fromFunction0(getSchedules), setSchedules = js.Any.fromFunction1(setSchedules))
    __obj.asInstanceOf[hasSchedules]
  }
  
  @scala.inline
  implicit class hasSchedulesOps[Self <: hasSchedules] (val x: Self) extends AnyVal {
    
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
    def setGetSchedules(value: () => ExtensionSchedule): Self = this.set("getSchedules", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetSchedules(value: ExtensionScheduleInput => Unit): Self = this.set("setSchedules", js.Any.fromFunction1(value))
  }
}
