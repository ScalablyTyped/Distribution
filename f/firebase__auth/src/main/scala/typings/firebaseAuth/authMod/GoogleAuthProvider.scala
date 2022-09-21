package typings.firebaseAuth.authMod

import typings.firebaseAuth.firebaseAuthStrings.googleDotcom
import typings.firebaseUtil.mod.FirebaseError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/auth/dist/auth", "GoogleAuthProvider")
@js.native
open class GoogleAuthProvider ()
  extends StObject
     with BaseOAuthProvider {
  
  /**
    * Provider for which credentials can be constructed.
    */
  /* CompleteClass */
  override val providerId: String = js.native
}
/* static members */
object GoogleAuthProvider {
  
  @JSImport("@firebase/auth/dist/auth", "GoogleAuthProvider")
  @js.native
  val ^ : js.Any = js.native
  
  /** Always set to {@link SignInMethod}.GOOGLE. */
  @JSImport("@firebase/auth/dist/auth", "GoogleAuthProvider.GOOGLE_SIGN_IN_METHOD")
  @js.native
  val GOOGLE_SIGN_IN_METHOD: googleDotcom = js.native
  
  /** Always set to {@link ProviderId}.GOOGLE. */
  @JSImport("@firebase/auth/dist/auth", "GoogleAuthProvider.PROVIDER_ID")
  @js.native
  val PROVIDER_ID: googleDotcom = js.native
  
  /**
    * Creates a credential for Google. At least one of ID token and access token is required.
    *
    * @example
    * ```javascript
    * // \`googleUser\` from the onsuccess Google Sign In callback.
    * const credential = GoogleAuthProvider.credential(googleUser.getAuthResponse().id_token);
    * const result = await signInWithCredential(credential);
    * ```
    *
    * @param idToken - Google ID token.
    * @param accessToken - Google access token.
    */
  inline def credential(): OAuthCredential = ^.asInstanceOf[js.Dynamic].applyDynamic("credential")().asInstanceOf[OAuthCredential]
  inline def credential(idToken: String): OAuthCredential = ^.asInstanceOf[js.Dynamic].applyDynamic("credential")(idToken.asInstanceOf[js.Any]).asInstanceOf[OAuthCredential]
  inline def credential(idToken: String, accessToken: String): OAuthCredential = (^.asInstanceOf[js.Dynamic].applyDynamic("credential")(idToken.asInstanceOf[js.Any], accessToken.asInstanceOf[js.Any])).asInstanceOf[OAuthCredential]
  inline def credential(idToken: Null, accessToken: String): OAuthCredential = (^.asInstanceOf[js.Dynamic].applyDynamic("credential")(idToken.asInstanceOf[js.Any], accessToken.asInstanceOf[js.Any])).asInstanceOf[OAuthCredential]
  inline def credential(idToken: Unit, accessToken: String): OAuthCredential = (^.asInstanceOf[js.Dynamic].applyDynamic("credential")(idToken.asInstanceOf[js.Any], accessToken.asInstanceOf[js.Any])).asInstanceOf[OAuthCredential]
  
  /**
    * Used to extract the underlying {@link OAuthCredential} from a {@link AuthError} which was
    * thrown during a sign-in, link, or reauthenticate operation.
    *
    * @param userCredential - The user credential.
    */
  inline def credentialFromError(error: FirebaseError): OAuthCredential | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("credentialFromError")(error.asInstanceOf[js.Any]).asInstanceOf[OAuthCredential | Null]
  
  /**
    * Used to extract the underlying {@link OAuthCredential} from a {@link UserCredential}.
    *
    * @param userCredential - The user credential.
    */
  inline def credentialFromResult(userCredential: UserCredential): OAuthCredential | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("credentialFromResult")(userCredential.asInstanceOf[js.Any]).asInstanceOf[OAuthCredential | Null]
  
  @JSImport("@firebase/auth/dist/auth", "GoogleAuthProvider.credentialFromTaggedObject")
  @js.native
  def credentialFromTaggedObject: Any = js.native
  inline def credentialFromTaggedObject_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("credentialFromTaggedObject")(x.asInstanceOf[js.Any])
}
