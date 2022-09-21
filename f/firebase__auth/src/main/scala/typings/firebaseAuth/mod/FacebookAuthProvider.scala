package typings.firebaseAuth.mod

import typings.firebaseAuth.firebaseAuthStrings.facebookDotcom
import typings.firebaseUtil.mod.FirebaseError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/auth", "FacebookAuthProvider")
@js.native
open class FacebookAuthProvider ()
  extends StObject
     with BaseOAuthProvider {
  
  /**
    * Provider for which credentials can be constructed.
    */
  /* CompleteClass */
  override val providerId: String = js.native
}
/* static members */
object FacebookAuthProvider {
  
  @JSImport("@firebase/auth", "FacebookAuthProvider")
  @js.native
  val ^ : js.Any = js.native
  
  /** Always set to {@link SignInMethod}.FACEBOOK. */
  @JSImport("@firebase/auth", "FacebookAuthProvider.FACEBOOK_SIGN_IN_METHOD")
  @js.native
  val FACEBOOK_SIGN_IN_METHOD: facebookDotcom = js.native
  
  /** Always set to {@link ProviderId}.FACEBOOK. */
  @JSImport("@firebase/auth", "FacebookAuthProvider.PROVIDER_ID")
  @js.native
  val PROVIDER_ID: facebookDotcom = js.native
  
  /**
    * Creates a credential for Facebook.
    *
    * @example
    * ```javascript
    * // `event` from the Facebook auth.authResponseChange callback.
    * const credential = FacebookAuthProvider.credential(event.authResponse.accessToken);
    * const result = await signInWithCredential(credential);
    * ```
    *
    * @param accessToken - Facebook access token.
    */
  inline def credential(accessToken: String): OAuthCredential = ^.asInstanceOf[js.Dynamic].applyDynamic("credential")(accessToken.asInstanceOf[js.Any]).asInstanceOf[OAuthCredential]
  
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
  
  @JSImport("@firebase/auth", "FacebookAuthProvider.credentialFromTaggedObject")
  @js.native
  def credentialFromTaggedObject: Any = js.native
  inline def credentialFromTaggedObject_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("credentialFromTaggedObject")(x.asInstanceOf[js.Any])
}
