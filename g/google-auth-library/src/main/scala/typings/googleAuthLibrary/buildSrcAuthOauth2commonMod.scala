package typings.googleAuthLibrary

import typings.gaxios.buildSrcCommonMod.GaxiosOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcAuthOauth2commonMod {
  
  @JSImport("google-auth-library/build/src/auth/oauth2common", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* note: abstract class */ @JSImport("google-auth-library/build/src/auth/oauth2common", "OAuthClientAuthHandler")
  @js.native
  /**
    * Instantiates an OAuth client authentication handler.
    * @param clientAuthentication The client auth credentials.
    */
  open class OAuthClientAuthHandler () extends StObject {
    def this(clientAuthentication: ClientAuthentication) = this()
    
    /**
      * Applies client authentication on the OAuth request's headers or POST
      * body but does not process the request.
      * @param opts The GaxiosOptions whose headers or data are to be modified
      *   depending on the client authentication mechanism to be used.
      * @param bearerToken The optional bearer token to use for authentication.
      *   When this is used, no client authentication credentials are needed.
      */
    /* protected */ def applyClientAuthenticationOptions(opts: GaxiosOptions): Unit = js.native
    /* protected */ def applyClientAuthenticationOptions(opts: GaxiosOptions, bearerToken: String): Unit = js.native
    
    /* private */ val clientAuthentication: Any = js.native
    
    /* private */ var crypto: Any = js.native
    
    /**
      * Applies client authentication on the request's header if either
      * basic authentication or bearer token authentication is selected.
      *
      * @param opts The GaxiosOptions whose headers or data are to be modified
      *   depending on the client authentication mechanism to be used.
      * @param bearerToken The optional bearer token to use for authentication.
      *   When this is used, no client authentication credentials are needed.
      */
    /* private */ var injectAuthenticatedHeaders: Any = js.native
    
    /**
      * Applies client authentication on the request's body if request-body
      * client authentication is selected.
      *
      * @param opts The GaxiosOptions whose headers or data are to be modified
      *   depending on the client authentication mechanism to be used.
      */
    /* private */ var injectAuthenticatedRequestBody: Any = js.native
  }
  
  inline def getErrorFromOAuthErrorResponse(resp: OAuthErrorResponse): js.Error = ^.asInstanceOf[js.Dynamic].applyDynamic("getErrorFromOAuthErrorResponse")(resp.asInstanceOf[js.Any]).asInstanceOf[js.Error]
  inline def getErrorFromOAuthErrorResponse(resp: OAuthErrorResponse, err: js.Error): js.Error = (^.asInstanceOf[js.Dynamic].applyDynamic("getErrorFromOAuthErrorResponse")(resp.asInstanceOf[js.Any], err.asInstanceOf[js.Any])).asInstanceOf[js.Error]
  
  trait ClientAuthentication extends StObject {
    
    var clientId: String
    
    var clientSecret: js.UndefOr[String] = js.undefined
    
    var confidentialClientType: ConfidentialClientType
  }
  object ClientAuthentication {
    
    inline def apply(clientId: String, confidentialClientType: ConfidentialClientType): ClientAuthentication = {
      val __obj = js.Dynamic.literal(clientId = clientId.asInstanceOf[js.Any], confidentialClientType = confidentialClientType.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClientAuthentication]
    }
    
    extension [Self <: ClientAuthentication](x: Self) {
      
      inline def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
      
      inline def setClientSecret(value: String): Self = StObject.set(x, "clientSecret", value.asInstanceOf[js.Any])
      
      inline def setClientSecretUndefined: Self = StObject.set(x, "clientSecret", js.undefined)
      
      inline def setConfidentialClientType(value: ConfidentialClientType): Self = StObject.set(x, "confidentialClientType", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.googleAuthLibrary.googleAuthLibraryStrings.basic
    - typings.googleAuthLibrary.googleAuthLibraryStrings.`request-body`
  */
  trait ConfidentialClientType extends StObject
  object ConfidentialClientType {
    
    inline def basic: typings.googleAuthLibrary.googleAuthLibraryStrings.basic = "basic".asInstanceOf[typings.googleAuthLibrary.googleAuthLibraryStrings.basic]
    
    inline def `request-body`: typings.googleAuthLibrary.googleAuthLibraryStrings.`request-body` = "request-body".asInstanceOf[typings.googleAuthLibrary.googleAuthLibraryStrings.`request-body`]
  }
  
  /**
    * OAuth error codes.
    * https://tools.ietf.org/html/rfc6749#section-5.2
    */
  /* Rewritten from type alias, can be one of: 
    - typings.googleAuthLibrary.googleAuthLibraryStrings.invalid_request
    - typings.googleAuthLibrary.googleAuthLibraryStrings.invalid_client
    - typings.googleAuthLibrary.googleAuthLibraryStrings.invalid_grant
    - typings.googleAuthLibrary.googleAuthLibraryStrings.unauthorized_client
    - typings.googleAuthLibrary.googleAuthLibraryStrings.unsupported_grant_type
    - typings.googleAuthLibrary.googleAuthLibraryStrings.invalid_scope
    - java.lang.String
  */
  type OAuthErrorCode = _OAuthErrorCode | String
  
  trait OAuthErrorResponse extends StObject {
    
    var error: OAuthErrorCode
    
    var error_description: js.UndefOr[String] = js.undefined
    
    var error_uri: js.UndefOr[String] = js.undefined
  }
  object OAuthErrorResponse {
    
    inline def apply(error: OAuthErrorCode): OAuthErrorResponse = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
      __obj.asInstanceOf[OAuthErrorResponse]
    }
    
    extension [Self <: OAuthErrorResponse](x: Self) {
      
      inline def setError(value: OAuthErrorCode): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setError_description(value: String): Self = StObject.set(x, "error_description", value.asInstanceOf[js.Any])
      
      inline def setError_descriptionUndefined: Self = StObject.set(x, "error_description", js.undefined)
      
      inline def setError_uri(value: String): Self = StObject.set(x, "error_uri", value.asInstanceOf[js.Any])
      
      inline def setError_uriUndefined: Self = StObject.set(x, "error_uri", js.undefined)
    }
  }
  
  trait _OAuthErrorCode extends StObject
}
