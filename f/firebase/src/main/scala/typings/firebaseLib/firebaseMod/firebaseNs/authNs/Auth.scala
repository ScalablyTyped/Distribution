package typings
package firebaseLib.firebaseMod.firebaseNs.authNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Auth extends js.Object {
  var app: firebaseLib.firebaseMod.firebaseNs.appNs.App = js.native
  var currentUser: firebaseLib.firebaseMod.firebaseNs.User | scala.Null = js.native
  var languageCode: java.lang.String | scala.Null = js.native
  var settings: AuthSettings = js.native
  def applyActionCode(code: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  def checkActionCode(code: java.lang.String): stdLib.Promise[ActionCodeInfo] = js.native
  def confirmPasswordReset(code: java.lang.String, newPassword: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  def createUserAndRetrieveDataWithEmailAndPassword(email: java.lang.String, password: java.lang.String): stdLib.Promise[UserCredential] = js.native
  def createUserWithEmailAndPassword(email: java.lang.String, password: java.lang.String): stdLib.Promise[UserCredential] = js.native
  def fetchProvidersForEmail(email: java.lang.String): stdLib.Promise[coreDashJsLib.Array[java.lang.String]] = js.native
  def fetchSignInMethodsForEmail(email: java.lang.String): stdLib.Promise[coreDashJsLib.Array[java.lang.String]] = js.native
  def getRedirectResult(): stdLib.Promise[UserCredential] = js.native
  def isSignInWithEmailLink(emailLink: java.lang.String): scala.Boolean = js.native
  def onAuthStateChanged(nextOrObserver: firebaseLib.firebaseMod.firebaseNs.Observer[_, nodeLib.Error]): firebaseLib.firebaseMod.firebaseNs.Unsubscribe = js.native
  def onAuthStateChanged(
    nextOrObserver: firebaseLib.firebaseMod.firebaseNs.Observer[_, nodeLib.Error],
    error: js.Function1[/* a */ Error, _]
  ): firebaseLib.firebaseMod.firebaseNs.Unsubscribe = js.native
  def onAuthStateChanged(
    nextOrObserver: firebaseLib.firebaseMod.firebaseNs.Observer[_, nodeLib.Error],
    error: js.Function1[/* a */ Error, _],
    completed: firebaseLib.firebaseMod.firebaseNs.Unsubscribe
  ): firebaseLib.firebaseMod.firebaseNs.Unsubscribe = js.native
  def onAuthStateChanged(nextOrObserver: js.Function1[/* a */ firebaseLib.firebaseMod.firebaseNs.User | scala.Null, _]): firebaseLib.firebaseMod.firebaseNs.Unsubscribe = js.native
  def onAuthStateChanged(
    nextOrObserver: js.Function1[/* a */ firebaseLib.firebaseMod.firebaseNs.User | scala.Null, _],
    error: js.Function1[/* a */ Error, _]
  ): firebaseLib.firebaseMod.firebaseNs.Unsubscribe = js.native
  def onAuthStateChanged(
    nextOrObserver: js.Function1[/* a */ firebaseLib.firebaseMod.firebaseNs.User | scala.Null, _],
    error: js.Function1[/* a */ Error, _],
    completed: firebaseLib.firebaseMod.firebaseNs.Unsubscribe
  ): firebaseLib.firebaseMod.firebaseNs.Unsubscribe = js.native
  def onIdTokenChanged(nextOrObserver: firebaseLib.firebaseMod.firebaseNs.Observer[_, nodeLib.Error]): firebaseLib.firebaseMod.firebaseNs.Unsubscribe = js.native
  def onIdTokenChanged(
    nextOrObserver: firebaseLib.firebaseMod.firebaseNs.Observer[_, nodeLib.Error],
    error: js.Function1[/* a */ Error, _]
  ): firebaseLib.firebaseMod.firebaseNs.Unsubscribe = js.native
  def onIdTokenChanged(
    nextOrObserver: firebaseLib.firebaseMod.firebaseNs.Observer[_, nodeLib.Error],
    error: js.Function1[/* a */ Error, _],
    completed: firebaseLib.firebaseMod.firebaseNs.Unsubscribe
  ): firebaseLib.firebaseMod.firebaseNs.Unsubscribe = js.native
  def onIdTokenChanged(nextOrObserver: js.Function1[/* a */ firebaseLib.firebaseMod.firebaseNs.User | scala.Null, _]): firebaseLib.firebaseMod.firebaseNs.Unsubscribe = js.native
  def onIdTokenChanged(
    nextOrObserver: js.Function1[/* a */ firebaseLib.firebaseMod.firebaseNs.User | scala.Null, _],
    error: js.Function1[/* a */ Error, _]
  ): firebaseLib.firebaseMod.firebaseNs.Unsubscribe = js.native
  def onIdTokenChanged(
    nextOrObserver: js.Function1[/* a */ firebaseLib.firebaseMod.firebaseNs.User | scala.Null, _],
    error: js.Function1[/* a */ Error, _],
    completed: firebaseLib.firebaseMod.firebaseNs.Unsubscribe
  ): firebaseLib.firebaseMod.firebaseNs.Unsubscribe = js.native
  def sendPasswordResetEmail(email: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  def sendPasswordResetEmail(email: java.lang.String, actionCodeSettings: ActionCodeSettings): stdLib.Promise[scala.Unit] = js.native
  def sendSignInLinkToEmail(email: java.lang.String, actionCodeSettings: ActionCodeSettings): stdLib.Promise[scala.Unit] = js.native
  def setPersistence(persistence: firebaseLib.firebaseMod.firebaseNs.authNs.AuthNs.Persistence): stdLib.Promise[scala.Unit] = js.native
  def signInAndRetrieveDataWithCredential(credential: AuthCredential): stdLib.Promise[UserCredential] = js.native
  def signInAndRetrieveDataWithCustomToken(token: java.lang.String): stdLib.Promise[UserCredential] = js.native
  def signInAndRetrieveDataWithEmailAndPassword(email: java.lang.String, password: java.lang.String): stdLib.Promise[UserCredential] = js.native
  def signInAnonymously(): stdLib.Promise[UserCredential] = js.native
  def signInAnonymouslyAndRetrieveData(): stdLib.Promise[UserCredential] = js.native
  def signInWithCredential(credential: AuthCredential): stdLib.Promise[firebaseLib.firebaseMod.firebaseNs.User] = js.native
  def signInWithCustomToken(token: java.lang.String): stdLib.Promise[UserCredential] = js.native
  def signInWithEmailAndPassword(email: java.lang.String, password: java.lang.String): stdLib.Promise[UserCredential] = js.native
  def signInWithEmailLink(email: java.lang.String): stdLib.Promise[UserCredential] = js.native
  def signInWithEmailLink(email: java.lang.String, emailLink: java.lang.String): stdLib.Promise[UserCredential] = js.native
  def signInWithPhoneNumber(phoneNumber: java.lang.String, applicationVerifier: ApplicationVerifier): stdLib.Promise[ConfirmationResult] = js.native
  def signInWithPopup(provider: AuthProvider): stdLib.Promise[UserCredential] = js.native
  def signInWithRedirect(provider: AuthProvider): stdLib.Promise[scala.Unit] = js.native
  def signOut(): stdLib.Promise[scala.Unit] = js.native
  def updateCurrentUser(): stdLib.Promise[scala.Unit] = js.native
  def updateCurrentUser(user: firebaseLib.firebaseMod.firebaseNs.User): stdLib.Promise[scala.Unit] = js.native
  def useDeviceLanguage(): scala.Unit = js.native
  def verifyPasswordResetCode(code: java.lang.String): stdLib.Promise[java.lang.String] = js.native
}

