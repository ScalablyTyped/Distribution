package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchPointInTimeReference extends StObject {
  
  var id: Id
  
  var keep_alive: js.UndefOr[Duration] = js.undefined
}
object SearchPointInTimeReference {
  
  inline def apply(id: Id): SearchPointInTimeReference = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchPointInTimeReference]
  }
  
  extension [Self <: SearchPointInTimeReference](x: Self) {
    
    inline def setId(value: Id): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setKeep_alive(value: Duration): Self = StObject.set(x, "keep_alive", value.asInstanceOf[js.Any])
    
    inline def setKeep_aliveUndefined: Self = StObject.set(x, "keep_alive", js.undefined)
  }
}
