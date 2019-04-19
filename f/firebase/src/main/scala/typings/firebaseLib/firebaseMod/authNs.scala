package typings
package firebaseLib.firebaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("firebase", "auth")
@js.native
object authNs extends js.Object {
  /**
    * A response from {@link firebase.auth.Auth.checkActionCode}.
    */
  trait ActionCodeInfo extends js.Object {
    /**
      * The data associated with the action code.
      *
      * For the PASSWORD_RESET, VERIFY_EMAIL, and RECOVER_EMAIL actions, this object
      * contains an `email` field with the address the email was sent to.
      *
      * For the RECOVER_EMAIL action, which allows a user to undo an email address
      * change, this object also contains a `fromEmail` field with the user account's
      * new email address. After the action completes, the user's email address will
      * revert to the value in the `email` field from the value in `fromEmail` field.
      */
    var data: firebaseLib.Anon_Email
    /**
      * The type of operation that generated the action code. This could be:
      * <ul>
      * <li>`PASSWORD_RESET`: password reset code generated via
      *     {@link firebase.auth.Auth.sendPasswordResetEmail}.</li>
      * <li>`VERIFY_EMAIL`: email verification code generated via
      *     {@link firebase.User.sendEmailVerification}.</li>
      * <li>`RECOVER_EMAIL`: email change revocation code generated via
      *     {@link firebase.User.updateEmail}.</li>
      * <li>`EMAIL_SIGNIN`: email sign in code generated via
      *     {@link firebase.auth.Auth.sendSignInLinkToEmail}.</li>
      * </ul>
      */
    var operation: java.lang.String
  }
  
  /**
    * This is the interface that defines the required continue/state URL with
    * optional Android and iOS bundle identifiers.
    * The action code setting fields are:
    * <ul>
    * <li><p>url: Sets the link continue/state URL, which has different meanings
    *     in different contexts:</p>
    *     <ul>
    *     <li>When the link is handled in the web action widgets, this is the deep
    *         link in the continueUrl query parameter.</li>
    *     <li>When the link is handled in the app directly, this is the continueUrl
    *         query parameter in the deep link of the Dynamic Link.</li>
    *     </ul>
    *     </li>
    * <li>iOS: Sets the iOS bundle ID. This will try to open the link in an iOS app
    *     if it is installed.</li>
    * <li>android: Sets the Android package name. This will try to open the link in
    *     an android app if it is installed. If installApp is passed, it specifies
    *     whether to install the Android app if the device supports it and the app
    *     is not already installed. If this field is provided without a
    *     packageName, an error is thrown explaining that the packageName must be
    *     provided in conjunction with this field.
    *     If minimumVersion is specified, and an older version of the app is
    *     installed, the user is taken to the Play Store to upgrade the app.</li>
    * <li>handleCodeInApp: The default is false. When set to true, the action code
    *     link will be be sent as a Universal Link or Android App Link and will be
    *     opened by the app if installed. In the false case, the code will be sent
    *     to the web widget first and then on continue will redirect to the app if
    *     installed.</li>
    * </ul>
    */
  trait ActionCodeSettings extends js.Object {
    var android: js.UndefOr[firebaseLib.Anon_InstallApp] = js.undefined
    var dynamicLinkDomain: js.UndefOr[java.lang.String] = js.undefined
    var handleCodeInApp: js.UndefOr[scala.Boolean] = js.undefined
    var iOS: js.UndefOr[firebaseLib.Anon_BundleId] = js.undefined
    var url: java.lang.String
  }
  
  /**
    * A structure containing additional user information from a federated identity
    * provider.
    */
  trait AdditionalUserInfo extends js.Object {
    var isNewUser: scala.Boolean
    var profile: js.Object | scala.Null
    var providerId: java.lang.String
    var username: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  }
  
