package typings.googleAuthLibrary

import typings.gaxios.buildSrcCommonMod.GaxiosOptions
import typings.gaxios.buildSrcCommonMod.GaxiosResponse
import typings.googleAuthLibrary.anon.AccessBoundaryRules
import typings.googleAuthLibrary.buildSrcAuthAuthclientMod.AuthClient
import typings.googleAuthLibrary.buildSrcAuthCredentialsMod.Credentials
import typings.googleAuthLibrary.buildSrcAuthOauth2clientMod.GetAccessTokenResponse
import typings.googleAuthLibrary.buildSrcAuthOauth2clientMod.RefreshOptions
import typings.googleAuthLibrary.buildSrcTransportersMod.BodyResponseCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcAuthDownscopedclientMod {
  
  @JSImport("google-auth-library/build/src/auth/downscopedclient", "DownscopedClient")
  @js.native
  open class DownscopedClient protected () extends AuthClient {
    /**
      * Instantiates a downscoped client object using the provided source
      * AuthClient and credential access boundary rules.
      * To downscope permissions of a source AuthClient, a Credential Access
      * Boundary that specifies which resources the new credential can access, as
      * well as an upper bound on the permissions that are available on each
      * resource, has to be defined. A downscoped client can then be instantiated
      * using the source AuthClient and the Credential Access Boundary.
      * @param authClient The source AuthClient to be downscoped based on the
      *   provided Credential Access Boundary rules.
      * @param credentialAccessBoundary The Credential Access Boundary which
      *   contains a list of access boundary rules. Each rule contains information
      *   on the resource that the rule applies to, the upper bound of the
      *   permissions that are available on that resource and an optional
      *   condition to further restrict permissions.
      * @param additionalOptions Optional additional behavior customization
      *   options. These currently customize expiration threshold time and
      *   whether to retry on 401/403 API request errors.
      * @param quotaProjectId Optional quota project id for setting up in the
      *   x-goog-user-project header.
      */
    def this(authClient: AuthClient, credentialAccessBoundary: CredentialAccessBoundary) = this()
    def this(
      authClient: AuthClient,
      credentialAccessBoundary: CredentialAccessBoundary,
      additionalOptions: RefreshOptions
    ) = this()
    def this(
      authClient: AuthClient,
      credentialAccessBoundary: CredentialAccessBoundary,
      additionalOptions: Unit,
      quotaProjectId: String
    ) = this()
    def this(
      authClient: AuthClient,
      credentialAccessBoundary: CredentialAccessBoundary,
      additionalOptions: RefreshOptions,
      quotaProjectId: String
    ) = this()
    
    /* private */ val authClient: Any = js.native
    
    /* private */ var cachedDownscopedAccessToken: Any = js.native
    
    /* private */ val credentialAccessBoundary: Any = js.native
    
    /**
      * Returns whether the provided credentials are expired or not.
      * If there is no expiry time, assumes the token is not expired or expiring.
      * @param downscopedAccessToken The credentials to check for expiration.
      * @return Whether the credentials are expired or not.
      */
    /* private */ var isExpired: Any = js.native
    
    /**
      * Forces token refresh, even if unexpired tokens are currently cached.
      * GCP access tokens are retrieved from authclient object/source credential.
      * Then GCP access tokens are exchanged for downscoped access tokens via the
      * token exchange endpoint.
      * @return A promise that resolves with the fresh downscoped access token.
      */
    /* protected */ def refreshAccessTokenAsync(): js.Promise[CredentialsWithResponse] = js.native
    
    def request[T](opts: GaxiosOptions, callback: BodyResponseCallback[T]): Unit = js.native
    
    /**
      * Authenticates the provided HTTP request, processes it and resolves with the
      * returned response.
      * @param opts The HTTP request options.
      * @param retry Whether the current attempt is a retry after a failed attempt.
      * @return A promise that resolves with the successful response.
      */
    /* protected */ def requestAsync[T](opts: GaxiosOptions): js.Promise[GaxiosResponse[T]] = js.native
    /* protected */ def requestAsync[T](opts: GaxiosOptions, retry: Boolean): js.Promise[GaxiosResponse[T]] = js.native
    
    /* private */ val stsCredential: Any = js.native
  }
  
  @JSImport("google-auth-library/build/src/auth/downscopedclient", "EXPIRATION_TIME_OFFSET")
  @js.native
  val EXPIRATION_TIME_OFFSET: Double = js.native
  
  @JSImport("google-auth-library/build/src/auth/downscopedclient", "MAX_ACCESS_BOUNDARY_RULES_COUNT")
  @js.native
  val MAX_ACCESS_BOUNDARY_RULES_COUNT: /* 10 */ Double = js.native
  
  /** Defines an upper bound of permissions on a particular resource. */
  trait AccessBoundaryRule extends StObject {
    
    var availabilityCondition: js.UndefOr[AvailabilityCondition] = js.undefined
    
    var availablePermissions: js.Array[String]
    
    var availableResource: String
  }
  object AccessBoundaryRule {
    
    inline def apply(availablePermissions: js.Array[String], availableResource: String): AccessBoundaryRule = {
      val __obj = js.Dynamic.literal(availablePermissions = availablePermissions.asInstanceOf[js.Any], availableResource = availableResource.asInstanceOf[js.Any])
      __obj.asInstanceOf[AccessBoundaryRule]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AccessBoundaryRule] (val x: Self) extends AnyVal {
      
      inline def setAvailabilityCondition(value: AvailabilityCondition): Self = StObject.set(x, "availabilityCondition", value.asInstanceOf[js.Any])
      
      inline def setAvailabilityConditionUndefined: Self = StObject.set(x, "availabilityCondition", js.undefined)
      
      inline def setAvailablePermissions(value: js.Array[String]): Self = StObject.set(x, "availablePermissions", value.asInstanceOf[js.Any])
      
      inline def setAvailablePermissionsVarargs(value: String*): Self = StObject.set(x, "availablePermissions", js.Array(value*))
      
      inline def setAvailableResource(value: String): Self = StObject.set(x, "availableResource", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * An optional condition that can be used as part of a
    * CredentialAccessBoundary to further restrict permissions.
    */
  trait AvailabilityCondition extends StObject {
    
    var description: js.UndefOr[String] = js.undefined
    
    var expression: String
    
    var title: js.UndefOr[String] = js.undefined
  }
  object AvailabilityCondition {
    
    inline def apply(expression: String): AvailabilityCondition = {
      val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
      __obj.asInstanceOf[AvailabilityCondition]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AvailabilityCondition] (val x: Self) extends AnyVal {
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setExpression(value: String): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  trait CredentialAccessBoundary extends StObject {
    
    var accessBoundary: AccessBoundaryRules
  }
  object CredentialAccessBoundary {
    
    inline def apply(accessBoundary: AccessBoundaryRules): CredentialAccessBoundary = {
      val __obj = js.Dynamic.literal(accessBoundary = accessBoundary.asInstanceOf[js.Any])
      __obj.asInstanceOf[CredentialAccessBoundary]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CredentialAccessBoundary] (val x: Self) extends AnyVal {
      
      inline def setAccessBoundary(value: AccessBoundaryRules): Self = StObject.set(x, "accessBoundary", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Internal interface for tracking the access token expiration time.
    */
  trait CredentialsWithResponse
    extends StObject
       with Credentials {
    
    var res: js.UndefOr[GaxiosResponse[Any] | Null] = js.undefined
  }
  object CredentialsWithResponse {
    
    inline def apply(): CredentialsWithResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CredentialsWithResponse]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CredentialsWithResponse] (val x: Self) extends AnyVal {
      
      inline def setRes(value: GaxiosResponse[Any]): Self = StObject.set(x, "res", value.asInstanceOf[js.Any])
      
      inline def setResNull: Self = StObject.set(x, "res", null)
      
      inline def setResUndefined: Self = StObject.set(x, "res", js.undefined)
    }
  }
  
  /**
    * Internal interface for tracking and returning the Downscoped access token
    * expiration time in epoch time (seconds).
    */
  trait DownscopedAccessTokenResponse
    extends StObject
       with GetAccessTokenResponse {
    
    var expirationTime: js.UndefOr[Double | Null] = js.undefined
  }
  object DownscopedAccessTokenResponse {
    
    inline def apply(): DownscopedAccessTokenResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DownscopedAccessTokenResponse]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DownscopedAccessTokenResponse] (val x: Self) extends AnyVal {
      
      inline def setExpirationTime(value: Double): Self = StObject.set(x, "expirationTime", value.asInstanceOf[js.Any])
      
      inline def setExpirationTimeNull: Self = StObject.set(x, "expirationTime", null)
      
      inline def setExpirationTimeUndefined: Self = StObject.set(x, "expirationTime", js.undefined)
    }
  }
}
