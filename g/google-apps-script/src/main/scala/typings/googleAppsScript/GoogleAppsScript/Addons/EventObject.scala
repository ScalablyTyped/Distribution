package typings.googleAppsScript.GoogleAppsScript.Addons

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @summary Addon Event Object
  * @see https://developers.google.com/workspace/add-ons/concepts/event-objects#event_object_structure
  */
trait EventObject extends StObject {
  
  var calendar: js.UndefOr[CalendarEventObject] = js.undefined
  
  var commonEventObject: CommonEventObject
  
  var docs: js.UndefOr[DocsEventObject] = js.undefined
  
  var drive: js.UndefOr[DriveEventObject] = js.undefined
  
  var gmail: js.UndefOr[GmailEventObject] = js.undefined
  
  var sheets: js.UndefOr[SheetsEventObject] = js.undefined
  
  var slides: js.UndefOr[SlidesEventObject] = js.undefined
}
object EventObject {
  
  inline def apply(commonEventObject: CommonEventObject): EventObject = {
    val __obj = js.Dynamic.literal(commonEventObject = commonEventObject.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventObject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EventObject] (val x: Self) extends AnyVal {
    
    inline def setCalendar(value: CalendarEventObject): Self = StObject.set(x, "calendar", value.asInstanceOf[js.Any])
    
    inline def setCalendarUndefined: Self = StObject.set(x, "calendar", js.undefined)
    
    inline def setCommonEventObject(value: CommonEventObject): Self = StObject.set(x, "commonEventObject", value.asInstanceOf[js.Any])
    
    inline def setDocs(value: DocsEventObject): Self = StObject.set(x, "docs", value.asInstanceOf[js.Any])
    
    inline def setDocsUndefined: Self = StObject.set(x, "docs", js.undefined)
    
    inline def setDrive(value: DriveEventObject): Self = StObject.set(x, "drive", value.asInstanceOf[js.Any])
    
    inline def setDriveUndefined: Self = StObject.set(x, "drive", js.undefined)
    
    inline def setGmail(value: GmailEventObject): Self = StObject.set(x, "gmail", value.asInstanceOf[js.Any])
    
    inline def setGmailUndefined: Self = StObject.set(x, "gmail", js.undefined)
    
    inline def setSheets(value: SheetsEventObject): Self = StObject.set(x, "sheets", value.asInstanceOf[js.Any])
    
    inline def setSheetsUndefined: Self = StObject.set(x, "sheets", js.undefined)
    
    inline def setSlides(value: SlidesEventObject): Self = StObject.set(x, "slides", value.asInstanceOf[js.Any])
    
    inline def setSlidesUndefined: Self = StObject.set(x, "slides", js.undefined)
  }
}
