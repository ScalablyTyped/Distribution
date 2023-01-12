package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodesIndexingPressureMemory extends StObject {
  
  var current: js.UndefOr[NodesPressureMemory] = js.undefined
  
  var limit_in_bytes: js.UndefOr[long] = js.undefined
  
  var total: js.UndefOr[NodesPressureMemory] = js.undefined
}
object NodesIndexingPressureMemory {
  
  inline def apply(): NodesIndexingPressureMemory = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodesIndexingPressureMemory]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NodesIndexingPressureMemory] (val x: Self) extends AnyVal {
    
    inline def setCurrent(value: NodesPressureMemory): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
    
    inline def setCurrentUndefined: Self = StObject.set(x, "current", js.undefined)
    
    inline def setLimit_in_bytes(value: long): Self = StObject.set(x, "limit_in_bytes", value.asInstanceOf[js.Any])
    
    inline def setLimit_in_bytesUndefined: Self = StObject.set(x, "limit_in_bytes", js.undefined)
    
    inline def setTotal(value: NodesPressureMemory): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    
    inline def setTotalUndefined: Self = StObject.set(x, "total", js.undefined)
  }
}
