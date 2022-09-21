package typings.googleapis.billingbudgetsV1beta1Mod.billingbudgetsV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceBillingaccountsBudgetsCreate
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the billing account to create the budget in. Values are of the form `billingAccounts/{billingAccountId\}`.
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGoogleCloudBillingBudgetsV1beta1CreateBudgetRequest] = js.undefined
}
object ParamsResourceBillingaccountsBudgetsCreate {
  
  inline def apply(): ParamsResourceBillingaccountsBudgetsCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceBillingaccountsBudgetsCreate]
  }
  
  extension [Self <: ParamsResourceBillingaccountsBudgetsCreate](x: Self) {
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaGoogleCloudBillingBudgetsV1beta1CreateBudgetRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
