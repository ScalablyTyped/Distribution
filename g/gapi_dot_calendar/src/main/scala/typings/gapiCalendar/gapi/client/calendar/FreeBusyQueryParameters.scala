package typings.gapiCalendar.gapi.client.calendar

import typings.gapiCalendar.anon.Id
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FreeBusyQueryParameters extends StObject {
  
  var calendarExpansionMax: js.UndefOr[integer] = js.native
  
  var groupExpansionMax: js.UndefOr[integer] = js.native
  
  var items: js.Array[Id] = js.native
  
  var timeMax: datetime = js.native
  
  var timeMin: datetime = js.native
  
  var timeZone: js.UndefOr[String] = js.native
}
object FreeBusyQueryParameters {
  
  @scala.inline
  def apply(items: js.Array[Id], timeMax: datetime, timeMin: datetime): FreeBusyQueryParameters = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], timeMax = timeMax.asInstanceOf[js.Any], timeMin = timeMin.asInstanceOf[js.Any])
    __obj.asInstanceOf[FreeBusyQueryParameters]
  }
  
  @scala.inline
  implicit class FreeBusyQueryParametersMutableBuilder[Self <: FreeBusyQueryParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCalendarExpansionMax(value: integer): Self = StObject.set(x, "calendarExpansionMax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCalendarExpansionMaxUndefined: Self = StObject.set(x, "calendarExpansionMax", js.undefined)
    
    @scala.inline
    def setGroupExpansionMax(value: integer): Self = StObject.set(x, "groupExpansionMax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupExpansionMaxUndefined: Self = StObject.set(x, "groupExpansionMax", js.undefined)
    
    @scala.inline
    def setItems(value: js.Array[Id]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsVarargs(value: Id*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setTimeMax(value: datetime): Self = StObject.set(x, "timeMax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeMin(value: datetime): Self = StObject.set(x, "timeMin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeZone(value: String): Self = StObject.set(x, "timeZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeZoneUndefined: Self = StObject.set(x, "timeZone", js.undefined)
  }
}
