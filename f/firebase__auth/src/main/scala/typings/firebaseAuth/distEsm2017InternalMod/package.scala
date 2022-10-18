package typings.firebaseAuth.distEsm2017InternalMod

import typings.firebaseApp.mod.FirebaseApp
import typings.firebaseAuth.anon.DisableWarnings
import typings.firebaseAuth.anon.DisplayName
import typings.firebaseAuth.distEsm2017InternalMod.^
import typings.firebaseAuth.distEsm2017SrcCoreErrorsMod.AuthErrorCode
import typings.firebaseAuth.distEsm2017SrcCoreUtilVersionMod.ClientPlatform
import typings.firebaseAuth.distEsm2017SrcModelAuthMod.ApiKey
import typings.firebaseAuth.distEsm2017SrcModelAuthMod.AppName
import typings.firebaseAuth.distEsm2017SrcModelAuthMod.AuthInternal
import typings.firebaseAuth.distEsm2017SrcModelPublicTypesMod.ActionCodeInfo
import typings.firebaseAuth.distEsm2017SrcModelPublicTypesMod.ActionCodeSettings
import typings.firebaseAuth.distEsm2017SrcModelPublicTypesMod.AdditionalUserInfo
import typings.firebaseAuth.distEsm2017SrcModelPublicTypesMod.ApplicationVerifier
import typings.firebaseAuth.distEsm2017SrcModelPublicTypesMod.Auth
import typings.firebaseAuth.distEsm2017SrcModelPublicTypesMod.AuthErrorMap
import typings.firebaseAuth.distEsm2017SrcModelPublicTypesMod.AuthProvider
import typings.firebaseAuth.distEsm2017SrcModelPublicTypesMod.ConfirmationResult
import typings.firebaseAuth.distEsm2017SrcModelPublicTypesMod.Dependencies
import typings.firebaseAuth.distEsm2017SrcModelPublicTypesMod.IdTokenResult
import typings.firebaseAuth.distEsm2017SrcModelPublicTypesMod.MultiFactorError
import typings.firebaseAuth.distEsm2017SrcModelPublicTypesMod.MultiFactorResolver
import typings.firebaseAuth.distEsm2017SrcModelPublicTypesMod.MultiFactorUser
import typings.firebaseAuth.distEsm2017SrcModelPublicTypesMod.NextOrObserver
import typings.firebaseAuth.distEsm2017SrcModelPublicTypesMod.Persistence
import typings.firebaseAuth.distEsm2017SrcModelPublicTypesMod.PopupRedirectResolver
import typings.firebaseAuth.distEsm2017SrcModelPublicTypesMod.User
import typings.firebaseAuth.distEsm2017SrcModelPublicTypesMod.UserCredential
import typings.firebaseAuth.distEsm2017SrcModelUserMod.UserCredentialInternal
import typings.firebaseUtil.mod.CompleteFn
import typings.firebaseUtil.mod.ErrorFn
import typings.firebaseUtil.mod.Unsubscribe
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def _getRedirectResult(auth: Auth): js.Promise[UserCredential | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("_getRedirectResult")(auth.asInstanceOf[js.Any]).asInstanceOf[js.Promise[UserCredential | Null]]
inline def _getRedirectResult(auth: Auth, resolverExtern: Unit, bypassAuthState: Boolean): js.Promise[UserCredential | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("_getRedirectResult")(auth.asInstanceOf[js.Any], resolverExtern.asInstanceOf[js.Any], bypassAuthState.asInstanceOf[js.Any])).asInstanceOf[js.Promise[UserCredential | Null]]
inline def _getRedirectResult(auth: Auth, resolverExtern: PopupRedirectResolver): js.Promise[UserCredential | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("_getRedirectResult")(auth.asInstanceOf[js.Any], resolverExtern.asInstanceOf[js.Any])).asInstanceOf[js.Promise[UserCredential | Null]]
inline def _getRedirectResult(auth: Auth, resolverExtern: PopupRedirectResolver, bypassAuthState: Boolean): js.Promise[UserCredential | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("_getRedirectResult")(auth.asInstanceOf[js.Any], resolverExtern.asInstanceOf[js.Any], bypassAuthState.asInstanceOf[js.Any])).asInstanceOf[js.Promise[UserCredential | Null]]

inline def addFrameworkForLogging(auth: Auth, framework: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addFrameworkForLogging")(auth.asInstanceOf[js.Any], framework.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def applyActionCode(auth: Auth, oobCode: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("applyActionCode")(auth.asInstanceOf[js.Any], oobCode.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]

inline def assert[K /* <: AuthErrorCode */](
  assertion: Any,
  auth: Auth,
  code: K,
  /* import warning: parser.TsParser#functionParam Dropping repeated marker of param data because its type {} extends LessAppName<K> ? [LessAppName<K> | undefined] : [LessAppName<K>] is not an array type */ data: /* import warning: importer.ImportType#apply Failed type conversion: {} extends @firebase/auth.@firebase/auth/dist/esm2017/src/core/util/assert.LessAppName<K> ? [@firebase/auth.@firebase/auth/dist/esm2017/src/core/util/assert.LessAppName<K> | undefined] : [@firebase/auth.@firebase/auth/dist/esm2017/src/core/util/assert.LessAppName<K>] */ js.Any
): /* asserts assertion */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("_assert")(assertion.asInstanceOf[js.Any], auth.asInstanceOf[js.Any], code.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[/* asserts assertion */ Boolean]
inline def assert[K /* <: AuthErrorCode */](
  assertion: Any,
  code: K,
  /* import warning: parser.TsParser#functionParam Dropping repeated marker of param data because its type {} extends AuthErrorParams[K] ? [AuthErrorParams[K] | undefined] : [AuthErrorParams[K]] is not an array type */ data: /* import warning: importer.ImportType#apply Failed type conversion: {} extends @firebase/auth.@firebase/auth/dist/esm2017/src/core/errors.AuthErrorParams[K] ? [@firebase/auth.@firebase/auth/dist/esm2017/src/core/errors.AuthErrorParams[K] | undefined] : [@firebase/auth.@firebase/auth/dist/esm2017/src/core/errors.AuthErrorParams[K]] */ js.Any
): /* asserts assertion */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("_assert")(assertion.asInstanceOf[js.Any], code.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[/* asserts assertion */ Boolean]

inline def beforeAuthStateChanged(auth: Auth, callback: js.Function1[/* user */ User | Null, Unit | js.Promise[Unit]]): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("beforeAuthStateChanged")(auth.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
inline def beforeAuthStateChanged(
  auth: Auth,
  callback: js.Function1[/* user */ User | Null, Unit | js.Promise[Unit]],
  onAbort: js.Function0[Unit]
): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("beforeAuthStateChanged")(auth.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], onAbort.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]

inline def browserLocalPersistence: Persistence = ^.asInstanceOf[js.Dynamic].selectDynamic("browserLocalPersistence").asInstanceOf[Persistence]

inline def browserPopupRedirectResolver: PopupRedirectResolver = ^.asInstanceOf[js.Dynamic].selectDynamic("browserPopupRedirectResolver").asInstanceOf[PopupRedirectResolver]

inline def browserSessionPersistence: Persistence = ^.asInstanceOf[js.Dynamic].selectDynamic("browserSessionPersistence").asInstanceOf[Persistence]

inline def castAuth(auth: Auth): AuthInternal = ^.asInstanceOf[js.Dynamic].applyDynamic("_castAuth")(auth.asInstanceOf[js.Any]).asInstanceOf[AuthInternal]

inline def checkActionCode(auth: Auth, oobCode: String): js.Promise[ActionCodeInfo] = (^.asInstanceOf[js.Dynamic].applyDynamic("checkActionCode")(auth.asInstanceOf[js.Any], oobCode.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ActionCodeInfo]]

inline def confirmPasswordReset(auth: Auth, oobCode: String, newPassword: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("confirmPasswordReset")(auth.asInstanceOf[js.Any], oobCode.asInstanceOf[js.Any], newPassword.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]

inline def connectAuthEmulator(auth: Auth, url: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("connectAuthEmulator")(auth.asInstanceOf[js.Any], url.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def connectAuthEmulator(auth: Auth, url: String, options: DisableWarnings): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("connectAuthEmulator")(auth.asInstanceOf[js.Any], url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def cordovaPopupRedirectResolver: PopupRedirectResolver = ^.asInstanceOf[js.Dynamic].selectDynamic("cordovaPopupRedirectResolver").asInstanceOf[PopupRedirectResolver]

inline def createUserWithEmailAndPassword(auth: Auth, email: String, password: String): js.Promise[UserCredential] = (^.asInstanceOf[js.Dynamic].applyDynamic("createUserWithEmailAndPassword")(auth.asInstanceOf[js.Any], email.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[js.Promise[UserCredential]]

inline def debugErrorMap: AuthErrorMap = ^.asInstanceOf[js.Dynamic].selectDynamic("debugErrorMap").asInstanceOf[AuthErrorMap]

inline def deleteUser(user: User): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteUser")(user.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]

inline def fail[K /* <: AuthErrorCode */](
  auth: Auth,
  code: K,
  /* import warning: parser.TsParser#functionParam Dropping repeated marker of param data because its type {} extends LessAppName<K> ? [LessAppName<K> | undefined] : [LessAppName<K>] is not an array type */ data: /* import warning: importer.ImportType#apply Failed type conversion: {} extends @firebase/auth.@firebase/auth/dist/esm2017/src/core/util/assert.LessAppName<K> ? [@firebase/auth.@firebase/auth/dist/esm2017/src/core/util/assert.LessAppName<K> | undefined] : [@firebase/auth.@firebase/auth/dist/esm2017/src/core/util/assert.LessAppName<K>] */ js.Any
): scala.Nothing = (^.asInstanceOf[js.Dynamic].applyDynamic("_fail")(auth.asInstanceOf[js.Any], code.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[scala.Nothing]
inline def fail[K /* <: AuthErrorCode */](
  code: K,
  /* import warning: parser.TsParser#functionParam Dropping repeated marker of param data because its type {} extends AuthErrorParams[K] ? [AuthErrorParams[K] | undefined] : [AuthErrorParams[K]] is not an array type */ data: /* import warning: importer.ImportType#apply Failed type conversion: {} extends @firebase/auth.@firebase/auth/dist/esm2017/src/core/errors.AuthErrorParams[K] ? [@firebase/auth.@firebase/auth/dist/esm2017/src/core/errors.AuthErrorParams[K] | undefined] : [@firebase/auth.@firebase/auth/dist/esm2017/src/core/errors.AuthErrorParams[K]] */ js.Any
): scala.Nothing = (^.asInstanceOf[js.Dynamic].applyDynamic("_fail")(code.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[scala.Nothing]

inline def fetchSignInMethodsForEmail(auth: Auth, email: String): js.Promise[js.Array[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("fetchSignInMethodsForEmail")(auth.asInstanceOf[js.Any], email.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[String]]]

inline def generateEventId(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("_generateEventId")().asInstanceOf[String]
inline def generateEventId(prefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("_generateEventId")(prefix.asInstanceOf[js.Any]).asInstanceOf[String]
inline def generateEventId(prefix: String, digits: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("_generateEventId")(prefix.asInstanceOf[js.Any], digits.asInstanceOf[js.Any])).asInstanceOf[String]
inline def generateEventId(prefix: Unit, digits: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("_generateEventId")(prefix.asInstanceOf[js.Any], digits.asInstanceOf[js.Any])).asInstanceOf[String]

inline def getAdditionalUserInfo(userCredential: UserCredential): AdditionalUserInfo | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getAdditionalUserInfo")(userCredential.asInstanceOf[js.Any]).asInstanceOf[AdditionalUserInfo | Null]

inline def getAuth(): Auth = ^.asInstanceOf[js.Dynamic].applyDynamic("getAuth")().asInstanceOf[Auth]
inline def getAuth(app: FirebaseApp): Auth = ^.asInstanceOf[js.Dynamic].applyDynamic("getAuth")(app.asInstanceOf[js.Any]).asInstanceOf[Auth]

inline def getClientVersion(clientPlatform: ClientPlatform): String = ^.asInstanceOf[js.Dynamic].applyDynamic("_getClientVersion")(clientPlatform.asInstanceOf[js.Any]).asInstanceOf[String]
inline def getClientVersion(clientPlatform: ClientPlatform, frameworks: js.Array[String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("_getClientVersion")(clientPlatform.asInstanceOf[js.Any], frameworks.asInstanceOf[js.Any])).asInstanceOf[String]

inline def getIdToken(user: User): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getIdToken")(user.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
inline def getIdToken(user: User, forceRefresh: Boolean): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getIdToken")(user.asInstanceOf[js.Any], forceRefresh.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]

inline def getIdTokenResult(user: User): js.Promise[IdTokenResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getIdTokenResult")(user.asInstanceOf[js.Any]).asInstanceOf[js.Promise[IdTokenResult]]
inline def getIdTokenResult(user: User, forceRefresh: Boolean): js.Promise[IdTokenResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getIdTokenResult")(user.asInstanceOf[js.Any], forceRefresh.asInstanceOf[js.Any])).asInstanceOf[js.Promise[IdTokenResult]]

inline def getInstance[T](cls: Any): T = ^.asInstanceOf[js.Dynamic].applyDynamic("_getInstance")(cls.asInstanceOf[js.Any]).asInstanceOf[T]

inline def getMultiFactorResolver(auth: Auth, error: MultiFactorError): MultiFactorResolver = (^.asInstanceOf[js.Dynamic].applyDynamic("getMultiFactorResolver")(auth.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[MultiFactorResolver]

inline def getRedirectResult(auth: Auth): js.Promise[UserCredential | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRedirectResult")(auth.asInstanceOf[js.Any]).asInstanceOf[js.Promise[UserCredential | Null]]
inline def getRedirectResult(auth: Auth, resolver: PopupRedirectResolver): js.Promise[UserCredential | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("getRedirectResult")(auth.asInstanceOf[js.Any], resolver.asInstanceOf[js.Any])).asInstanceOf[js.Promise[UserCredential | Null]]

inline def inMemoryPersistence: Persistence = ^.asInstanceOf[js.Dynamic].selectDynamic("inMemoryPersistence").asInstanceOf[Persistence]

inline def indexedDBLocalPersistence: Persistence = ^.asInstanceOf[js.Dynamic].selectDynamic("indexedDBLocalPersistence").asInstanceOf[Persistence]

inline def initializeAuth(app: FirebaseApp): Auth = ^.asInstanceOf[js.Dynamic].applyDynamic("initializeAuth")(app.asInstanceOf[js.Any]).asInstanceOf[Auth]
inline def initializeAuth(app: FirebaseApp, deps: Dependencies): Auth = (^.asInstanceOf[js.Dynamic].applyDynamic("initializeAuth")(app.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[Auth]

inline def isSignInWithEmailLink(auth: Auth, emailLink: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSignInWithEmailLink")(auth.asInstanceOf[js.Any], emailLink.asInstanceOf[js.Any])).asInstanceOf[Boolean]

inline def linkWithCredential(user: User, credential: typings.firebaseAuth.distEsm2017SrcCoreCredentialsMod.AuthCredential): js.Promise[UserCredential] = (^.asInstanceOf[js.Dynamic].applyDynamic("linkWithCredential")(user.asInstanceOf[js.Any], credential.asInstanceOf[js.Any])).asInstanceOf[js.Promise[UserCredential]]

inline def linkWithPhoneNumber(user: User, phoneNumber: String, appVerifier: ApplicationVerifier): js.Promise[ConfirmationResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("linkWithPhoneNumber")(user.asInstanceOf[js.Any], phoneNumber.asInstanceOf[js.Any], appVerifier.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ConfirmationResult]]

inline def linkWithPopup(user: User, provider: AuthProvider): js.Promise[UserCredential] = (^.asInstanceOf[js.Dynamic].applyDynamic("linkWithPopup")(user.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[js.Promise[UserCredential]]
inline def linkWithPopup(user: User, provider: AuthProvider, resolver: PopupRedirectResolver): js.Promise[UserCredential] = (^.asInstanceOf[js.Dynamic].applyDynamic("linkWithPopup")(user.asInstanceOf[js.Any], provider.asInstanceOf[js.Any], resolver.asInstanceOf[js.Any])).asInstanceOf[js.Promise[UserCredential]]

inline def linkWithRedirect(user: User, provider: AuthProvider): js.Promise[scala.Nothing] = (^.asInstanceOf[js.Dynamic].applyDynamic("linkWithRedirect")(user.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[js.Promise[scala.Nothing]]
inline def linkWithRedirect(user: User, provider: AuthProvider, resolver: PopupRedirectResolver): js.Promise[scala.Nothing] = (^.asInstanceOf[js.Dynamic].applyDynamic("linkWithRedirect")(user.asInstanceOf[js.Any], provider.asInstanceOf[js.Any], resolver.asInstanceOf[js.Any])).asInstanceOf[js.Promise[scala.Nothing]]

inline def multiFactor(user: User): MultiFactorUser = ^.asInstanceOf[js.Dynamic].applyDynamic("multiFactor")(user.asInstanceOf[js.Any]).asInstanceOf[MultiFactorUser]

inline def onAuthStateChanged(auth: Auth, nextOrObserver: NextOrObserver[User]): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onAuthStateChanged")(auth.asInstanceOf[js.Any], nextOrObserver.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
inline def onAuthStateChanged(auth: Auth, nextOrObserver: NextOrObserver[User], error: Unit, completed: CompleteFn): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onAuthStateChanged")(auth.asInstanceOf[js.Any], nextOrObserver.asInstanceOf[js.Any], error.asInstanceOf[js.Any], completed.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
inline def onAuthStateChanged(auth: Auth, nextOrObserver: NextOrObserver[User], error: ErrorFn): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onAuthStateChanged")(auth.asInstanceOf[js.Any], nextOrObserver.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
inline def onAuthStateChanged(auth: Auth, nextOrObserver: NextOrObserver[User], error: ErrorFn, completed: CompleteFn): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onAuthStateChanged")(auth.asInstanceOf[js.Any], nextOrObserver.asInstanceOf[js.Any], error.asInstanceOf[js.Any], completed.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]

inline def onIdTokenChanged(auth: Auth, nextOrObserver: NextOrObserver[User]): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onIdTokenChanged")(auth.asInstanceOf[js.Any], nextOrObserver.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
inline def onIdTokenChanged(auth: Auth, nextOrObserver: NextOrObserver[User], error: Unit, completed: CompleteFn): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onIdTokenChanged")(auth.asInstanceOf[js.Any], nextOrObserver.asInstanceOf[js.Any], error.asInstanceOf[js.Any], completed.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
inline def onIdTokenChanged(auth: Auth, nextOrObserver: NextOrObserver[User], error: ErrorFn): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onIdTokenChanged")(auth.asInstanceOf[js.Any], nextOrObserver.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
inline def onIdTokenChanged(auth: Auth, nextOrObserver: NextOrObserver[User], error: ErrorFn, completed: CompleteFn): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onIdTokenChanged")(auth.asInstanceOf[js.Any], nextOrObserver.asInstanceOf[js.Any], error.asInstanceOf[js.Any], completed.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]

inline def overrideRedirectResult(auth: AuthInternal, result: js.Function0[js.Promise[UserCredentialInternal | Null]]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_overrideRedirectResult")(auth.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def parseActionCodeURL(link: String): typings.firebaseAuth.distEsm2017SrcCoreActionCodeUrlMod.ActionCodeURL | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("parseActionCodeURL")(link.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseAuth.distEsm2017SrcCoreActionCodeUrlMod.ActionCodeURL | Null]

inline def persistenceKeyName(key: String, apiKey: ApiKey, appName: AppName): String = (^.asInstanceOf[js.Dynamic].applyDynamic("_persistenceKeyName")(key.asInstanceOf[js.Any], apiKey.asInstanceOf[js.Any], appName.asInstanceOf[js.Any])).asInstanceOf[String]

inline def prodErrorMap: AuthErrorMap = ^.asInstanceOf[js.Dynamic].selectDynamic("prodErrorMap").asInstanceOf[AuthErrorMap]

inline def reauthenticateWithCredential(user: User, credential: typings.firebaseAuth.distEsm2017SrcCoreCredentialsMod.AuthCredential): js.Promise[UserCredential] = (^.asInstanceOf[js.Dynamic].applyDynamic("reauthenticateWithCredential")(user.asInstanceOf[js.Any], credential.asInstanceOf[js.Any])).asInstanceOf[js.Promise[UserCredential]]

inline def reauthenticateWithPhoneNumber(user: User, phoneNumber: String, appVerifier: ApplicationVerifier): js.Promise[ConfirmationResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("reauthenticateWithPhoneNumber")(user.asInstanceOf[js.Any], phoneNumber.asInstanceOf[js.Any], appVerifier.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ConfirmationResult]]

inline def reauthenticateWithPopup(user: User, provider: AuthProvider): js.Promise[UserCredential] = (^.asInstanceOf[js.Dynamic].applyDynamic("reauthenticateWithPopup")(user.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[js.Promise[UserCredential]]
inline def reauthenticateWithPopup(user: User, provider: AuthProvider, resolver: PopupRedirectResolver): js.Promise[UserCredential] = (^.asInstanceOf[js.Dynamic].applyDynamic("reauthenticateWithPopup")(user.asInstanceOf[js.Any], provider.asInstanceOf[js.Any], resolver.asInstanceOf[js.Any])).asInstanceOf[js.Promise[UserCredential]]

inline def reauthenticateWithRedirect(user: User, provider: AuthProvider): js.Promise[scala.Nothing] = (^.asInstanceOf[js.Dynamic].applyDynamic("reauthenticateWithRedirect")(user.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[js.Promise[scala.Nothing]]
inline def reauthenticateWithRedirect(user: User, provider: AuthProvider, resolver: PopupRedirectResolver): js.Promise[scala.Nothing] = (^.asInstanceOf[js.Dynamic].applyDynamic("reauthenticateWithRedirect")(user.asInstanceOf[js.Any], provider.asInstanceOf[js.Any], resolver.asInstanceOf[js.Any])).asInstanceOf[js.Promise[scala.Nothing]]

inline def reload(user: User): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("reload")(user.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]

inline def sendEmailVerification(user: User): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("sendEmailVerification")(user.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
inline def sendEmailVerification(user: User, actionCodeSettings: ActionCodeSettings): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("sendEmailVerification")(user.asInstanceOf[js.Any], actionCodeSettings.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]

inline def sendPasswordResetEmail(auth: Auth, email: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("sendPasswordResetEmail")(auth.asInstanceOf[js.Any], email.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
inline def sendPasswordResetEmail(auth: Auth, email: String, actionCodeSettings: ActionCodeSettings): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("sendPasswordResetEmail")(auth.asInstanceOf[js.Any], email.asInstanceOf[js.Any], actionCodeSettings.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]

inline def sendSignInLinkToEmail(auth: Auth, email: String, actionCodeSettings: ActionCodeSettings): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("sendSignInLinkToEmail")(auth.asInstanceOf[js.Any], email.asInstanceOf[js.Any], actionCodeSettings.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]

inline def setPersistence(auth: Auth, persistence: Persistence): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("setPersistence")(auth.asInstanceOf[js.Any], persistence.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]

inline def signInAnonymously(auth: Auth): js.Promise[UserCredential] = ^.asInstanceOf[js.Dynamic].applyDynamic("signInAnonymously")(auth.asInstanceOf[js.Any]).asInstanceOf[js.Promise[UserCredential]]

inline def signInWithCredential(auth: Auth, credential: typings.firebaseAuth.distEsm2017SrcCoreCredentialsMod.AuthCredential): js.Promise[UserCredential] = (^.asInstanceOf[js.Dynamic].applyDynamic("signInWithCredential")(auth.asInstanceOf[js.Any], credential.asInstanceOf[js.Any])).asInstanceOf[js.Promise[UserCredential]]

inline def signInWithCustomToken(auth: Auth, customToken: String): js.Promise[UserCredential] = (^.asInstanceOf[js.Dynamic].applyDynamic("signInWithCustomToken")(auth.asInstanceOf[js.Any], customToken.asInstanceOf[js.Any])).asInstanceOf[js.Promise[UserCredential]]

inline def signInWithEmailAndPassword(auth: Auth, email: String, password: String): js.Promise[UserCredential] = (^.asInstanceOf[js.Dynamic].applyDynamic("signInWithEmailAndPassword")(auth.asInstanceOf[js.Any], email.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[js.Promise[UserCredential]]

inline def signInWithEmailLink(auth: Auth, email: String): js.Promise[UserCredential] = (^.asInstanceOf[js.Dynamic].applyDynamic("signInWithEmailLink")(auth.asInstanceOf[js.Any], email.asInstanceOf[js.Any])).asInstanceOf[js.Promise[UserCredential]]
inline def signInWithEmailLink(auth: Auth, email: String, emailLink: String): js.Promise[UserCredential] = (^.asInstanceOf[js.Dynamic].applyDynamic("signInWithEmailLink")(auth.asInstanceOf[js.Any], email.asInstanceOf[js.Any], emailLink.asInstanceOf[js.Any])).asInstanceOf[js.Promise[UserCredential]]

inline def signInWithPhoneNumber(auth: Auth, phoneNumber: String, appVerifier: ApplicationVerifier): js.Promise[ConfirmationResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("signInWithPhoneNumber")(auth.asInstanceOf[js.Any], phoneNumber.asInstanceOf[js.Any], appVerifier.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ConfirmationResult]]

inline def signInWithPopup(auth: Auth, provider: AuthProvider): js.Promise[UserCredential] = (^.asInstanceOf[js.Dynamic].applyDynamic("signInWithPopup")(auth.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[js.Promise[UserCredential]]
inline def signInWithPopup(auth: Auth, provider: AuthProvider, resolver: PopupRedirectResolver): js.Promise[UserCredential] = (^.asInstanceOf[js.Dynamic].applyDynamic("signInWithPopup")(auth.asInstanceOf[js.Any], provider.asInstanceOf[js.Any], resolver.asInstanceOf[js.Any])).asInstanceOf[js.Promise[UserCredential]]

inline def signInWithRedirect(auth: Auth, provider: AuthProvider): js.Promise[scala.Nothing] = (^.asInstanceOf[js.Dynamic].applyDynamic("signInWithRedirect")(auth.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[js.Promise[scala.Nothing]]
inline def signInWithRedirect(auth: Auth, provider: AuthProvider, resolver: PopupRedirectResolver): js.Promise[scala.Nothing] = (^.asInstanceOf[js.Dynamic].applyDynamic("signInWithRedirect")(auth.asInstanceOf[js.Any], provider.asInstanceOf[js.Any], resolver.asInstanceOf[js.Any])).asInstanceOf[js.Promise[scala.Nothing]]

inline def signOut(auth: Auth): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("signOut")(auth.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]

inline def unlink(user: User, providerId: String): js.Promise[User] = (^.asInstanceOf[js.Dynamic].applyDynamic("unlink")(user.asInstanceOf[js.Any], providerId.asInstanceOf[js.Any])).asInstanceOf[js.Promise[User]]

inline def updateCurrentUser(auth: Auth): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("updateCurrentUser")(auth.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
inline def updateCurrentUser(auth: Auth, user: User): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("updateCurrentUser")(auth.asInstanceOf[js.Any], user.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]

inline def updateEmail(user: User, newEmail: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("updateEmail")(user.asInstanceOf[js.Any], newEmail.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]

inline def updatePassword(user: User, newPassword: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("updatePassword")(user.asInstanceOf[js.Any], newPassword.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]

inline def updatePhoneNumber(
  user: User,
  credential: typings.firebaseAuth.distEsm2017SrcCoreCredentialsPhoneMod.PhoneAuthCredential
): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("updatePhoneNumber")(user.asInstanceOf[js.Any], credential.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]

inline def updateProfile(user: User, hasDisplayNamePhotoUrl: DisplayName): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("updateProfile")(user.asInstanceOf[js.Any], hasDisplayNamePhotoUrl.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]

inline def useDeviceLanguage(auth: Auth): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useDeviceLanguage")(auth.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def verifyBeforeUpdateEmail(user: User, newEmail: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("verifyBeforeUpdateEmail")(user.asInstanceOf[js.Any], newEmail.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
inline def verifyBeforeUpdateEmail(user: User, newEmail: String, actionCodeSettings: ActionCodeSettings): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("verifyBeforeUpdateEmail")(user.asInstanceOf[js.Any], newEmail.asInstanceOf[js.Any], actionCodeSettings.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]

inline def verifyPasswordResetCode(auth: Auth, code: String): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("verifyPasswordResetCode")(auth.asInstanceOf[js.Any], code.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
