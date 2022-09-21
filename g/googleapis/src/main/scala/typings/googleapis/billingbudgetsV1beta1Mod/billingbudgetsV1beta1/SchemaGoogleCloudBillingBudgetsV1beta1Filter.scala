package typings.googleapis.billingbudgetsV1beta1Mod.billingbudgetsV1beta1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudBillingBudgetsV1beta1Filter extends StObject {
  
  /**
    * Optional. Specifies to track usage for recurring calendar period. For example, assume that CalendarPeriod.QUARTER is set. The budget will track usage from April 1 to June 30, when the current calendar month is April, May, June. After that, it will track usage from July 1 to September 30 when the current calendar month is July, August, September, so on.
    */
  var calendarPeriod: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. If Filter.credit_types_treatment is INCLUDE_SPECIFIED_CREDITS, this is a list of credit types to be subtracted from gross cost to determine the spend for threshold calculations. See [a list of acceptable credit type values](https://cloud.google.com/billing/docs/how-to/export-data-bigquery-tables#credits-type). If Filter.credit_types_treatment is **not** INCLUDE_SPECIFIED_CREDITS, this field must be empty.
    */
  var creditTypes: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Optional. If not set, default behavior is `INCLUDE_ALL_CREDITS`.
    */
  var creditTypesTreatment: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. Specifies to track usage from any start date (required) to any end date (optional). This time period is static, it does not recur.
    */
  var customPeriod: js.UndefOr[SchemaGoogleCloudBillingBudgetsV1beta1CustomPeriod] = js.undefined
  
  /**
    * Optional. A single label and value pair specifying that usage from only this set of labeled resources should be included in the budget. If omitted, the report will include all labeled and unlabeled usage. An object containing a single `"key": value` pair. Example: `{ "name": "wrench" \}`. _Currently, multiple entries or multiple values per entry are not allowed._
    */
  var labels: js.UndefOr[StringDictionary[js.Array[Any]] | Null] = js.undefined
  
  /**
    * Optional. A set of projects of the form `projects/{project\}`, specifying that usage from only this set of projects should be included in the budget. If omitted, the report will include all usage for the billing account, regardless of which project the usage occurred on. Only zero or one project can be specified currently.
    */
  var projects: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Optional. A set of services of the form `services/{service_id\}`, specifying that usage from only this set of services should be included in the budget. If omitted, the report will include usage for all the services. The service names are available through the Catalog API: https://cloud.google.com/billing/v1/how-tos/catalog-api.
    */
  var services: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Optional. A set of subaccounts of the form `billingAccounts/{account_id\}`, specifying that usage from only this set of subaccounts should be included in the budget. If a subaccount is set to the name of the parent account, usage from the parent account will be included. If omitted, the report will include usage from the parent account and all subaccounts, if they exist.
    */
  var subaccounts: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaGoogleCloudBillingBudgetsV1beta1Filter {
  
  inline def apply(): SchemaGoogleCloudBillingBudgetsV1beta1Filter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudBillingBudgetsV1beta1Filter]
  }
  
  extension [Self <: SchemaGoogleCloudBillingBudgetsV1beta1Filter](x: Self) {
    
    inline def setCalendarPeriod(value: String): Self = StObject.set(x, "calendarPeriod", value.asInstanceOf[js.Any])
    
    inline def setCalendarPeriodNull: Self = StObject.set(x, "calendarPeriod", null)
    
    inline def setCalendarPeriodUndefined: Self = StObject.set(x, "calendarPeriod", js.undefined)
    
    inline def setCreditTypes(value: js.Array[String]): Self = StObject.set(x, "creditTypes", value.asInstanceOf[js.Any])
    
    inline def setCreditTypesNull: Self = StObject.set(x, "creditTypes", null)
    
    inline def setCreditTypesTreatment(value: String): Self = StObject.set(x, "creditTypesTreatment", value.asInstanceOf[js.Any])
    
    inline def setCreditTypesTreatmentNull: Self = StObject.set(x, "creditTypesTreatment", null)
    
    inline def setCreditTypesTreatmentUndefined: Self = StObject.set(x, "creditTypesTreatment", js.undefined)
    
    inline def setCreditTypesUndefined: Self = StObject.set(x, "creditTypes", js.undefined)
    
    inline def setCreditTypesVarargs(value: String*): Self = StObject.set(x, "creditTypes", js.Array(value*))
    
    inline def setCustomPeriod(value: SchemaGoogleCloudBillingBudgetsV1beta1CustomPeriod): Self = StObject.set(x, "customPeriod", value.asInstanceOf[js.Any])
    
    inline def setCustomPeriodUndefined: Self = StObject.set(x, "customPeriod", js.undefined)
    
    inline def setLabels(value: StringDictionary[js.Array[Any]]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsNull: Self = StObject.set(x, "labels", null)
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setProjects(value: js.Array[String]): Self = StObject.set(x, "projects", value.asInstanceOf[js.Any])
    
    inline def setProjectsNull: Self = StObject.set(x, "projects", null)
    
    inline def setProjectsUndefined: Self = StObject.set(x, "projects", js.undefined)
    
    inline def setProjectsVarargs(value: String*): Self = StObject.set(x, "projects", js.Array(value*))
    
    inline def setServices(value: js.Array[String]): Self = StObject.set(x, "services", value.asInstanceOf[js.Any])
    
    inline def setServicesNull: Self = StObject.set(x, "services", null)
    
    inline def setServicesUndefined: Self = StObject.set(x, "services", js.undefined)
    
    inline def setServicesVarargs(value: String*): Self = StObject.set(x, "services", js.Array(value*))
    
    inline def setSubaccounts(value: js.Array[String]): Self = StObject.set(x, "subaccounts", value.asInstanceOf[js.Any])
    
    inline def setSubaccountsNull: Self = StObject.set(x, "subaccounts", null)
    
    inline def setSubaccountsUndefined: Self = StObject.set(x, "subaccounts", js.undefined)
    
    inline def setSubaccountsVarargs(value: String*): Self = StObject.set(x, "subaccounts", js.Array(value*))
  }
}
