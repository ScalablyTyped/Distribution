package typings.googleapis.calendarV3Mod.calendarV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaFreeBusyCalendar extends StObject {
  
  /**
    * List of time ranges during which this calendar should be regarded as busy.
    */
  var busy: js.UndefOr[js.Array[SchemaTimePeriod]] = js.undefined
  
  /**
    * Optional error(s) (if computation for the calendar failed).
    */
  var errors: js.UndefOr[js.Array[SchemaError]] = js.undefined
}
object SchemaFreeBusyCalendar {
  
  inline def apply(): SchemaFreeBusyCalendar = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFreeBusyCalendar]
  }
  
  extension [Self <: SchemaFreeBusyCalendar](x: Self) {
    
    inline def setBusy(value: js.Array[SchemaTimePeriod]): Self = StObject.set(x, "busy", value.asInstanceOf[js.Any])
    
    inline def setBusyUndefined: Self = StObject.set(x, "busy", js.undefined)
    
    inline def setBusyVarargs(value: SchemaTimePeriod*): Self = StObject.set(x, "busy", js.Array(value*))
    
    inline def setErrors(value: js.Array[SchemaError]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    inline def setErrorsVarargs(value: SchemaError*): Self = StObject.set(x, "errors", js.Array(value*))
  }
}
