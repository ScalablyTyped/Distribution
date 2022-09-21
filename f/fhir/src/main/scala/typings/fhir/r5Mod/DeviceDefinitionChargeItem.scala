package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceDefinitionChargeItem
  extends StObject
     with BackboneElement {
  
  /**
    * The code or reference for the charge item.
    */
  var chargeItemCode: CodeableReference
  
  /**
    * Coefficient applicable to the billing code.
    */
  var count: Quantity
  
  /**
    * A specific time period in which this charge item applies.
    */
  var effectivePeriod: js.UndefOr[Period] = js.undefined
  
  /**
    * The context to which this charge item applies.
    */
  var useContext: js.UndefOr[js.Array[UsageContext]] = js.undefined
}
object DeviceDefinitionChargeItem {
  
  inline def apply(chargeItemCode: CodeableReference, count: Quantity): DeviceDefinitionChargeItem = {
    val __obj = js.Dynamic.literal(chargeItemCode = chargeItemCode.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceDefinitionChargeItem]
  }
  
  extension [Self <: DeviceDefinitionChargeItem](x: Self) {
    
    inline def setChargeItemCode(value: CodeableReference): Self = StObject.set(x, "chargeItemCode", value.asInstanceOf[js.Any])
    
    inline def setCount(value: Quantity): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setEffectivePeriod(value: Period): Self = StObject.set(x, "effectivePeriod", value.asInstanceOf[js.Any])
    
    inline def setEffectivePeriodUndefined: Self = StObject.set(x, "effectivePeriod", js.undefined)
    
    inline def setUseContext(value: js.Array[UsageContext]): Self = StObject.set(x, "useContext", value.asInstanceOf[js.Any])
    
    inline def setUseContextUndefined: Self = StObject.set(x, "useContext", js.undefined)
    
    inline def setUseContextVarargs(value: UsageContext*): Self = StObject.set(x, "useContext", js.Array(value*))
  }
}
