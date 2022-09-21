package typings.googleapis.cloudbuildV1Mod.cloudbuildV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGitHubEnterpriseSecrets extends StObject {
  
  /**
    * The resource name for the OAuth client ID secret in Secret Manager.
    */
  var oauthClientIdName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The resource name for the OAuth client ID secret version in Secret Manager.
    */
  var oauthClientIdVersionName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The resource name for the OAuth secret in Secret Manager.
    */
  var oauthSecretName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The resource name for the OAuth secret secret version in Secret Manager.
    */
  var oauthSecretVersionName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The resource name for the private key secret.
    */
  var privateKeyName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The resource name for the private key secret version.
    */
  var privateKeyVersionName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The resource name for the webhook secret in Secret Manager.
    */
  var webhookSecretName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The resource name for the webhook secret secret version in Secret Manager.
    */
  var webhookSecretVersionName: js.UndefOr[String | Null] = js.undefined
}
object SchemaGitHubEnterpriseSecrets {
  
  inline def apply(): SchemaGitHubEnterpriseSecrets = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGitHubEnterpriseSecrets]
  }
  
  extension [Self <: SchemaGitHubEnterpriseSecrets](x: Self) {
    
    inline def setOauthClientIdName(value: String): Self = StObject.set(x, "oauthClientIdName", value.asInstanceOf[js.Any])
    
    inline def setOauthClientIdNameNull: Self = StObject.set(x, "oauthClientIdName", null)
    
    inline def setOauthClientIdNameUndefined: Self = StObject.set(x, "oauthClientIdName", js.undefined)
    
    inline def setOauthClientIdVersionName(value: String): Self = StObject.set(x, "oauthClientIdVersionName", value.asInstanceOf[js.Any])
    
    inline def setOauthClientIdVersionNameNull: Self = StObject.set(x, "oauthClientIdVersionName", null)
    
    inline def setOauthClientIdVersionNameUndefined: Self = StObject.set(x, "oauthClientIdVersionName", js.undefined)
    
    inline def setOauthSecretName(value: String): Self = StObject.set(x, "oauthSecretName", value.asInstanceOf[js.Any])
    
    inline def setOauthSecretNameNull: Self = StObject.set(x, "oauthSecretName", null)
    
    inline def setOauthSecretNameUndefined: Self = StObject.set(x, "oauthSecretName", js.undefined)
    
    inline def setOauthSecretVersionName(value: String): Self = StObject.set(x, "oauthSecretVersionName", value.asInstanceOf[js.Any])
    
    inline def setOauthSecretVersionNameNull: Self = StObject.set(x, "oauthSecretVersionName", null)
    
    inline def setOauthSecretVersionNameUndefined: Self = StObject.set(x, "oauthSecretVersionName", js.undefined)
    
    inline def setPrivateKeyName(value: String): Self = StObject.set(x, "privateKeyName", value.asInstanceOf[js.Any])
    
    inline def setPrivateKeyNameNull: Self = StObject.set(x, "privateKeyName", null)
    
    inline def setPrivateKeyNameUndefined: Self = StObject.set(x, "privateKeyName", js.undefined)
    
    inline def setPrivateKeyVersionName(value: String): Self = StObject.set(x, "privateKeyVersionName", value.asInstanceOf[js.Any])
    
    inline def setPrivateKeyVersionNameNull: Self = StObject.set(x, "privateKeyVersionName", null)
    
    inline def setPrivateKeyVersionNameUndefined: Self = StObject.set(x, "privateKeyVersionName", js.undefined)
    
    inline def setWebhookSecretName(value: String): Self = StObject.set(x, "webhookSecretName", value.asInstanceOf[js.Any])
    
    inline def setWebhookSecretNameNull: Self = StObject.set(x, "webhookSecretName", null)
    
    inline def setWebhookSecretNameUndefined: Self = StObject.set(x, "webhookSecretName", js.undefined)
    
    inline def setWebhookSecretVersionName(value: String): Self = StObject.set(x, "webhookSecretVersionName", value.asInstanceOf[js.Any])
    
    inline def setWebhookSecretVersionNameNull: Self = StObject.set(x, "webhookSecretVersionName", null)
    
    inline def setWebhookSecretVersionNameUndefined: Self = StObject.set(x, "webhookSecretVersionName", js.undefined)
  }
}
