package typings.googleapis.calendarV3Mod.calendarV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaFreeBusyGroup extends StObject {
  
  /**
    * List of calendars&#39; identifiers within a group.
    */
  var calendars: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Optional error(s) (if computation for the group failed).
    */
  var errors: js.UndefOr[js.Array[SchemaError]] = js.undefined
}
object SchemaFreeBusyGroup {
  
  @scala.inline
  def apply(): SchemaFreeBusyGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFreeBusyGroup]
  }
  
  @scala.inline
  implicit class SchemaFreeBusyGroupMutableBuilder[Self <: SchemaFreeBusyGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCalendars(value: js.Array[String]): Self = StObject.set(x, "calendars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCalendarsUndefined: Self = StObject.set(x, "calendars", js.undefined)
    
    @scala.inline
    def setCalendarsVarargs(value: String*): Self = StObject.set(x, "calendars", js.Array(value :_*))
    
    @scala.inline
    def setErrors(value: js.Array[SchemaError]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    @scala.inline
    def setErrorsVarargs(value: SchemaError*): Self = StObject.set(x, "errors", js.Array(value :_*))
  }
}
