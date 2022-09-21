package typings.googleapis.billingbudgetsV1beta1Mod.billingbudgetsV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceBillingaccountsBudgetsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Name of budget to get. Values are of the form `billingAccounts/{billingAccountId\}/budgets/{budgetId\}`.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceBillingaccountsBudgetsGet {
  
  inline def apply(): ParamsResourceBillingaccountsBudgetsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceBillingaccountsBudgetsGet]
  }
  
  extension [Self <: ParamsResourceBillingaccountsBudgetsGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
