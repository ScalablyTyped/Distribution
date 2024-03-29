package typings.googleapis.apigatewayV1betaMod.apigatewayV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaApigatewayBackendConfig extends StObject {
  
  /**
    * Google Cloud IAM service account used to sign OIDC tokens for backends that have authentication configured (https://cloud.google.com/service-infrastructure/docs/service-management/reference/rest/v1/services.configs#backend). This may either be the Service Account's email (i.e. "{ACCOUNT_ID\}@{PROJECT\}.iam.gserviceaccount.com") or its full resource name (i.e. "projects/{PROJECT\}/accounts/{UNIQUE_ID\}"). This is most often used when the backend is a GCP resource such as a Cloud Run Service or an IAP-secured service. Note that this token is always sent as an authorization header bearer token. The audience of the OIDC token is configured in the associated Service Config in the BackendRule option (https://github.com/googleapis/googleapis/blob/master/google/api/backend.proto#L125).
    */
  var googleServiceAccount: js.UndefOr[String | Null] = js.undefined
}
object SchemaApigatewayBackendConfig {
  
  inline def apply(): SchemaApigatewayBackendConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaApigatewayBackendConfig]
  }
  
  extension [Self <: SchemaApigatewayBackendConfig](x: Self) {
    
    inline def setGoogleServiceAccount(value: String): Self = StObject.set(x, "googleServiceAccount", value.asInstanceOf[js.Any])
    
    inline def setGoogleServiceAccountNull: Self = StObject.set(x, "googleServiceAccount", null)
    
    inline def setGoogleServiceAccountUndefined: Self = StObject.set(x, "googleServiceAccount", js.undefined)
  }
}
