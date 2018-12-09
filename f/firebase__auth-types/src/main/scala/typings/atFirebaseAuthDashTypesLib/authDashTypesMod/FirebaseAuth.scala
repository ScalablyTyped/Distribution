package typings
package atFirebaseAuthDashTypesLib.authDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/auth-types", "FirebaseAuth")
@js.native
class FirebaseAuth protected () extends js.Object {
  var app: atFirebaseAppDashTypesLib.appDashTypesMod.FirebaseApp = js.native
  var currentUser: User | scala.Null = js.native
  var languageCode: java.lang.String | scala.Null = js.native
  var settings: AuthSettings = js.native
  def applyActionCode(code: java.lang.String): js.Promise[scala.Unit] = js.native
  def checkActionCode(code: java.lang.String): js.Promise[ActionCodeInfo] = js.native
  def confirmPasswordReset(code: java.lang.String, newPassword: java.lang.String): js.Promise[scala.Unit] = js.native
  def createUserAndRetrieveDataWithEmailAndPassword(email: java.lang.String, password: java.lang.String): js.Promise[UserCredential] = js.native
  def createUserWithEmailAndPassword(email: java.lang.String, password: java.lang.String): js.Promise[UserCredential] = js.native
  def fetchProvidersForEmail(email: java.lang.String): js.Promise[js.Array[java.lang.String]] = js.native
  def fetchSignInMethodsForEmail(email: java.lang.String): js.Promise[js.Array[java.lang.String]] = js.native
  def getRedirectResult(): js.Promise[UserCredential] = js.native
  def isSignInWithEmailLink(emailLink: java.lang.String): scala.Boolean = js.native
  def onAuthStateChanged(nextOrObserver: atFirebaseUtilLib.distSrcSubscribeMod.Observer[_]): atFirebaseUtilLib.distSrcSubscribeMod.Unsubscribe = js.native
  def onAuthStateChanged(
    nextOrObserver: atFirebaseUtilLib.distSrcSubscribeMod.Observer[_],
    error: js.Function1[/* a */ Error, _]
  ): atFirebaseUtilLib.distSrcSubscribeMod.Unsubscribe = js.native
  def onAuthStateChanged(
    nextOrObserver: atFirebaseUtilLib.distSrcSubscribeMod.Observer[_],
    error: js.Function1[/* a */ Error, _],
    completed: atFirebaseUtilLib.distSrcSubscribeMod.Unsubscribe
  ): atFirebaseUtilLib.distSrcSubscribeMod.Unsubscribe = js.native
  def onAuthStateChanged(nextOrObserver: js.Function1[/* a */ User | scala.Null, _]): atFirebaseUtilLib.distSrcSubscribeMod.Unsubscribe = js.native
  def onAuthStateChanged(nextOrObserver: js.Function1[/* a */ User | scala.Null, _], error: js.Function1[/* a */ Error, _]): atFirebaseUtilLib.distSrcSubscribeMod.Unsubscribe = js.native
  def onAuthStateChanged(
    nextOrObserver: js.Function1[/* a */ User | scala.Null, _],
    error: js.Function1[/* a */ Error, _],
    completed: atFirebaseUtilLib.distSrcSubscribeMod.Unsubscribe
  ): atFirebaseUtilLib.distSrcSubscribeMod.Unsubscribe = js.native
  def onIdTokenChanged(nextOrObserver: atFirebaseUtilLib.distSrcSubscribeMod.Observer[_]): atFirebaseUtilLib.distSrcSubscribeMod.Unsubscribe = js.native
  def onIdTokenChanged(
    nextOrObserver: atFirebaseUtilLib.distSrcSubscribeMod.Observer[_],
    error: js.Function1[/* a */ Error, _]
  ): atFirebaseUtilLib.distSrcSubscribeMod.Unsubscribe = js.native
  def onIdTokenChanged(
    nextOrObserver: atFirebaseUtilLib.distSrcSubscribeMod.Observer[_],
    error: js.Function1[/* a */ Error, _],
    completed: atFirebaseUtilLib.distSrcSubscribeMod.Unsubscribe
  ): atFirebaseUtilLib.distSrcSubscribeMod.Unsubscribe = js.native
  def onIdTokenChanged(nextOrObserver: js.Function1[/* a */ User | scala.Null, _]): atFirebaseUtilLib.distSrcSubscribeMod.Unsubscribe = js.native
  def onIdTokenChanged(nextOrObserver: js.Function1[/* a */ User | scala.Null, _], error: js.Function1[/* a */ Error, _]): atFirebaseUtilLib.distSrcSubscribeMod.Unsubscribe = js.native
  def onIdTokenChanged(
    nextOrObserver: js.Function1[/* a */ User | scala.Null, _],
    error: js.Function1[/* a */ Error, _],
    completed: atFirebaseUtilLib.distSrcSubscribeMod.Unsubscribe
  ): atFirebaseUtilLib.distSrcSubscribeMod.Unsubscribe = js.native
  def sendPasswordResetEmail(email: java.lang.String): js.Promise[scala.Unit] = js.native
  def sendPasswordResetEmail(email: java.lang.String, actionCodeSettings: ActionCodeSettings): js.Promise[scala.Unit] = js.native
  def sendSignInLinkToEmail(email: java.lang.String, actionCodeSettings: ActionCodeSettings): js.Promise[scala.Unit] = js.native
  def setPersistence(persistence: Persistence): js.Promise[scala.Unit] = js.native
  def signInAndRetrieveDataWithCredential(credential: AuthCredential): js.Promise[UserCredential] = js.native
  def signInAndRetrieveDataWithCustomToken(token: java.lang.String): js.Promise[UserCredential] = js.native
  def signInAndRetrieveDataWithEmailAndPassword(email: java.lang.String, password: java.lang.String): js.Promise[UserCredential] = js.native
  def signInAnonymously(): js.Promise[UserCredential] = js.native
  def signInAnonymouslyAndRetrieveData(): js.Promise[UserCredential] = js.native
  def signInWithCredential(credential: AuthCredential): js.Promise[User] = js.native
  def signInWithCustomToken(token: java.lang.String): js.Promise[UserCredential] = js.native
  def signInWithEmailAndPassword(email: java.lang.String, password: java.lang.String): js.Promise[UserCredential] = js.native
  def signInWithEmailLink(email: java.lang.String): js.Promise[UserCredential] = js.native
  def signInWithEmailLink(email: java.lang.String, emailLink: java.lang.String): js.Promise[UserCredential] = js.native
  def signInWithPhoneNumber(phoneNumber: java.lang.String, applicationVerifier: ApplicationVerifier): js.Promise[ConfirmationResult] = js.native
  def signInWithPopup(provider: AuthProvider): js.Promise[UserCredential] = js.native
  def signInWithRedirect(provider: AuthProvider): js.Promise[scala.Unit] = js.native
  def signOut(): js.Promise[scala.Unit] = js.native
  def updateCurrentUser(): js.Promise[scala.Unit] = js.native
  def updateCurrentUser(user: User): js.Promise[scala.Unit] = js.native
  def useDeviceLanguage(): scala.Unit = js.native
  def verifyPasswordResetCode(code: java.lang.String): js.Promise[java.lang.String] = js.native
}

@JSImport("@firebase/auth-types", "FirebaseAuth")
@js.native
object FirebaseAuth extends js.Object {
  var Persistence: atFirebaseAuthDashTypesLib.Anon_LOCAL = js.native
}

