package typings.googleapis.authorizedbuyersmarketplaceV1Mod.authorizedbuyersmarketplaceV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDeliveryControl extends StObject {
  
  /**
    * Output only. Specifies roadblocking in a main companion lineitem.
    */
  var companionDeliveryType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Specifies strategy to use for selecting a creative when multiple creatives of the same size are available.
    */
  var creativeRotationType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Specifies how the impression delivery will be paced.
    */
  var deliveryRateType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Specifies any frequency caps. Cannot be filtered within ListDealsRequest.
    */
  var frequencyCap: js.UndefOr[js.Array[SchemaFrequencyCap]] = js.undefined
  
  /**
    * Output only. Specifies the roadblocking type in display creatives.
    */
  var roadblockingType: js.UndefOr[String | Null] = js.undefined
}
object SchemaDeliveryControl {
  
  inline def apply(): SchemaDeliveryControl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeliveryControl]
  }
  
  extension [Self <: SchemaDeliveryControl](x: Self) {
    
    inline def setCompanionDeliveryType(value: String): Self = StObject.set(x, "companionDeliveryType", value.asInstanceOf[js.Any])
    
    inline def setCompanionDeliveryTypeNull: Self = StObject.set(x, "companionDeliveryType", null)
    
    inline def setCompanionDeliveryTypeUndefined: Self = StObject.set(x, "companionDeliveryType", js.undefined)
    
    inline def setCreativeRotationType(value: String): Self = StObject.set(x, "creativeRotationType", value.asInstanceOf[js.Any])
    
    inline def setCreativeRotationTypeNull: Self = StObject.set(x, "creativeRotationType", null)
    
    inline def setCreativeRotationTypeUndefined: Self = StObject.set(x, "creativeRotationType", js.undefined)
    
    inline def setDeliveryRateType(value: String): Self = StObject.set(x, "deliveryRateType", value.asInstanceOf[js.Any])
    
    inline def setDeliveryRateTypeNull: Self = StObject.set(x, "deliveryRateType", null)
    
    inline def setDeliveryRateTypeUndefined: Self = StObject.set(x, "deliveryRateType", js.undefined)
    
    inline def setFrequencyCap(value: js.Array[SchemaFrequencyCap]): Self = StObject.set(x, "frequencyCap", value.asInstanceOf[js.Any])
    
    inline def setFrequencyCapUndefined: Self = StObject.set(x, "frequencyCap", js.undefined)
    
    inline def setFrequencyCapVarargs(value: SchemaFrequencyCap*): Self = StObject.set(x, "frequencyCap", js.Array(value*))
    
    inline def setRoadblockingType(value: String): Self = StObject.set(x, "roadblockingType", value.asInstanceOf[js.Any])
    
    inline def setRoadblockingTypeNull: Self = StObject.set(x, "roadblockingType", null)
    
    inline def setRoadblockingTypeUndefined: Self = StObject.set(x, "roadblockingType", js.undefined)
  }
}
