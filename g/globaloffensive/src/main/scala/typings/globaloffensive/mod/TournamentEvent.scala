package typings.globaloffensive.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TournamentEvent extends StObject {
  
  var active_section_id: Double
  
  var event_id: Double
  
  var event_name: String
  
  var event_public: Double
  
  var event_stage_id: Double
  
  var event_stage_name: String
  
  var event_tag: String
  
  var event_time_end: Double
  
  var event_time_start: Double
}
object TournamentEvent {
  
  inline def apply(
    active_section_id: Double,
    event_id: Double,
    event_name: String,
    event_public: Double,
    event_stage_id: Double,
    event_stage_name: String,
    event_tag: String,
    event_time_end: Double,
    event_time_start: Double
  ): TournamentEvent = {
    val __obj = js.Dynamic.literal(active_section_id = active_section_id.asInstanceOf[js.Any], event_id = event_id.asInstanceOf[js.Any], event_name = event_name.asInstanceOf[js.Any], event_public = event_public.asInstanceOf[js.Any], event_stage_id = event_stage_id.asInstanceOf[js.Any], event_stage_name = event_stage_name.asInstanceOf[js.Any], event_tag = event_tag.asInstanceOf[js.Any], event_time_end = event_time_end.asInstanceOf[js.Any], event_time_start = event_time_start.asInstanceOf[js.Any])
    __obj.asInstanceOf[TournamentEvent]
  }
  
  extension [Self <: TournamentEvent](x: Self) {
    
    inline def setActive_section_id(value: Double): Self = StObject.set(x, "active_section_id", value.asInstanceOf[js.Any])
    
    inline def setEvent_id(value: Double): Self = StObject.set(x, "event_id", value.asInstanceOf[js.Any])
    
    inline def setEvent_name(value: String): Self = StObject.set(x, "event_name", value.asInstanceOf[js.Any])
    
    inline def setEvent_public(value: Double): Self = StObject.set(x, "event_public", value.asInstanceOf[js.Any])
    
    inline def setEvent_stage_id(value: Double): Self = StObject.set(x, "event_stage_id", value.asInstanceOf[js.Any])
    
    inline def setEvent_stage_name(value: String): Self = StObject.set(x, "event_stage_name", value.asInstanceOf[js.Any])
    
    inline def setEvent_tag(value: String): Self = StObject.set(x, "event_tag", value.asInstanceOf[js.Any])
    
    inline def setEvent_time_end(value: Double): Self = StObject.set(x, "event_time_end", value.asInstanceOf[js.Any])
    
    inline def setEvent_time_start(value: Double): Self = StObject.set(x, "event_time_start", value.asInstanceOf[js.Any])
  }
}
