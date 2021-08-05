package typings.googleapis.anon

import org.scalablytyped.runtime.Instantiable0
import typings.googleAuthLibrary.mod.OAuth2Client
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofOAuth2Client
  extends StObject
     with Instantiable0[OAuth2Client] {
  
  /**
    * Clock skew - five minutes in seconds
    */
  /* private */ val CLOCK_SKEW_SECS_ : js.Any = js.native
  
  /**
    * The base URL for auth endpoints.
    */
  /* private */ val GOOGLE_OAUTH2_AUTH_BASE_URL_ : js.Any = js.native
  
  /**
    * Google Sign on certificates in JWK format.
    */
  /* private */ val GOOGLE_OAUTH2_FEDERATED_SIGNON_JWK_CERTS_URL_ : js.Any = js.native
  
  /**
    * Google Sign on certificates in PEM format.
    */
  /* private */ val GOOGLE_OAUTH2_FEDERATED_SIGNON_PEM_CERTS_URL_ : js.Any = js.native
  
  /**
    * Google Sign on certificates in JWK format.
    */
  /* private */ val GOOGLE_OAUTH2_IAP_PUBLIC_KEY_URL_ : js.Any = js.native
  
  /**
    * The base endpoint to revoke tokens.
    */
  /* private */ val GOOGLE_OAUTH2_REVOKE_URL_ : js.Any = js.native
  
  /**
    * The base endpoint for token retrieval.
    */
  /* private */ val GOOGLE_OAUTH2_TOKEN_URL_ : js.Any = js.native
  
  /* protected */ val GOOGLE_TOKEN_INFO_URL: /* "https://oauth2.googleapis.com/tokeninfo" */ String = js.native
  
  /**
    * The allowed oauth token issuers.
    */
  /* private */ val ISSUERS_ : js.Any = js.native
  
  /**
    * Max Token Lifetime is one day in seconds
    */
  /* private */ val MAX_TOKEN_LIFETIME_SECS_ : js.Any = js.native
  
  /**
    * Generates an URL to revoke the given token.
    * @param token The existing token to be revoked.
    */
  def getRevokeTokenUrl(token: String): String = js.native
}
