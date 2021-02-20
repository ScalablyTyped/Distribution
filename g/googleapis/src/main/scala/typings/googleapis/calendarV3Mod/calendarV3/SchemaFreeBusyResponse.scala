package typings.googleapis.calendarV3Mod.calendarV3

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaFreeBusyResponse extends StObject {
  
  /**
    * List of free/busy information for calendars.
    */
  var calendars: js.UndefOr[StringDictionary[SchemaFreeBusyCalendar]] = js.native
  
  /**
    * Expansion of groups.
    */
  var groups: js.UndefOr[StringDictionary[SchemaFreeBusyGroup]] = js.native
  
  /**
    * Type of the resource (&quot;calendar#freeBusy&quot;).
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * The end of the interval.
    */
  var timeMax: js.UndefOr[String] = js.native
  
  /**
    * The start of the interval.
    */
  var timeMin: js.UndefOr[String] = js.native
}
object SchemaFreeBusyResponse {
  
  @scala.inline
  def apply(): SchemaFreeBusyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFreeBusyResponse]
  }
  
  @scala.inline
  implicit class SchemaFreeBusyResponseMutableBuilder[Self <: SchemaFreeBusyResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCalendars(value: StringDictionary[SchemaFreeBusyCalendar]): Self = StObject.set(x, "calendars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCalendarsUndefined: Self = StObject.set(x, "calendars", js.undefined)
    
    @scala.inline
    def setGroups(value: StringDictionary[SchemaFreeBusyGroup]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupsUndefined: Self = StObject.set(x, "groups", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setTimeMax(value: String): Self = StObject.set(x, "timeMax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeMaxUndefined: Self = StObject.set(x, "timeMax", js.undefined)
    
    @scala.inline
    def setTimeMin(value: String): Self = StObject.set(x, "timeMin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeMinUndefined: Self = StObject.set(x, "timeMin", js.undefined)
  }
}
