package typings.googleapis.billingbudgetsV1beta1Mod.billingbudgetsV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceBillingaccountsBudgetsDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Name of the budget to delete. Values are of the form `billingAccounts/{billingAccountId\}/budgets/{budgetId\}`.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceBillingaccountsBudgetsDelete {
  
  inline def apply(): ParamsResourceBillingaccountsBudgetsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceBillingaccountsBudgetsDelete]
  }
  
  extension [Self <: ParamsResourceBillingaccountsBudgetsDelete](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
