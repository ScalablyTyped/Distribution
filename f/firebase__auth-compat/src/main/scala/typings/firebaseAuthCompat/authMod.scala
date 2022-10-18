package typings.firebaseAuthCompat

import typings.firebaseAuth.mod.ActionCodeInfo
import typings.firebaseAuth.mod.ActionCodeSettings
import typings.firebaseAuth.mod.ApplicationVerifier
import typings.firebaseAuth.mod.Auth
import typings.firebaseAuth.mod.AuthCredential
import typings.firebaseAuth.mod.AuthProvider
import typings.firebaseAuth.mod.ConfirmationResult
import typings.firebaseAuth.mod.Dependencies
import typings.firebaseAuth.mod.IdTokenResult
import typings.firebaseAuth.mod.MultiFactorError
import typings.firebaseAuth.mod.MultiFactorResolver
import typings.firebaseAuth.mod.MultiFactorUser
import typings.firebaseAuth.mod.NextOrObserver
import typings.firebaseAuth.mod.Persistence
import typings.firebaseAuth.mod.PhoneAuthCredential
import typings.firebaseAuth.mod.PopupRedirectResolver
import typings.firebaseAuth.mod.User
import typings.firebaseAuth.mod.UserCredential
import typings.firebaseAuthCompat.anon.DisableWarnings
import typings.firebaseAuthCompat.anon.DisplayName
import typings.firebaseAuthCompat.appCompatMod.FirebaseApp
import typings.firebaseAuthTypes.mod.FirebaseAuth
import typings.firebaseUtil.mod.CompleteFn
import typings.firebaseUtil.mod.ErrorFn
import typings.firebaseUtil.mod.Unsubscribe
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object authMod {
  
  @JSImport("@firebase/auth", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def applyActionCode(auth: FirebaseAuth, oobCode: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("applyActionCode")(auth.asInstanceOf[js.Any], oobCode.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def beforeAuthStateChanged(
    auth: FirebaseAuth,
    callback: js.Function1[/* user */ User | Null, Unit | js.Promise[Unit]],
    onAbort: js.UndefOr[js.Function0[Unit]]
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("beforeAuthStateChanged")(auth.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], onAbort.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  
  inline def checkActionCode(auth: FirebaseAuth, oobCode: String): js.Promise[ActionCodeInfo] = (^.asInstanceOf[js.Dynamic].applyDynamic("checkActionCode")(auth.asInstanceOf[js.Any], oobCode.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ActionCodeInfo]]
  
  inline def confirmPasswordReset(auth: FirebaseAuth, oobCode: String, newPassword: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("confirmPasswordReset")(auth.asInstanceOf[js.Any], oobCode.asInstanceOf[js.Any], newPassword.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def connectAuthEmulator(auth: FirebaseAuth, url: String, options: js.UndefOr[DisableWarnings]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("connectAuthEmulator")(auth.asInstanceOf[js.Any], url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def createUserWithEmailAndPassword(auth: FirebaseAuth, email: String, password: String): js.Promise[UserCredential] = (^.asInstanceOf[js.Dynamic].applyDynamic("createUserWithEmailAndPassword")(auth.asInstanceOf[js.Any], email.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[js.Promise[UserCredential]]
  
  inline def deleteUser(user: typings.firebaseAuthTypes.mod.User): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteUser")(user.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def fetchSignInMethodsForEmail(auth: FirebaseAuth, email: String): js.Promise[js.Array[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("fetchSignInMethodsForEmail")(auth.asInstanceOf[js.Any], email.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[String]]]
  
  inline def getAuth(app: js.UndefOr[FirebaseApp]): Auth = ^.asInstanceOf[js.Dynamic].applyDynamic("getAuth")(app.asInstanceOf[js.Any]).asInstanceOf[Auth]
  
  inline def getIdToken(user: typings.firebaseAuthTypes.mod.User, forceRefresh: js.UndefOr[Boolean]): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getIdToken")(user.asInstanceOf[js.Any], forceRefresh.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  inline def getIdTokenResult(user: typings.firebaseAuthTypes.mod.User, forceRefresh: js.UndefOr[Boolean]): js.Promise[IdTokenResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getIdTokenResult")(user.asInstanceOf[js.Any], forceRefresh.asInstanceOf[js.Any])).asInstanceOf[js.Promise[IdTokenResult]]
  
  inline def getMultiFactorResolver(auth: FirebaseAuth, error: MultiFactorError): MultiFactorResolver = (^.asInstanceOf[js.Dynamic].applyDynamic("getMultiFactorResolver")(auth.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[MultiFactorResolver]
  
  inline def getRedirectResult(auth: FirebaseAuth, resolver: js.UndefOr[PopupRedirectResolver]): js.Promise[UserCredential | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("getRedirectResult")(auth.asInstanceOf[js.Any], resolver.asInstanceOf[js.Any])).asInstanceOf[js.Promise[UserCredential | Null]]
  
  inline def initializeAuth(app: FirebaseApp, deps: js.UndefOr[Dependencies]): Auth = (^.asInstanceOf[js.Dynamic].applyDynamic("initializeAuth")(app.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[Auth]
  
  inline def isSignInWithEmailLink(auth: FirebaseAuth, emailLink: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSignInWithEmailLink")(auth.asInstanceOf[js.Any], emailLink.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def linkWithCredential(user: typings.firebaseAuthTypes.mod.User, credential: AuthCredential): js.Promise[UserCredential] = (^.asInstanceOf[js.Dynamic].applyDynamic("linkWithCredential")(user.asInstanceOf[js.Any], credential.asInstanceOf[js.Any])).asInstanceOf[js.Promise[UserCredential]]
  
  inline def linkWithPhoneNumber(user: typings.firebaseAuthTypes.mod.User, phoneNumber: String, appVerifier: ApplicationVerifier): js.Promise[ConfirmationResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("linkWithPhoneNumber")(user.asInstanceOf[js.Any], phoneNumber.asInstanceOf[js.Any], appVerifier.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ConfirmationResult]]
  
  inline def linkWithPopup(
    user: typings.firebaseAuthTypes.mod.User,
    provider: AuthProvider,
    resolver: js.UndefOr[PopupRedirectResolver]
  ): js.Promise[UserCredential] = (^.asInstanceOf[js.Dynamic].applyDynamic("linkWithPopup")(user.asInstanceOf[js.Any], provider.asInstanceOf[js.Any], resolver.asInstanceOf[js.Any])).asInstanceOf[js.Promise[UserCredential]]
  
  inline def linkWithRedirect(
    user: typings.firebaseAuthTypes.mod.User,
    provider: AuthProvider,
    resolver: js.UndefOr[PopupRedirectResolver]
  ): js.Promise[scala.Nothing] = (^.asInstanceOf[js.Dynamic].applyDynamic("linkWithRedirect")(user.asInstanceOf[js.Any], provider.asInstanceOf[js.Any], resolver.asInstanceOf[js.Any])).asInstanceOf[js.Promise[scala.Nothing]]
  
  inline def multiFactor(user: typings.firebaseAuthTypes.mod.User): MultiFactorUser = ^.asInstanceOf[js.Dynamic].applyDynamic("multiFactor")(user.asInstanceOf[js.Any]).asInstanceOf[MultiFactorUser]
  
  inline def onAuthStateChanged(
    auth: FirebaseAuth,
    nextOrObserver: NextOrObserver[User],
    error: js.UndefOr[ErrorFn],
    completed: js.UndefOr[CompleteFn]
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onAuthStateChanged")(auth.asInstanceOf[js.Any], nextOrObserver.asInstanceOf[js.Any], error.asInstanceOf[js.Any], completed.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  
  inline def onIdTokenChanged(
    auth: FirebaseAuth,
    nextOrObserver: NextOrObserver[User],
    error: js.UndefOr[ErrorFn],
    completed: js.UndefOr[CompleteFn]
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onIdTokenChanged")(auth.asInstanceOf[js.Any], nextOrObserver.asInstanceOf[js.Any], error.asInstanceOf[js.Any], completed.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  
  inline def reauthenticateWithCredential(user: typings.firebaseAuthTypes.mod.User, credential: AuthCredential): js.Promise[UserCredential] = (^.asInstanceOf[js.Dynamic].applyDynamic("reauthenticateWithCredential")(user.asInstanceOf[js.Any], credential.asInstanceOf[js.Any])).asInstanceOf[js.Promise[UserCredential]]
  
  inline def reauthenticateWithPhoneNumber(user: typings.firebaseAuthTypes.mod.User, phoneNumber: String, appVerifier: ApplicationVerifier): js.Promise[ConfirmationResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("reauthenticateWithPhoneNumber")(user.asInstanceOf[js.Any], phoneNumber.asInstanceOf[js.Any], appVerifier.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ConfirmationResult]]
  
  inline def reauthenticateWithPopup(
    user: typings.firebaseAuthTypes.mod.User,
    provider: AuthProvider,
    resolver: js.UndefOr[PopupRedirectResolver]
  ): js.Promise[UserCredential] = (^.asInstanceOf[js.Dynamic].applyDynamic("reauthenticateWithPopup")(user.asInstanceOf[js.Any], provider.asInstanceOf[js.Any], resolver.asInstanceOf[js.Any])).asInstanceOf[js.Promise[UserCredential]]
  
  inline def reauthenticateWithRedirect(
    user: typings.firebaseAuthTypes.mod.User,
    provider: AuthProvider,
    resolver: js.UndefOr[PopupRedirectResolver]
  ): js.Promise[scala.Nothing] = (^.asInstanceOf[js.Dynamic].applyDynamic("reauthenticateWithRedirect")(user.asInstanceOf[js.Any], provider.asInstanceOf[js.Any], resolver.asInstanceOf[js.Any])).asInstanceOf[js.Promise[scala.Nothing]]
  
  inline def reload(user: typings.firebaseAuthTypes.mod.User): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("reload")(user.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def sendEmailVerification(
    user: typings.firebaseAuthTypes.mod.User,
    actionCodeSettings: js.UndefOr[ActionCodeSettings | Null]
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("sendEmailVerification")(user.asInstanceOf[js.Any], actionCodeSettings.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def sendPasswordResetEmail(auth: FirebaseAuth, email: String, actionCodeSettings: js.UndefOr[ActionCodeSettings]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("sendPasswordResetEmail")(auth.asInstanceOf[js.Any], email.asInstanceOf[js.Any], actionCodeSettings.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def sendSignInLinkToEmail(auth: FirebaseAuth, email: String, actionCodeSettings: ActionCodeSettings): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("sendSignInLinkToEmail")(auth.asInstanceOf[js.Any], email.asInstanceOf[js.Any], actionCodeSettings.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def setPersistence(auth: FirebaseAuth, persistence: Persistence): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("setPersistence")(auth.asInstanceOf[js.Any], persistence.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def signInAnonymously(auth: FirebaseAuth): js.Promise[UserCredential] = ^.asInstanceOf[js.Dynamic].applyDynamic("signInAnonymously")(auth.asInstanceOf[js.Any]).asInstanceOf[js.Promise[UserCredential]]
  
  inline def signInWithCredential(auth: FirebaseAuth, credential: AuthCredential): js.Promise[UserCredential] = (^.asInstanceOf[js.Dynamic].applyDynamic("signInWithCredential")(auth.asInstanceOf[js.Any], credential.asInstanceOf[js.Any])).asInstanceOf[js.Promise[UserCredential]]
  
  inline def signInWithCustomToken(auth: FirebaseAuth, customToken: String): js.Promise[UserCredential] = (^.asInstanceOf[js.Dynamic].applyDynamic("signInWithCustomToken")(auth.asInstanceOf[js.Any], customToken.asInstanceOf[js.Any])).asInstanceOf[js.Promise[UserCredential]]
  
  inline def signInWithEmailAndPassword(auth: FirebaseAuth, email: String, password: String): js.Promise[UserCredential] = (^.asInstanceOf[js.Dynamic].applyDynamic("signInWithEmailAndPassword")(auth.asInstanceOf[js.Any], email.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[js.Promise[UserCredential]]
  
  inline def signInWithEmailLink(auth: FirebaseAuth, email: String, emailLink: js.UndefOr[String]): js.Promise[UserCredential] = (^.asInstanceOf[js.Dynamic].applyDynamic("signInWithEmailLink")(auth.asInstanceOf[js.Any], email.asInstanceOf[js.Any], emailLink.asInstanceOf[js.Any])).asInstanceOf[js.Promise[UserCredential]]
  
  inline def signInWithPhoneNumber(auth: FirebaseAuth, phoneNumber: String, appVerifier: ApplicationVerifier): js.Promise[ConfirmationResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("signInWithPhoneNumber")(auth.asInstanceOf[js.Any], phoneNumber.asInstanceOf[js.Any], appVerifier.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ConfirmationResult]]
  
  inline def signInWithPopup(auth: FirebaseAuth, provider: AuthProvider, resolver: js.UndefOr[PopupRedirectResolver]): js.Promise[UserCredential] = (^.asInstanceOf[js.Dynamic].applyDynamic("signInWithPopup")(auth.asInstanceOf[js.Any], provider.asInstanceOf[js.Any], resolver.asInstanceOf[js.Any])).asInstanceOf[js.Promise[UserCredential]]
  
  inline def signInWithRedirect(auth: FirebaseAuth, provider: AuthProvider, resolver: js.UndefOr[PopupRedirectResolver]): js.Promise[scala.Nothing] = (^.asInstanceOf[js.Dynamic].applyDynamic("signInWithRedirect")(auth.asInstanceOf[js.Any], provider.asInstanceOf[js.Any], resolver.asInstanceOf[js.Any])).asInstanceOf[js.Promise[scala.Nothing]]
  
  inline def signOut(auth: FirebaseAuth): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("signOut")(auth.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def unlink(user: typings.firebaseAuthTypes.mod.User, providerId: String): js.Promise[User] = (^.asInstanceOf[js.Dynamic].applyDynamic("unlink")(user.asInstanceOf[js.Any], providerId.asInstanceOf[js.Any])).asInstanceOf[js.Promise[User]]
  
  inline def updateCurrentUser(auth: FirebaseAuth, user: User | Null): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("updateCurrentUser")(auth.asInstanceOf[js.Any], user.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def updateEmail(user: typings.firebaseAuthTypes.mod.User, newEmail: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("updateEmail")(user.asInstanceOf[js.Any], newEmail.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def updatePassword(user: typings.firebaseAuthTypes.mod.User, newPassword: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("updatePassword")(user.asInstanceOf[js.Any], newPassword.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def updatePhoneNumber(user: typings.firebaseAuthTypes.mod.User, credential: PhoneAuthCredential): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("updatePhoneNumber")(user.asInstanceOf[js.Any], credential.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def updateProfile(user: typings.firebaseAuthTypes.mod.User, hasDisplayNamePhotoUrl: DisplayName): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("updateProfile")(user.asInstanceOf[js.Any], hasDisplayNamePhotoUrl.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def useDeviceLanguage(auth: FirebaseAuth): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useDeviceLanguage")(auth.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def verifyBeforeUpdateEmail(
    user: typings.firebaseAuthTypes.mod.User,
    newEmail: String,
    actionCodeSettings: js.UndefOr[ActionCodeSettings | Null]
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("verifyBeforeUpdateEmail")(user.asInstanceOf[js.Any], newEmail.asInstanceOf[js.Any], actionCodeSettings.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def verifyPasswordResetCode(auth: FirebaseAuth, code: String): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("verifyPasswordResetCode")(auth.asInstanceOf[js.Any], code.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
}
