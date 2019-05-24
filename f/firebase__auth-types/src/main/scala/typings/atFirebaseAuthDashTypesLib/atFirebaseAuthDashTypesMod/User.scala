package typings
package atFirebaseAuthDashTypesLib.atFirebaseAuthDashTypesMod

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
  def delete(): js.Promise[scala.Unit] = js.native
  def getIdToken(): js.Promise[java.lang.String] = js.native
  def getIdToken(forceRefresh: scala.Boolean): js.Promise[java.lang.String] = js.native
  def getIdTokenResult(): js.Promise[IdTokenResult] = js.native
  def getIdTokenResult(forceRefresh: scala.Boolean): js.Promise[IdTokenResult] = js.native
  def linkAndRetrieveDataWithCredential(credential: AuthCredential): js.Promise[UserCredential] = js.native
  def linkWithCredential(credential: AuthCredential): js.Promise[UserCredential] = js.native
  def linkWithPhoneNumber(phoneNumber: java.lang.String, applicationVerifier: ApplicationVerifier): js.Promise[ConfirmationResult] = js.native
  def linkWithPopup(provider: AuthProvider): js.Promise[UserCredential] = js.native
  def linkWithRedirect(provider: AuthProvider): js.Promise[scala.Unit] = js.native
  def reauthenticateAndRetrieveDataWithCredential(credential: AuthCredential): js.Promise[UserCredential] = js.native
  def reauthenticateWithCredential(credential: AuthCredential): js.Promise[UserCredential] = js.native
  def reauthenticateWithPhoneNumber(phoneNumber: java.lang.String, applicationVerifier: ApplicationVerifier): js.Promise[ConfirmationResult] = js.native
  def reauthenticateWithPopup(provider: AuthProvider): js.Promise[UserCredential] = js.native
  def reauthenticateWithRedirect(provider: AuthProvider): js.Promise[scala.Unit] = js.native
  def reload(): js.Promise[scala.Unit] = js.native
  def sendEmailVerification(): js.Promise[scala.Unit] = js.native
  def sendEmailVerification(actionCodeSettings: ActionCodeSettings): js.Promise[scala.Unit] = js.native
  def toJSON(): js.Object = js.native
  def unlink(providerId: java.lang.String): js.Promise[User] = js.native
  def updateEmail(newEmail: java.lang.String): js.Promise[scala.Unit] = js.native
  def updatePassword(newPassword: java.lang.String): js.Promise[scala.Unit] = js.native
  def updatePhoneNumber(phoneCredential: AuthCredential): js.Promise[scala.Unit] = js.native
  def updateProfile(profile: atFirebaseAuthDashTypesLib.Anon_DisplayName): js.Promise[scala.Unit] = js.native
}

