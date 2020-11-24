package typings.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Time window specified for weekly operations.
  */
@js.native
trait SchemaResourcePolicyWeeklyCycle extends js.Object {
  
  /**
    * Up to 7 intervals/windows, one for each day of the week.
    */
  var dayOfWeeks: js.UndefOr[js.Array[SchemaResourcePolicyWeeklyCycleDayOfWeek]] = js.native
}
object SchemaResourcePolicyWeeklyCycle {
  
  @scala.inline
  def apply(): SchemaResourcePolicyWeeklyCycle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResourcePolicyWeeklyCycle]
  }
  
  @scala.inline
  implicit class SchemaResourcePolicyWeeklyCycleOps[Self <: SchemaResourcePolicyWeeklyCycle] (val x: Self) extends AnyVal {
    
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
    def setDayOfWeeksVarargs(value: SchemaResourcePolicyWeeklyCycleDayOfWeek*): Self = this.set("dayOfWeeks", js.Array(value :_*))
    
    @scala.inline
    def setDayOfWeeks(value: js.Array[SchemaResourcePolicyWeeklyCycleDayOfWeek]): Self = this.set("dayOfWeeks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDayOfWeeks: Self = this.set("dayOfWeeks", js.undefined)
  }
}
