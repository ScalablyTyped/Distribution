package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EqlHitsSequence[TEvent] extends StObject {
  
  var events: js.Array[EqlHitsEvent[TEvent]]
  
  var join_keys: js.Array[Any]
}
object EqlHitsSequence {
  
  inline def apply[TEvent](events: js.Array[EqlHitsEvent[TEvent]], join_keys: js.Array[Any]): EqlHitsSequence[TEvent] = {
    val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any], join_keys = join_keys.asInstanceOf[js.Any])
    __obj.asInstanceOf[EqlHitsSequence[TEvent]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EqlHitsSequence[?], TEvent] (val x: Self & EqlHitsSequence[TEvent]) extends AnyVal {
    
    inline def setEvents(value: js.Array[EqlHitsEvent[TEvent]]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setEventsVarargs(value: EqlHitsEvent[TEvent]*): Self = StObject.set(x, "events", js.Array(value*))
    
    inline def setJoin_keys(value: js.Array[Any]): Self = StObject.set(x, "join_keys", value.asInstanceOf[js.Any])
    
    inline def setJoin_keysVarargs(value: Any*): Self = StObject.set(x, "join_keys", js.Array(value*))
  }
}
