package typings.gapiCalendar.gapi.client.calendar

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CalendarListInsertParameters extends StObject {
  
  // Parameters
  // Optional query parameters
  var colorRgbFormat: js.UndefOr[Boolean] = js.undefined
  
  // CalendarList resource
  var resource: CalendarListInput
}
object CalendarListInsertParameters {
  
  inline def apply(resource: CalendarListInput): CalendarListInsertParameters = {
    val __obj = js.Dynamic.literal(resource = resource.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalendarListInsertParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CalendarListInsertParameters] (val x: Self) extends AnyVal {
    
    inline def setColorRgbFormat(value: Boolean): Self = StObject.set(x, "colorRgbFormat", value.asInstanceOf[js.Any])
    
    inline def setColorRgbFormatUndefined: Self = StObject.set(x, "colorRgbFormat", js.undefined)
    
    inline def setResource(value: CalendarListInput): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
  }
}
