package typings.googleapis.cloudbuildV1Mod.cloudbuildV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBitbucketServerSecrets extends StObject {
  
  /**
    * Required. The resource name for the admin access token's secret version.
    */
  var adminAccessTokenVersionName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The resource name for the read access token's secret version.
    */
  var readAccessTokenVersionName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. Immutable. The resource name for the webhook secret's secret version. Once this field has been set, it cannot be changed. If you need to change it, please create another BitbucketServerConfig.
    */
  var webhookSecretVersionName: js.UndefOr[String | Null] = js.undefined
}
object SchemaBitbucketServerSecrets {
  
  inline def apply(): SchemaBitbucketServerSecrets = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBitbucketServerSecrets]
  }
  
  extension [Self <: SchemaBitbucketServerSecrets](x: Self) {
    
    inline def setAdminAccessTokenVersionName(value: String): Self = StObject.set(x, "adminAccessTokenVersionName", value.asInstanceOf[js.Any])
    
    inline def setAdminAccessTokenVersionNameNull: Self = StObject.set(x, "adminAccessTokenVersionName", null)
    
    inline def setAdminAccessTokenVersionNameUndefined: Self = StObject.set(x, "adminAccessTokenVersionName", js.undefined)
    
    inline def setReadAccessTokenVersionName(value: String): Self = StObject.set(x, "readAccessTokenVersionName", value.asInstanceOf[js.Any])
    
    inline def setReadAccessTokenVersionNameNull: Self = StObject.set(x, "readAccessTokenVersionName", null)
    
    inline def setReadAccessTokenVersionNameUndefined: Self = StObject.set(x, "readAccessTokenVersionName", js.undefined)
    
    inline def setWebhookSecretVersionName(value: String): Self = StObject.set(x, "webhookSecretVersionName", value.asInstanceOf[js.Any])
    
    inline def setWebhookSecretVersionNameNull: Self = StObject.set(x, "webhookSecretVersionName", null)
    
    inline def setWebhookSecretVersionNameUndefined: Self = StObject.set(x, "webhookSecretVersionName", js.undefined)
  }
}
