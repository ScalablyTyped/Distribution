package typings.googleAuthLibrary

import org.scalablytyped.runtime.StringDictionary
import typings.gaxios.buildSrcCommonMod.GaxiosResponse
import typings.googleAuthLibrary.anon.ActorToken
import typings.googleAuthLibrary.buildSrcAuthOauth2clientMod.Headers
import typings.googleAuthLibrary.buildSrcAuthOauth2commonMod.ClientAuthentication
import typings.googleAuthLibrary.buildSrcAuthOauth2commonMod.OAuthClientAuthHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcAuthStscredentialsMod {
  
  @JSImport("google-auth-library/build/src/auth/stscredentials", "StsCredentials")
  @js.native
  open class StsCredentials protected () extends OAuthClientAuthHandler {
    /**
      * Initializes an STS credentials instance.
      * @param tokenExchangeEndpoint The token exchange endpoint.
      * @param clientAuthentication The client authentication credentials if
      *   available.
      */
    def this(tokenExchangeEndpoint: String) = this()
    def this(tokenExchangeEndpoint: String, clientAuthentication: ClientAuthentication) = this()
    
    /**
      * Exchanges the provided token for another type of token based on the
      * rfc8693 spec.
      * @param stsCredentialsOptions The token exchange options used to populate
      *   the token exchange request.
      * @param additionalHeaders Optional additional headers to pass along the
      *   request.
      * @param options Optional additional GCP-specific non-spec defined options
      *   to send with the request.
      *   Example: `&options=${encodeUriComponent(JSON.stringified(options))}`
      * @return A promise that resolves with the token exchange response containing
      *   the requested token and its expiration time.
      */
    def exchangeToken(stsCredentialsOptions: StsCredentialsOptions): js.Promise[StsSuccessfulResponse] = js.native
    def exchangeToken(
      stsCredentialsOptions: StsCredentialsOptions,
      additionalHeaders: Unit,
      options: StringDictionary[Any]
    ): js.Promise[StsSuccessfulResponse] = js.native
    def exchangeToken(stsCredentialsOptions: StsCredentialsOptions, additionalHeaders: Headers): js.Promise[StsSuccessfulResponse] = js.native
    def exchangeToken(
      stsCredentialsOptions: StsCredentialsOptions,
      additionalHeaders: Headers,
      options: StringDictionary[Any]
    ): js.Promise[StsSuccessfulResponse] = js.native
    
    /* private */ val tokenExchangeEndpoint: Any = js.native
    
    /* private */ var transporter: Any = js.native
  }
  
  trait StsCredentialsOptions extends StObject {
    
    var actingParty: js.UndefOr[ActorToken] = js.undefined
    
    /**
      * OPTIONAL. The logical name of the target service where the client
      * intends to use the requested security token.  This serves a purpose
      * similar to the "resource" parameter but with the client providing a
      * logical name for the target service.
      */
    var audience: js.UndefOr[String] = js.undefined
    
    /**
      * REQUIRED. The value "urn:ietf:params:oauth:grant-type:token-exchange"
      * indicates that a token exchange is being performed.
      */
    var grantType: String
    
    /**
      * OPTIONAL. An identifier, as described in Section 3 of [RFC8693], eg.
      * "urn:ietf:params:oauth:token-type:access_token" for the type of the
      * requested security token.
      */
    var requestedTokenType: js.UndefOr[String] = js.undefined
    
    /**
      * OPTIONAL. A URI that indicates the target service or resource where the
      * client intends to use the requested security token.
      */
    var resource: js.UndefOr[String] = js.undefined
    
    /**
      * OPTIONAL. A list of space-delimited, case-sensitive strings, as defined
      * in Section 3.3 of [RFC6749], that allow the client to specify the desired
      * scope of the requested security token in the context of the service or
      * resource where the token will be used.
      */
    var scope: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * REQUIRED. A security token that represents the identity of the party on
      * behalf of whom the request is being made.
      */
    var subjectToken: String
    
    /**
      * REQUIRED. An identifier, as described in Section 3 of [RFC8693], that
      * indicates the type of the security token in the "subject_token" parameter.
      */
    var subjectTokenType: String
  }
  object StsCredentialsOptions {
    
    inline def apply(grantType: String, subjectToken: String, subjectTokenType: String): StsCredentialsOptions = {
      val __obj = js.Dynamic.literal(grantType = grantType.asInstanceOf[js.Any], subjectToken = subjectToken.asInstanceOf[js.Any], subjectTokenType = subjectTokenType.asInstanceOf[js.Any])
      __obj.asInstanceOf[StsCredentialsOptions]
    }
    
    extension [Self <: StsCredentialsOptions](x: Self) {
      
      inline def setActingParty(value: ActorToken): Self = StObject.set(x, "actingParty", value.asInstanceOf[js.Any])
      
      inline def setActingPartyUndefined: Self = StObject.set(x, "actingParty", js.undefined)
      
      inline def setAudience(value: String): Self = StObject.set(x, "audience", value.asInstanceOf[js.Any])
      
      inline def setAudienceUndefined: Self = StObject.set(x, "audience", js.undefined)
      
      inline def setGrantType(value: String): Self = StObject.set(x, "grantType", value.asInstanceOf[js.Any])
      
      inline def setRequestedTokenType(value: String): Self = StObject.set(x, "requestedTokenType", value.asInstanceOf[js.Any])
      
      inline def setRequestedTokenTypeUndefined: Self = StObject.set(x, "requestedTokenType", js.undefined)
      
      inline def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
      
      inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
      
      inline def setScope(value: js.Array[String]): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
      
      inline def setScopeVarargs(value: String*): Self = StObject.set(x, "scope", js.Array(value*))
      
      inline def setSubjectToken(value: String): Self = StObject.set(x, "subjectToken", value.asInstanceOf[js.Any])
      
      inline def setSubjectTokenType(value: String): Self = StObject.set(x, "subjectTokenType", value.asInstanceOf[js.Any])
    }
  }
  
  trait StsSuccessfulResponse extends StObject {
    
    var access_token: String
    
    var expires_in: js.UndefOr[Double] = js.undefined
    
    var issued_token_type: String
    
    var refresh_token: js.UndefOr[String] = js.undefined
    
    var res: js.UndefOr[GaxiosResponse[Any] | Null] = js.undefined
    
    var scope: js.UndefOr[String] = js.undefined
    
    var token_type: String
  }
  object StsSuccessfulResponse {
    
    inline def apply(access_token: String, issued_token_type: String, token_type: String): StsSuccessfulResponse = {
      val __obj = js.Dynamic.literal(access_token = access_token.asInstanceOf[js.Any], issued_token_type = issued_token_type.asInstanceOf[js.Any], token_type = token_type.asInstanceOf[js.Any])
      __obj.asInstanceOf[StsSuccessfulResponse]
    }
    
    extension [Self <: StsSuccessfulResponse](x: Self) {
      
      inline def setAccess_token(value: String): Self = StObject.set(x, "access_token", value.asInstanceOf[js.Any])
      
      inline def setExpires_in(value: Double): Self = StObject.set(x, "expires_in", value.asInstanceOf[js.Any])
      
      inline def setExpires_inUndefined: Self = StObject.set(x, "expires_in", js.undefined)
      
      inline def setIssued_token_type(value: String): Self = StObject.set(x, "issued_token_type", value.asInstanceOf[js.Any])
      
      inline def setRefresh_token(value: String): Self = StObject.set(x, "refresh_token", value.asInstanceOf[js.Any])
      
      inline def setRefresh_tokenUndefined: Self = StObject.set(x, "refresh_token", js.undefined)
      
      inline def setRes(value: GaxiosResponse[Any]): Self = StObject.set(x, "res", value.asInstanceOf[js.Any])
      
      inline def setResNull: Self = StObject.set(x, "res", null)
      
      inline def setResUndefined: Self = StObject.set(x, "res", js.undefined)
      
      inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
      
      inline def setToken_type(value: String): Self = StObject.set(x, "token_type", value.asInstanceOf[js.Any])
    }
  }
}
