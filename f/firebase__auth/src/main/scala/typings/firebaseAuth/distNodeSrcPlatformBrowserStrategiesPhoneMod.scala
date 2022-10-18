package typings.firebaseAuth

import typings.firebaseAuth.distNodeSrcCoreCredentialsPhoneMod.PhoneAuthCredential
import typings.firebaseAuth.distNodeSrcModelApplicationVerifierMod.ApplicationVerifierInternal
import typings.firebaseAuth.distNodeSrcModelAuthMod.AuthInternal
import typings.firebaseAuth.distNodeSrcModelPublicTypesMod.ApplicationVerifier
import typings.firebaseAuth.distNodeSrcModelPublicTypesMod.Auth
import typings.firebaseAuth.distNodeSrcModelPublicTypesMod.ConfirmationResult
import typings.firebaseAuth.distNodeSrcModelPublicTypesMod.PhoneInfoOptions
import typings.firebaseAuth.distNodeSrcModelPublicTypesMod.User
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNodeSrcPlatformBrowserStrategiesPhoneMod {
  
  @JSImport("@firebase/auth/dist/node/src/platform_browser/strategies/phone", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def linkWithPhoneNumber(user: User, phoneNumber: String, appVerifier: ApplicationVerifier): js.Promise[ConfirmationResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("linkWithPhoneNumber")(user.asInstanceOf[js.Any], phoneNumber.asInstanceOf[js.Any], appVerifier.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ConfirmationResult]]
  
  inline def reauthenticateWithPhoneNumber(user: User, phoneNumber: String, appVerifier: ApplicationVerifier): js.Promise[ConfirmationResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("reauthenticateWithPhoneNumber")(user.asInstanceOf[js.Any], phoneNumber.asInstanceOf[js.Any], appVerifier.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ConfirmationResult]]
  
  inline def signInWithPhoneNumber(auth: Auth, phoneNumber: String, appVerifier: ApplicationVerifier): js.Promise[ConfirmationResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("signInWithPhoneNumber")(auth.asInstanceOf[js.Any], phoneNumber.asInstanceOf[js.Any], appVerifier.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ConfirmationResult]]
  
  inline def updatePhoneNumber(user: User, credential: PhoneAuthCredential): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("updatePhoneNumber")(user.asInstanceOf[js.Any], credential.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def verifyPhoneNumber(auth: AuthInternal, options: String, verifier: ApplicationVerifierInternal): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("_verifyPhoneNumber")(auth.asInstanceOf[js.Any], options.asInstanceOf[js.Any], verifier.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def verifyPhoneNumber(auth: AuthInternal, options: PhoneInfoOptions, verifier: ApplicationVerifierInternal): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("_verifyPhoneNumber")(auth.asInstanceOf[js.Any], options.asInstanceOf[js.Any], verifier.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
}
