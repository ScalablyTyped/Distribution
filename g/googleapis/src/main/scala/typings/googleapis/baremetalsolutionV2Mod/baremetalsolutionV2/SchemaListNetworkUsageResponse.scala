package typings.googleapis.baremetalsolutionV2Mod.baremetalsolutionV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListNetworkUsageResponse extends StObject {
  
  /**
    * Networks with IPs.
    */
  var networks: js.UndefOr[js.Array[SchemaNetworkUsage]] = js.undefined
}
object SchemaListNetworkUsageResponse {
  
  inline def apply(): SchemaListNetworkUsageResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListNetworkUsageResponse]
  }
  
  extension [Self <: SchemaListNetworkUsageResponse](x: Self) {
    
    inline def setNetworks(value: js.Array[SchemaNetworkUsage]): Self = StObject.set(x, "networks", value.asInstanceOf[js.Any])
    
    inline def setNetworksUndefined: Self = StObject.set(x, "networks", js.undefined)
    
    inline def setNetworksVarargs(value: SchemaNetworkUsage*): Self = StObject.set(x, "networks", js.Array(value*))
  }
}
