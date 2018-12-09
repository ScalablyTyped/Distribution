package typings
package firebaseLib.firebaseMod.firebaseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait User extends UserInfo {
  var emailVerified: scala.Boolean = js.native
  var isAnonymous: scala.Boolean = js.native
  var metadata: firebaseLib.firebaseMod.firebaseNs.authNs.UserMetadata = js.native
  var providerData: coreDashJsLib.Array[UserInfo | scala.Null] = js.native
  var refreshToken: java.lang.String = js.native
  def delete(): js.Promise[scala.Unit] = js.native
  def getIdToken(): js.Promise[java.lang.String] = js.native
  def getIdToken(forceRefresh: scala.Boolean): js.Promise[java.lang.String] = js.native
  def getIdTokenResult(): js.Promise[firebaseLib.firebaseMod.firebaseNs.authNs.IdTokenResult] = js.native
  def getIdTokenResult(forceRefresh: scala.Boolean): js.Promise[firebaseLib.firebaseMod.firebaseNs.authNs.IdTokenResult] = js.native
  def linkAndRetrieveDataWithCredential(credential: firebaseLib.firebaseMod.firebaseNs.authNs.AuthCredential): js.Promise[firebaseLib.firebaseMod.firebaseNs.authNs.UserCredential] = js.native
  def linkWithCredential(credential: firebaseLib.firebaseMod.firebaseNs.authNs.AuthCredential): js.Promise[User] = js.native
  def linkWithPhoneNumber(
    phoneNumber: java.lang.String,
    applicationVerifier: firebaseLib.firebaseMod.firebaseNs.authNs.ApplicationVerifier
  ): js.Promise[firebaseLib.firebaseMod.firebaseNs.authNs.ConfirmationResult] = js.native
  def linkWithPopup(provider: firebaseLib.firebaseMod.firebaseNs.authNs.AuthProvider): js.Promise[firebaseLib.firebaseMod.firebaseNs.authNs.UserCredential] = js.native
  def linkWithRedirect(provider: firebaseLib.firebaseMod.firebaseNs.authNs.AuthProvider): js.Promise[scala.Unit] = js.native
  def reauthenticateAndRetrieveDataWithCredential(credential: firebaseLib.firebaseMod.firebaseNs.authNs.AuthCredential): js.Promise[firebaseLib.firebaseMod.firebaseNs.authNs.UserCredential] = js.native
  def reauthenticateWithCredential(credential: firebaseLib.firebaseMod.firebaseNs.authNs.AuthCredential): js.Promise[scala.Unit] = js.native
  def reauthenticateWithPhoneNumber(
    phoneNumber: java.lang.String,
    applicationVerifier: firebaseLib.firebaseMod.firebaseNs.authNs.ApplicationVerifier
  ): js.Promise[firebaseLib.firebaseMod.firebaseNs.authNs.ConfirmationResult] = js.native
  def reauthenticateWithPopup(provider: firebaseLib.firebaseMod.firebaseNs.authNs.AuthProvider): js.Promise[firebaseLib.firebaseMod.firebaseNs.authNs.UserCredential] = js.native
  def reauthenticateWithRedirect(provider: firebaseLib.firebaseMod.firebaseNs.authNs.AuthProvider): js.Promise[scala.Unit] = js.native
  def reload(): js.Promise[scala.Unit] = js.native
  def sendEmailVerification(): js.Promise[scala.Unit] = js.native
  def sendEmailVerification(actionCodeSettings: firebaseLib.firebaseMod.firebaseNs.authNs.ActionCodeSettings): js.Promise[scala.Unit] = js.native
  def toJSON(): coreDashJsLib.Object = js.native
  def unlink(providerId: java.lang.String): js.Promise[User] = js.native
  def updateEmail(newEmail: java.lang.String): js.Promise[scala.Unit] = js.native
  def updatePassword(newPassword: java.lang.String): js.Promise[scala.Unit] = js.native
  def updatePhoneNumber(phoneCredential: firebaseLib.firebaseMod.firebaseNs.authNs.AuthCredential): js.Promise[scala.Unit] = js.native
  def updateProfile(profile: firebaseLib.Anon_DisplayName): js.Promise[scala.Unit] = js.native
}

