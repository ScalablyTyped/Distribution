package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XpackUsageDataTiers
  extends StObject
     with XpackUsageBase {
  
  var data_cold: XpackUsageDataTierPhaseStatistics
  
  var data_content: XpackUsageDataTierPhaseStatistics
  
  var data_frozen: js.UndefOr[XpackUsageDataTierPhaseStatistics] = js.undefined
  
  var data_hot: XpackUsageDataTierPhaseStatistics
  
  var data_warm: XpackUsageDataTierPhaseStatistics
}
object XpackUsageDataTiers {
  
  inline def apply(
    available: Boolean,
    data_cold: XpackUsageDataTierPhaseStatistics,
    data_content: XpackUsageDataTierPhaseStatistics,
    data_hot: XpackUsageDataTierPhaseStatistics,
    data_warm: XpackUsageDataTierPhaseStatistics,
    enabled: Boolean
  ): XpackUsageDataTiers = {
    val __obj = js.Dynamic.literal(available = available.asInstanceOf[js.Any], data_cold = data_cold.asInstanceOf[js.Any], data_content = data_content.asInstanceOf[js.Any], data_hot = data_hot.asInstanceOf[js.Any], data_warm = data_warm.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[XpackUsageDataTiers]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XpackUsageDataTiers] (val x: Self) extends AnyVal {
    
    inline def setData_cold(value: XpackUsageDataTierPhaseStatistics): Self = StObject.set(x, "data_cold", value.asInstanceOf[js.Any])
    
    inline def setData_content(value: XpackUsageDataTierPhaseStatistics): Self = StObject.set(x, "data_content", value.asInstanceOf[js.Any])
    
    inline def setData_frozen(value: XpackUsageDataTierPhaseStatistics): Self = StObject.set(x, "data_frozen", value.asInstanceOf[js.Any])
    
    inline def setData_frozenUndefined: Self = StObject.set(x, "data_frozen", js.undefined)
    
    inline def setData_hot(value: XpackUsageDataTierPhaseStatistics): Self = StObject.set(x, "data_hot", value.asInstanceOf[js.Any])
    
    inline def setData_warm(value: XpackUsageDataTierPhaseStatistics): Self = StObject.set(x, "data_warm", value.asInstanceOf[js.Any])
  }
}
