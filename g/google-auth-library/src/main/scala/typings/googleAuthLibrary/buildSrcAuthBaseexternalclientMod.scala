package typings.googleAuthLibrary

import org.scalablytyped.runtime.StringDictionary
import typings.gaxios.buildSrcCommonMod.GaxiosOptions
import typings.gaxios.buildSrcCommonMod.GaxiosResponse
import typings.googleAuthLibrary.anon.Tokenlifetimeseconds
import typings.googleAuthLibrary.buildSrcAuthAuthclientMod.AuthClient
import typings.googleAuthLibrary.buildSrcAuthCredentialsMod.Credentials
import typings.googleAuthLibrary.buildSrcAuthGoogleauthMod.JSONClient
import typings.googleAuthLibrary.buildSrcAuthOauth2clientMod.RefreshOptions
import typings.googleAuthLibrary.buildSrcTransportersMod.BodyResponseCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcAuthBaseexternalclientMod {
  
  /* note: abstract class */ @JSImport("google-auth-library/build/src/auth/baseexternalclient", "BaseExternalAccountClient")
  @js.native
  open class BaseExternalAccountClient protected ()
    extends AuthClient
       with JSONClient {
    /**
      * Instantiate a BaseExternalAccountClient instance using the provided JSON
      * object loaded from an external account credentials file.
      * @param options The external account options object typically loaded
      *   from the external account JSON credential file.
      * @param additionalOptions Optional additional behavior customization
      *   options. These currently customize expiration threshold time and
      *   whether to retry on 401/403 API request errors.
      */
    def this(options: BaseExternalAccountClientOptions) = this()
    def this(options: BaseExternalAccountClientOptions, additionalOptions: RefreshOptions) = this()
    
    /* protected */ val audience: String = js.native
    
    /* private */ var cachedAccessToken: Any = js.native
    
    /* private */ val clientAuth: Any = js.native
    
    /**
      * Exchanges an external account GCP access token for a service
      * account impersonated access token using iamcredentials
      * GenerateAccessToken API.
      * @param token The access token to exchange for a service account access
      *   token.
      * @return A promise that resolves with the service account impersonated
      *   credentials response.
      */
    /* private */ var getImpersonatedAccessToken: Any = js.native
    
    /**
      * @return A promise that resolves with the project ID corresponding to the
      *   current workload identity pool or current workforce pool if
      *   determinable. For workforce pool credential, it returns the project ID
      *   corresponding to the workforcePoolUserProject.
      *   This is introduced to match the current pattern of using the Auth
      *   library:
      *   const projectId = await auth.getProjectId();
      *   const url = `https://dns.googleapis.com/dns/v1/projects/${projectId}`;
      *   const res = await client.request({ url });
      *   The resource may not have permission
      *   (resourcemanager.projects.get) to call this API or the required
      *   scopes may not be selected:
      *   https://cloud.google.com/resource-manager/reference/rest/v1/projects/get#authorization-scopes
      */
    def getProjectId(): js.Promise[String | Null] = js.native
    
    /**
      * Returns the workload identity pool project number if it is determinable
      * from the audience resource name.
      * @param audience The STS audience used to determine the project number.
      * @return The project number associated with the workload identity pool, if
      *   this can be determined from the STS audience field. Otherwise, null is
      *   returned.
      */
    /* private */ var getProjectNumber: Any = js.native
    
    /**
      * @return The list of scopes for the requested GCP access token.
      */
    /* private */ var getScopesArray: Any = js.native
    
    /** The service account email to be impersonated, if available. */
    def getServiceAccountEmail(): String | Null = js.native
    
    /**
      * Returns whether the provided credentials are expired or not.
      * If there is no expiry time, assumes the token is not expired or expiring.
      * @param accessToken The credentials to check for expiration.
      * @return Whether the credentials are expired or not.
      */
    /* private */ var isExpired: Any = js.native
    
    @JSName("projectId")
    var projectId_BaseExternalAccountClient: String | Null = js.native
    
    var projectNumber: String | Null = js.native
    
    /**
      * Forces token refresh, even if unexpired tokens are currently cached.
      * External credentials are exchanged for GCP access tokens via the token
      * exchange endpoint and other settings provided in the client options
      * object.
      * If the service_account_impersonation_url is provided, an additional
      * step to exchange the external account GCP access token for a service
      * account impersonated token is performed.
      * @return A promise that resolves with the fresh GCP access tokens.
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
    
    /**
      * Triggered when a external subject token is needed to be exchanged for a GCP
      * access token via GCP STS endpoint.
      * This abstract method needs to be implemented by subclasses depending on
      * the type of external credential used.
      * @return A promise that resolves with the external subject token.
      */
    def retrieveSubjectToken(): js.Promise[String] = js.native
    
    /**
      * OAuth scopes for the GCP access token to use. When not provided,
      * the default https://www.googleapis.com/auth/cloud-platform is
      * used.
      */
    var scopes: js.UndefOr[String | js.Array[String]] = js.native
    
    /* private */ val serviceAccountImpersonationLifetime: Any = js.native
    
    /* private */ val serviceAccountImpersonationUrl: Any = js.native
    
    /* private */ val stsCredential: Any = js.native
    
    /* protected */ val subjectTokenType: String = js.native
    
    /**
      * Checks whether Google APIs URL is valid.
      * @param apiName The apiName of url.
      * @param url The Google API URL to validate.
      * @return Whether the URL is valid or not.
      */
    /* private */ var validateGoogleAPIsUrl: Any = js.native
    
    /* private */ val workforcePoolUserProject: Any = js.native
  }
  
  @JSImport("google-auth-library/build/src/auth/baseexternalclient", "CLOUD_RESOURCE_MANAGER")
  @js.native
  val CLOUD_RESOURCE_MANAGER: /* "https://cloudresourcemanager.googleapis.com/v1/projects/" */ String = js.native
  
  @JSImport("google-auth-library/build/src/auth/baseexternalclient", "EXPIRATION_TIME_OFFSET")
  @js.native
  val EXPIRATION_TIME_OFFSET: Double = js.native
  
  @JSImport("google-auth-library/build/src/auth/baseexternalclient", "EXTERNAL_ACCOUNT_TYPE")
  @js.native
  val EXTERNAL_ACCOUNT_TYPE: /* "external_account" */ String = js.native
  
  trait BaseExternalAccountClientOptions extends StObject {
    
    var audience: String
    
    var client_id: js.UndefOr[String] = js.undefined
    
    var client_secret: js.UndefOr[String] = js.undefined
    
    var quota_project_id: js.UndefOr[String] = js.undefined
    
    var service_account_impersonation: js.UndefOr[Tokenlifetimeseconds] = js.undefined
    
    var service_account_impersonation_url: js.UndefOr[String] = js.undefined
    
    var subject_token_type: String
    
    var token_info_url: js.UndefOr[String] = js.undefined
    
    var token_url: String
    
    var `type`: String
    
    var workforce_pool_user_project: js.UndefOr[String] = js.undefined
  }
  object BaseExternalAccountClientOptions {
    
    inline def apply(audience: String, subject_token_type: String, token_url: String, `type`: String): BaseExternalAccountClientOptions = {
      val __obj = js.Dynamic.literal(audience = audience.asInstanceOf[js.Any], subject_token_type = subject_token_type.asInstanceOf[js.Any], token_url = token_url.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseExternalAccountClientOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BaseExternalAccountClientOptions] (val x: Self) extends AnyVal {
      
      inline def setAudience(value: String): Self = StObject.set(x, "audience", value.asInstanceOf[js.Any])
      
      inline def setClient_id(value: String): Self = StObject.set(x, "client_id", value.asInstanceOf[js.Any])
      
      inline def setClient_idUndefined: Self = StObject.set(x, "client_id", js.undefined)
      
      inline def setClient_secret(value: String): Self = StObject.set(x, "client_secret", value.asInstanceOf[js.Any])
      
      inline def setClient_secretUndefined: Self = StObject.set(x, "client_secret", js.undefined)
      
      inline def setQuota_project_id(value: String): Self = StObject.set(x, "quota_project_id", value.asInstanceOf[js.Any])
      
      inline def setQuota_project_idUndefined: Self = StObject.set(x, "quota_project_id", js.undefined)
      
      inline def setService_account_impersonation(value: Tokenlifetimeseconds): Self = StObject.set(x, "service_account_impersonation", value.asInstanceOf[js.Any])
      
      inline def setService_account_impersonationUndefined: Self = StObject.set(x, "service_account_impersonation", js.undefined)
      
      inline def setService_account_impersonation_url(value: String): Self = StObject.set(x, "service_account_impersonation_url", value.asInstanceOf[js.Any])
      
      inline def setService_account_impersonation_urlUndefined: Self = StObject.set(x, "service_account_impersonation_url", js.undefined)
      
      inline def setSubject_token_type(value: String): Self = StObject.set(x, "subject_token_type", value.asInstanceOf[js.Any])
      
      inline def setToken_info_url(value: String): Self = StObject.set(x, "token_info_url", value.asInstanceOf[js.Any])
      
      inline def setToken_info_urlUndefined: Self = StObject.set(x, "token_info_url", js.undefined)
      
      inline def setToken_url(value: String): Self = StObject.set(x, "token_url", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setWorkforce_pool_user_project(value: String): Self = StObject.set(x, "workforce_pool_user_project", value.asInstanceOf[js.Any])
      
      inline def setWorkforce_pool_user_projectUndefined: Self = StObject.set(x, "workforce_pool_user_project", js.undefined)
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
  
  trait IamGenerateAccessTokenResponse extends StObject {
    
    var accessToken: String
    
    var expireTime: String
  }
  object IamGenerateAccessTokenResponse {
    
    inline def apply(accessToken: String, expireTime: String): IamGenerateAccessTokenResponse = {
      val __obj = js.Dynamic.literal(accessToken = accessToken.asInstanceOf[js.Any], expireTime = expireTime.asInstanceOf[js.Any])
      __obj.asInstanceOf[IamGenerateAccessTokenResponse]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IamGenerateAccessTokenResponse] (val x: Self) extends AnyVal {
      
      inline def setAccessToken(value: String): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
      
      inline def setExpireTime(value: String): Self = StObject.set(x, "expireTime", value.asInstanceOf[js.Any])
    }
  }
  
  trait ProjectInfo extends StObject {
    
    var createTime: js.UndefOr[String] = js.undefined
    
    var lifecycleState: String
    
    var name: String
    
    var parent: StringDictionary[Any]
    
    var projectId: String
    
    var projectNumber: String
  }
  object ProjectInfo {
    
    inline def apply(
      lifecycleState: String,
      name: String,
      parent: StringDictionary[Any],
      projectId: String,
      projectNumber: String
    ): ProjectInfo = {
      val __obj = js.Dynamic.literal(lifecycleState = lifecycleState.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], projectId = projectId.asInstanceOf[js.Any], projectNumber = projectNumber.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProjectInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ProjectInfo] (val x: Self) extends AnyVal {
      
      inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
      
      inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
      
      inline def setLifecycleState(value: String): Self = StObject.set(x, "lifecycleState", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setParent(value: StringDictionary[Any]): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
      
      inline def setProjectNumber(value: String): Self = StObject.set(x, "projectNumber", value.asInstanceOf[js.Any])
    }
  }
}
