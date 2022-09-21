package typings.googleapis.billingbudgetsV1beta1Mod.billingbudgetsV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudBillingBudgetsV1beta1UpdateBudgetRequest extends StObject {
  
  /**
    * Required. The updated budget object. The budget to update is specified by the budget name in the budget.
    */
  var budget: js.UndefOr[SchemaGoogleCloudBillingBudgetsV1beta1Budget] = js.undefined
  
  /**
    * Optional. Indicates which fields in the provided budget to update. Read-only fields (such as `name`) cannot be changed. If this is not provided, then only fields with non-default values from the request are updated. See https://developers.google.com/protocol-buffers/docs/proto3#default for more details about default values.
    */
  var updateMask: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudBillingBudgetsV1beta1UpdateBudgetRequest {
  
  inline def apply(): SchemaGoogleCloudBillingBudgetsV1beta1UpdateBudgetRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudBillingBudgetsV1beta1UpdateBudgetRequest]
  }
  
  extension [Self <: SchemaGoogleCloudBillingBudgetsV1beta1UpdateBudgetRequest](x: Self) {
    
    inline def setBudget(value: SchemaGoogleCloudBillingBudgetsV1beta1Budget): Self = StObject.set(x, "budget", value.asInstanceOf[js.Any])
    
    inline def setBudgetUndefined: Self = StObject.set(x, "budget", js.undefined)
    
    inline def setUpdateMask(value: String): Self = StObject.set(x, "updateMask", value.asInstanceOf[js.Any])
    
    inline def setUpdateMaskNull: Self = StObject.set(x, "updateMask", null)
    
    inline def setUpdateMaskUndefined: Self = StObject.set(x, "updateMask", js.undefined)
  }
}
