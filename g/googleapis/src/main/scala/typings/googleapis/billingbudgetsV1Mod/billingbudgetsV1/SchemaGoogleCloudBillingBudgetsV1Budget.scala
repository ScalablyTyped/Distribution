package typings.googleapis.billingbudgetsV1Mod.billingbudgetsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudBillingBudgetsV1Budget extends StObject {
  
  /**
    * Required. Budgeted amount.
    */
  var amount: js.UndefOr[SchemaGoogleCloudBillingBudgetsV1BudgetAmount] = js.undefined
  
  /**
    * Optional. Filters that define which resources are used to compute the actual spend against the budget amount, such as projects, services, and the budget's time period, as well as other filters.
    */
  var budgetFilter: js.UndefOr[SchemaGoogleCloudBillingBudgetsV1Filter] = js.undefined
  
  /**
    * User data for display name in UI. The name must be less than or equal to 60 characters.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. Etag to validate that the object is unchanged for a read-modify-write operation. An empty etag causes an update to overwrite other changes.
    */
  var etag: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Resource name of the budget. The resource name implies the scope of a budget. Values are of the form `billingAccounts/{billingAccountId\}/budgets/{budgetId\}`.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. Rules to apply to notifications sent based on budget spend and thresholds.
    */
  var notificationsRule: js.UndefOr[SchemaGoogleCloudBillingBudgetsV1NotificationsRule] = js.undefined
  
  /**
    * Optional. Rules that trigger alerts (notifications of thresholds being crossed) when spend exceeds the specified percentages of the budget. Optional for `pubsubTopic` notifications. Required if using email notifications.
    */
  var thresholdRules: js.UndefOr[js.Array[SchemaGoogleCloudBillingBudgetsV1ThresholdRule]] = js.undefined
}
object SchemaGoogleCloudBillingBudgetsV1Budget {
  
  inline def apply(): SchemaGoogleCloudBillingBudgetsV1Budget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudBillingBudgetsV1Budget]
  }
  
  extension [Self <: SchemaGoogleCloudBillingBudgetsV1Budget](x: Self) {
    
    inline def setAmount(value: SchemaGoogleCloudBillingBudgetsV1BudgetAmount): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
    
    inline def setBudgetFilter(value: SchemaGoogleCloudBillingBudgetsV1Filter): Self = StObject.set(x, "budgetFilter", value.asInstanceOf[js.Any])
    
    inline def setBudgetFilterUndefined: Self = StObject.set(x, "budgetFilter", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagNull: Self = StObject.set(x, "etag", null)
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNotificationsRule(value: SchemaGoogleCloudBillingBudgetsV1NotificationsRule): Self = StObject.set(x, "notificationsRule", value.asInstanceOf[js.Any])
    
    inline def setNotificationsRuleUndefined: Self = StObject.set(x, "notificationsRule", js.undefined)
    
    inline def setThresholdRules(value: js.Array[SchemaGoogleCloudBillingBudgetsV1ThresholdRule]): Self = StObject.set(x, "thresholdRules", value.asInstanceOf[js.Any])
    
    inline def setThresholdRulesUndefined: Self = StObject.set(x, "thresholdRules", js.undefined)
    
    inline def setThresholdRulesVarargs(value: SchemaGoogleCloudBillingBudgetsV1ThresholdRule*): Self = StObject.set(x, "thresholdRules", js.Array(value*))
  }
}
