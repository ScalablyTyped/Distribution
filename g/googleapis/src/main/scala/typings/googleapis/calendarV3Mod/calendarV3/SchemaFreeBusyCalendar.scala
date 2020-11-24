package typings.googleapis.calendarV3Mod.calendarV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaFreeBusyCalendar extends js.Object {
  
  /**
    * List of time ranges during which this calendar should be regarded as
    * busy.
    */
  var busy: js.UndefOr[js.Array[SchemaTimePeriod]] = js.native
  
  /**
    * Optional error(s) (if computation for the calendar failed).
    */
  var errors: js.UndefOr[js.Array[SchemaError]] = js.native
}
object SchemaFreeBusyCalendar {
  
  @scala.inline
  def apply(): SchemaFreeBusyCalendar = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFreeBusyCalendar]
  }
  
  @scala.inline
  implicit class SchemaFreeBusyCalendarOps[Self <: SchemaFreeBusyCalendar] (val x: Self) extends AnyVal {
    
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
    def setBusyVarargs(value: SchemaTimePeriod*): Self = this.set("busy", js.Array(value :_*))
    
    @scala.inline
    def setBusy(value: js.Array[SchemaTimePeriod]): Self = this.set("busy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBusy: Self = this.set("busy", js.undefined)
    
    @scala.inline
    def setErrorsVarargs(value: SchemaError*): Self = this.set("errors", js.Array(value :_*))
    
    @scala.inline
    def setErrors(value: js.Array[SchemaError]): Self = this.set("errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrors: Self = this.set("errors", js.undefined)
  }
}
