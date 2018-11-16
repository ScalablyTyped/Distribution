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
  def delete(): stdLib.Promise[scala.Unit] = js.native
  def getIdToken(): stdLib.Promise[java.lang.String] = js.native
  def getIdToken(forceRefresh: scala.Boolean): stdLib.Promise[java.lang.String] = js.native
  def getIdTokenResult(): stdLib.Promise[firebaseLib.firebaseMod.firebaseNs.authNs.IdTokenResult] = js.native
  def getIdTokenResult(forceRefresh: scala.Boolean): stdLib.Promise[firebaseLib.firebaseMod.firebaseNs.authNs.IdTokenResult] = js.native
  def linkAndRetrieveDataWithCredential(credential: firebaseLib.firebaseMod.firebaseNs.authNs.AuthCredential): stdLib.Promise[firebaseLib.firebaseMod.firebaseNs.authNs.UserCredential] = js.native
  def linkWithCredential(credential: firebaseLib.firebaseMod.firebaseNs.authNs.AuthCredential): stdLib.Promise[User] = js.native
  def linkWithPhoneNumber(
    phoneNumber: java.lang.String,
    applicationVerifier: firebaseLib.firebaseMod.firebaseNs.authNs.ApplicationVerifier
  ): stdLib.Promise[firebaseLib.firebaseMod.firebaseNs.authNs.ConfirmationResult] = js.native
  def linkWithPopup(provider: firebaseLib.firebaseMod.firebaseNs.authNs.AuthProvider): stdLib.Promise[firebaseLib.firebaseMod.firebaseNs.authNs.UserCredential] = js.native
  def linkWithRedirect(provider: firebaseLib.firebaseMod.firebaseNs.authNs.AuthProvider): stdLib.Promise[scala.Unit] = js.native
  def reauthenticateAndRetrieveDataWithCredential(credential: firebaseLib.firebaseMod.firebaseNs.authNs.AuthCredential): stdLib.Promise[firebaseLib.firebaseMod.firebaseNs.authNs.UserCredential] = js.native
  def reauthenticateWithCredential(credential: firebaseLib.firebaseMod.firebaseNs.authNs.AuthCredential): stdLib.Promise[scala.Unit] = js.native
  def reauthenticateWithPhoneNumber(
    phoneNumber: java.lang.String,
    applicationVerifier: firebaseLib.firebaseMod.firebaseNs.authNs.ApplicationVerifier
  ): stdLib.Promise[firebaseLib.firebaseMod.firebaseNs.authNs.ConfirmationResult] = js.native
  def reauthenticateWithPopup(provider: firebaseLib.firebaseMod.firebaseNs.authNs.AuthProvider): stdLib.Promise[firebaseLib.firebaseMod.firebaseNs.authNs.UserCredential] = js.native
  def reauthenticateWithRedirect(provider: firebaseLib.firebaseMod.firebaseNs.authNs.AuthProvider): stdLib.Promise[scala.Unit] = js.native
  def reload(): stdLib.Promise[scala.Unit] = js.native
  def sendEmailVerification(): stdLib.Promise[scala.Unit] = js.native
  def sendEmailVerification(actionCodeSettings: firebaseLib.firebaseMod.firebaseNs.authNs.ActionCodeSettings): stdLib.Promise[scala.Unit] = js.native
  def toJSON(): js.Object = js.native
  def unlink(providerId: java.lang.String): stdLib.Promise[User] = js.native
  def updateEmail(newEmail: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  def updatePassword(newPassword: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  def updatePhoneNumber(phoneCredential: firebaseLib.firebaseMod.firebaseNs.authNs.AuthCredential): stdLib.Promise[scala.Unit] = js.native
  def updateProfile(profile: firebaseLib.Anon_DisplayName): stdLib.Promise[scala.Unit] = js.native
}

