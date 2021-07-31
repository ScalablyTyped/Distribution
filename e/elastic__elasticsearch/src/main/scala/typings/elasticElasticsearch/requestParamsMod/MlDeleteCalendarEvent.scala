package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlDeleteCalendarEvent
  extends StObject
     with Generic {
  
  var calendar_id: String
  
  var event_id: String
}
object MlDeleteCalendarEvent {
  
  @scala.inline
  def apply(calendar_id: String, event_id: String): MlDeleteCalendarEvent = {
    val __obj = js.Dynamic.literal(calendar_id = calendar_id.asInstanceOf[js.Any], event_id = event_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlDeleteCalendarEvent]
  }
  
  @scala.inline
  implicit class MlDeleteCalendarEventMutableBuilder[Self <: MlDeleteCalendarEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCalendar_id(value: String): Self = StObject.set(x, "calendar_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvent_id(value: String): Self = StObject.set(x, "event_id", value.asInstanceOf[js.Any])
  }
}
