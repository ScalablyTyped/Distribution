package typings.firebaseAuth.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/auth", "OAuthCredential")
@js.native
open class OAuthCredential () extends AuthCredential {
  
  /**
    * The OAuth access token associated with the credential if it belongs to an
    * {@link OAuthProvider}, such as `facebook.com`, `twitter.com`, etc.
    * @readonly
    */
  var accessToken: js.UndefOr[String] = js.native
  
  /* Excluded from this release type: _getIdTokenResponse */
  /* Excluded from this release type: _linkToIdToken */
  /* Excluded from this release type: _getReauthenticationResolver */
  /* private */ var buildRequest: Any = js.native
  
  /**
    * The OAuth ID token associated with the credential if it belongs to an OIDC provider,
    * such as `google.com`.
    * @readonly
    */
  var idToken: js.UndefOr[String] = js.native
  
  /* private */ var nonce: Any = js.native
  
  /* private */ var pendingToken: Any = js.native
  
  /**
    * The OAuth access token secret associated with the credential if it belongs to an OAuth 1.0
    * provider, such as `twitter.com`.
    * @readonly
    */
  var secret: js.UndefOr[String] = js.native
}
/* static members */
object OAuthCredential {
  
  @JSImport("@firebase/auth", "OAuthCredential")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Static method to deserialize a JSON representation of an object into an
    * {@link  AuthCredential}.
    *
    * @param json - Input can be either Object or the stringified representation of the object.
    * When string is provided, JSON.parse would be called first.
    *
    * @returns If the JSON input does not represent an {@link  AuthCredential}, null is returned.
    */
  inline def fromJSON(json: String): OAuthCredential | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[OAuthCredential | Null]
  inline def fromJSON(json: js.Object): OAuthCredential | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[OAuthCredential | Null]
}
