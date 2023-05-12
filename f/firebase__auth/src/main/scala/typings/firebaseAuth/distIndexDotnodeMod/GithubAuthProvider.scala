package typings.firebaseAuth.distIndexDotnodeMod

import typings.firebaseAuth.distSrcModelPublicTypesMod.UserCredential
import typings.firebaseAuth.firebaseAuthStrings.githubDotcom
import typings.firebaseUtil.mod.FirebaseError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/auth/dist/index.node", "GithubAuthProvider")
@js.native
open class GithubAuthProvider ()
  extends typings.firebaseAuth.distMod.GithubAuthProvider
/* static members */
object GithubAuthProvider {
  
  @JSImport("@firebase/auth/dist/index.node", "GithubAuthProvider")
  @js.native
  val ^ : js.Any = js.native
  
  /** Always set to {@link SignInMethod}.GITHUB. */
  @JSImport("@firebase/auth/dist/index.node", "GithubAuthProvider.GITHUB_SIGN_IN_METHOD")
  @js.native
  val GITHUB_SIGN_IN_METHOD: githubDotcom = js.native
  
  /** Always set to {@link ProviderId}.GITHUB. */
  @JSImport("@firebase/auth/dist/index.node", "GithubAuthProvider.PROVIDER_ID")
  @js.native
  val PROVIDER_ID: githubDotcom = js.native
  
  /**
    * Creates a credential for Github.
    *
    * @param accessToken - Github access token.
    */
  inline def credential(accessToken: String): typings.firebaseAuth.distSrcCoreCredentialsOauthMod.OAuthCredential = ^.asInstanceOf[js.Dynamic].applyDynamic("credential")(accessToken.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseAuth.distSrcCoreCredentialsOauthMod.OAuthCredential]
  
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
  
  @JSImport("@firebase/auth/dist/index.node", "GithubAuthProvider.credentialFromTaggedObject")
  @js.native
  def credentialFromTaggedObject: Any = js.native
  inline def credentialFromTaggedObject_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("credentialFromTaggedObject")(x.asInstanceOf[js.Any])
}
