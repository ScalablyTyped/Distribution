package typings.googleapis.billingbudgetsV1Mod.billingbudgetsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudBillingBudgetsV1ListBudgetsResponse extends StObject {
  
  /**
    * List of the budgets owned by the requested billing account.
    */
  var budgets: js.UndefOr[js.Array[SchemaGoogleCloudBillingBudgetsV1Budget]] = js.undefined
  
  /**
    * If not empty, indicates that there may be more budgets that match the request; this value should be passed in a new `ListBudgetsRequest`.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudBillingBudgetsV1ListBudgetsResponse {
  
  inline def apply(): SchemaGoogleCloudBillingBudgetsV1ListBudgetsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudBillingBudgetsV1ListBudgetsResponse]
  }
  
  extension [Self <: SchemaGoogleCloudBillingBudgetsV1ListBudgetsResponse](x: Self) {
    
    inline def setBudgets(value: js.Array[SchemaGoogleCloudBillingBudgetsV1Budget]): Self = StObject.set(x, "budgets", value.asInstanceOf[js.Any])
    
    inline def setBudgetsUndefined: Self = StObject.set(x, "budgets", js.undefined)
    
    inline def setBudgetsVarargs(value: SchemaGoogleCloudBillingBudgetsV1Budget*): Self = StObject.set(x, "budgets", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
