package typings.googleapis.baremetalsolutionV2Mod.baremetalsolutionV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaQosPolicy extends StObject {
  
  /**
    * The bandwidth permitted by the QOS policy, in gbps.
    */
  var bandwidthGbps: js.UndefOr[Double | Null] = js.undefined
}
object SchemaQosPolicy {
  
  inline def apply(): SchemaQosPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaQosPolicy]
  }
  
  extension [Self <: SchemaQosPolicy](x: Self) {
    
    inline def setBandwidthGbps(value: Double): Self = StObject.set(x, "bandwidthGbps", value.asInstanceOf[js.Any])
    
    inline def setBandwidthGbpsNull: Self = StObject.set(x, "bandwidthGbps", null)
    
    inline def setBandwidthGbpsUndefined: Self = StObject.set(x, "bandwidthGbps", js.undefined)
  }
}
