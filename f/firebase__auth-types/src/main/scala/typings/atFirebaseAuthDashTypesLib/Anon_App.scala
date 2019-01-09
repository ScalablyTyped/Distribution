package typings
package atFirebaseAuthDashTypesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_App extends js.Object {
  var Auth: Anon_Persistence = js.native
  var EmailAuthProvider: Anon_Credential = js.native
  var EmailAuthProvider_Instance: org.scalablytyped.runtime.Instantiable0[atFirebaseAuthDashTypesLib.authDashTypesMod.EmailAuthProvider_Instance] = js.native
  var FacebookAuthProvider: Anon_CredentialFACEBOOKSIGNINMETHOD = js.native
  var FacebookAuthProvider_Instance: org.scalablytyped.runtime.Instantiable0[atFirebaseAuthDashTypesLib.authDashTypesMod.FacebookAuthProvider_Instance] = js.native
  var GithubAuthProvider: Anon_CredentialGITHUBSIGNINMETHOD = js.native
  var GithubAuthProvider_Instance: org.scalablytyped.runtime.Instantiable0[atFirebaseAuthDashTypesLib.authDashTypesMod.GithubAuthProvider_Instance] = js.native
  var GoogleAuthProvider: Anon_AccessToken = js.native
  var GoogleAuthProvider_Instance: org.scalablytyped.runtime.Instantiable0[atFirebaseAuthDashTypesLib.authDashTypesMod.GoogleAuthProvider_Instance] = js.native
  var OAuthProvider: org.scalablytyped.runtime.Instantiable0[atFirebaseAuthDashTypesLib.authDashTypesMod.OAuthProvider] = js.native
  var PhoneAuthProvider: Anon_CredentialPHONESIGNINMETHOD = js.native
  var PhoneAuthProvider_Instance: org.scalablytyped.runtime.Instantiable1[
    /* auth */ js.UndefOr[/* auth */ atFirebaseAuthDashTypesLib.authDashTypesMod.FirebaseAuth | scala.Null], 
    atFirebaseAuthDashTypesLib.authDashTypesMod.PhoneAuthProvider_Instance
  ] = js.native
  var RecaptchaVerifier: org.scalablytyped.runtime.Instantiable0[atFirebaseAuthDashTypesLib.authDashTypesMod.RecaptchaVerifier] = js.native
  var RecaptchaVerifier_Instance: org.scalablytyped.runtime.Instantiable3[
    /* container */ js.Any | java.lang.String, 
    /* parameters */ js.UndefOr[/* parameters */ js.Object | scala.Null], 
    /* app */ js.UndefOr[/* app */ atFirebaseAppDashTypesLib.appDashTypesMod.FirebaseApp | scala.Null], 
    atFirebaseAuthDashTypesLib.authDashTypesMod.RecaptchaVerifier_Instance
  ] = js.native
  var SAMLAuthProvider: org.scalablytyped.runtime.Instantiable0[atFirebaseAuthDashTypesLib.authDashTypesMod.SAMLAuthProvider] = js.native
  var TwitterAuthProvider: Anon_CredentialPROVIDERID = js.native
  var TwitterAuthProvider_Instance: org.scalablytyped.runtime.Instantiable0[atFirebaseAuthDashTypesLib.authDashTypesMod.TwitterAuthProvider_Instance] = js.native
  def apply(): atFirebaseAuthDashTypesLib.authDashTypesMod.FirebaseAuth = js.native
  def apply(app: atFirebaseAuthDashTypesLib.authDashTypesMod.appDashTypesMod.FirebaseApp): atFirebaseAuthDashTypesLib.authDashTypesMod.FirebaseAuth = js.native
}

