package typings.googleCloudStorage.utilMod

import typings.googleAuthLibrary.authclientMod.AuthClient
import typings.googleAuthLibrary.credentialsMod.CredentialBody
import typings.googleAuthLibrary.externalclientMod.ExternalAccountClientOptions
import typings.googleAuthLibrary.googleauthMod.JSONClient
import typings.googleAuthLibrary.impersonatedMod.ImpersonatedOptions
import typings.googleAuthLibrary.jwtclientMod.JWTOptions
import typings.googleAuthLibrary.mod.GoogleAuth
import typings.googleAuthLibrary.oauth2clientMod.OAuth2ClientOptions
import typings.googleAuthLibrary.refreshclientMod.UserRefreshClientOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Omit<google-auth-library.google-auth-library.GoogleAuthOptions<google-auth-library.google-auth-library/build/src/auth/googleauth.JSONClient>, 'authClient'> */
trait MakeAuthenticatedRequestFactoryConfig extends StObject {
  
  /**
    * A pre-instantiated `AuthClient` or `GoogleAuth` client that should be used.
    * A new will be created if this is not set.
    */
  var authClient: js.UndefOr[AuthClient | GoogleAuth[JSONClient]] = js.undefined
  
  /**
    * Automatically retry requests if the response is related to rate limits or
    * certain intermittent server errors. We will exponentially backoff
    * subsequent requests by default. (default: true)
    */
  var autoRetry: js.UndefOr[Boolean] = js.undefined
  
  var clientOptions: js.UndefOr[
    JWTOptions | OAuth2ClientOptions | UserRefreshClientOptions | ImpersonatedOptions
  ] = js.undefined
  
  var credentials: js.UndefOr[CredentialBody | ExternalAccountClientOptions] = js.undefined
  
  /**
    * If true, just return the provided request options. Default: false.
    */
  var customEndpoint: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Account email address, required for PEM/P12 usage.
    */
  var email: js.UndefOr[String] = js.undefined
  
  var keyFile: js.UndefOr[String] = js.undefined
  
  var keyFilename: js.UndefOr[String] = js.undefined
  
  /**
    * Maximum number of automatic retries attempted before returning the error.
    * (default: 3)
    */
  var maxRetries: js.UndefOr[Double] = js.undefined
  
  var projectId: js.UndefOr[String] = js.undefined
  
  /**
    * Determines if a projectId is required for authenticated requests. Defaults to `true`.
    */
  var projectIdRequired: js.UndefOr[Boolean] = js.undefined
  
  var scopes: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var stream: js.UndefOr[Duplexify] = js.undefined
  
  /**
    * If true, will authenticate when using a custom endpoint. Default: false.
    */
  var useAuthWithCustomEndpoint: js.UndefOr[Boolean] = js.undefined
}
object MakeAuthenticatedRequestFactoryConfig {
  
  inline def apply(): MakeAuthenticatedRequestFactoryConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MakeAuthenticatedRequestFactoryConfig]
  }
  
  extension [Self <: MakeAuthenticatedRequestFactoryConfig](x: Self) {
    
    inline def setAuthClient(value: AuthClient | GoogleAuth[JSONClient]): Self = StObject.set(x, "authClient", value.asInstanceOf[js.Any])
    
    inline def setAuthClientUndefined: Self = StObject.set(x, "authClient", js.undefined)
    
    inline def setAutoRetry(value: Boolean): Self = StObject.set(x, "autoRetry", value.asInstanceOf[js.Any])
    
    inline def setAutoRetryUndefined: Self = StObject.set(x, "autoRetry", js.undefined)
    
    inline def setClientOptions(value: JWTOptions | OAuth2ClientOptions | UserRefreshClientOptions | ImpersonatedOptions): Self = StObject.set(x, "clientOptions", value.asInstanceOf[js.Any])
    
    inline def setClientOptionsUndefined: Self = StObject.set(x, "clientOptions", js.undefined)
    
    inline def setCredentials(value: CredentialBody | ExternalAccountClientOptions): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
    
    inline def setCredentialsUndefined: Self = StObject.set(x, "credentials", js.undefined)
    
    inline def setCustomEndpoint(value: Boolean): Self = StObject.set(x, "customEndpoint", value.asInstanceOf[js.Any])
    
    inline def setCustomEndpointUndefined: Self = StObject.set(x, "customEndpoint", js.undefined)
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setKeyFile(value: String): Self = StObject.set(x, "keyFile", value.asInstanceOf[js.Any])
    
    inline def setKeyFileUndefined: Self = StObject.set(x, "keyFile", js.undefined)
    
    inline def setKeyFilename(value: String): Self = StObject.set(x, "keyFilename", value.asInstanceOf[js.Any])
    
    inline def setKeyFilenameUndefined: Self = StObject.set(x, "keyFilename", js.undefined)
    
    inline def setMaxRetries(value: Double): Self = StObject.set(x, "maxRetries", value.asInstanceOf[js.Any])
    
    inline def setMaxRetriesUndefined: Self = StObject.set(x, "maxRetries", js.undefined)
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdRequired(value: Boolean): Self = StObject.set(x, "projectIdRequired", value.asInstanceOf[js.Any])
    
    inline def setProjectIdRequiredUndefined: Self = StObject.set(x, "projectIdRequired", js.undefined)
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    inline def setScopes(value: String | js.Array[String]): Self = StObject.set(x, "scopes", value.asInstanceOf[js.Any])
    
    inline def setScopesUndefined: Self = StObject.set(x, "scopes", js.undefined)
    
    inline def setScopesVarargs(value: String*): Self = StObject.set(x, "scopes", js.Array(value*))
    
    inline def setStream(value: Duplexify): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
    
    inline def setStreamUndefined: Self = StObject.set(x, "stream", js.undefined)
    
    inline def setUseAuthWithCustomEndpoint(value: Boolean): Self = StObject.set(x, "useAuthWithCustomEndpoint", value.asInstanceOf[js.Any])
    
    inline def setUseAuthWithCustomEndpointUndefined: Self = StObject.set(x, "useAuthWithCustomEndpoint", js.undefined)
  }
}
