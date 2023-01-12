package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EqlEqlSearchResponseBase[TEvent] extends StObject {
  
  var hits: EqlEqlHits[TEvent]
  
  var id: js.UndefOr[Id] = js.undefined
  
  var is_partial: js.UndefOr[Boolean] = js.undefined
  
  var is_running: js.UndefOr[Boolean] = js.undefined
  
  var timed_out: js.UndefOr[Boolean] = js.undefined
  
  var took: js.UndefOr[DurationValue[UnitMillis]] = js.undefined
}
object EqlEqlSearchResponseBase {
  
  inline def apply[TEvent](hits: EqlEqlHits[TEvent]): EqlEqlSearchResponseBase[TEvent] = {
    val __obj = js.Dynamic.literal(hits = hits.asInstanceOf[js.Any])
    __obj.asInstanceOf[EqlEqlSearchResponseBase[TEvent]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EqlEqlSearchResponseBase[?], TEvent] (val x: Self & EqlEqlSearchResponseBase[TEvent]) extends AnyVal {
    
    inline def setHits(value: EqlEqlHits[TEvent]): Self = StObject.set(x, "hits", value.asInstanceOf[js.Any])
    
    inline def setId(value: Id): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setIs_partial(value: Boolean): Self = StObject.set(x, "is_partial", value.asInstanceOf[js.Any])
    
    inline def setIs_partialUndefined: Self = StObject.set(x, "is_partial", js.undefined)
    
    inline def setIs_running(value: Boolean): Self = StObject.set(x, "is_running", value.asInstanceOf[js.Any])
    
    inline def setIs_runningUndefined: Self = StObject.set(x, "is_running", js.undefined)
    
    inline def setTimed_out(value: Boolean): Self = StObject.set(x, "timed_out", value.asInstanceOf[js.Any])
    
    inline def setTimed_outUndefined: Self = StObject.set(x, "timed_out", js.undefined)
    
    inline def setTook(value: DurationValue[UnitMillis]): Self = StObject.set(x, "took", value.asInstanceOf[js.Any])
    
    inline def setTookUndefined: Self = StObject.set(x, "took", js.undefined)
  }
}
