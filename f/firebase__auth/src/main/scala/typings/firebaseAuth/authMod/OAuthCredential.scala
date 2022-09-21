package typings.firebaseAuth.authMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/auth/dist/auth", "OAuthCredential")
@js.native
open class OAuthCredential protected () extends AuthCredential {
  /** @internal */
  /* protected */ def this(
    /**
    * The authentication provider ID for the credential.
    *
    * @remarks
    * For example, 'facebook.com', or 'google.com'.
    */
  providerId: String,
    /**
    * The authentication sign in method for the credential.
    *
    * @remarks
    * For example, {@link SignInMethod}.EMAIL_PASSWORD, or
    * {@link SignInMethod}.EMAIL_LINK. This corresponds to the sign-in method
    * identifier as returned in {@link fetchSignInMethodsForEmail}.
    */
  signInMethod: String
  ) = this()
  
  /**
    * The OAuth access token associated with the credential if it belongs to an
    * {@link OAuthProvider}, such as `facebook.com`, `twitter.com`, etc.
    * @readonly
    */
  var accessToken: js.UndefOr[String] = js.native
  
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
  
  @JSImport("@firebase/auth/dist/auth", "OAuthCredential")
  @js.native
  val ^ : js.Any = js.native
  
  /** @internal */
  inline def _fromParams(params: OAuthCredentialParams): OAuthCredential = ^.asInstanceOf[js.Dynamic].applyDynamic("_fromParams")(params.asInstanceOf[js.Any]).asInstanceOf[OAuthCredential]
  
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
