package typings.googleapis.baremetalsolutionV1alpha1Mod.baremetalsolutionV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListProvisioningQuotasResponse extends StObject {
  
  /**
    * Token to retrieve the next page of results, or empty if there are no more results in the list.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The provisioning quotas registered in this project.
    */
  var provisioningQuotas: js.UndefOr[js.Array[SchemaProvisioningQuota]] = js.undefined
}
object SchemaListProvisioningQuotasResponse {
  
  inline def apply(): SchemaListProvisioningQuotasResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListProvisioningQuotasResponse]
  }
  
  extension [Self <: SchemaListProvisioningQuotasResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setProvisioningQuotas(value: js.Array[SchemaProvisioningQuota]): Self = StObject.set(x, "provisioningQuotas", value.asInstanceOf[js.Any])
    
    inline def setProvisioningQuotasUndefined: Self = StObject.set(x, "provisioningQuotas", js.undefined)
    
    inline def setProvisioningQuotasVarargs(value: SchemaProvisioningQuota*): Self = StObject.set(x, "provisioningQuotas", js.Array(value*))
  }
}
