package typings.googleapis.calendarV3Mod.calendarV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaFreeBusyCalendar extends StObject {
  
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
  implicit class SchemaFreeBusyCalendarMutableBuilder[Self <: SchemaFreeBusyCalendar] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBusy(value: js.Array[SchemaTimePeriod]): Self = StObject.set(x, "busy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBusyUndefined: Self = StObject.set(x, "busy", js.undefined)
    
    @scala.inline
    def setBusyVarargs(value: SchemaTimePeriod*): Self = StObject.set(x, "busy", js.Array(value :_*))
    
    @scala.inline
    def setErrors(value: js.Array[SchemaError]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    @scala.inline
    def setErrorsVarargs(value: SchemaError*): Self = StObject.set(x, "errors", js.Array(value :_*))
  }
}
