package typings.firebaseAuthTypes.mod

import typings.firebaseAuthTypes.anon.DisplayName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait User extends UserInfo {
  var emailVerified: Boolean = js.native
  var isAnonymous: Boolean = js.native
  var metadata: UserMetadata = js.native
  var multiFactor: MultiFactorUser = js.native
  var providerData: js.Array[UserInfo | Null] = js.native
  var refreshToken: String = js.native
  val tenantId: String | Null = js.native
  def delete(): js.Promise[Unit] = js.native
  def getIdToken(): js.Promise[String] = js.native
  def getIdToken(forceRefresh: Boolean): js.Promise[String] = js.native
  def getIdTokenResult(): js.Promise[IdTokenResult] = js.native
  def getIdTokenResult(forceRefresh: Boolean): js.Promise[IdTokenResult] = js.native
  def linkAndRetrieveDataWithCredential(credential: AuthCredential): js.Promise[UserCredential] = js.native
  def linkWithCredential(credential: AuthCredential): js.Promise[UserCredential] = js.native
  def linkWithPhoneNumber(phoneNumber: String, applicationVerifier: ApplicationVerifier): js.Promise[ConfirmationResult] = js.native
  def linkWithPopup(provider: AuthProvider): js.Promise[UserCredential] = js.native
  def linkWithRedirect(provider: AuthProvider): js.Promise[Unit] = js.native
  def reauthenticateAndRetrieveDataWithCredential(credential: AuthCredential): js.Promise[UserCredential] = js.native
  def reauthenticateWithCredential(credential: AuthCredential): js.Promise[UserCredential] = js.native
  def reauthenticateWithPhoneNumber(phoneNumber: String, applicationVerifier: ApplicationVerifier): js.Promise[ConfirmationResult] = js.native
  def reauthenticateWithPopup(provider: AuthProvider): js.Promise[UserCredential] = js.native
  def reauthenticateWithRedirect(provider: AuthProvider): js.Promise[Unit] = js.native
  def reload(): js.Promise[Unit] = js.native
  def sendEmailVerification(): js.Promise[Unit] = js.native
  def sendEmailVerification(actionCodeSettings: ActionCodeSettings): js.Promise[Unit] = js.native
  def toJSON(): js.Object = js.native
  def unlink(providerId: String): js.Promise[User] = js.native
  def updateEmail(newEmail: String): js.Promise[Unit] = js.native
  def updatePassword(newPassword: String): js.Promise[Unit] = js.native
  def updatePhoneNumber(phoneCredential: AuthCredential): js.Promise[Unit] = js.native
  def updateProfile(profile: DisplayName): js.Promise[Unit] = js.native
  def verifyBeforeUpdateEmail(newEmail: String): js.Promise[Unit] = js.native
  def verifyBeforeUpdateEmail(newEmail: String, actionCodeSettings: ActionCodeSettings): js.Promise[Unit] = js.native
}

