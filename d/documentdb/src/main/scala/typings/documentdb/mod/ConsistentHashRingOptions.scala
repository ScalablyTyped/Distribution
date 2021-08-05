package typings.documentdb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConsistentHashRingOptions extends StObject {
  
  /** Function to compute the hash for a given link or partition key */
  var computeHash: js.UndefOr[js.Function2[/* key */ String | Double, /* seed */ Double, Double]] = js.undefined
  
  /** Number of points in the ring to assign to each collection link */
  var numberOfVirtualNodesPerCollection: js.UndefOr[Double] = js.undefined
}
object ConsistentHashRingOptions {
  
  inline def apply(): ConsistentHashRingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConsistentHashRingOptions]
  }
  
  extension [Self <: ConsistentHashRingOptions](x: Self) {
    
    inline def setComputeHash(value: (/* key */ String | Double, /* seed */ Double) => Double): Self = StObject.set(x, "computeHash", js.Any.fromFunction2(value))
    
    inline def setComputeHashUndefined: Self = StObject.set(x, "computeHash", js.undefined)
    
    inline def setNumberOfVirtualNodesPerCollection(value: Double): Self = StObject.set(x, "numberOfVirtualNodesPerCollection", value.asInstanceOf[js.Any])
    
    inline def setNumberOfVirtualNodesPerCollectionUndefined: Self = StObject.set(x, "numberOfVirtualNodesPerCollection", js.undefined)
  }
}
