package typings.gapiCalendar.gapi.client.calendar

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CalendarListInsertParameters extends StObject {
  
  // Parameters
  // Optional query parameters
  var colorRgbFormat: js.UndefOr[Boolean] = js.native
  
  // CalendarList resource
  var resource: CalendarListInput = js.native
}
object CalendarListInsertParameters {
  
  @scala.inline
  def apply(resource: CalendarListInput): CalendarListInsertParameters = {
    val __obj = js.Dynamic.literal(resource = resource.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalendarListInsertParameters]
  }
  
  @scala.inline
  implicit class CalendarListInsertParametersMutableBuilder[Self <: CalendarListInsertParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColorRgbFormat(value: Boolean): Self = StObject.set(x, "colorRgbFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorRgbFormatUndefined: Self = StObject.set(x, "colorRgbFormat", js.undefined)
    
    @scala.inline
    def setResource(value: CalendarListInput): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
  }
}
