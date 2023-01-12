package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EqlEqlHits[TEvent] extends StObject {
  
  var events: js.UndefOr[js.Array[EqlHitsEvent[TEvent]]] = js.undefined
  
  var sequences: js.UndefOr[js.Array[EqlHitsSequence[TEvent]]] = js.undefined
  
  var total: js.UndefOr[SearchTotalHits] = js.undefined
}
object EqlEqlHits {
  
  inline def apply[TEvent](): EqlEqlHits[TEvent] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EqlEqlHits[TEvent]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EqlEqlHits[?], TEvent] (val x: Self & EqlEqlHits[TEvent]) extends AnyVal {
    
    inline def setEvents(value: js.Array[EqlHitsEvent[TEvent]]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
    
    inline def setEventsVarargs(value: EqlHitsEvent[TEvent]*): Self = StObject.set(x, "events", js.Array(value*))
    
    inline def setSequences(value: js.Array[EqlHitsSequence[TEvent]]): Self = StObject.set(x, "sequences", value.asInstanceOf[js.Any])
    
    inline def setSequencesUndefined: Self = StObject.set(x, "sequences", js.undefined)
    
    inline def setSequencesVarargs(value: EqlHitsSequence[TEvent]*): Self = StObject.set(x, "sequences", js.Array(value*))
    
    inline def setTotal(value: SearchTotalHits): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    
    inline def setTotalUndefined: Self = StObject.set(x, "total", js.undefined)
  }
}
