package typings.googleapis.billingbudgetsV1Mod.billingbudgetsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudBillingBudgetsV1ThresholdRule extends StObject {
  
  /**
    * Optional. The type of basis used to determine if spend has passed the threshold. Behavior defaults to CURRENT_SPEND if not set.
    */
  var spendBasis: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. Send an alert when this threshold is exceeded. This is a 1.0-based percentage, so 0.5 = 50%. Validation: non-negative number.
    */
  var thresholdPercent: js.UndefOr[Double | Null] = js.undefined
}
object SchemaGoogleCloudBillingBudgetsV1ThresholdRule {
  
  inline def apply(): SchemaGoogleCloudBillingBudgetsV1ThresholdRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudBillingBudgetsV1ThresholdRule]
  }
  
  extension [Self <: SchemaGoogleCloudBillingBudgetsV1ThresholdRule](x: Self) {
    
    inline def setSpendBasis(value: String): Self = StObject.set(x, "spendBasis", value.asInstanceOf[js.Any])
    
    inline def setSpendBasisNull: Self = StObject.set(x, "spendBasis", null)
    
    inline def setSpendBasisUndefined: Self = StObject.set(x, "spendBasis", js.undefined)
    
    inline def setThresholdPercent(value: Double): Self = StObject.set(x, "thresholdPercent", value.asInstanceOf[js.Any])
    
    inline def setThresholdPercentNull: Self = StObject.set(x, "thresholdPercent", null)
    
    inline def setThresholdPercentUndefined: Self = StObject.set(x, "thresholdPercent", js.undefined)
  }
}
