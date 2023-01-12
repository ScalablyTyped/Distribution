package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodesClusterStateQueue extends StObject {
  
  var committed: js.UndefOr[long] = js.undefined
  
  var pending: js.UndefOr[long] = js.undefined
  
  var total: js.UndefOr[long] = js.undefined
}
object NodesClusterStateQueue {
  
  inline def apply(): NodesClusterStateQueue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodesClusterStateQueue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NodesClusterStateQueue] (val x: Self) extends AnyVal {
    
    inline def setCommitted(value: long): Self = StObject.set(x, "committed", value.asInstanceOf[js.Any])
    
    inline def setCommittedUndefined: Self = StObject.set(x, "committed", js.undefined)
    
    inline def setPending(value: long): Self = StObject.set(x, "pending", value.asInstanceOf[js.Any])
    
    inline def setPendingUndefined: Self = StObject.set(x, "pending", js.undefined)
    
    inline def setTotal(value: long): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    
    inline def setTotalUndefined: Self = StObject.set(x, "total", js.undefined)
  }
}
