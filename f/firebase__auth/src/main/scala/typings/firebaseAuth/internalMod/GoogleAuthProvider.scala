package typings.firebaseAuth.internalMod

import typings.firebaseAuth.distSrcModelPublicTypesMod.UserCredential
import typings.firebaseAuth.firebaseAuthStrings.googleDotcom
import typings.firebaseUtil.mod.FirebaseError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/auth/internal", "GoogleAuthProvider")
@js.native
open class GoogleAuthProvider ()
  extends typings.firebaseAuth.distInternalMod.GoogleAuthProvider
/* static members */
object GoogleAuthProvider {
  
  @JSImport("@firebase/auth/internal", "GoogleAuthProvider")
  @js.native
  val ^ : js.Any = js.native
  
  /** Always set to {@link SignInMethod}.GOOGLE. */
  @JSImport("@firebase/auth/internal", "GoogleAuthProvider.GOOGLE_SIGN_IN_METHOD")
  @js.native
  val GOOGLE_SIGN_IN_METHOD: googleDotcom = js.native
  
  /** Always set to {@link ProviderId}.GOOGLE. */
  @JSImport("@firebase/auth/internal", "GoogleAuthProvider.PROVIDER_ID")
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
  inline def credential(): typings.firebaseAuth.distSrcCoreCredentialsOauthMod.OAuthCredential = ^.asInstanceOf[js.Dynamic].applyDynamic("credential")().asInstanceOf[typings.firebaseAuth.distSrcCoreCredentialsOauthMod.OAuthCredential]
  inline def credential(idToken: String): typings.firebaseAuth.distSrcCoreCredentialsOauthMod.OAuthCredential = ^.asInstanceOf[js.Dynamic].applyDynamic("credential")(idToken.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseAuth.distSrcCoreCredentialsOauthMod.OAuthCredential]
  inline def credential(idToken: String, accessToken: String): typings.firebaseAuth.distSrcCoreCredentialsOauthMod.OAuthCredential = (^.asInstanceOf[js.Dynamic].applyDynamic("credential")(idToken.asInstanceOf[js.Any], accessToken.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseAuth.distSrcCoreCredentialsOauthMod.OAuthCredential]
  inline def credential(idToken: Null, accessToken: String): typings.firebaseAuth.distSrcCoreCredentialsOauthMod.OAuthCredential = (^.asInstanceOf[js.Dynamic].applyDynamic("credential")(idToken.asInstanceOf[js.Any], accessToken.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseAuth.distSrcCoreCredentialsOauthMod.OAuthCredential]
  inline def credential(idToken: Unit, accessToken: String): typings.firebaseAuth.distSrcCoreCredentialsOauthMod.OAuthCredential = (^.asInstanceOf[js.Dynamic].applyDynamic("credential")(idToken.asInstanceOf[js.Any], accessToken.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseAuth.distSrcCoreCredentialsOauthMod.OAuthCredential]
  
  /**
    * Used to extract the underlying {@link OAuthCredential} from a {@link AuthError} which was
    * thrown during a sign-in, link, or reauthenticate operation.
    *
    * @param userCredential - The user credential.
    */
  inline def credentialFromError(error: FirebaseError): typings.firebaseAuth.distSrcCoreCredentialsOauthMod.OAuthCredential | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("credentialFromError")(error.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseAuth.distSrcCoreCredentialsOauthMod.OAuthCredential | Null]
  
  /**
    * Used to extract the underlying {@link OAuthCredential} from a {@link UserCredential}.
    *
    * @param userCredential - The user credential.
    */
  inline def credentialFromResult(userCredential: UserCredential): typings.firebaseAuth.distSrcCoreCredentialsOauthMod.OAuthCredential | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("credentialFromResult")(userCredential.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseAuth.distSrcCoreCredentialsOauthMod.OAuthCredential | Null]
  
  @JSImport("@firebase/auth/internal", "GoogleAuthProvider.credentialFromTaggedObject")
  @js.native
  def credentialFromTaggedObject: Any = js.native
  inline def credentialFromTaggedObject_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("credentialFromTaggedObject")(x.asInstanceOf[js.Any])
}
