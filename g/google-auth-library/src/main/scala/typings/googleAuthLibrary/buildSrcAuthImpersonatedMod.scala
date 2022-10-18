package typings.googleAuthLibrary

import typings.googleAuthLibrary.buildSrcAuthAuthclientMod.AuthClient
import typings.googleAuthLibrary.buildSrcAuthGoogleauthMod.JSONClient
import typings.googleAuthLibrary.buildSrcAuthIdtokenclientMod.IdTokenProvider
import typings.googleAuthLibrary.buildSrcAuthOauth2clientMod.OAuth2Client
import typings.googleAuthLibrary.buildSrcAuthOauth2clientMod.RefreshOptions
import typings.googleAuthLibrary.googleAuthLibraryInts.`3600`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcAuthImpersonatedMod {
  
  @JSImport("google-auth-library/build/src/auth/impersonated", "IMPERSONATED_ACCOUNT_TYPE")
  @js.native
  val IMPERSONATED_ACCOUNT_TYPE: /* "impersonated_service_account" */ String = js.native
  
  @JSImport("google-auth-library/build/src/auth/impersonated", "Impersonated")
  @js.native
  /**
    * Impersonated service account credentials.
    *
    * Create a new access token by impersonating another service account.
    *
    * Impersonated Credentials allowing credentials issued to a user or
    * service account to impersonate another. The source project using
    * Impersonated Credentials must enable the "IAMCredentials" API.
    * Also, the target service account must grant the orginating principal
    * the "Service Account Token Creator" IAM role.
    *
    * @param {object} options - The configuration object.
    * @param {object} [options.sourceClient] the source credential used as to
    * acquire the impersonated credentials.
    * @param {string} [options.targetPrincipal] the service account to
    * impersonate.
    * @param {string[]} [options.delegates] the chained list of delegates
    * required to grant the final access_token. If set, the sequence of
    * identities must have "Service Account Token Creator" capability granted to
    * the preceding identity. For example, if set to [serviceAccountB,
    * serviceAccountC], the sourceCredential must have the Token Creator role on
    * serviceAccountB. serviceAccountB must have the Token Creator on
    * serviceAccountC. Finally, C must have Token Creator on target_principal.
    * If left unset, sourceCredential must have that role on targetPrincipal.
    * @param {string[]} [options.targetScopes] scopes to request during the
    * authorization grant.
    * @param {number} [options.lifetime] number of seconds the delegated
    * credential should be valid for up to 3600 seconds by default, or 43,200
    * seconds by extending the token's lifetime, see:
    * https://cloud.google.com/iam/docs/creating-short-lived-service-account-credentials#sa-credentials-oauth
    * @param {string} [options.endpoint] api endpoint override.
    */
  open class Impersonated ()
    extends OAuth2Client
       with IdTokenProvider
       with JSONClient {
    def this(options: ImpersonatedOptions) = this()
    
    /* private */ var delegates: Any = js.native
    
    /* private */ var endpoint: Any = js.native
    
    /* CompleteClass */
    override def fetchIdToken(targetAudience: String): js.Promise[String] = js.native
    def fetchIdToken(targetAudience: String, options: FetchIdTokenOptions): js.Promise[String] = js.native
    
    /* private */ var lifetime: Any = js.native
    
    /* private */ var sourceClient: Any = js.native
    
    /* private */ var targetPrincipal: Any = js.native
    
    /* private */ var targetScopes: Any = js.native
  }
  
  trait FetchIdTokenOptions extends StObject {
    
    /**
      * Include the service account email in the token.
      * If set to `true`, the token will contain `email` and `email_verified` claims.
      */
    var includeEmail: Boolean
  }
  object FetchIdTokenOptions {
    
    inline def apply(includeEmail: Boolean): FetchIdTokenOptions = {
      val __obj = js.Dynamic.literal(includeEmail = includeEmail.asInstanceOf[js.Any])
      __obj.asInstanceOf[FetchIdTokenOptions]
    }
    
    extension [Self <: FetchIdTokenOptions](x: Self) {
      
      inline def setIncludeEmail(value: Boolean): Self = StObject.set(x, "includeEmail", value.asInstanceOf[js.Any])
    }
  }
  
  trait FetchIdTokenResponse extends StObject {
    
    /** The OpenId Connect ID token. */
    var token: String
  }
  object FetchIdTokenResponse {
    
    inline def apply(token: String): FetchIdTokenResponse = {
      val __obj = js.Dynamic.literal(token = token.asInstanceOf[js.Any])
      __obj.asInstanceOf[FetchIdTokenResponse]
    }
    
    extension [Self <: FetchIdTokenResponse](x: Self) {
      
      inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    }
  }
  
  trait ImpersonatedOptions
    extends StObject
       with RefreshOptions {
    
    /**
      * The chained list of delegates required to grant the final access_token.
      */
    var delegates: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * API endpoint to fetch token from.
      */
    var endpoint: js.UndefOr[String] = js.undefined
    
    /**
      * Number of seconds the delegated credential should be valid.
      */
    var lifetime: js.UndefOr[Double | `3600`] = js.undefined
    
    /**
      * Client used to perform exchange for impersonated client.
      */
    var sourceClient: js.UndefOr[AuthClient] = js.undefined
    
    /**
      * The service account to impersonate.
      */
    var targetPrincipal: js.UndefOr[String] = js.undefined
    
    /**
      * Scopes to request during the authorization grant.
      */
    var targetScopes: js.UndefOr[js.Array[String]] = js.undefined
  }
  object ImpersonatedOptions {
    
    inline def apply(): ImpersonatedOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ImpersonatedOptions]
    }
    
    extension [Self <: ImpersonatedOptions](x: Self) {
      
      inline def setDelegates(value: js.Array[String]): Self = StObject.set(x, "delegates", value.asInstanceOf[js.Any])
      
      inline def setDelegatesUndefined: Self = StObject.set(x, "delegates", js.undefined)
      
      inline def setDelegatesVarargs(value: String*): Self = StObject.set(x, "delegates", js.Array(value*))
      
      inline def setEndpoint(value: String): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
      
      inline def setEndpointUndefined: Self = StObject.set(x, "endpoint", js.undefined)
      
      inline def setLifetime(value: Double | `3600`): Self = StObject.set(x, "lifetime", value.asInstanceOf[js.Any])
      
      inline def setLifetimeUndefined: Self = StObject.set(x, "lifetime", js.undefined)
      
      inline def setSourceClient(value: AuthClient): Self = StObject.set(x, "sourceClient", value.asInstanceOf[js.Any])
      
      inline def setSourceClientUndefined: Self = StObject.set(x, "sourceClient", js.undefined)
      
      inline def setTargetPrincipal(value: String): Self = StObject.set(x, "targetPrincipal", value.asInstanceOf[js.Any])
      
      inline def setTargetPrincipalUndefined: Self = StObject.set(x, "targetPrincipal", js.undefined)
      
      inline def setTargetScopes(value: js.Array[String]): Self = StObject.set(x, "targetScopes", value.asInstanceOf[js.Any])
      
      inline def setTargetScopesUndefined: Self = StObject.set(x, "targetScopes", js.undefined)
      
      inline def setTargetScopesVarargs(value: String*): Self = StObject.set(x, "targetScopes", js.Array(value*))
    }
  }
  
  trait TokenResponse extends StObject {
    
    var accessToken: String
    
    var expireTime: String
  }
  object TokenResponse {
    
    inline def apply(accessToken: String, expireTime: String): TokenResponse = {
      val __obj = js.Dynamic.literal(accessToken = accessToken.asInstanceOf[js.Any], expireTime = expireTime.asInstanceOf[js.Any])
      __obj.asInstanceOf[TokenResponse]
    }
    
    extension [Self <: TokenResponse](x: Self) {
      
      inline def setAccessToken(value: String): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
      
      inline def setExpireTime(value: String): Self = StObject.set(x, "expireTime", value.asInstanceOf[js.Any])
    }
  }
}
