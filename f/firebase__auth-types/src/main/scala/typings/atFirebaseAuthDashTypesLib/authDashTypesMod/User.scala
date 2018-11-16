package typings
package atFirebaseAuthDashTypesLib.authDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait User extends UserInfo {
  var emailVerified: scala.Boolean = js.native
  var isAnonymous: scala.Boolean = js.native
  var metadata: UserMetadata = js.native
  var providerData: js.Array[UserInfo | scala.Null] = js.native
  var refreshToken: java.lang.String = js.native
  def delete(): stdLib.Promise[scala.Unit] = js.native
  def getIdToken(): stdLib.Promise[java.lang.String] = js.native
  def getIdToken(forceRefresh: scala.Boolean): stdLib.Promise[java.lang.String] = js.native
  def getIdTokenResult(): stdLib.Promise[IdTokenResult] = js.native
  def getIdTokenResult(forceRefresh: scala.Boolean): stdLib.Promise[IdTokenResult] = js.native
  def linkAndRetrieveDataWithCredential(credential: AuthCredential): stdLib.Promise[UserCredential] = js.native
  def linkWithCredential(credential: AuthCredential): stdLib.Promise[User] = js.native
  def linkWithPhoneNumber(phoneNumber: java.lang.String, applicationVerifier: ApplicationVerifier): stdLib.Promise[ConfirmationResult] = js.native
  def linkWithPopup(provider: AuthProvider): stdLib.Promise[UserCredential] = js.native
  def linkWithRedirect(provider: AuthProvider): stdLib.Promise[scala.Unit] = js.native
  def reauthenticateAndRetrieveDataWithCredential(credential: AuthCredential): stdLib.Promise[UserCredential] = js.native
  def reauthenticateWithCredential(credential: AuthCredential): stdLib.Promise[scala.Unit] = js.native
  def reauthenticateWithPhoneNumber(phoneNumber: java.lang.String, applicationVerifier: ApplicationVerifier): stdLib.Promise[ConfirmationResult] = js.native
  def reauthenticateWithPopup(provider: AuthProvider): stdLib.Promise[UserCredential] = js.native
  def reauthenticateWithRedirect(provider: AuthProvider): stdLib.Promise[scala.Unit] = js.native
  def reload(): stdLib.Promise[scala.Unit] = js.native
  def sendEmailVerification(): stdLib.Promise[scala.Unit] = js.native
  def sendEmailVerification(actionCodeSettings: ActionCodeSettings): stdLib.Promise[scala.Unit] = js.native
  def toJSON(): js.Object = js.native
  def unlink(providerId: java.lang.String): stdLib.Promise[User] = js.native
  def updateEmail(newEmail: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  def updatePassword(newPassword: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  def updatePhoneNumber(phoneCredential: AuthCredential): stdLib.Promise[scala.Unit] = js.native
  def updateProfile(profile: atFirebaseAuthDashTypesLib.Anon_DisplayName): stdLib.Promise[scala.Unit] = js.native
}

