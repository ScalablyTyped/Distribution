package typings.googleapis.billingbudgetsV1Mod.billingbudgetsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudBillingBudgetsV1BudgetAmount extends StObject {
  
  /**
    * Use the last period's actual spend as the budget for the present period. LastPeriodAmount can only be set when the budget's time period is a Filter.calendar_period. It cannot be set in combination with Filter.custom_period.
    */
  var lastPeriodAmount: js.UndefOr[SchemaGoogleCloudBillingBudgetsV1LastPeriodAmount] = js.undefined
  
  /**
    * A specified amount to use as the budget. `currency_code` is optional. If specified when creating a budget, it must match the currency of the billing account. If specified when updating a budget, it must match the currency_code of the existing budget. The `currency_code` is provided on output.
    */
  var specifiedAmount: js.UndefOr[SchemaGoogleTypeMoney] = js.undefined
}
object SchemaGoogleCloudBillingBudgetsV1BudgetAmount {
  
  inline def apply(): SchemaGoogleCloudBillingBudgetsV1BudgetAmount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudBillingBudgetsV1BudgetAmount]
  }
  
  extension [Self <: SchemaGoogleCloudBillingBudgetsV1BudgetAmount](x: Self) {
    
    inline def setLastPeriodAmount(value: SchemaGoogleCloudBillingBudgetsV1LastPeriodAmount): Self = StObject.set(x, "lastPeriodAmount", value.asInstanceOf[js.Any])
    
    inline def setLastPeriodAmountUndefined: Self = StObject.set(x, "lastPeriodAmount", js.undefined)
    
    inline def setSpecifiedAmount(value: SchemaGoogleTypeMoney): Self = StObject.set(x, "specifiedAmount", value.asInstanceOf[js.Any])
    
    inline def setSpecifiedAmountUndefined: Self = StObject.set(x, "specifiedAmount", js.undefined)
  }
}
