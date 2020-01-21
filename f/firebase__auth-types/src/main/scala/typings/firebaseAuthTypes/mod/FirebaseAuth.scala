package typings.firebaseAuthTypes.mod

import typings.firebaseAppTypes.mod.FirebaseApp
import typings.firebaseAuthTypes.AnonLOCAL
import typings.firebaseUtil.subscribeMod.Observer
import typings.firebaseUtil.subscribeMod.Unsubscribe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/auth-types", "FirebaseAuth")
@js.native
class FirebaseAuth protected () extends js.Object {
  var app: FirebaseApp = js.native
  var currentUser: User | Null = js.native
  var languageCode: String | Null = js.native
  var settings: AuthSettings = js.native
  var tenantId: String | Null = js.native
  def applyActionCode(code: String): js.Promise[Unit] = js.native
  def checkActionCode(code: String): js.Promise[ActionCodeInfo] = js.native
  def confirmPasswordReset(code: String, newPassword: String): js.Promise[Unit] = js.native
  def createUserWithEmailAndPassword(email: String, password: String): js.Promise[UserCredential] = js.native
  def fetchSignInMethodsForEmail(email: String): js.Promise[js.Array[String]] = js.native
  def getRedirectResult(): js.Promise[UserCredential] = js.native
  def isSignInWithEmailLink(emailLink: String): Boolean = js.native
  def onAuthStateChanged(nextOrObserver: js.Function1[/* a */ User | Null, _]): Unsubscribe = js.native
  def onAuthStateChanged(nextOrObserver: js.Function1[/* a */ User | Null, _], error: js.Function1[/* a */ Error, _]): Unsubscribe = js.native
  def onAuthStateChanged(
    nextOrObserver: js.Function1[/* a */ User | Null, _],
    error: js.Function1[/* a */ Error, _],
    completed: Unsubscribe
  ): Unsubscribe = js.native
  def onAuthStateChanged(nextOrObserver: Observer[_]): Unsubscribe = js.native
  def onAuthStateChanged(nextOrObserver: Observer[_], error: js.Function1[/* a */ Error, _]): Unsubscribe = js.native
  def onAuthStateChanged(nextOrObserver: Observer[_], error: js.Function1[/* a */ Error, _], completed: Unsubscribe): Unsubscribe = js.native
  def onIdTokenChanged(nextOrObserver: js.Function1[/* a */ User | Null, _]): Unsubscribe = js.native
  def onIdTokenChanged(nextOrObserver: js.Function1[/* a */ User | Null, _], error: js.Function1[/* a */ Error, _]): Unsubscribe = js.native
  def onIdTokenChanged(
    nextOrObserver: js.Function1[/* a */ User | Null, _],
    error: js.Function1[/* a */ Error, _],
    completed: Unsubscribe
  ): Unsubscribe = js.native
  def onIdTokenChanged(nextOrObserver: Observer[_]): Unsubscribe = js.native
  def onIdTokenChanged(nextOrObserver: Observer[_], error: js.Function1[/* a */ Error, _]): Unsubscribe = js.native
  def onIdTokenChanged(nextOrObserver: Observer[_], error: js.Function1[/* a */ Error, _], completed: Unsubscribe): Unsubscribe = js.native
  def sendPasswordResetEmail(email: String): js.Promise[Unit] = js.native
  def sendPasswordResetEmail(email: String, actionCodeSettings: ActionCodeSettings): js.Promise[Unit] = js.native
  def sendSignInLinkToEmail(email: String, actionCodeSettings: ActionCodeSettings): js.Promise[Unit] = js.native
  def setPersistence(persistence: Persistence): js.Promise[Unit] = js.native
  def signInAndRetrieveDataWithCredential(credential: AuthCredential): js.Promise[UserCredential] = js.native
  def signInAnonymously(): js.Promise[UserCredential] = js.native
  def signInWithCredential(credential: AuthCredential): js.Promise[UserCredential] = js.native
  def signInWithCustomToken(token: String): js.Promise[UserCredential] = js.native
  def signInWithEmailAndPassword(email: String, password: String): js.Promise[UserCredential] = js.native
  def signInWithEmailLink(email: String): js.Promise[UserCredential] = js.native
  def signInWithEmailLink(email: String, emailLink: String): js.Promise[UserCredential] = js.native
  def signInWithPhoneNumber(phoneNumber: String, applicationVerifier: ApplicationVerifier): js.Promise[ConfirmationResult] = js.native
  def signInWithPopup(provider: AuthProvider): js.Promise[UserCredential] = js.native
  def signInWithRedirect(provider: AuthProvider): js.Promise[Unit] = js.native
  def signOut(): js.Promise[Unit] = js.native
  def updateCurrentUser(): js.Promise[Unit] = js.native
  def updateCurrentUser(user: User): js.Promise[Unit] = js.native
  def useDeviceLanguage(): Unit = js.native
  def verifyPasswordResetCode(code: String): js.Promise[String] = js.native
}

/* static members */
@JSImport("@firebase/auth-types", "FirebaseAuth")
@js.native
object FirebaseAuth extends js.Object {
  var Persistence: AnonLOCAL = js.native
}

