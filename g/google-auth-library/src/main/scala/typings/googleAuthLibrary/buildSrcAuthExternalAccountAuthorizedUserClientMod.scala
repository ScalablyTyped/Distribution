package typings.googleAuthLibrary

import typings.gaxios.buildSrcCommonMod.GaxiosOptions
import typings.gaxios.buildSrcCommonMod.GaxiosResponse
import typings.googleAuthLibrary.buildSrcAuthAuthclientMod.AuthClient
import typings.googleAuthLibrary.buildSrcAuthCredentialsMod.Credentials
import typings.googleAuthLibrary.buildSrcAuthGoogleauthMod.JSONClient
import typings.googleAuthLibrary.buildSrcAuthOauth2clientMod.RefreshOptions
import typings.googleAuthLibrary.buildSrcTransportersMod.BodyResponseCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcAuthExternalAccountAuthorizedUserClientMod {
  
  @JSImport("google-auth-library/build/src/auth/externalAccountAuthorizedUserClient", "EXTERNAL_ACCOUNT_AUTHORIZED_USER_TYPE")
  @js.native
  val EXTERNAL_ACCOUNT_AUTHORIZED_USER_TYPE: /* "external_account_authorized_user" */ String = js.native
  
  @JSImport("google-auth-library/build/src/auth/externalAccountAuthorizedUserClient", "ExternalAccountAuthorizedUserClient")
  @js.native
  open class ExternalAccountAuthorizedUserClient protected ()
    extends AuthClient
       with JSONClient {
    /**
      * Instantiates an ExternalAccountAuthorizedUserClient instances using the
      * provided JSON object loaded from a credentials files.
      * An error is throws if the credential is not valid.
      * @param options The external account authorized user option object typically
      *   from the external accoutn authorized user JSON credential file.
      * @param additionalOptions Optional additional behavior customization
      *   options. These currently customize expiration threshold time and
      *   whether to retry on 401/403 API request errors.
      */
    def this(options: ExternalAccountAuthorizedUserClientOptions) = this()
    def this(options: ExternalAccountAuthorizedUserClientOptions, additionalOptions: RefreshOptions) = this()
    
    /* private */ var cachedAccessToken: Any = js.native
    
    /* private */ val externalAccountAuthorizedUserHandler: Any = js.native
    
    /**
      * Returns whether the provided credentials are expired or not.
      * If there is no expiry time, assumes the token is not expired or expiring.
      * @param credentials The credentials to check for expiration.
      * @return Whether the credentials are expired or not.
      */
    /* private */ var isExpired: Any = js.native
    
    /**
      * Forces token refresh, even if unexpired tokens are currently cached.
      * @return A promise that resolves with the refreshed credential.
      */
    /* protected */ def refreshAccessTokenAsync(): js.Promise[CredentialsWithResponse] = js.native
    
    /* private */ var refreshToken: Any = js.native
    
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
  
  trait ExternalAccountAuthorizedUserClientOptions extends StObject {
    
    var audience: String
    
    var client_id: String
    
    var client_secret: String
    
    var quota_project_id: js.UndefOr[String] = js.undefined
    
    var refresh_token: String
    
    var revoke_url: js.UndefOr[String] = js.undefined
    
    var token_info_url: String
    
    var token_url: String
    
    var `type`: /* "external_account_authorized_user" */ String
  }
  object ExternalAccountAuthorizedUserClientOptions {
    
    inline def apply(
      audience: String,
      client_id: String,
      client_secret: String,
      refresh_token: String,
      token_info_url: String,
      token_url: String,
      `type`: /* "external_account_authorized_user" */ String
    ): ExternalAccountAuthorizedUserClientOptions = {
      val __obj = js.Dynamic.literal(audience = audience.asInstanceOf[js.Any], client_id = client_id.asInstanceOf[js.Any], client_secret = client_secret.asInstanceOf[js.Any], refresh_token = refresh_token.asInstanceOf[js.Any], token_info_url = token_info_url.asInstanceOf[js.Any], token_url = token_url.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExternalAccountAuthorizedUserClientOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ExternalAccountAuthorizedUserClientOptions] (val x: Self) extends AnyVal {
      
      inline def setAudience(value: String): Self = StObject.set(x, "audience", value.asInstanceOf[js.Any])
      
      inline def setClient_id(value: String): Self = StObject.set(x, "client_id", value.asInstanceOf[js.Any])
      
      inline def setClient_secret(value: String): Self = StObject.set(x, "client_secret", value.asInstanceOf[js.Any])
      
      inline def setQuota_project_id(value: String): Self = StObject.set(x, "quota_project_id", value.asInstanceOf[js.Any])
      
      inline def setQuota_project_idUndefined: Self = StObject.set(x, "quota_project_id", js.undefined)
      
      inline def setRefresh_token(value: String): Self = StObject.set(x, "refresh_token", value.asInstanceOf[js.Any])
      
      inline def setRevoke_url(value: String): Self = StObject.set(x, "revoke_url", value.asInstanceOf[js.Any])
      
      inline def setRevoke_urlUndefined: Self = StObject.set(x, "revoke_url", js.undefined)
      
      inline def setToken_info_url(value: String): Self = StObject.set(x, "token_info_url", value.asInstanceOf[js.Any])
      
      inline def setToken_url(value: String): Self = StObject.set(x, "token_url", value.asInstanceOf[js.Any])
      
      inline def setType(value: /* "external_account_authorized_user" */ String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
