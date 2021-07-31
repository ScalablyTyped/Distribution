package typings.firebase.mod.firebase.auth

import typings.firebase.mod.firebase.Observer
import typings.firebase.mod.firebase.Unsubscribe
import typings.firebase.mod.firebase.User
import typings.firebase.mod.firebase.app.App
import typings.firebase.mod.firebase.auth.Auth.Persistence
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The Firebase Auth service interface.
  *
  * Do not call this constructor directly. Instead, use
  * {@link firebase.auth `firebase.auth()`}.
  *
  * See
  * {@link https://firebase.google.com/docs/auth/ Firebase Authentication}
  * for a full guide on how to use the Firebase Auth service.
  *
  */
@js.native
trait Auth extends StObject {
  
  /**
    * The {@link firebase.app.App app} associated with the `Auth` service
    * instance.
    *
    * @example
    * ```javascript
    * var app = auth.app;
    * ```
    */
  var app: App = js.native
  
  /**
    * Applies a verification code sent to the user by email or other out-of-band
    * mechanism.
    *
    * <h4>Error Codes</h4>
    * <dl>
    * <dt>auth/expired-action-code</dt>
    * <dd>Thrown if the action code has expired.</dd>
    * <dt>auth/invalid-action-code</dt>
    * <dd>Thrown if the action code is invalid. This can happen if the code is
    *     malformed or has already been used.</dd>
    * <dt>auth/user-disabled</dt>
    * <dd>Thrown if the user corresponding to the given action code has been
    *     disabled.</dd>
    * <dt>auth/user-not-found</dt>
    * <dd>Thrown if there is no user corresponding to the action code. This may
    *     have happened if the user was deleted between when the action code was
    *     issued and when this method was called.</dd>
    * </dl>
    *
    * @param code A verification code sent to the user.
    */
  def applyActionCode(code: String): js.Promise[Unit] = js.native
  
  /**
    * Checks a verification code sent to the user by email or other out-of-band
    * mechanism.
    *
    * Returns metadata about the code.
    *
    * <h4>Error Codes</h4>
    * <dl>
    * <dt>auth/expired-action-code</dt>
    * <dd>Thrown if the action code has expired.</dd>
    * <dt>auth/invalid-action-code</dt>
    * <dd>Thrown if the action code is invalid. This can happen if the code is
    *     malformed or has already been used.</dd>
    * <dt>auth/user-disabled</dt>
    * <dd>Thrown if the user corresponding to the given action code has been
    *     disabled.</dd>
    * <dt>auth/user-not-found</dt>
    * <dd>Thrown if there is no user corresponding to the action code. This may
    *     have happened if the user was deleted between when the action code was
    *     issued and when this method was called.</dd>
    * </dl>
    *
    * @param code A verification code sent to the user.
    */
  def checkActionCode(code: String): js.Promise[ActionCodeInfo] = js.native
  
  /**
    * Completes the password reset process, given a confirmation code and new
    * password.
    *
    * <h4>Error Codes</h4>
    * <dl>
    * <dt>auth/expired-action-code</dt>
    * <dd>Thrown if the password reset code has expired.</dd>
    * <dt>auth/invalid-action-code</dt>
    * <dd>Thrown if the password reset code is invalid. This can happen if the
    *     code is malformed or has already been used.</dd>
    * <dt>auth/user-disabled</dt>
    * <dd>Thrown if the user corresponding to the given password reset code has
    *     been disabled.</dd>
    * <dt>auth/user-not-found</dt>
    * <dd>Thrown if there is no user corresponding to the password reset code. This
    *     may have happened if the user was deleted between when the code was
    *     issued and when this method was called.</dd>
    * <dt>auth/weak-password</dt>
    * <dd>Thrown if the new password is not strong enough.</dd>
    * </dl>
    *
    * @param code The confirmation code send via email to the user.
    * @param newPassword The new password.
    */
  def confirmPasswordReset(code: String, newPassword: String): js.Promise[Unit] = js.native
  
  /**
    * Creates a new user account associated with the specified email address and
    * password.
    *
    * On successful creation of the user account, this user will also be
    * signed in to your application.
    *
    * User account creation can fail if the account already exists or the password
    * is invalid.
    *
    * Note: The email address acts as a unique identifier for the user and
    * enables an email-based password reset.  This function will create
    * a new user account and set the initial user password.
    *
    * <h4>Error Codes</h4>
    * <dl>
    * <dt>auth/email-already-in-use</dt>
    * <dd>Thrown if there already exists an account with the given email
    *     address.</dd>
    * <dt>auth/invalid-email</dt>
    * <dd>Thrown if the email address is not valid.</dd>
    * <dt>auth/operation-not-allowed</dt>
    * <dd>Thrown if email/password accounts are not enabled. Enable email/password
    *     accounts in the Firebase Console, under the Auth tab.</dd>
    * <dt>auth/weak-password</dt>
    * <dd>Thrown if the password is not strong enough.</dd>
    * </dl>
    *
    * @example
    * ```javascript
    * firebase.auth().createUserWithEmailAndPassword(email, password)
    *     .catch(function(error) {
    *   // Handle Errors here.
    *   var errorCode = error.code;
    *   var errorMessage = error.message;
    *   if (errorCode == 'auth/weak-password') {
    *     alert('The password is too weak.');
    *   } else {
    *     alert(errorMessage);
    *   }
    *   console.log(error);
    * });
    * ```
    * @param email The user's email address.
    * @param password The user's chosen password.
    */
  def createUserWithEmailAndPassword(email: String, password: String): js.Promise[UserCredential] = js.native
  
  /**
    * The currently signed-in user (or null).
    */
  var currentUser: User | Null = js.native
  
  /**
    * Gets the list of possible sign in methods for the given email address. This
    * is useful to differentiate methods of sign-in for the same provider,
    * eg. `EmailAuthProvider` which has 2 methods of sign-in, email/password and
    * email/link.
    *
    * <h4>Error Codes</h4>
    * <dl>
    * <dt>auth/invalid-email</dt>
    * <dd>Thrown if the email address is not valid.</dd>
    * </dl>
    */
  def fetchSignInMethodsForEmail(email: String): js.Promise[js.Array[String]] = js.native
  
  /**
    * Returns a UserCredential from the redirect-based sign-in flow.
    *
    * If sign-in succeeded, returns the signed in user. If sign-in was
    * unsuccessful, fails with an error. If no redirect operation was called,
    * returns a UserCredential with a null User.
    *
    * <h4>Error Codes</h4>
    * <dl>
    * <dt>auth/account-exists-with-different-credential</dt>
    * <dd>Thrown if there already exists an account with the email address
    *     asserted by the credential. Resolve this by calling
    *     {@link firebase.auth.Auth.fetchSignInMethodsForEmail} with the error.email
    *     and then asking the user to sign in using one of the returned providers.
    *     Once the user is signed in, the original credential retrieved from the
    *     error.credential can be linked to the user with
    *     {@link firebase.User.linkWithCredential} to prevent the user from signing
    *     in again to the original provider via popup or redirect. If you are using
    *     redirects for sign in, save the credential in session storage and then
    *     retrieve on redirect and repopulate the credential using for example
    *     {@link firebase.auth.GoogleAuthProvider.credential} depending on the
    *     credential provider id and complete the link.</dd>
    * <dt>auth/auth-domain-config-required</dt>
    * <dd>Thrown if authDomain configuration is not provided when calling
    *     firebase.initializeApp(). Check Firebase Console for instructions on
    *     determining and passing that field.</dd>
    * <dt>auth/credential-already-in-use</dt>
    * <dd>Thrown if the account corresponding to the credential already exists
    *     among your users, or is already linked to a Firebase User.
    *     For example, this error could be thrown if you are upgrading an anonymous
    *     user to a Google user by linking a Google credential to it and the Google
    *     credential used is already associated with an existing Firebase Google
    *     user.
    *     An <code>error.email</code> and <code>error.credential</code>
    *     ({@link firebase.auth.AuthCredential}) fields are also provided. You can
    *     recover from this error by signing in with that credential directly via
    *     {@link firebase.auth.Auth.signInWithCredential}.</dd>
    * <dt>auth/email-already-in-use</dt>
    * <dd>Thrown if the email corresponding to the credential already exists
    *     among your users. When thrown while linking a credential to an existing
    *     user, an <code>error.email</code> and <code>error.credential</code>
    *     ({@link firebase.auth.AuthCredential}) fields are also provided.
    *     You have to link the credential to the existing user with that email if
    *     you wish to continue signing in with that credential. To do so, call
    *     {@link firebase.auth.Auth.fetchSignInMethodsForEmail}, sign in to
    *     <code>error.email</code> via one of the providers returned and then
    *     {@link firebase.User.linkWithCredential} the original credential to that
    *     newly signed in user.</dd>
    * <dt>auth/operation-not-allowed</dt>
    * <dd>Thrown if the type of account corresponding to the credential
    *     is not enabled. Enable the account type in the Firebase Console, under
    *     the Auth tab.</dd>
    * <dt>auth/operation-not-supported-in-this-environment</dt>
    * <dd>Thrown if this operation is not supported in the environment your
    *     application is running on. "location.protocol" must be http or https.
    *     </dd>
    * <dt>auth/timeout</dt>
    * <dd>Thrown typically if the app domain is not authorized for OAuth operations
    *     for your Firebase project. Edit the list of authorized domains from the
    *     Firebase console.</dd>
    * </dl>
    *
    * @webonly
    *
    * @example
    * ```javascript
    * // First, we perform the signInWithRedirect.
    * // Creates the provider object.
    * var provider = new firebase.auth.FacebookAuthProvider();
    * // You can add additional scopes to the provider:
    * provider.addScope('email');
    * provider.addScope('user_friends');
    * // Sign in with redirect:
    * auth.signInWithRedirect(provider)
    * ////////////////////////////////////////////////////////////
    * // The user is redirected to the provider's sign in flow...
    * ////////////////////////////////////////////////////////////
    * // Then redirected back to the app, where we check the redirect result:
    * auth.getRedirectResult().then(function(result) {
    *   // The firebase.User instance:
    *   var user = result.user;
    *   // The Facebook firebase.auth.AuthCredential containing the Facebook
    *   // access token:
    *   var credential = result.credential;
    *   // As this API can be used for sign-in, linking and reauthentication,
    *   // check the operationType to determine what triggered this redirect
    *   // operation.
    *   var operationType = result.operationType;
    * }, function(error) {
    *   // The provider's account email, can be used in case of
    *   // auth/account-exists-with-different-credential to fetch the providers
    *   // linked to the email:
    *   var email = error.email;
    *   // The provider's credential:
    *   var credential = error.credential;
    *   // In case of auth/account-exists-with-different-credential error,
    *   // you can fetch the providers using this:
    *   if (error.code === 'auth/account-exists-with-different-credential') {
    *     auth.fetchSignInMethodsForEmail(email).then(function(providers) {
    *       // The returned 'providers' is a list of the available providers
    *       // linked to the email address. Please refer to the guide for a more
    *       // complete explanation on how to recover from this error.
    *     });
    *   }
    * });
    * ```
    */
  def getRedirectResult(): js.Promise[UserCredential] = js.native
  
  /**
    * Checks if an incoming link is a sign-in with email link.
    */
  def isSignInWithEmailLink(emailLink: String): Boolean = js.native
  
  /**
    * The current Auth instance's language code. This is a readable/writable
    * property. When set to null, the default Firebase Console language setting
    * is applied. The language code will propagate to email action templates
    * (password reset, email verification and email change revocation), SMS
    * templates for phone authentication, reCAPTCHA verifier and OAuth
    * popup/redirect operations provided the specified providers support
    * localization with the language code specified.
    */
  var languageCode: String | Null = js.native
  
  def onAuthStateChanged(nextOrObserver: js.Function1[/* a */ User | Null, js.Any]): Unsubscribe = js.native
  def onAuthStateChanged(
    nextOrObserver: js.Function1[/* a */ User | Null, js.Any],
    error: js.Function1[/* a */ Error, js.Any]
  ): Unsubscribe = js.native
  def onAuthStateChanged(
    nextOrObserver: js.Function1[/* a */ User | Null, js.Any],
    error: js.Function1[/* a */ Error, js.Any],
    completed: Unsubscribe
  ): Unsubscribe = js.native
  def onAuthStateChanged(nextOrObserver: js.Function1[/* a */ User | Null, js.Any], error: Unit, completed: Unsubscribe): Unsubscribe = js.native
  /**
    * Adds an observer for changes to the user's sign-in state.
    *
    * Prior to 4.0.0, this triggered the observer when users were signed in,
    * signed out, or when the user's ID token changed in situations such as token
    * expiry or password change. After 4.0.0, the observer is only triggered
    * on sign-in or sign-out.
    *
    * To keep the old behavior, see {@link firebase.auth.Auth.onIdTokenChanged}.
    *
    * @example
    * ```javascript
    * firebase.auth().onAuthStateChanged(function(user) {
    *   if (user) {
    *     // User is signed in.
    *   }
    * });
    * ```
    */
  def onAuthStateChanged(nextOrObserver: Observer[js.Any, typings.std.Error]): Unsubscribe = js.native
  def onAuthStateChanged(nextOrObserver: Observer[js.Any, typings.std.Error], error: js.Function1[/* a */ Error, js.Any]): Unsubscribe = js.native
  def onAuthStateChanged(
    nextOrObserver: Observer[js.Any, typings.std.Error],
    error: js.Function1[/* a */ Error, js.Any],
    completed: Unsubscribe
  ): Unsubscribe = js.native
  def onAuthStateChanged(nextOrObserver: Observer[js.Any, typings.std.Error], error: Unit, completed: Unsubscribe): Unsubscribe = js.native
  
  def onIdTokenChanged(nextOrObserver: js.Function1[/* a */ User | Null, js.Any]): Unsubscribe = js.native
  def onIdTokenChanged(
    nextOrObserver: js.Function1[/* a */ User | Null, js.Any],
    error: js.Function1[/* a */ Error, js.Any]
  ): Unsubscribe = js.native
  def onIdTokenChanged(
    nextOrObserver: js.Function1[/* a */ User | Null, js.Any],
    error: js.Function1[/* a */ Error, js.Any],
    completed: Unsubscribe
  ): Unsubscribe = js.native
  def onIdTokenChanged(nextOrObserver: js.Function1[/* a */ User | Null, js.Any], error: Unit, completed: Unsubscribe): Unsubscribe = js.native
  /**
    * Adds an observer for changes to the signed-in user's ID token, which includes
    * sign-in, sign-out, and token refresh events. This method has the same
    * behavior as {@link firebase.auth.Auth.onAuthStateChanged} had prior to 4.0.0.
    *
    * @example
    * ```javascript
    * firebase.auth().onIdTokenChanged(function(user) {
    *   if (user) {
    *     // User is signed in or token was refreshed.
    *   }
    * });
    * ```
    * @param
    *     nextOrObserver An observer object or a function triggered on change.
    * @param error Optional A function
    *     triggered on auth error.
    * @param completed Optional A function triggered when the
    *     observer is removed.
    */
  def onIdTokenChanged(nextOrObserver: Observer[js.Any, typings.std.Error]): Unsubscribe = js.native
  def onIdTokenChanged(nextOrObserver: Observer[js.Any, typings.std.Error], error: js.Function1[/* a */ Error, js.Any]): Unsubscribe = js.native
  def onIdTokenChanged(
    nextOrObserver: Observer[js.Any, typings.std.Error],
    error: js.Function1[/* a */ Error, js.Any],
    completed: Unsubscribe
  ): Unsubscribe = js.native
  def onIdTokenChanged(nextOrObserver: Observer[js.Any, typings.std.Error], error: Unit, completed: Unsubscribe): Unsubscribe = js.native
  
  /**
    * Sends a password reset email to the given email address.
    *
    * To complete the password reset, call
    * {@link firebase.auth.Auth.confirmPasswordReset} with the code supplied in the
    * email sent to the user, along with the new password specified by the user.
    *
    * <h4>Error Codes</h4>
    * <dl>
    * <dt>auth/invalid-email</dt>
    * <dd>Thrown if the email address is not valid.</dd>
    * <dt>auth/missing-android-pkg-name</dt>
    * <dd>An Android package name must be provided if the Android app is required
    *     to be installed.</dd>
    * <dt>auth/missing-continue-uri</dt>
    * <dd>A continue URL must be provided in the request.</dd>
    * <dt>auth/missing-ios-bundle-id</dt>
    * <dd>An iOS Bundle ID must be provided if an App Store ID is provided.</dd>
    * <dt>auth/invalid-continue-uri</dt>
    * <dd>The continue URL provided in the request is invalid.</dd>
    * <dt>auth/unauthorized-continue-uri</dt>
    * <dd>The domain of the continue URL is not whitelisted. Whitelist
    *     the domain in the Firebase console.</dd>
    * <dt>auth/user-not-found</dt>
    * <dd>Thrown if there is no user corresponding to the email address.</dd>
    * </dl>
    *
    * @example
    * ```javascript
    * var actionCodeSettings = {
    *   url: 'https://www.example.com/?email=user@example.com',
    *   iOS: {
    *     bundleId: 'com.example.ios'
    *   },
    *   android: {
    *     packageName: 'com.example.android',
    *     installApp: true,
    *     minimumVersion: '12'
    *   },
    *   handleCodeInApp: true
    * };
    * firebase.auth().sendPasswordResetEmail(
    *     'user@example.com', actionCodeSettings)
    *     .then(function() {
    *       // Password reset email sent.
    *     })
    *     .catch(function(error) {
    *       // Error occurred. Inspect error.code.
    *     });
    * ```
    *
    * @param email The email address with the password to be reset.
    * @param actionCodeSettings The action
    *     code settings. If specified, the state/continue URL will be set as the
    *     "continueUrl" parameter in the password reset link. The default password
    *     reset landing page will use this to display a link to go back to the app
    *     if it is installed.
    *     If the actionCodeSettings is not specified, no URL is appended to the
    *     action URL.
    *     The state URL provided must belong to a domain that is whitelisted by the
    *     developer in the console. Otherwise an error will be thrown.
    *     Mobile app redirects will only be applicable if the developer configures
    *     and accepts the Firebase Dynamic Links terms of condition.
    *     The Android package name and iOS bundle ID will be respected only if they
    *     are configured in the same Firebase Auth project used.
    */
  def sendPasswordResetEmail(email: String): js.Promise[Unit] = js.native
  def sendPasswordResetEmail(email: String, actionCodeSettings: ActionCodeSettings): js.Promise[Unit] = js.native
  
  /**
    * Sends a sign-in email link to the user with the specified email.
    *
    * The sign-in operation has to always be completed in the app unlike other out
    * of band email actions (password reset and email verifications). This is
    * because, at the end of the flow, the user is expected to be signed in and
    * their Auth state persisted within the app.
    *
    * To complete sign in with the email link, call
    * {@link firebase.auth.Auth.signInWithEmailLink} with the email address and
    * the email link supplied in the email sent to the user.
    *
    * <h4>Error Codes</h4>
    * <dl>
    * <dt>auth/argument-error</dt>
    * <dd>Thrown if handleCodeInApp is false.</dd>
    * <dt>auth/invalid-email</dt>
    * <dd>Thrown if the email address is not valid.</dd>
    * <dt>auth/missing-android-pkg-name</dt>
    * <dd>An Android package name must be provided if the Android app is required
    *     to be installed.</dd>
    * <dt>auth/missing-continue-uri</dt>
    * <dd>A continue URL must be provided in the request.</dd>
    * <dt>auth/missing-ios-bundle-id</dt>
    * <dd>An iOS Bundle ID must be provided if an App Store ID is provided.</dd>
    * <dt>auth/invalid-continue-uri</dt>
    * <dd>The continue URL provided in the request is invalid.</dd>
    * <dt>auth/unauthorized-continue-uri</dt>
    * <dd>The domain of the continue URL is not whitelisted. Whitelist
    *     the domain in the Firebase console.</dd>
    * </dl>
    *
    * @example
    * ```javascript
    * var actionCodeSettings = {
    *   // The URL to redirect to for sign-in completion. This is also the deep
    *   // link for mobile redirects. The domain (www.example.com) for this URL
    *   // must be whitelisted in the Firebase Console.
    *   url: 'https://www.example.com/finishSignUp?cartId=1234',
    *   iOS: {
    *     bundleId: 'com.example.ios'
    *   },
    *   android: {
    *     packageName: 'com.example.android',
    *     installApp: true,
    *     minimumVersion: '12'
    *   },
    *   // This must be true.
    *   handleCodeInApp: true
    * };
    * firebase.auth().sendSignInLinkToEmail('user@example.com', actionCodeSettings)
    *     .then(function() {
    *       // The link was successfully sent. Inform the user. Save the email
    *       // locally so you don't need to ask the user for it again if they open
    *       // the link on the same device.
    *     })
    *     .catch(function(error) {
    *       // Some error occurred, you can inspect the code: error.code
    *     });
    * ```
    * @param email The email account to sign in with.
    * @param actionCodeSettings The action
    *     code settings. The action code settings which provides Firebase with
    *     instructions on how to construct the email link. This includes the
    *     sign in completion URL or the deep link for mobile redirects, the mobile
    *     apps to use when the sign-in link is opened on an Android or iOS device.
    *     Mobile app redirects will only be applicable if the developer configures
    *     and accepts the Firebase Dynamic Links terms of condition.
    *     The Android package name and iOS bundle ID will be respected only if they
    *     are configured in the same Firebase Auth project used.
    */
  def sendSignInLinkToEmail(email: String, actionCodeSettings: ActionCodeSettings): js.Promise[Unit] = js.native
  
  /**
    * Changes the current type of persistence on the current Auth instance for the
    * currently saved Auth session and applies this type of persistence for
    * future sign-in requests, including sign-in with redirect requests. This will
    * return a promise that will resolve once the state finishes copying from one
    * type of storage to the other.
    * Calling a sign-in method after changing persistence will wait for that
    * persistence change to complete before applying it on the new Auth state.
    *
    * This makes it easy for a user signing in to specify whether their session
    * should be remembered or not. It also makes it easier to never persist the
    * Auth state for applications that are shared by other users or have sensitive
    * data.
    *
    * The default for web browser apps and React Native apps is 'local' (provided
    * the browser supports this mechanism) whereas it is 'none' for Node.js backend
    * apps.
    *
    * <h4>Error Codes (thrown synchronously)</h4>
    * <dl>
    * <dt>auth/invalid-persistence-type</dt>
    * <dd>Thrown if the specified persistence type is invalid.</dd>
    * <dt>auth/unsupported-persistence-type</dt>
    * <dd>Thrown if the current environment does not support the specified
    *     persistence type.</dd>
    * </dl>
    *
    * @example
    * ```javascript
    * firebase.auth().setPersistence(firebase.auth.Auth.Persistence.SESSION)
    *     .then(function() {
    *   // Existing and future Auth states are now persisted in the current
    *   // session only. Closing the window would clear any existing state even if
    *   // a user forgets to sign out.
    * });
    * ```
    */
  def setPersistence(persistence: Persistence): js.Promise[Unit] = js.native
  
  /**
    * The current Auth instance's settings. This is used to edit/read configuration
    * related options like app verification mode for phone authentication.
    */
  var settings: AuthSettings = js.native
  
  /**
    * Asynchronously signs in with the given credentials, and returns any available
    * additional user information, such as user name.
    *
    * <h4>Error Codes</h4>
    * <dl>
    * <dt>auth/account-exists-with-different-credential</dt>
    * <dd>Thrown if there already exists an account with the email address
    *     asserted by the credential. Resolve this by calling
    *     {@link firebase.auth.Auth.fetchSignInMethodsForEmail} and then asking the
    *     user to sign in using one of the returned providers. Once the user is
    *     signed in, the original credential can be linked to the user with
    *     {@link firebase.User.linkWithCredential}.</dd>
    * <dt>auth/invalid-credential</dt>
    * <dd>Thrown if the credential is malformed or has expired.</dd>
    * <dt>auth/operation-not-allowed</dt>
    * <dd>Thrown if the type of account corresponding to the credential
    *     is not enabled. Enable the account type in the Firebase Console, under
    *     the Auth tab.</dd>
    * <dt>auth/user-disabled</dt>
    * <dd>Thrown if the user corresponding to the given credential has been
    *     disabled.</dd>
    * <dt>auth/user-not-found</dt>
    * <dd>Thrown if signing in with a credential from
    *     {@link firebase.auth.EmailAuthProvider.credential} and there is no user
    *     corresponding to the given email. </dd>
    * <dt>auth/wrong-password</dt>
    * <dd>Thrown if signing in with a credential from
    *     {@link firebase.auth.EmailAuthProvider.credential} and the password is
    *     invalid for the given email, or if the account corresponding to the email
    *     does not have a password set.</dd>
    * <dt>auth/invalid-verification-code</dt>
    * <dd>Thrown if the credential is a
    *     {@link firebase.auth.PhoneAuthProvider.credential} and the verification
    *     code of the credential is not valid.</dd>
    * <dt>auth/invalid-verification-id</dt>
    * <dd>Thrown if the credential is a
    *     {@link firebase.auth.PhoneAuthProvider.credential}  and the verification
    *     ID of the credential is not valid.</dd>
    * </dl>
    *
    * @deprecated
    * This method is deprecated. Use
    * {@link firebase.auth.Auth.signInWithCredential} instead.
    *
    * @example
    * ```javascript
    * firebase.auth().signInAndRetrieveDataWithCredential(credential)
    *     .then(function(userCredential) {
    *       console.log(userCredential.additionalUserInfo.username);
    *     });
    * ```
    * @param credential The auth credential.
    */
  def signInAndRetrieveDataWithCredential(credential: AuthCredential): js.Promise[UserCredential] = js.native
  
  /**
    * Asynchronously signs in as an anonymous user.
    *
    *
    * If there is already an anonymous user signed in, that user will be returned;
    * otherwise, a new anonymous user identity will be created and returned.
    *
    * <h4>Error Codes</h4>
    * <dl>
    * <dt>auth/operation-not-allowed</dt>
    * <dd>Thrown if anonymous accounts are not enabled. Enable anonymous accounts
    *     in the Firebase Console, under the Auth tab.</dd>
    * </dl>
    *
    * @example
    * ```javascript
    * firebase.auth().signInAnonymously().catch(function(error) {
    *   // Handle Errors here.
    *   var errorCode = error.code;
    *   var errorMessage = error.message;
    *
    *   if (errorCode === 'auth/operation-not-allowed') {
    *     alert('You must enable Anonymous auth in the Firebase Console.');
    *   } else {
    *     console.error(error);
    *   }
    * });
    * ```
    */
  def signInAnonymously(): js.Promise[UserCredential] = js.native
  
  /**
    * Asynchronously signs in with the given credentials.
    *
    * <h4>Error Codes</h4>
    * <dl>
    * <dt>auth/account-exists-with-different-credential</dt>
    * <dd>Thrown if there already exists an account with the email address
    *     asserted by the credential. Resolve this by calling
    *     {@link firebase.auth.Auth.fetchSignInMethodsForEmail} and then asking the
    *     user to sign in using one of the returned providers. Once the user is
    *     signed in, the original credential can be linked to the user with
    *     {@link firebase.User.linkWithCredential}.</dd>
    * <dt>auth/invalid-credential</dt>
    * <dd>Thrown if the credential is malformed or has expired.</dd>
    * <dt>auth/operation-not-allowed</dt>
    * <dd>Thrown if the type of account corresponding to the credential
    *     is not enabled. Enable the account type in the Firebase Console, under
    *     the Auth tab.</dd>
    * <dt>auth/user-disabled</dt>
    * <dd>Thrown if the user corresponding to the given credential has been
    *     disabled.</dd>
    * <dt>auth/user-not-found</dt>
    * <dd>Thrown if signing in with a credential from
    *     {@link firebase.auth.EmailAuthProvider.credential} and there is no user
    *     corresponding to the given email. </dd>
    * <dt>auth/wrong-password</dt>
    * <dd>Thrown if signing in with a credential from
    *     {@link firebase.auth.EmailAuthProvider.credential} and the password is
    *     invalid for the given email, or if the account corresponding to the email
    *     does not have a password set.</dd>
    * <dt>auth/invalid-verification-code</dt>
    * <dd>Thrown if the credential is a
    *     {@link firebase.auth.PhoneAuthProvider.credential} and the verification
    *     code of the credential is not valid.</dd>
    * <dt>auth/invalid-verification-id</dt>
    * <dd>Thrown if the credential is a
    *     {@link firebase.auth.PhoneAuthProvider.credential}  and the verification
    *     ID of the credential is not valid.</dd>
    * </dl>
    *
    * @example
    * ```javascript
    * firebase.auth().signInWithCredential(credential).catch(function(error) {
    *   // Handle Errors here.
    *   var errorCode = error.code;
    *   var errorMessage = error.message;
    *   // The email of the user's account used.
    *   var email = error.email;
    *   // The firebase.auth.AuthCredential type that was used.
    *   var credential = error.credential;
    *   if (errorCode === 'auth/account-exists-with-different-credential') {
    *     alert('Email already associated with another account.');
    *     // Handle account linking here, if using.
    *   } else {
    *     console.error(error);
    *   }
    *  });
    * ```
    *
    * @param credential The auth credential.
    */
  def signInWithCredential(credential: AuthCredential): js.Promise[UserCredential] = js.native
  
  /**
    * Asynchronously signs in using a custom token.
    *
    * Custom tokens are used to integrate Firebase Auth with existing auth systems,
    * and must be generated by the auth backend.
    *
    * Fails with an error if the token is invalid, expired, or not accepted by the
    * Firebase Auth service.
    *
    * <h4>Error Codes</h4>
    * <dl>
    * <dt>auth/custom-token-mismatch</dt>
    * <dd>Thrown if the custom token is for a different Firebase App.</dd>
    * <dt>auth/invalid-custom-token</dt>
    * <dd>Thrown if the custom token format is incorrect.</dd>
    * </dl>
    *
    * @example
    * ```javascript
    * firebase.auth().signInWithCustomToken(token).catch(function(error) {
    *   // Handle Errors here.
    *   var errorCode = error.code;
    *   var errorMessage = error.message;
    *   if (errorCode === 'auth/invalid-custom-token') {
    *     alert('The token you provided is not valid.');
    *   } else {
    *     console.error(error);
    *   }
    * });
    * ```
    *
    * @param token The custom token to sign in with.
    */
  def signInWithCustomToken(token: String): js.Promise[UserCredential] = js.native
  
  /**
    * Asynchronously signs in using an email and password.
    *
    * Fails with an error if the email address and password do not match.
    *
    * Note: The user's password is NOT the password used to access the user's email
    * account. The email address serves as a unique identifier for the user, and
    * the password is used to access the user's account in your Firebase project.
    *
    * See also: {@link firebase.auth.Auth.createUserWithEmailAndPassword}.
    *
    * <h4>Error Codes</h4>
    * <dl>
    * <dt>auth/invalid-email</dt>
    * <dd>Thrown if the email address is not valid.</dd>
    * <dt>auth/user-disabled</dt>
    * <dd>Thrown if the user corresponding to the given email has been
    *     disabled.</dd>
    * <dt>auth/user-not-found</dt>
    * <dd>Thrown if there is no user corresponding to the given email.</dd>
    * <dt>auth/wrong-password</dt>
    * <dd>Thrown if the password is invalid for the given email, or the account
    *     corresponding to the email does not have a password set.</dd>
    * </dl>
    *
    * @example
    * ```javascript
    * firebase.auth().signInWithEmailAndPassword(email, password)
    *     .catch(function(error) {
    *   // Handle Errors here.
    *   var errorCode = error.code;
    *   var errorMessage = error.message;
    *   if (errorCode === 'auth/wrong-password') {
    *     alert('Wrong password.');
    *   } else {
    *     alert(errorMessage);
    *   }
    *   console.log(error);
    * });
    * ```
    *
    * @param email The users email address.
    * @param password The users password.
    */
  def signInWithEmailAndPassword(email: String, password: String): js.Promise[UserCredential] = js.native
  
  /**
    * Asynchronously signs in using an email and sign-in email link. If no link
    * is passed, the link is inferred from the current URL.
    *
    * Fails with an error if the email address is invalid or OTP in email link
    * expires.
    *
    * Note: Confirm the link is a sign-in email link before calling this method
    * {@link firebase.auth.Auth.isSignInWithEmailLink}.
    *
    * <h4>Error Codes</h4>
    * <dl>
    * <dt>auth/expired-action-code</dt>
    * <dd>Thrown if OTP in email link expires.</dd>
    * <dt>auth/invalid-email</dt>
    * <dd>Thrown if the email address is not valid.</dd>
    * <dt>auth/user-disabled</dt>
    * <dd>Thrown if the user corresponding to the given email has been
    *     disabled.</dd>
    * </dl>
    *
    * @example
    * ```javascript
    * firebase.auth().signInWithEmailLink(email, emailLink)
    *     .catch(function(error) {
    *       // Some error occurred, you can inspect the code: error.code
    *       // Common errors could be invalid email and invalid or expired OTPs.
    *     });
    * ```
    *
    * @param email The email account to sign in with.
    * @param emailLink The optional link which contains the OTP needed
    *     to complete the sign in with email link. If not specified, the current
    *     URL is used instead.
    */
  def signInWithEmailLink(email: String): js.Promise[UserCredential] = js.native
  def signInWithEmailLink(email: String, emailLink: String): js.Promise[UserCredential] = js.native
  
  /**
    * Asynchronously signs in using a phone number. This method sends a code via
    * SMS to the given phone number, and returns a
    * {@link firebase.auth.ConfirmationResult}. After the user provides the code
    * sent to their phone, call {@link firebase.auth.ConfirmationResult.confirm}
    * with the code to sign the user in.
    *
    * For abuse prevention, this method also requires a
    * {@link firebase.auth.ApplicationVerifier}. The Firebase Auth SDK includes
    * a reCAPTCHA-based implementation, {@link firebase.auth.RecaptchaVerifier}.
    *
    * <h4>Error Codes</h4>
    * <dl>
    * <dt>auth/captcha-check-failed</dt>
    * <dd>Thrown if the reCAPTCHA response token was invalid, expired, or if
    *     this method was called from a non-whitelisted domain.</dd>
    * <dt>auth/invalid-phone-number</dt>
    * <dd>Thrown if the phone number has an invalid format.</dd>
    * <dt>auth/missing-phone-number</dt>
    * <dd>Thrown if the phone number is missing.</dd>
    * <dt>auth/quota-exceeded</dt>
    * <dd>Thrown if the SMS quota for the Firebase project has been exceeded.</dd>
    * <dt>auth/user-disabled</dt>
    * <dd>Thrown if the user corresponding to the given phone number has been
    *     disabled.</dd>
    * <dt>auth/operation-not-allowed</dt>
    * <dd>Thrown if you have not enabled the provider in the Firebase Console. Go
    *     to the Firebase Console for your project, in the Auth section and the
    *     <strong>Sign in Method</strong> tab and configure the provider.</dd>
    * </dl>
    *
    * @example
    * ```javascript
    * // 'recaptcha-container' is the ID of an element in the DOM.
    * var applicationVerifier = new firebase.auth.RecaptchaVerifier(
    *     'recaptcha-container');
    * firebase.auth().signInWithPhoneNumber(phoneNumber, applicationVerifier)
    *     .then(function(confirmationResult) {
    *       var verificationCode = window.prompt('Please enter the verification ' +
    *           'code that was sent to your mobile device.');
    *       return confirmationResult.confirm(verificationCode);
    *     })
    *     .catch(function(error) {
    *       // Handle Errors here.
    *     });
    * ```
    *
    * @param phoneNumber The user's phone number in E.164 format (e.g.
    *     +16505550101).
    * @param applicationVerifier
    */
  def signInWithPhoneNumber(phoneNumber: String, applicationVerifier: ApplicationVerifier): js.Promise[ConfirmationResult] = js.native
  
  /**
    * Authenticates a Firebase client using a popup-based OAuth authentication
    * flow.
    *
    * If succeeds, returns the signed in user along with the provider's credential.
    * If sign in was unsuccessful, returns an error object containing additional
    * information about the error.
    *
    * <h4>Error Codes</h4>
    * <dl>
    * <dt>auth/account-exists-with-different-credential</dt>
    * <dd>Thrown if there already exists an account with the email address
    *     asserted by the credential. Resolve this by calling
    *     {@link firebase.auth.Auth.fetchSignInMethodsForEmail} with the error.email
    *     and then asking the user to sign in using one of the returned providers.
    *     Once the user is signed in, the original credential retrieved from the
    *     error.credential can be linked to the user with
    *     {@link firebase.User.linkWithCredential} to prevent the user from signing
    *     in again to the original provider via popup or redirect. If you are using
    *     redirects for sign in, save the credential in session storage and then
    *     retrieve on redirect and repopulate the credential using for example
    *     {@link firebase.auth.GoogleAuthProvider.credential} depending on the
    *     credential provider id and complete the link.</dd>
    * <dt>auth/auth-domain-config-required</dt>
    * <dd>Thrown if authDomain configuration is not provided when calling
    *     firebase.initializeApp(). Check Firebase Console for instructions on
    *     determining and passing that field.</dd>
    * <dt>auth/cancelled-popup-request</dt>
    * <dd>Thrown if successive popup operations are triggered. Only one popup
    *     request is allowed at one time. All the popups would fail with this error
    *     except for the last one.</dd>
    * <dt>auth/operation-not-allowed</dt>
    * <dd>Thrown if the type of account corresponding to the credential
    *     is not enabled. Enable the account type in the Firebase Console, under
    *     the Auth tab.</dd>
    * <dt>auth/operation-not-supported-in-this-environment</dt>
    * <dd>Thrown if this operation is not supported in the environment your
    *     application is running on. "location.protocol" must be http or https.
    *     </dd>
    * <dt>auth/popup-blocked</dt>
    * <dd>Thrown if the popup was blocked by the browser, typically when this
    *     operation is triggered outside of a click handler.</dd>
    * <dt>auth/popup-closed-by-user</dt>
    * <dd>Thrown if the popup window is closed by the user without completing the
    *     sign in to the provider.</dd>
    * <dt>auth/unauthorized-domain</dt>
    * <dd>Thrown if the app domain is not authorized for OAuth operations for your
    *     Firebase project. Edit the list of authorized domains from the Firebase
    *     console.</dd>
    * </dl>
    *
    * @webonly
    *
    * @example
    * ```javascript
    * // Creates the provider object.
    * var provider = new firebase.auth.FacebookAuthProvider();
    * // You can add additional scopes to the provider:
    * provider.addScope('email');
    * provider.addScope('user_friends');
    * // Sign in with popup:
    * auth.signInWithPopup(provider).then(function(result) {
    *   // The firebase.User instance:
    *   var user = result.user;
    *   // The Facebook firebase.auth.AuthCredential containing the Facebook
    *   // access token:
    *   var credential = result.credential;
    * }, function(error) {
    *   // The provider's account email, can be used in case of
    *   // auth/account-exists-with-different-credential to fetch the providers
    *   // linked to the email:
    *   var email = error.email;
    *   // The provider's credential:
    *   var credential = error.credential;
    *   // In case of auth/account-exists-with-different-credential error,
    *   // you can fetch the providers using this:
    *   if (error.code === 'auth/account-exists-with-different-credential') {
    *     auth.fetchSignInMethodsForEmail(email).then(function(providers) {
    *       // The returned 'providers' is a list of the available providers
    *       // linked to the email address. Please refer to the guide for a more
    *       // complete explanation on how to recover from this error.
    *     });
    *   }
    * });
    * ```
    *
    * @param provider The provider to authenticate.
    *     The provider has to be an OAuth provider. Non-OAuth providers like {@link
    *     firebase.auth.EmailAuthProvider} will throw an error.
    */
  def signInWithPopup(provider: AuthProvider): js.Promise[UserCredential] = js.native
  
  /**
    * Authenticates a Firebase client using a full-page redirect flow. To handle
    * the results and errors for this operation, refer to {@link
    * firebase.auth.Auth.getRedirectResult}.
    *
    * <h4>Error Codes</h4>
    * <dl>
    * <dt>auth/auth-domain-config-required</dt>
    * <dd>Thrown if authDomain configuration is not provided when calling
    *     firebase.initializeApp(). Check Firebase Console for instructions on
    *     determining and passing that field.</dd>
    * <dt>auth/operation-not-supported-in-this-environment</dt>
    * <dd>Thrown if this operation is not supported in the environment your
    *     application is running on. "location.protocol" must be http or https.
    *     </dd>
    * <dt>auth/unauthorized-domain</dt>
    * <dd>Thrown if the app domain is not authorized for OAuth operations for your
    *     Firebase project. Edit the list of authorized domains from the Firebase
    *     console.</dd>
    * </dl>
    *
    * @webonly
    *
    * @param provider The provider to authenticate.
    *     The provider has to be an OAuth provider. Non-OAuth providers like {@link
    *     firebase.auth.EmailAuthProvider} will throw an error.
    */
  def signInWithRedirect(provider: AuthProvider): js.Promise[Unit] = js.native
  
  /**
    * Signs out the current user.
    */
  def signOut(): js.Promise[Unit] = js.native
  
  /**
    * The current Auth instance's tenant ID. This is a readable/writable
    * property. When you set the tenant ID of an Auth instance, all future
    * sign-in/sign-up operations will pass this tenant ID and sign in or
    * sign up users to the specified tenant project.
    * When set to null, users are signed in to the parent project. By default,
    * this is set to null.
    *
    * @example
    * ```javascript
    * // Set the tenant ID on Auth instance.
    * firebase.auth().tenantId = ‘TENANT_PROJECT_ID’;
    *
    * // All future sign-in request now include tenant ID.
    * firebase.auth().signInWithEmailAndPassword(email, password)
    *   .then(function(result) {
    *     // result.user.tenantId should be ‘TENANT_PROJECT_ID’.
    *   }).catch(function(error) {
    *     // Handle error.
    *   });
    * ```
    */
  var tenantId: String | Null = js.native
  
  /**
    * Asynchronously sets the provided user as `currentUser` on the current Auth
    * instance. A new instance copy of the user provided will be made and set as
    * `currentUser`.
    *
    * This will trigger {@link firebase.auth.Auth.onAuthStateChanged} and
    * {@link firebase.auth.Auth.onIdTokenChanged} listeners like other sign in
    * methods.
    *
    * The operation fails with an error if the user to be updated belongs to a
    * different Firebase project.
    *
    * <h4>Error Codes</h4>
    * <dl>
    * <dt>auth/invalid-user-token</dt>
    * <dd>Thrown if the user to be updated belongs to a diffent Firebase
    *     project.</dd>
    * <dt>auth/user-token-expired</dt>
    * <dd>Thrown if the token of the user to be updated is expired.</dd>
    * <dt>auth/null-user</dt>
    * <dd>Thrown if the user to be updated is null.</dd>
    * <dt>auth/tenant-id-mismatch</dt>
    * <dd>Thrown if the provided user's tenant ID does not match the
    *     underlying Auth instance's configured tenant ID</dd>
    * </dl>
    */
  def updateCurrentUser(): js.Promise[Unit] = js.native
  def updateCurrentUser(user: User): js.Promise[Unit] = js.native
  
  /**
    * Sets the current language to the default device/browser preference.
    */
  def useDeviceLanguage(): Unit = js.native
  
  /**
    * Modify this Auth instance to communicate with the Firebase Auth emulator.  This must be
    * called synchronously immediately following the first call to `firebase.auth()`.  Do not use
    * with production credentials as emulator traffic is not encrypted.
    *
    * @param url The URL at which the emulator is running (eg, 'http://localhost:9099')
    */
  def useEmulator(url: String): Unit = js.native
  
  /**
    * Checks a password reset code sent to the user by email or other out-of-band
    * mechanism.
    *
    * Returns the user's email address if valid.
    *
    * <h4>Error Codes</h4>
    * <dl>
    * <dt>auth/expired-action-code</dt>
    * <dd>Thrown if the password reset code has expired.</dd>
    * <dt>auth/invalid-action-code</dt>
    * <dd>Thrown if the password reset code is invalid. This can happen if the code
    *     is malformed or has already been used.</dd>
    * <dt>auth/user-disabled</dt>
    * <dd>Thrown if the user corresponding to the given password reset code has
    *     been disabled.</dd>
    * <dt>auth/user-not-found</dt>
    * <dd>Thrown if there is no user corresponding to the password reset code. This
    *     may have happened if the user was deleted between when the code was
    *     issued and when this method was called.</dd>
    * </dl>
    *
    * @param code A verification code sent to the user.
    */
  def verifyPasswordResetCode(code: String): js.Promise[String] = js.native
}
object Auth {
  
  type Persistence = String
}
