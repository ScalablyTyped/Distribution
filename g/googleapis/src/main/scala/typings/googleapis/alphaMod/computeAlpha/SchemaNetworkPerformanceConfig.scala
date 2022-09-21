package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaNetworkPerformanceConfig extends StObject {
  
  var externalIpEgressBandwidthTier: js.UndefOr[String | Null] = js.undefined
  
  var totalEgressBandwidthTier: js.UndefOr[String | Null] = js.undefined
}
object SchemaNetworkPerformanceConfig {
  
  inline def apply(): SchemaNetworkPerformanceConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNetworkPerformanceConfig]
  }
  
  extension [Self <: SchemaNetworkPerformanceConfig](x: Self) {
    
    inline def setExternalIpEgressBandwidthTier(value: String): Self = StObject.set(x, "externalIpEgressBandwidthTier", value.asInstanceOf[js.Any])
    
    inline def setExternalIpEgressBandwidthTierNull: Self = StObject.set(x, "externalIpEgressBandwidthTier", null)
    
    inline def setExternalIpEgressBandwidthTierUndefined: Self = StObject.set(x, "externalIpEgressBandwidthTier", js.undefined)
    
    inline def setTotalEgressBandwidthTier(value: String): Self = StObject.set(x, "totalEgressBandwidthTier", value.asInstanceOf[js.Any])
    
    inline def setTotalEgressBandwidthTierNull: Self = StObject.set(x, "totalEgressBandwidthTier", null)
    
    inline def setTotalEgressBandwidthTierUndefined: Self = StObject.set(x, "totalEgressBandwidthTier", js.undefined)
  }
}
