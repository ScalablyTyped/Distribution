package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSubsetting extends StObject {
  
  var policy: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The number of backends per backend group assigned to each proxy instance or each service mesh client. An input parameter to the `CONSISTENT_HASH_SUBSETTING` algorithm. Can only be set if `policy` is set to `CONSISTENT_HASH_SUBSETTING`. Can only be set if load balancing scheme is `INTERNAL_MANAGED` or `INTERNAL_SELF_MANAGED`. `subset_size` is optional for Internal HTTP(S) load balancing and required for Traffic Director. If you do not provide this value, Cloud Load Balancing will calculate it dynamically to optimize the number of proxies/clients visible to each backend and vice versa. Must be greater than 0. If `subset_size` is larger than the number of backends/endpoints, then subsetting is disabled.
    */
  var subsetSize: js.UndefOr[Double | Null] = js.undefined
}
object SchemaSubsetting {
  
  inline def apply(): SchemaSubsetting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSubsetting]
  }
  
  extension [Self <: SchemaSubsetting](x: Self) {
    
    inline def setPolicy(value: String): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
    
    inline def setPolicyNull: Self = StObject.set(x, "policy", null)
    
    inline def setPolicyUndefined: Self = StObject.set(x, "policy", js.undefined)
    
    inline def setSubsetSize(value: Double): Self = StObject.set(x, "subsetSize", value.asInstanceOf[js.Any])
    
    inline def setSubsetSizeNull: Self = StObject.set(x, "subsetSize", null)
    
    inline def setSubsetSizeUndefined: Self = StObject.set(x, "subsetSize", js.undefined)
  }
}
