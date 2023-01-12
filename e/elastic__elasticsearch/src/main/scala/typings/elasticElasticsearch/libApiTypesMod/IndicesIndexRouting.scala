package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndicesIndexRouting extends StObject {
  
  var allocation: js.UndefOr[IndicesIndexRoutingAllocation] = js.undefined
  
  var rebalance: js.UndefOr[IndicesIndexRoutingRebalance] = js.undefined
}
object IndicesIndexRouting {
  
  inline def apply(): IndicesIndexRouting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IndicesIndexRouting]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IndicesIndexRouting] (val x: Self) extends AnyVal {
    
    inline def setAllocation(value: IndicesIndexRoutingAllocation): Self = StObject.set(x, "allocation", value.asInstanceOf[js.Any])
    
    inline def setAllocationUndefined: Self = StObject.set(x, "allocation", js.undefined)
    
    inline def setRebalance(value: IndicesIndexRoutingRebalance): Self = StObject.set(x, "rebalance", value.asInstanceOf[js.Any])
    
    inline def setRebalanceUndefined: Self = StObject.set(x, "rebalance", js.undefined)
  }
}
