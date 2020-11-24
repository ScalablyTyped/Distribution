package typings.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Video
// Non-entity
@js.native
trait ExtensionSchedule extends js.Object {
  
  def getDayOfWeek(): DayOfWeekString = js.native
  
  def getEndHour(): Double = js.native
  
  def getEndMinute(): Double = js.native
  
  def getStartHour(): Double = js.native
  
  def getStartMinute(): Double = js.native
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
  
  @scala.inline
  implicit class ExtensionScheduleOps[Self <: ExtensionSchedule] (val x: Self) extends AnyVal {
    
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
    def setGetDayOfWeek(value: () => DayOfWeekString): Self = this.set("getDayOfWeek", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetEndHour(value: () => Double): Self = this.set("getEndHour", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetEndMinute(value: () => Double): Self = this.set("getEndMinute", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetStartHour(value: () => Double): Self = this.set("getStartHour", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetStartMinute(value: () => Double): Self = this.set("getStartMinute", js.Any.fromFunction0(value))
  }
}
