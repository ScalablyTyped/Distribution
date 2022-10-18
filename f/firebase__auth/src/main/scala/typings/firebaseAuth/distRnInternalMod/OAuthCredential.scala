package typings.firebaseAuth.distRnInternalMod

import typings.firebaseAuth.distRnSrcCoreCredentialsOauthMod.OAuthCredentialParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/auth/dist/rn/internal", "OAuthCredential")
@js.native
open class OAuthCredential protected ()
  extends typings.firebaseAuth.distRnMod.OAuthCredential {
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
}
/* static members */
object OAuthCredential {
  
  @JSImport("@firebase/auth/dist/rn/internal", "OAuthCredential")
  @js.native
  val ^ : js.Any = js.native
  
  /** @internal */
  inline def _fromParams(params: OAuthCredentialParams): typings.firebaseAuth.distRnSrcCoreCredentialsOauthMod.OAuthCredential = ^.asInstanceOf[js.Dynamic].applyDynamic("_fromParams")(params.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseAuth.distRnSrcCoreCredentialsOauthMod.OAuthCredential]
  
  /**
    * Static method to deserialize a JSON representation of an object into an
    * {@link  AuthCredential}.
    *
    * @param json - Input can be either Object or the stringified representation of the object.
    * When string is provided, JSON.parse would be called first.
    *
    * @returns If the JSON input does not represent an {@link  AuthCredential}, null is returned.
    */
  inline def fromJSON(json: String): typings.firebaseAuth.distRnSrcCoreCredentialsOauthMod.OAuthCredential | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseAuth.distRnSrcCoreCredentialsOauthMod.OAuthCredential | Null]
  inline def fromJSON(json: js.Object): typings.firebaseAuth.distRnSrcCoreCredentialsOauthMod.OAuthCredential | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseAuth.distRnSrcCoreCredentialsOauthMod.OAuthCredential | Null]
}
