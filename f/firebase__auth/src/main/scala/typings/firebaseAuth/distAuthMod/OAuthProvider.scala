package typings.firebaseAuth.distAuthMod

import typings.firebaseUtil.mod.FirebaseError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/auth/dist/auth", "OAuthProvider")
@js.native
open class OAuthProvider ()
  extends StObject
     with BaseOAuthProvider {
  
  /** An internal credential method that accepts more permissive options */
  /* private */ var _credential: Any = js.native
  
  /**
    * Creates a {@link OAuthCredential} from a generic OAuth provider's access token or ID token.
    *
    * @remarks
    * The raw nonce is required when an ID token with a nonce field is provided. The SHA-256 hash of
    * the raw nonce must match the nonce field in the ID token.
    *
    * @example
    * ```javascript
    * // `googleUser` from the onsuccess Google Sign In callback.
    * // Initialize a generate OAuth provider with a `google.com` providerId.
    * const provider = new OAuthProvider('google.com');
    * const credential = provider.credential({
    *   idToken: googleUser.getAuthResponse().id_token,
    * });
    * const result = await signInWithCredential(credential);
    * ```
    *
    * @param params - Either the options object containing the ID token, access token and raw nonce
    * or the ID token string.
    */
  def credential(params: OAuthCredentialOptions): OAuthCredential = js.native
  
  /**
    * Provider for which credentials can be constructed.
    */
  /* CompleteClass */
  override val providerId: String = js.native
}
/* static members */
object OAuthProvider {
  
  @JSImport("@firebase/auth/dist/auth", "OAuthProvider")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Used to extract the underlying {@link OAuthCredential} from a {@link AuthError} which was
    * thrown during a sign-in, link, or reauthenticate operation.
    *
    * @param userCredential - The user credential.
    */
  inline def credentialFromError(error: FirebaseError): OAuthCredential | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("credentialFromError")(error.asInstanceOf[js.Any]).asInstanceOf[OAuthCredential | Null]
  
  inline def credentialFromJSON(json: String): OAuthCredential = ^.asInstanceOf[js.Dynamic].applyDynamic("credentialFromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[OAuthCredential]
  /**
    * Creates an {@link OAuthCredential} from a JSON string or a plain object.
    * @param json - A plain object or a JSON string
    */
  inline def credentialFromJSON(json: js.Object): OAuthCredential = ^.asInstanceOf[js.Dynamic].applyDynamic("credentialFromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[OAuthCredential]
  
  /**
    * Used to extract the underlying {@link OAuthCredential} from a {@link UserCredential}.
    *
    * @param userCredential - The user credential.
    */
  inline def credentialFromResult(userCredential: UserCredential): OAuthCredential | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("credentialFromResult")(userCredential.asInstanceOf[js.Any]).asInstanceOf[OAuthCredential | Null]
  
  @JSImport("@firebase/auth/dist/auth", "OAuthProvider.oauthCredentialFromTaggedObject")
  @js.native
  def oauthCredentialFromTaggedObject: Any = js.native
  inline def oauthCredentialFromTaggedObject_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("oauthCredentialFromTaggedObject")(x.asInstanceOf[js.Any])
}
