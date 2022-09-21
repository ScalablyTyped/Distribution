package typings.googleapis.billingbudgetsV1beta1Mod.billingbudgetsV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudBillingBudgetsV1beta1CreateBudgetRequest extends StObject {
  
  /**
    * Required. Budget to create.
    */
  var budget: js.UndefOr[SchemaGoogleCloudBillingBudgetsV1beta1Budget] = js.undefined
}
object SchemaGoogleCloudBillingBudgetsV1beta1CreateBudgetRequest {
  
  inline def apply(): SchemaGoogleCloudBillingBudgetsV1beta1CreateBudgetRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudBillingBudgetsV1beta1CreateBudgetRequest]
  }
  
  extension [Self <: SchemaGoogleCloudBillingBudgetsV1beta1CreateBudgetRequest](x: Self) {
    
    inline def setBudget(value: SchemaGoogleCloudBillingBudgetsV1beta1Budget): Self = StObject.set(x, "budget", value.asInstanceOf[js.Any])
    
    inline def setBudgetUndefined: Self = StObject.set(x, "budget", js.undefined)
  }
}
