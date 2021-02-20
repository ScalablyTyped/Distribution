package typings.googleapis.calendarV3Mod.calendarV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaCalendar extends StObject {
  
  /**
    * Conferencing properties for this calendar, for example what types of
    * conferences are allowed.
    */
  var conferenceProperties: js.UndefOr[SchemaConferenceProperties] = js.native
  
  /**
    * Description of the calendar. Optional.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * ETag of the resource.
    */
  var etag: js.UndefOr[String] = js.native
  
  /**
    * Identifier of the calendar. To retrieve IDs call the calendarList.list()
    * method.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * Type of the resource (&quot;calendar#calendar&quot;).
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * Geographic location of the calendar as free-form text. Optional.
    */
  var location: js.UndefOr[String] = js.native
  
  /**
    * Title of the calendar.
    */
  var summary: js.UndefOr[String] = js.native
  
  /**
    * The time zone of the calendar. (Formatted as an IANA Time Zone Database
    * name, e.g. &quot;Europe/Zurich&quot;.) Optional.
    */
  var timeZone: js.UndefOr[String] = js.native
}
object SchemaCalendar {
  
  @scala.inline
  def apply(): SchemaCalendar = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCalendar]
  }
  
  @scala.inline
  implicit class SchemaCalendarMutableBuilder[Self <: SchemaCalendar] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConferenceProperties(value: SchemaConferenceProperties): Self = StObject.set(x, "conferenceProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConferencePropertiesUndefined: Self = StObject.set(x, "conferenceProperties", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    @scala.inline
    def setSummary(value: String): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSummaryUndefined: Self = StObject.set(x, "summary", js.undefined)
    
    @scala.inline
    def setTimeZone(value: String): Self = StObject.set(x, "timeZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeZoneUndefined: Self = StObject.set(x, "timeZone", js.undefined)
  }
}