  /**
    * A verifier for domain verification and abuse prevention. Currently, the
    * only implementation is {@link firebase.auth.RecaptchaVerifier}.
    */
  trait ApplicationVerifier extends js.Object {
    /**
      * Identifies the type of application verifier (e.g. "recaptcha").
      */
    var `type`: java.lang.String
    /**
      * Executes the verification process.
      * @return A Promise for a token that can be used to
      *     assert the validity of a request.
      */
    def verify(): js.Promise[java.lang.String]
  }
  
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
  trait Auth extends js.Object {
    /**
      * The {@link firebase.app.App app} associated with the `Auth` service
      * instance.
      *
      * @example
      * ```javascript
      * var app = auth.app;
      * ```
      */
    var app: firebaseLib.firebaseMod.appNs.App = js.native
    /**
      * The currently signed-in user (or null).
      */
    var currentUser: firebaseLib.firebaseMod.User | scala.Null = js.native
    /**
      * The current Auth instance's language code. This is a readable/writable
      * property. When set to null, the default Firebase Console language setting
      * is applied. The language code will propagate to email action templates
      * (password reset, email verification and email change revocation), SMS
      * templates for phone authentication, reCAPTCHA verifier and OAuth
      * popup/redirect operations provided the specified providers support
      * localization with the language code specified.
      */
    var languageCode: java.lang.String | scala.Null = js.native
    /**
      * The current Auth instance's settings. This is used to edit/read configuration
      * related options like app verification mode for phone authentication.
      */
    var settings: AuthSettings = js.native
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
    def applyActionCode(code: java.lang.String): js.Promise[scala.Unit] = js.native
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
    def checkActionCode(code: java.lang.String): js.Promise[ActionCodeInfo] = js.native
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
    def confirmPasswordReset(code: java.lang.String, newPassword: java.lang.String): js.Promise[scala.Unit] = js.native
    /**
      * Creates a new user account associated with the specified email address and
      * password and returns any additional user info data or credentials.
      *
      * This method is deprecated. Use
      * {@link firebase.auth.Auth.createUserWithEmailAndPassword} instead.
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
      * firebase.auth().createUserAndRetrieveDataWithEmailAndPassword(email, password)
      *     .catch(function(error) {
      *       // Handle Errors here.
      *       var errorCode = error.code;
      *       var errorMessage = error.message;
      *       if (errorCode == 'auth/weak-password') {
      *         alert('The password is too weak.');
      *       } else {
      *         alert(errorMessage);
      *       }
      *       console.log(error);
      *     });
      * ```
      * @param email The user's email address.
      * @param password The user's chosen password.
      */
    def createUserAndRetrieveDataWithEmailAndPassword(email: java.lang.String, password: java.lang.String): js.Promise[UserCredential] = js.native
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
    def createUserWithEmailAndPassword(email: java.lang.String, password: java.lang.String): js.Promise[UserCredential] = js.native
    /**
      * Gets the list of provider IDs that can be used to sign in for the given email
      * address. Useful for an "identifier-first" sign-in flow.
      *
      * This method is deprecated. Use
      * {@link firebase.auth.Auth.fetchSignInMethodsForEmail} instead.
      *
      * <h4>Error Codes</h4>
      * <dl>
      * <dt>auth/invalid-email</dt>
      * <dd>Thrown if the email address is not valid.</dd>
      * </dl>
      */
    def fetchProvidersForEmail(email: java.lang.String): js.Promise[js.Array[java.lang.String]] = js.native
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
    def fetchSignInMethodsForEmail(email: java.lang.String): js.Promise[js.Array[java.lang.String]] = js.native
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
      *     {@link firebase.auth.Auth.fetchProvidersForEmail} with the error.email
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
      *     {@link firebase.auth.Auth.fetchProvidersForEmail}, sign in to
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
      *     auth.fetchProvidersForEmail(email).then(function(providers) {
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
    def isSignInWithEmailLink(emailLink: java.lang.String): scala.Boolean = js.native
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
    def onAuthStateChanged(nextOrObserver: firebaseLib.firebaseMod.Observer[_, stdLib.Error]): firebaseLib.firebaseMod.Unsubscribe = js.native
    def onAuthStateChanged(
      nextOrObserver: firebaseLib.firebaseMod.Observer[_, stdLib.Error],
      error: js.Function1[/* a */ Error, _]
    ): firebaseLib.firebaseMod.Unsubscribe = js.native
    def onAuthStateChanged(
      nextOrObserver: firebaseLib.firebaseMod.Observer[_, stdLib.Error],
      error: js.Function1[/* a */ Error, _],
      completed: firebaseLib.firebaseMod.Unsubscribe
    ): firebaseLib.firebaseMod.Unsubscribe = js.native
    def onAuthStateChanged(nextOrObserver: js.Function1[/* a */ firebaseLib.firebaseMod.User | scala.Null, _]): firebaseLib.firebaseMod.Unsubscribe = js.native
    def onAuthStateChanged(
      nextOrObserver: js.Function1[/* a */ firebaseLib.firebaseMod.User | scala.Null, _],
      error: js.Function1[/* a */ Error, _]
    ): firebaseLib.firebaseMod.Unsubscribe = js.native
    def onAuthStateChanged(
      nextOrObserver: js.Function1[/* a */ firebaseLib.firebaseMod.User | scala.Null, _],
      error: js.Function1[/* a */ Error, _],
      completed: firebaseLib.firebaseMod.Unsubscribe
    ): firebaseLib.firebaseMod.Unsubscribe = js.native
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
    def onIdTokenChanged(nextOrObserver: firebaseLib.firebaseMod.Observer[_, stdLib.Error]): firebaseLib.firebaseMod.Unsubscribe = js.native
    def onIdTokenChanged(
      nextOrObserver: firebaseLib.firebaseMod.Observer[_, stdLib.Error],
      error: js.Function1[/* a */ Error, _]
    ): firebaseLib.firebaseMod.Unsubscribe = js.native
    def onIdTokenChanged(
      nextOrObserver: firebaseLib.firebaseMod.Observer[_, stdLib.Error],
      error: js.Function1[/* a */ Error, _],
      completed: firebaseLib.firebaseMod.Unsubscribe
    ): firebaseLib.firebaseMod.Unsubscribe = js.native
    def onIdTokenChanged(nextOrObserver: js.Function1[/* a */ firebaseLib.firebaseMod.User | scala.Null, _]): firebaseLib.firebaseMod.Unsubscribe = js.native
    def onIdTokenChanged(
      nextOrObserver: js.Function1[/* a */ firebaseLib.firebaseMod.User | scala.Null, _],
      error: js.Function1[/* a */ Error, _]
    ): firebaseLib.firebaseMod.Unsubscribe = js.native
    def onIdTokenChanged(
      nextOrObserver: js.Function1[/* a */ firebaseLib.firebaseMod.User | scala.Null, _],
      error: js.Function1[/* a */ Error, _],
      completed: firebaseLib.firebaseMod.Unsubscribe
    ): firebaseLib.firebaseMod.Unsubscribe = js.native
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
    def sendPasswordResetEmail(email: java.lang.String): js.Promise[scala.Unit] = js.native
    def sendPasswordResetEmail(email: java.lang.String, actionCodeSettings: ActionCodeSettings): js.Promise[scala.Unit] = js.native
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
    def sendSignInLinkToEmail(email: java.lang.String, actionCodeSettings: ActionCodeSettings): js.Promise[scala.Unit] = js.native
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
    def setPersistence(persistence: firebaseLib.firebaseMod.authNs.AuthNs.Persistence): js.Promise[scala.Unit] = js.native
    /**
      * Asynchronously signs in with the given credentials, and returns any available
      * additional user information, such as user name.
      *
      * <h4>Error Codes</h4>
      * <dl>
      * <dt>auth/account-exists-with-different-credential</dt>
      * <dd>Thrown if there already exists an account with the email address
      *     asserted by the credential. Resolve this by calling
      *     {@link firebase.auth.Auth.fetchProvidersForEmail} and then asking the
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
      * firebase.auth().signInAndRetrieveDataWithCredential(credential)
      *     .then(function(userCredential) {
      *       console.log(userCredential.additionalUserInfo.username);
      *     });
      * ```
      * @param credential The auth credential.
      */
    def signInAndRetrieveDataWithCredential(credential: AuthCredential): js.Promise[UserCredential] = js.native
    /**
      * Signs in a user asynchronously using a custom token and returns any
      * additional user info data or credentials.
      *
      * This method is deprecated. Use
      * {@link firebase.auth.Auth.signInWithCustomToken} instead.
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
      * firebase.auth().signInAndRetrieveDataWithCustomToken(token)
      *     .catch(function(error) {
      *       // Handle Errors here.
      *       var errorCode = error.code;
      *       var errorMessage = error.message;
      *       if (errorCode === 'auth/invalid-custom-token') {
      *         alert('The token you provided is not valid.');
      *       } else {
      *         console.error(error);
      *       }
      *     });
      * ```
      *
      * @param token The custom token to sign in with.
      */
    def signInAndRetrieveDataWithCustomToken(token: java.lang.String): js.Promise[UserCredential] = js.native
    /**
      * Asynchronously signs in using an email and password and returns any additional
      * user info data or credentials.
      *
      * This method is deprecated. Use
      * {@link firebase.auth.Auth.signInWithEmailAndPassword} instead.
      *
      * Fails with an error if the email address and password do not match.
      *
      * Note: The user's password is NOT the password used to access the user's email
      * account. The email address serves as a unique identifier for the user, and
      * the password is used to access the user's account in your Firebase project.
      *
      * See also:
      * {@link firebase.auth.Auth.createUserAndRetrieveDataWithEmailAndPassword}.
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
      * firebase.auth().signInAndRetrieveDataWithEmailAndPassword(email, password)
      *     .catch(function(error) {
      *       // Handle Errors here.
      *       var errorCode = error.code;
      *       var errorMessage = error.message;
      *       if (errorCode === 'auth/wrong-password') {
      *         alert('Wrong password.');
      *       } else {
      *         alert(errorMessage);
      *       }
      *       console.log(error);
      *     });
      * ```
      *
      * @param email The users email address.
      * @param password The users password.
      */
    def signInAndRetrieveDataWithEmailAndPassword(email: java.lang.String, password: java.lang.String): js.Promise[UserCredential] = js.native
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
      * Signs in a user anonymously and returns any additional user info data or
      * credentials.
      *
      * This method is deprecated. Use
      * {@link firebase.auth.Auth.signInAnonymously} instead.
      *
      * If there is already an anonymous user signed in, that user with
      * additional date will be returned; otherwise, a new anonymous user
      * identity will be created and returned.
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
      * firebase.auth().signInAnonymouslyAndRetrieveData().catch(function(error) {
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
    def signInAnonymouslyAndRetrieveData(): js.Promise[UserCredential] = js.native
    /**
      * Asynchronously signs in with the given credentials.
      *
      * This method is deprecated. Use
      * {@link firebase.auth.Auth.signInAndRetrieveDataWithCredential} instead.
      *
      * <h4>Error Codes</h4>
      * <dl>
      * <dt>auth/account-exists-with-different-credential</dt>
      * <dd>Thrown if there already exists an account with the email address
      *     asserted by the credential. Resolve this by calling
      *     {@link firebase.auth.Auth.fetchProvidersForEmail} and then asking the
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
    def signInWithCredential(credential: AuthCredential): js.Promise[firebaseLib.firebaseMod.User] = js.native
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
    def signInWithCustomToken(token: java.lang.String): js.Promise[UserCredential] = js.native
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
    def signInWithEmailAndPassword(email: java.lang.String, password: java.lang.String): js.Promise[UserCredential] = js.native
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
    def signInWithEmailLink(email: java.lang.String): js.Promise[UserCredential] = js.native
    def signInWithEmailLink(email: java.lang.String, emailLink: java.lang.String): js.Promise[UserCredential] = js.native
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
    def signInWithPhoneNumber(phoneNumber: java.lang.String, applicationVerifier: ApplicationVerifier): js.Promise[ConfirmationResult] = js.native
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
      *     {@link firebase.auth.Auth.fetchProvidersForEmail} with the error.email
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
      *     auth.fetchProvidersForEmail(email).then(function(providers) {
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
    def signInWithRedirect(provider: AuthProvider): js.Promise[scala.Unit] = js.native
    /**
      * Signs out the current user.
      */
    def signOut(): js.Promise[scala.Unit] = js.native
    def updateCurrentUser(): js.Promise[scala.Unit] = js.native
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
      * </dl>
      */
    def updateCurrentUser(user: firebaseLib.firebaseMod.User): js.Promise[scala.Unit] = js.native
    /**
      * Sets the current language to the default device/browser preference.
      */
    def useDeviceLanguage(): scala.Unit = js.native
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
    def verifyPasswordResetCode(code: java.lang.String): js.Promise[java.lang.String] = js.native
  }
  
  /**
    * Interface that represents the credentials returned by an auth provider.
    * Implementations specify the details about each auth provider's credential
    * requirements.
    *
    */
  @js.native
  abstract class AuthCredential () extends js.Object {
    /**
      * The authentication provider ID for the credential.
      * For example, 'facebook.com', or 'google.com'.
      */
    var providerId: java.lang.String = js.native
    /**
      * The authentication sign in method for the credential.
      * For example, 'password', or 'emailLink. This corresponds to the sign-in
      * method identifier as returned in
      * {@link firebase.auth.Auth.fetchSignInMethodsForEmail}.
      */
    var signInMethod: java.lang.String = js.native
    /**
      * Returns a JSON-serializable representation of this object.
      */
    def toJSON(): js.Object = js.native
  }
  
  /**
    * Interface that represents an auth provider.
    */
  trait AuthProvider extends js.Object {
    var providerId: java.lang.String
  }
  
  /**
    * Interface representing an Auth instance's settings, currently used for
    * enabling/disabling app verification for phone Auth testing.
    */
  trait AuthSettings extends js.Object {
    /**
      * When set, this property disables app verification for the purpose of testing
      * phone authentication. For this property to take effect, it needs to be set
      * before rendering a reCAPTCHA app verifier. When this is disabled, a
      * mock reCAPTCHA is rendered instead. This is useful for manual testing during
      * development or for automated integration tests.
      *
      * In order to use this feature, you will need to
      * {@link https://firebase.google.com/docs/auth/web/phone-auth#test-with-whitelisted-phone-numbers
      * whitelist your phone number} via the
      * Firebase Console.
      *
      * The default value is false (app verification is enabled).
      */
    var appVerificationDisabledForTesting: scala.Boolean
  }
  
  /**
    * A result from a phone number sign-in, link, or reauthenticate call.
    */
  trait ConfirmationResult extends js.Object {
    /**
      * The phone number authentication operation's verification ID. This can be used
      * along with the verification code to initialize a phone auth credential.
      */
    var verificationId: java.lang.String
    /**
      * Finishes a phone number sign-in, link, or reauthentication, given the code
      * that was sent to the user's mobile device.
      *
      * <h4>Error Codes</h4>
      * <dl>
      * <dt>auth/invalid-verification-code</dt>
      * <dd>Thrown if the verification code is not valid.</dd>
      * <dt>auth/missing-verification-code</dt>
      * <dd>Thrown if the verification code is missing.</dd>
      * </dl>
      */
    def confirm(verificationCode: java.lang.String): js.Promise[UserCredential]
  }
  
  /**
    * Email and password auth provider implementation.
    *
    * To authenticate: {@link firebase.auth.Auth.createUserWithEmailAndPassword}
    * and {@link firebase.auth.Auth.signInWithEmailAndPassword}.
    */
  @js.native
  class EmailAuthProvider () extends EmailAuthProvider_Instance
  
  /**
    * @hidden
    */
  @js.native
  class EmailAuthProvider_Instance () extends AuthProvider {
    /* CompleteClass */
    override var providerId: java.lang.String = js.native
  }
  
  /**
    * An authentication error.
    * For method-specific error codes, refer to the specific methods in the
    * documentation. For common error codes, check the reference below. Use {@link
    * firebase.auth.Error#code} to get the specific error code. For a detailed
    * message, use {@link firebase.auth.Error.message}.
    * Errors with the code <strong>auth/account-exists-with-different-credential
    * </strong> will have the additional fields <strong>email</strong> and <strong>
    * credential</strong> which are needed to provide a way to resolve these
    * specific errors. Refer to {@link firebase.auth.Auth.signInWithPopup} for more
    * information.
    *
    * <h4>Common Error Codes</h4>
    * <dl>
    * <dt>auth/app-deleted</dt>
    * <dd>Thrown if the instance of FirebaseApp has been deleted.</dd>
    * <dt>auth/app-not-authorized</dt>
    * <dd>Thrown if the app identified by the domain where it's hosted, is not
    *     authorized to use Firebase Authentication with the provided API key.
    *     Review your key configuration in the Google API console.</dd>
    * <dt>auth/argument-error</dt>
    * <dd>Thrown if a method is called with incorrect arguments.</dd>
    * <dt>auth/invalid-api-key</dt>
    * <dd>Thrown if the provided API key is invalid. Please check that you have
    *     copied it correctly from the Firebase Console.</dd>
    * <dt>auth/invalid-user-token</dt>
    * <dd>Thrown if the user's credential is no longer valid. The user must sign in
    *     again.</dd>
    * <dt>auth/network-request-failed</dt>
    * <dd>Thrown if a network error (such as timeout, interrupted connection or
    *     unreachable host) has occurred.</dd>
    * <dt>auth/operation-not-allowed</dt>
    * <dd>Thrown if you have not enabled the provider in the Firebase Console. Go
    *     to the Firebase Console for your project, in the Auth section and the
    *     <strong>Sign in Method</strong> tab and configure the provider.</dd>
    * <dt>auth/requires-recent-login</dt>
    * <dd>Thrown if the user's last sign-in time does not meet the security
    *     threshold. Use {@link firebase.User.reauthenticateWithCredential} to
    *     resolve. This does not apply if the user is anonymous.</dd>
    * <dt>auth/too-many-requests</dt>
    * <dd>Thrown if requests are blocked from a device due to unusual activity.
    *     Trying again after some delay would unblock.</dd>
    * <dt>auth/unauthorized-domain</dt>
    * <dd>Thrown if the app domain is not authorized for OAuth operations for your
    *     Firebase project. Edit the list of authorized domains from the Firebase
    *     console.</dd>
    * <dt>auth/user-disabled</dt>
    * <dd>Thrown if the user account has been disabled by an administrator.
    *     Accounts can be enabled or disabled in the Firebase Console, the Auth
    *     section and Users subsection.</dd>
    * <dt>auth/user-token-expired</dt>
    * <dd>Thrown if the user's credential has expired. This could also be thrown if
    *     a user has been deleted. Prompting the user to sign in again should
    *     resolve this for either case.</dd>
    * <dt>auth/web-storage-unsupported</dt>
    * <dd>Thrown if the browser does not support web storage or if the user
    *     disables them.</dd>
    * </dl>
    */
  trait Error extends js.Object {
    /**
      * Unique error code.
      */
    var code: java.lang.String
    /**
      * Complete error message.
      */
    var message: java.lang.String
  }
  
  /**
    * Facebook auth provider.
    *
    * @example
    * ```javascript
    * // Sign in using a redirect.
    * firebase.auth().getRedirectResult().then(function(result) {
    *   if (result.credential) {
    *     // This gives you a Google Access Token.
    *     var token = result.credential.accessToken;
    *   }
    *   var user = result.user;
    * })
    * // Start a sign in process for an unauthenticated user.
    * var provider = new firebase.auth.FacebookAuthProvider();
    * provider.addScope('user_birthday');
    * firebase.auth().signInWithRedirect(provider);
    * ```
    *
    * @example
    * ```javascript
    * // Sign in using a popup.
    * var provider = new firebase.auth.FacebookAuthProvider();
    * provider.addScope('user_birthday');
    * firebase.auth().signInWithPopup(provider).then(function(result) {
    *   // This gives you a Facebook Access Token.
    *   var token = result.credential.accessToken;
    *   // The signed-in user info.
    *   var user = result.user;
    * });
    * ```
    *
    * @see {@link firebase.auth.Auth.onAuthStateChanged} to receive sign in state
    * changes.
    */
  @js.native
  class FacebookAuthProvider () extends FacebookAuthProvider_Instance
  
  /**
    * @hidden
    */
  @js.native
  class FacebookAuthProvider_Instance () extends AuthProvider {
    /* CompleteClass */
    override var providerId: java.lang.String = js.native
    /**
      * @param scope Facebook OAuth scope.
      * @return The provider instance itself.
      */
    def addScope(scope: java.lang.String): AuthProvider = js.native
    /**
      * Sets the OAuth custom parameters to pass in a Facebook OAuth request for
      * popup and redirect sign-in operations.
      * Valid parameters include 'auth_type', 'display' and 'locale'.
      * For a detailed list, check the
      * {@link https://goo.gl/pve4fo Facebook}
      * documentation.
      * Reserved required OAuth 2.0 parameters such as 'client_id', 'redirect_uri',
      * 'scope', 'response_type' and 'state' are not allowed and will be ignored.
      * @param customOAuthParameters The custom OAuth parameters to pass
      *     in the OAuth request.
      * @return The provider instance itself.
      */
    def setCustomParameters(customOAuthParameters: js.Object): AuthProvider = js.native
  }
  
  /**
    * GitHub auth provider.
    *
    * GitHub requires an OAuth 2.0 redirect, so you can either handle the redirect
    * directly, or use the signInWithPopup handler:
    *
    * @example
    * ```javascript
    * // Using a redirect.
    * firebase.auth().getRedirectResult().then(function(result) {
    *   if (result.credential) {
    *     // This gives you a GitHub Access Token.
    *     var token = result.credential.accessToken;
    *   }
    *   var user = result.user;
    * }).catch(function(error) {
    *   // Handle Errors here.
    *   var errorCode = error.code;
    *   var errorMessage = error.message;
    *   // The email of the user's account used.
    *   var email = error.email;
    *   // The firebase.auth.AuthCredential type that was used.
    *   var credential = error.credential;
    *   if (errorCode === 'auth/account-exists-with-different-credential') {
    *     alert('You have signed up with a different provider for that email.');
    *     // Handle linking here if your app allows it.
    *   } else {
    *     console.error(error);
    *   }
    * });
    *
    * // Start a sign in process for an unauthenticated user.
    * var provider = new firebase.auth.GithubAuthProvider();
    * provider.addScope('repo');
    * firebase.auth().signInWithRedirect(provider);
    * ```
    *
    * @example
    * ```javascript
    * // With popup.
    * var provider = new firebase.auth.GithubAuthProvider();
    *  provider.addScope('repo');
    *  firebase.auth().signInWithPopup(provider).then(function(result) {
    *    // This gives you a GitHub Access Token.
    *    var token = result.credential.accessToken;
    *    // The signed-in user info.
    *    var user = result.user;
    *  }).catch(function(error) {
    *    // Handle Errors here.
    *    var errorCode = error.code;
    *    var errorMessage = error.message;
    *    // The email of the user's account used.
    *    var email = error.email;
    *    // The firebase.auth.AuthCredential type that was used.
    *    var credential = error.credential;
    *    if (errorCode === 'auth/account-exists-with-different-credential') {
    *      alert('You have signed up with a different provider for that email.');
    *      // Handle linking here if your app allows it.
    *    } else {
    *      console.error(error);
    *    }
    *  });
    * ```
    *
    * @see {@link firebase.auth.Auth.onAuthStateChanged} to receive sign in state
    * changes.
    */
  @js.native
  class GithubAuthProvider () extends GithubAuthProvider_Instance
  
  /**
    * @hidden
    */
  @js.native
  class GithubAuthProvider_Instance () extends AuthProvider {
    /* CompleteClass */
    override var providerId: java.lang.String = js.native
    /**
      * @param scope Github OAuth scope.
      * @return The provider instance itself.
      */
    def addScope(scope: java.lang.String): AuthProvider = js.native
    /**
      * Sets the OAuth custom parameters to pass in a GitHub OAuth request for popup
      * and redirect sign-in operations.
      * Valid parameters include 'allow_signup'.
      * For a detailed list, check the
      * {@link https://developer.github.com/v3/oauth/ GitHub} documentation.
      * Reserved required OAuth 2.0 parameters such as 'client_id', 'redirect_uri',
      * 'scope', 'response_type' and 'state' are not allowed and will be ignored.
      * @param customOAuthParameters The custom OAuth parameters to pass
      *     in the OAuth request.
      * @return The provider instance itself.
      */
    def setCustomParameters(customOAuthParameters: js.Object): AuthProvider = js.native
  }
  
  /**
    * Google auth provider.
    *
    * @example
    * ```javascript
    * // Using a redirect.
    * firebase.auth().getRedirectResult().then(function(result) {
    *   if (result.credential) {
    *     // This gives you a Google Access Token.
    *     var token = result.credential.accessToken;
    *   }
    *   var user = result.user;
    * });
    *
    * // Start a sign in process for an unauthenticated user.
    * var provider = new firebase.auth.GoogleAuthProvider();
    * provider.addScope('profile');
    * provider.addScope('email');
    * firebase.auth().signInWithRedirect(provider);
    * ```
    *
    * @example
    * ```javascript
    * // Using a popup.
    * var provider = new firebase.auth.GoogleAuthProvider();
    * provider.addScope('profile');
    * provider.addScope('email');
    * firebase.auth().signInWithPopup(provider).then(function(result) {
    *  // This gives you a Google Access Token.
    *  var token = result.credential.accessToken;
    *  // The signed-in user info.
    *  var user = result.user;
    * });
    * ```
    *
    * @see {@link firebase.auth.Auth.onAuthStateChanged} to receive sign in state
    * changes.
    */
  @js.native
  class GoogleAuthProvider () extends GoogleAuthProvider_Instance
  
  /**
    * @hidden
    */
  @js.native
  class GoogleAuthProvider_Instance () extends AuthProvider {
    /* CompleteClass */
    override var providerId: java.lang.String = js.native
    /**
      * @param scope Google OAuth scope.
      * @return The provider instance itself.
      */
    def addScope(scope: java.lang.String): AuthProvider = js.native
    /**
      * Sets the OAuth custom parameters to pass in a Google OAuth request for popup
      * and redirect sign-in operations.
      * Valid parameters include 'hd', 'hl', 'include_granted_scopes', 'login_hint'
      * and 'prompt'.
      * For a detailed list, check the
      * {@link https://goo.gl/Xo01Jm Google}
      * documentation.
      * Reserved required OAuth 2.0 parameters such as 'client_id', 'redirect_uri',
      * 'scope', 'response_type' and 'state' are not allowed and will be ignored.
      * @param customOAuthParameters The custom OAuth parameters to pass
      *     in the OAuth request.
      * @return The provider instance itself.
      */
    def setCustomParameters(customOAuthParameters: js.Object): AuthProvider = js.native
  }
  
  /**
    * Interface representing ID token result obtained from
    * {@link firebase.User.getIdTokenResult}. It contains the ID token JWT string
    * and other helper properties for getting different data associated with the
    * token as well as all the decoded payload claims.
    *
    * Note that these claims are not to be trusted as they are parsed client side.
    * Only server side verification can guarantee the integrity of the token
    * claims.
    */
  trait IdTokenResult extends js.Object {
    /**
      * The authentication time formatted as a UTC string. This is the time the
      * user authenticated (signed in) and not the time the token was refreshed.
      */
    var authTime: java.lang.String
    /**
      * The entire payload claims of the ID token including the standard reserved
      * claims as well as the custom claims.
      */
    var claims: org.scalablytyped.runtime.StringDictionary[js.Any]
    /**
      * The ID token expiration time formatted as a UTC string.
      */
    var expirationTime: java.lang.String
    /**
      * The ID token issued at time formatted as a UTC string.
      */
    var issuedAtTime: java.lang.String
    /**
      * The sign-in provider through which the ID token was obtained (anonymous,
      * custom, phone, password, etc). Note, this does not map to provider IDs.
      */
    var signInProvider: java.lang.String | scala.Null
    /**
      * The Firebase Auth ID token JWT string.
      */
    var token: java.lang.String
  }
  
  /**
    * Interface that represents the OAuth credentials returned by an OAuth
    * provider. Implementations specify the details about each auth provider's
    * credential requirements.
    *
    */
  @js.native
  class OAuthCredential protected () extends AuthCredential {
    /**
      * The OAuth access token associated with the credential if it belongs to
      * an OAuth provider, such as `facebook.com`, `twitter.com`, etc.
      */
    var accessToken: js.UndefOr[java.lang.String] = js.native
    /**
      * The OAuth ID token associated with the credential if it belongs to an
      * OIDC provider, such as `google.com`.
      */
    var idToken: js.UndefOr[java.lang.String] = js.native
    /**
      * The OAuth access token secret associated with the credential if it
      * belongs to an OAuth 1.0 provider, such as `twitter.com`.
      */
    var secret: js.UndefOr[java.lang.String] = js.native
  }
  
  /**
    * Generic OAuth provider.
    *
    * @example
    * ```javascript
    * // Using a redirect.
    * firebase.auth().getRedirectResult().then(function(result) {
    *   if (result.credential) {
    *     // This gives you the OAuth Access Token for that provider.
    *     var token = result.credential.accessToken;
    *   }
    *   var user = result.user;
    * });
    *
    * // Start a sign in process for an unauthenticated user.
    * var provider = new firebase.auth.OAuthProvider('google.com');
    * provider.addScope('profile');
    * provider.addScope('email');
    * firebase.auth().signInWithRedirect(provider);
    * ```
    * @example
    * ```javascript
    * // Using a popup.
    * var provider = new firebase.auth.OAuthProvider('google.com');
    * provider.addScope('profile');
    * provider.addScope('email');
    * firebase.auth().signInWithPopup(provider).then(function(result) {
    *  // This gives you the OAuth Access Token for that provider.
    *  var token = result.credential.accessToken;
    *  // The signed-in user info.
    *  var user = result.user;
    * });
    * ```
    *
    * @see {@link firebase.auth.Auth.onAuthStateChanged} to receive sign in state
    * changes.
    * @param providerId The associated provider ID, such as `github.com`.
    */
  @js.native
  class OAuthProvider protected () extends AuthProvider {
    def this(providerId: java.lang.String) = this()
    /* CompleteClass */
    override var providerId: java.lang.String = js.native
    /**
      * @param scope Provider OAuth scope to add.
      */
    def addScope(scope: java.lang.String): AuthProvider = js.native
    /**
      * Creates a Firebase credential from a generic OAuth provider's access token or
      * ID token.
      *
      * @example
      * ```javascript
      * // `googleUser` from the onsuccess Google Sign In callback.
      * // Initialize a generate OAuth provider with a `google.com` providerId.
      * var provider = new firebase.auth.OAuthProvider('google.com');
      * var credential = provider.credential(
      *     googleUser.getAuthResponse().id_token);
      * firebase.auth().signInWithCredential(credential)
      * ```
      *
      * @param idToken The OAuth ID token if OIDC compliant.
      * @param accessToken The OAuth access token.
      */
    def credential(): OAuthCredential = js.native
    def credential(idToken: java.lang.String): OAuthCredential = js.native
    def credential(idToken: java.lang.String, accessToken: java.lang.String): OAuthCredential = js.native
    /**
      * Sets the OAuth custom parameters to pass in an OAuth request for popup
      * and redirect sign-in operations.
      * For a detailed list, check the
      * reserved required OAuth 2.0 parameters such as `client_id`, `redirect_uri`,
      * `scope`, `response_type` and `state` are not allowed and will be ignored.
      * @param customOAuthParameters The custom OAuth parameters to pass
      *     in the OAuth request.
      */
    def setCustomParameters(customOAuthParameters: js.Object): AuthProvider = js.native
  }
  
  /**
    * Phone number auth provider.
    *
    * @example
    * ```javascript
    * // 'recaptcha-container' is the ID of an element in the DOM.
    * var applicationVerifier = new firebase.auth.RecaptchaVerifier(
    *     'recaptcha-container');
    * var provider = new firebase.auth.PhoneAuthProvider();
    * provider.verifyPhoneNumber('+16505550101', applicationVerifier)
    *     .then(function(verificationId) {
    *       var verificationCode = window.prompt('Please enter the verification ' +
    *           'code that was sent to your mobile device.');
    *       return firebase.auth.PhoneAuthProvider.credential(verificationId,
    *           verificationCode);
    *     })
    *     .then(function(phoneCredential) {
    *       return firebase.auth().signInWithCredential(phoneCredential);
    *     });
    * ```
    * @param auth The Firebase Auth instance in which
    *     sign-ins should occur. Uses the default Auth instance if unspecified.
    */
  @js.native
  class PhoneAuthProvider () extends PhoneAuthProvider_Instance
  
  /**
    * @hidden
    */
  @js.native
  class PhoneAuthProvider_Instance () extends AuthProvider {
    def this(auth: Auth) = this()
    /* CompleteClass */
    override var providerId: java.lang.String = js.native
    /**
      * Starts a phone number authentication flow by sending a verification code to
      * the given phone number. Returns an ID that can be passed to
      * {@link firebase.auth.PhoneAuthProvider.credential} to identify this flow.
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
      * </dl>
      *
      * @param phoneNumber The user's phone number in E.164 format (e.g.
      *     +16505550101).
      * @param applicationVerifier
      * @return A Promise for the verification ID.
      */
    def verifyPhoneNumber(phoneNumber: java.lang.String, applicationVerifier: ApplicationVerifier): js.Promise[java.lang.String] = js.native
  }
  
  /**
    * An {@link https://www.google.com/recaptcha/ reCAPTCHA}-based application
    * verifier.
    *
    * @webonly
    *
    * @param container The reCAPTCHA container parameter. This
    *     has different meaning depending on whether the reCAPTCHA is hidden or
    *     visible. For a visible reCAPTCHA the container must be empty. If a string
    *     is used, it has to correspond to an element ID. The corresponding element
    *     must also must be in the DOM at the time of initialization.
    * @param parameters The optional reCAPTCHA parameters. Check the
    *     reCAPTCHA docs for a comprehensive list. All parameters are accepted
    *     except for the sitekey. Firebase Auth backend provisions a reCAPTCHA for
    *     each project and will configure this upon rendering. For an invisible
    *     reCAPTCHA, a size key must have the value 'invisible'.
    * @param app The corresponding Firebase app. If none is
    *     provided, the default Firebase App instance is used. A Firebase App
    *     instance must be initialized with an API key, otherwise an error will be
    *     thrown.
    */
  @js.native
  class RecaptchaVerifier () extends RecaptchaVerifier_Instance
  
  /**
    * @webonly
    * @hidden
    */
  @js.native
  class RecaptchaVerifier_Instance protected () extends ApplicationVerifier {
    def this(container: java.lang.String) = this()
    def this(container: js.Any) = this()
    def this(container: java.lang.String, parameters: js.Object) = this()
    def this(container: js.Any, parameters: js.Object) = this()
    def this(container: java.lang.String, parameters: js.Object, app: firebaseLib.firebaseMod.appNs.App) = this()
    def this(container: java.lang.String, parameters: scala.Null, app: firebaseLib.firebaseMod.appNs.App) = this()
    def this(container: js.Any, parameters: js.Object, app: firebaseLib.firebaseMod.appNs.App) = this()
    def this(container: js.Any, parameters: scala.Null, app: firebaseLib.firebaseMod.appNs.App) = this()
    /**
      * Identifies the type of application verifier (e.g. "recaptcha").
      */
    /* CompleteClass */
    override var `type`: java.lang.String = js.native
    /**
      * Clears the reCAPTCHA widget from the page and destroys the current instance.
      */
    def clear(): scala.Unit = js.native
    /**
      * Renders the reCAPTCHA widget on the page.
      * @return A Promise that resolves with the
      *     reCAPTCHA widget ID.
      */
    def render(): js.Promise[scala.Double] = js.native
    /**
      * Executes the verification process.
      * @return A Promise for a token that can be used to
      *     assert the validity of a request.
      */
    /* CompleteClass */
    override def verify(): js.Promise[java.lang.String] = js.native
  }
  
  @js.native
  class SAMLAuthProvider () extends AuthProvider {
    /* CompleteClass */
    override var providerId: java.lang.String = js.native
  }
  
  /**
    * Twitter auth provider.
    *
    * @example
    * ```javascript
    * // Using a redirect.
    * firebase.auth().getRedirectResult().then(function(result) {
    *   if (result.credential) {
    *     // For accessing the Twitter API.
    *     var token = result.credential.accessToken;
    *     var secret = result.credential.secret;
    *   }
    *   var user = result.user;
    * });
    *
    * // Start a sign in process for an unauthenticated user.
    * var provider = new firebase.auth.TwitterAuthProvider();
    * firebase.auth().signInWithRedirect(provider);
    * ```
    * @example
    * ```javascript
    * // Using a popup.
    * var provider = new firebase.auth.TwitterAuthProvider();
    * firebase.auth().signInWithPopup(provider).then(function(result) {
    *   // For accessing the Twitter API.
    *   var token = result.credential.accessToken;
    *   var secret = result.credential.secret;
    *   // The signed-in user info.
    *   var user = result.user;
    * });
    * ```
    *
    * @see {@link firebase.auth.Auth.onAuthStateChanged} to receive sign in state
    * changes.
    */
  @js.native
  class TwitterAuthProvider () extends TwitterAuthProvider_Instance
  
  /**
    * @hidden
    */
  @js.native
  class TwitterAuthProvider_Instance () extends AuthProvider {
    /* CompleteClass */
    override var providerId: java.lang.String = js.native
    /**
      * Sets the OAuth custom parameters to pass in a Twitter OAuth request for popup
      * and redirect sign-in operations.
      * Valid parameters include 'lang'.
      * Reserved required OAuth 1.0 parameters such as 'oauth_consumer_key',
      * 'oauth_token', 'oauth_signature', etc are not allowed and will be ignored.
      * @param customOAuthParameters The custom OAuth parameters to pass
      *     in the OAuth request.
      * @return The provider instance itself.
      */
    def setCustomParameters(customOAuthParameters: js.Object): AuthProvider = js.native
  }
  
  /**
    * A structure containing a User, an AuthCredential, the operationType, and
    * any additional user information that was returned from the identity provider.
    * operationType could be 'signIn' for a sign-in operation, 'link' for a linking
    * operation and 'reauthenticate' for a reauthentication operation.
    */
  trait UserCredential extends js.Object {
    var additionalUserInfo: js.UndefOr[AdditionalUserInfo | scala.Null] = js.undefined
    var credential: AuthCredential | scala.Null
    var operationType: js.UndefOr[java.lang.String | scala.Null] = js.undefined
    var user: firebaseLib.firebaseMod.User | scala.Null
  }
  
  /**
    * Interface representing a user's metadata.
    */
  trait UserMetadata extends js.Object {
    var creationTime: js.UndefOr[java.lang.String] = js.undefined
    var lastSignInTime: js.UndefOr[java.lang.String] = js.undefined
  }
  
  /* static members */
  @js.native
  object AuthCredential extends js.Object {
    def fromJSON(json: java.lang.String): firebaseLib.firebaseMod.authNs.AuthCredential | scala.Null = js.native
    /**
      * Static method to deserialize a JSON representation of an object into an
      * {@link firebase.auth.AuthCredential}. Input can be either Object or the
      * stringified representation of the object. When string is provided,
      * JSON.parse would be called first. If the JSON input does not represent
      * an`AuthCredential`, null is returned.
      * @param json The plain object representation of an
      *     AuthCredential.
      */
    def fromJSON(json: js.Object): firebaseLib.firebaseMod.authNs.AuthCredential | scala.Null = js.native
  }
  
  @JSName("Auth")
  @js.native
  object AuthNs extends js.Object {
    /**
      * An enumeration of the possible persistence mechanism types.
      */
    @js.native
    object Persistence extends js.Object {
      /**
        * Indicates that the state will be persisted even when the browser window is
        * closed or the activity is destroyed in react-native.
        */
      var LOCAL: firebaseLib.firebaseMod.authNs.AuthNs.Persistence = js.native
      /**
        * Indicates that the state will only be stored in memory and will be cleared
        * when the window or activity is refreshed.
        */
      var NONE: firebaseLib.firebaseMod.authNs.AuthNs.Persistence = js.native
      /**
        * Indicates that the state will only persist in current session/tab, relevant
        * to web only, and will be cleared when the tab is closed.
        */
      var SESSION: firebaseLib.firebaseMod.authNs.AuthNs.Persistence = js.native
    }
    
    type Persistence = java.lang.String
  }
  
  /* static members */
  @js.native
  object EmailAuthProvider extends js.Object {
    /**
      * This corresponds to the sign-in method identifier as returned in
      * {@link firebase.auth.Auth.fetchSignInMethodsForEmail}.
      */
    var EMAIL_LINK_SIGN_IN_METHOD: java.lang.String = js.native
    /**
      * This corresponds to the sign-in method identifier as returned in
      * {@link firebase.auth.Auth.fetchSignInMethodsForEmail}.
      */
    var EMAIL_PASSWORD_SIGN_IN_METHOD: java.lang.String = js.native
    var PROVIDER_ID: java.lang.String = js.native
    /**
      * @example
      * ```javascript
      * var cred = firebase.auth.EmailAuthProvider.credential(
      *     email,
      *     password
      * );
      * ```
      *
      * @param email Email address.
      * @param password User account password.
      * @return The auth provider credential.
      */
    def credential(email: java.lang.String, password: java.lang.String): firebaseLib.firebaseMod.authNs.AuthCredential = js.native
    /**
      * Initialize an `EmailAuthProvider` credential using an email and an email link
      * after a sign in with email link operation.
      *
      * @example
      * ```javascript
      * var cred = firebase.auth.EmailAuthProvider.credentialWithLink(
      *     email,
      *     emailLink
      * );
      * ```
      *
      * @param email Email address.
      * @param emailLink Sign-in email link.
      * @return The auth provider credential.
      */
    def credentialWithLink(email: java.lang.String, emailLink: java.lang.String): firebaseLib.firebaseMod.authNs.AuthCredential = js.native
  }
  
  /* static members */
  @js.native
  object FacebookAuthProvider extends js.Object {
    /**
      * This corresponds to the sign-in method identifier as returned in
      * {@link firebase.auth.Auth.fetchSignInMethodsForEmail}.
      */
    var FACEBOOK_SIGN_IN_METHOD: java.lang.String = js.native
    var PROVIDER_ID: java.lang.String = js.native
    /**
      * @example
      * ```javascript
      * var cred = firebase.auth.FacebookAuthProvider.credential(
      *     // `event` from the Facebook auth.authResponseChange callback.
      *     event.authResponse.accessToken
      * );
      * ```
      *
      * @param token Facebook access token.
      */
    def credential(token: java.lang.String): firebaseLib.firebaseMod.authNs.OAuthCredential = js.native
  }
  
  /* static members */
  @js.native
  object GithubAuthProvider extends js.Object {
    /**
      * This corresponds to the sign-in method identifier as returned in
      * {@link firebase.auth.Auth.fetchSignInMethodsForEmail}.
      */
    var GITHUB_SIGN_IN_METHOD: java.lang.String = js.native
    var PROVIDER_ID: java.lang.String = js.native
    /**
      * @example
      * ```javascript
      * var cred = firebase.auth.FacebookAuthProvider.credential(
      *     // `event` from the Facebook auth.authResponseChange callback.
      *     event.authResponse.accessToken
      * );
      * ```
      *
      * @param token Github access token.
      * @return {!firebase.auth.OAuthCredential} The auth provider credential.
      */
    def credential(token: java.lang.String): firebaseLib.firebaseMod.authNs.OAuthCredential = js.native
  }
  
  /* static members */
  @js.native
  object GoogleAuthProvider extends js.Object {
    /**
      * This corresponds to the sign-in method identifier as returned in
      * {@link firebase.auth.Auth.fetchSignInMethodsForEmail}.
      */
    var GOOGLE_SIGN_IN_METHOD: java.lang.String = js.native
    var PROVIDER_ID: java.lang.String = js.native
    /**
      * Creates a credential for Google. At least one of ID token and access token
      * is required.
      *
      * @example
      * ```javascript
      * // \`googleUser\` from the onsuccess Google Sign In callback.
      * var credential = firebase.auth.GoogleAuthProvider.credential(
      googleUser.getAuthResponse().id_token);
      * firebase.auth().signInWithCredential(credential)
      * ```
      * @param idToken Google ID token.
      * @param accessToken Google access token.
      * @return The auth provider credential.
      */
    def credential(): firebaseLib.firebaseMod.authNs.OAuthCredential = js.native
    def credential(idToken: java.lang.String): firebaseLib.firebaseMod.authNs.OAuthCredential = js.native
    def credential(idToken: java.lang.String, accessToken: java.lang.String): firebaseLib.firebaseMod.authNs.OAuthCredential = js.native
    def credential(idToken: scala.Null, accessToken: java.lang.String): firebaseLib.firebaseMod.authNs.OAuthCredential = js.native
  }
  
  /* static members */
  @js.native
  object PhoneAuthProvider extends js.Object {
    /**
      * This corresponds to the sign-in method identifier as returned in
      * {@link firebase.auth.Auth.fetchSignInMethodsForEmail}.
      */
    var PHONE_SIGN_IN_METHOD: java.lang.String = js.native
    var PROVIDER_ID: java.lang.String = js.native
    /**
      * Creates a phone auth credential, given the verification ID from
      * {@link firebase.auth.PhoneAuthProvider.verifyPhoneNumber} and the code
      * that was sent to the user's mobile device.
      *
      * <h4>Error Codes</h4>
      * <dl>
      * <dt>auth/missing-verification-code</dt>
      * <dd>Thrown if the verification code is missing.</dd>
      * <dt>auth/missing-verification-id</dt>
      * <dd>Thrown if the verification ID is missing.</dd>
      * </dl>
      *
      * @param verificationId The verification ID returned from
      *     {@link firebase.auth.PhoneAuthProvider.verifyPhoneNumber}.
      * @param verificationCode The verification code sent to the user's
      *     mobile device.
      * @return The auth provider credential.
      */
    def credential(verificationId: java.lang.String, verificationCode: java.lang.String): firebaseLib.firebaseMod.authNs.AuthCredential = js.native
  }
  
  /* static members */
  @js.native
  object TwitterAuthProvider extends js.Object {
    var PROVIDER_ID: java.lang.String = js.native
    /**
      * This corresponds to the sign-in method identifier as returned in
      * {@link firebase.auth.Auth.fetchSignInMethodsForEmail}.
      *
      */
    var TWITTER_SIGN_IN_METHOD: java.lang.String = js.native
    /**
      * @param token Twitter access token.
      * @param secret Twitter secret.
      * @return The auth provider credential.
      */
    def credential(token: java.lang.String, secret: java.lang.String): firebaseLib.firebaseMod.authNs.OAuthCredential = js.native
  }
  
}

