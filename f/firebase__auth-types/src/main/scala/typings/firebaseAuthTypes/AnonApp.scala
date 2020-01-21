package typings.firebaseAuthTypes

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable3
import typings.firebaseAppTypes.mod.FirebaseApp
import typings.firebaseAuthTypes.mod.EmailAuthProviderInstance
import typings.firebaseAuthTypes.mod.FacebookAuthProviderInstance
import typings.firebaseAuthTypes.mod.FirebaseAuth
import typings.firebaseAuthTypes.mod.GithubAuthProviderInstance
import typings.firebaseAuthTypes.mod.GoogleAuthProviderInstance
import typings.firebaseAuthTypes.mod.PhoneAuthProviderInstance
import typings.firebaseAuthTypes.mod.RecaptchaVerifierInstance
import typings.firebaseAuthTypes.mod.TwitterAuthProviderInstance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonApp extends js.Object {
  var Auth: TypeofClassFirebaseAuth = js.native
  var EmailAuthProvider: TypeofClassEmailAuthProvider = js.native
  var EmailAuthProvider_Instance: Instantiable0[EmailAuthProviderInstance] = js.native
  var FacebookAuthProvider: TypeofClassFacebookAuthProvider = js.native
  var FacebookAuthProvider_Instance: Instantiable0[FacebookAuthProviderInstance] = js.native
  var GithubAuthProvider: TypeofClassGithubAuthProvider = js.native
  var GithubAuthProvider_Instance: Instantiable0[GithubAuthProviderInstance] = js.native
  var GoogleAuthProvider: TypeofClassGoogleAuthProvider = js.native
  var GoogleAuthProvider_Instance: Instantiable0[GoogleAuthProviderInstance] = js.native
  var OAuthProvider: Instantiable1[/* providerId */ String, typings.firebaseAuthTypes.mod.OAuthProvider] = js.native
  var PhoneAuthProvider: TypeofClassPhoneAuthProvider = js.native
  var PhoneAuthProvider_Instance: Instantiable1[js.UndefOr[FirebaseAuth | Null], PhoneAuthProviderInstance] = js.native
  var RecaptchaVerifier: Instantiable0[typings.firebaseAuthTypes.mod.RecaptchaVerifier] = js.native
  var RecaptchaVerifier_Instance: Instantiable3[
    /* container */ js.Any | String, 
    js.UndefOr[js.Object | Null], 
    js.UndefOr[FirebaseApp | Null], 
    RecaptchaVerifierInstance
  ] = js.native
  var SAMLAuthProvider: Instantiable1[/* providerId */ String, typings.firebaseAuthTypes.mod.SAMLAuthProvider] = js.native
  var TwitterAuthProvider: TypeofClassTwitterAuthProvider = js.native
  var TwitterAuthProvider_Instance: Instantiable0[TwitterAuthProviderInstance] = js.native
  def apply(): FirebaseAuth = js.native
  def apply(app: typings.firebaseAuthTypes.mod.firebaseAppTypesAugmentingMod.FirebaseApp): FirebaseAuth = js.native
}

