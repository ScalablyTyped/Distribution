package typings.firebaseAuth.publicTypesMod

import typings.firebaseApp.mod.FirebaseApp
import typings.firebaseUtil.mod.CompleteFn
import typings.firebaseUtil.mod.ErrorFn
import typings.firebaseUtil.mod.Unsubscribe
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Auth extends StObject {
  
  /** The {@link @firebase/app#FirebaseApp} associated with the `Auth` service instance. */
  val app: FirebaseApp = js.native
  
  /**
    * Adds a blocking callback that runs before an auth state change
    * sets a new user.
    *
    * @param callback - callback triggered before new user value is set.
    *   If this throws, it blocks the user from being set.
    * @param onAbort - callback triggered if a later `beforeAuthStateChanged()`
    *   callback throws, allowing you to undo any side effects.
    */
  def beforeAuthStateChanged(callback: js.Function1[/* user */ User | Null, Unit | js.Promise[Unit]]): Unsubscribe = js.native
  def beforeAuthStateChanged(
    callback: js.Function1[/* user */ User | Null, Unit | js.Promise[Unit]],
    onAbort: js.Function0[Unit]
  ): Unsubscribe = js.native
  
  /** The {@link Config} used to initialize this instance. */
  val config: Config = js.native
  
  /** The currently signed-in user (or null). */
  val currentUser: User | Null = js.native
  
  /** The current emulator configuration (or null). */
  val emulatorConfig: EmulatorConfig | Null = js.native
  
  /**
    * The {@link Auth} instance's language code.
    *
    * @remarks
    * This is a readable/writable property. When set to null, the default Firebase Console language
    * setting is applied. The language code will propagate to email action templates (password
    * reset, email verification and email change revocation), SMS templates for phone authentication,
    * reCAPTCHA verifier and OAuth popup/redirect operations provided the specified providers support
    * localization with the language code specified.
    */
  var languageCode: String | Null = js.native
  
  /** The name of the app associated with the `Auth` service instance. */
  val name: String = js.native
  
  /**
    * Adds an observer for changes to the user's sign-in state.
    *
    * @remarks
    * To keep the old behavior, see {@link Auth.onIdTokenChanged}.
    *
    * @param nextOrObserver - callback triggered on change.
    * @param error - Deprecated. This callback is never triggered. Errors
    * on signing in/out can be caught in promises returned from
    * sign-in/sign-out functions.
    * @param completed - Deprecated. This callback is never triggered.
    */
  def onAuthStateChanged(nextOrObserver: NextOrObserver[User | Null]): Unsubscribe = js.native
  def onAuthStateChanged(nextOrObserver: NextOrObserver[User | Null], error: Unit, completed: CompleteFn): Unsubscribe = js.native
  def onAuthStateChanged(nextOrObserver: NextOrObserver[User | Null], error: ErrorFn): Unsubscribe = js.native
  def onAuthStateChanged(nextOrObserver: NextOrObserver[User | Null], error: ErrorFn, completed: CompleteFn): Unsubscribe = js.native
  
  /**
    * Adds an observer for changes to the signed-in user's ID token.
    *
    * @remarks
    * This includes sign-in, sign-out, and token refresh events.
    *
    * @param nextOrObserver - callback triggered on change.
    * @param error - Deprecated. This callback is never triggered. Errors
    * on signing in/out can be caught in promises returned from
    * sign-in/sign-out functions.
    * @param completed - Deprecated. This callback is never triggered.
    */
  def onIdTokenChanged(nextOrObserver: NextOrObserver[User | Null]): Unsubscribe = js.native
  def onIdTokenChanged(nextOrObserver: NextOrObserver[User | Null], error: Unit, completed: CompleteFn): Unsubscribe = js.native
  def onIdTokenChanged(nextOrObserver: NextOrObserver[User | Null], error: ErrorFn): Unsubscribe = js.native
  def onIdTokenChanged(nextOrObserver: NextOrObserver[User | Null], error: ErrorFn, completed: CompleteFn): Unsubscribe = js.native
  
  /**
    * Changes the type of persistence on the `Auth` instance.
    *
    * @remarks
    * This will affect the currently saved Auth session and applies this type of persistence for
    * future sign-in requests, including sign-in with redirect requests.
    *
    * This makes it easy for a user signing in to specify whether their session should be
    * remembered or not. It also makes it easier to never persist the Auth state for applications
    * that are shared by other users or have sensitive data.
    *
    * @example
    * ```javascript
    * auth.setPersistence(browserSessionPersistence);
    * ```
    *
    * @param persistence - The {@link Persistence} to use.
    */
  def setPersistence(persistence: Persistence): js.Promise[Unit] = js.native
  
  /**
    * The {@link Auth} instance's settings.
    *
    * @remarks
    * This is used to edit/read configuration related options such as app verification mode for
    * phone authentication.
    */
  val settings: AuthSettings = js.native
  
  /**
    * Signs out the current user.
    */
  def signOut(): js.Promise[Unit] = js.native
  
  /**
    * The {@link Auth} instance's tenant ID.
    *
    * @remarks
    * This is a readable/writable property. When you set the tenant ID of an {@link Auth} instance, all
    * future sign-in/sign-up operations will pass this tenant ID and sign in or sign up users to
    * the specified tenant project. When set to null, users are signed in to the parent project.
    *
    * @example
    * ```javascript
    * // Set the tenant ID on Auth instance.
    * auth.tenantId = 'TENANT_PROJECT_ID';
    *
    * // All future sign-in request now include tenant ID.
    * const result = await signInWithEmailAndPassword(auth, email, password);
    * // result.user.tenantId should be 'TENANT_PROJECT_ID'.
    * ```
    *
    * @defaultValue null
    */
  var tenantId: String | Null = js.native
  
  /**
    * Asynchronously sets the provided user as {@link Auth.currentUser} on the {@link Auth} instance.
    *
    * @remarks
    * A new instance copy of the user provided will be made and set as currentUser.
    *
    * This will trigger {@link Auth.onAuthStateChanged} and {@link Auth.onIdTokenChanged} listeners
    * like other sign in methods.
    *
    * The operation fails with an error if the user to be updated belongs to a different Firebase
    * project.
    *
    * @param user - The new {@link User}.
    */
  def updateCurrentUser(): js.Promise[Unit] = js.native
  def updateCurrentUser(user: User): js.Promise[Unit] = js.native
  
  /**
    * Sets the current language to the default device/browser preference.
    */
  def useDeviceLanguage(): Unit = js.native
}
