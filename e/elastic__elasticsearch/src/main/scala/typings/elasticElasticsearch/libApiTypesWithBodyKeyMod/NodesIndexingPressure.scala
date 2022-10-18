package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodesIndexingPressure extends StObject {
  
  var memory: js.UndefOr[NodesIndexingPressureMemory] = js.undefined
}
object NodesIndexingPressure {
  
  inline def apply(): NodesIndexingPressure = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodesIndexingPressure]
  }
  
  extension [Self <: NodesIndexingPressure](x: Self) {
    
    inline def setMemory(value: NodesIndexingPressureMemory): Self = StObject.set(x, "memory", value.asInstanceOf[js.Any])
    
    inline def setMemoryUndefined: Self = StObject.set(x, "memory", js.undefined)
  }
}
