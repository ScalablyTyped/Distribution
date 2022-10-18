package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndicesIndexingPressure extends StObject {
  
  var memory: IndicesIndexingPressureMemory
}
object IndicesIndexingPressure {
  
  inline def apply(memory: IndicesIndexingPressureMemory): IndicesIndexingPressure = {
    val __obj = js.Dynamic.literal(memory = memory.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndicesIndexingPressure]
  }
  
  extension [Self <: IndicesIndexingPressure](x: Self) {
    
    inline def setMemory(value: IndicesIndexingPressureMemory): Self = StObject.set(x, "memory", value.asInstanceOf[js.Any])
  }
}
