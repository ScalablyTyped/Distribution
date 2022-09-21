package typings.googleapis.calendarV3Mod.calendarV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaFreeBusyGroup extends StObject {
  
  /**
    * List of calendars' identifiers within a group.
    */
  var calendars: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Optional error(s) (if computation for the group failed).
    */
  var errors: js.UndefOr[js.Array[SchemaError]] = js.undefined
}
object SchemaFreeBusyGroup {
  
  inline def apply(): SchemaFreeBusyGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFreeBusyGroup]
  }
  
  extension [Self <: SchemaFreeBusyGroup](x: Self) {
    
    inline def setCalendars(value: js.Array[String]): Self = StObject.set(x, "calendars", value.asInstanceOf[js.Any])
    
    inline def setCalendarsNull: Self = StObject.set(x, "calendars", null)
    
    inline def setCalendarsUndefined: Self = StObject.set(x, "calendars", js.undefined)
    
    inline def setCalendarsVarargs(value: String*): Self = StObject.set(x, "calendars", js.Array(value*))
    
    inline def setErrors(value: js.Array[SchemaError]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    inline def setErrorsVarargs(value: SchemaError*): Self = StObject.set(x, "errors", js.Array(value*))
  }
}
