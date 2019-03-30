package typings
package firebaseLib.firebaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("firebase", "auth")
@js.native
object authNs extends js.Object {
  /**
    * Email and password auth provider implementation.
    *
    * To authenticate: {@link firebase.auth.Auth.createUserWithEmailAndPassword}
    * and {@link firebase.auth.Auth.signInWithEmailAndPassword}.
    */
  @js.native
  class EmailAuthProvider ()
    extends firebaseLib.firebaseMod.firebaseNs.authNs.EmailAuthProvider {
    /* CompleteClass */
    override var providerId: java.lang.String = js.native
  }
  
  /**
    * @hidden
    */
  @js.native
  class EmailAuthProvider_Instance ()
    extends firebaseLib.firebaseMod.firebaseNs.authNs.EmailAuthProvider_Instance {
    /* CompleteClass */
    override var providerId: java.lang.String = js.native
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
  class FacebookAuthProvider ()
    extends firebaseLib.firebaseMod.firebaseNs.authNs.FacebookAuthProvider {
    /* CompleteClass */
    override var providerId: java.lang.String = js.native
    /**
      * @param scope Facebook OAuth scope.
      * @return The provider instance itself.
      */
    /* CompleteClass */
    override def addScope(scope: java.lang.String): firebaseLib.firebaseMod.firebaseNs.authNs.AuthProvider = js.native
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
    /* CompleteClass */
    override def setCustomParameters(customOAuthParameters: js.Object): firebaseLib.firebaseMod.firebaseNs.authNs.AuthProvider = js.native
  }
  
  /**
    * @hidden
    */
  @js.native
  class FacebookAuthProvider_Instance ()
    extends firebaseLib.firebaseMod.firebaseNs.authNs.FacebookAuthProvider_Instance {
    /* CompleteClass */
    override var providerId: java.lang.String = js.native
    /**
      * @param scope Facebook OAuth scope.
      * @return The provider instance itself.
      */
    /* CompleteClass */
    override def addScope(scope: java.lang.String): firebaseLib.firebaseMod.firebaseNs.authNs.AuthProvider = js.native
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
    /* CompleteClass */
    override def setCustomParameters(customOAuthParameters: js.Object): firebaseLib.firebaseMod.firebaseNs.authNs.AuthProvider = js.native
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
  class GithubAuthProvider ()
    extends firebaseLib.firebaseMod.firebaseNs.authNs.GithubAuthProvider {
    /* CompleteClass */
    override var providerId: java.lang.String = js.native
    /**
      * @param scope Github OAuth scope.
      * @return The provider instance itself.
      */
    /* CompleteClass */
    override def addScope(scope: java.lang.String): firebaseLib.firebaseMod.firebaseNs.authNs.AuthProvider = js.native
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
    /* CompleteClass */
    override def setCustomParameters(customOAuthParameters: js.Object): firebaseLib.firebaseMod.firebaseNs.authNs.AuthProvider = js.native
  }
  
  /**
    * @hidden
    */
  @js.native
  class GithubAuthProvider_Instance ()
    extends firebaseLib.firebaseMod.firebaseNs.authNs.GithubAuthProvider_Instance {
    /* CompleteClass */
    override var providerId: java.lang.String = js.native
    /**
      * @param scope Github OAuth scope.
      * @return The provider instance itself.
      */
    /* CompleteClass */
    override def addScope(scope: java.lang.String): firebaseLib.firebaseMod.firebaseNs.authNs.AuthProvider = js.native
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
    /* CompleteClass */
    override def setCustomParameters(customOAuthParameters: js.Object): firebaseLib.firebaseMod.firebaseNs.authNs.AuthProvider = js.native
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
  class GoogleAuthProvider ()
    extends firebaseLib.firebaseMod.firebaseNs.authNs.GoogleAuthProvider {
    /* CompleteClass */
    override var providerId: java.lang.String = js.native
    /**
      * @param scope Google OAuth scope.
      * @return The provider instance itself.
      */
    /* CompleteClass */
    override def addScope(scope: java.lang.String): firebaseLib.firebaseMod.firebaseNs.authNs.AuthProvider = js.native
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
    /* CompleteClass */
    override def setCustomParameters(customOAuthParameters: js.Object): firebaseLib.firebaseMod.firebaseNs.authNs.AuthProvider = js.native
  }
  
  /**
    * @hidden
    */
  @js.native
  class GoogleAuthProvider_Instance ()
    extends firebaseLib.firebaseMod.firebaseNs.authNs.GoogleAuthProvider_Instance {
    /* CompleteClass */
    override var providerId: java.lang.String = js.native
    /**
      * @param scope Google OAuth scope.
      * @return The provider instance itself.
      */
    /* CompleteClass */
    override def addScope(scope: java.lang.String): firebaseLib.firebaseMod.firebaseNs.authNs.AuthProvider = js.native
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
    /* CompleteClass */
    override def setCustomParameters(customOAuthParameters: js.Object): firebaseLib.firebaseMod.firebaseNs.authNs.AuthProvider = js.native
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
  class OAuthProvider ()
    extends firebaseLib.firebaseMod.firebaseNs.authNs.OAuthProvider {
    /* CompleteClass */
    override var providerId: java.lang.String = js.native
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
  class PhoneAuthProvider ()
    extends firebaseLib.firebaseMod.firebaseNs.authNs.PhoneAuthProvider {
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
    /* CompleteClass */
    override def verifyPhoneNumber(
      phoneNumber: java.lang.String,
      applicationVerifier: firebaseLib.firebaseMod.firebaseNs.authNs.ApplicationVerifier
    ): js.Promise[java.lang.String] = js.native
  }
  
  /**
    * @hidden
    */
  @js.native
  class PhoneAuthProvider_Instance ()
    extends firebaseLib.firebaseMod.firebaseNs.authNs.PhoneAuthProvider_Instance {
    def this(auth: firebaseLib.firebaseMod.firebaseNs.authNs.Auth) = this()
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
    /* CompleteClass */
    override def verifyPhoneNumber(
      phoneNumber: java.lang.String,
      applicationVerifier: firebaseLib.firebaseMod.firebaseNs.authNs.ApplicationVerifier
    ): js.Promise[java.lang.String] = js.native
  }
  
  /**
    * An {@link https://www.google.com/recaptcha/ reCAPTCHA}-based application
    * verifier.
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
  class RecaptchaVerifier ()
    extends firebaseLib.firebaseMod.firebaseNs.authNs.RecaptchaVerifier {
    /**
      * Identifies the type of application verifier (e.g. "recaptcha").
      */
    /* CompleteClass */
    override var `type`: java.lang.String = js.native
    /**
      * Clears the reCAPTCHA widget from the page and destroys the current instance.
      */
    /* CompleteClass */
    override def clear(): scala.Unit = js.native
    /**
      * Renders the reCAPTCHA widget on the page.
      * @return A Promise that resolves with the
      *     reCAPTCHA widget ID.
      */
    /* CompleteClass */
    override def render(): js.Promise[scala.Double] = js.native
    /**
      * Executes the verification process.
      * @return A Promise for a token that can be used to
      *     assert the validity of a request.
      */
    /* CompleteClass */
    override def verify(): js.Promise[java.lang.String] = js.native
  }
  
  /**
    * @hidden
    */
  @js.native
  class RecaptchaVerifier_Instance protected ()
    extends firebaseLib.firebaseMod.firebaseNs.authNs.RecaptchaVerifier_Instance {
    def this(container: java.lang.String) = this()
    def this(container: js.Any) = this()
    def this(container: java.lang.String, parameters: js.Object) = this()
    def this(container: js.Any, parameters: js.Object) = this()
    def this(container: java.lang.String, parameters: js.Object, app: firebaseLib.firebaseMod.firebaseNs.appNs.App) = this()
    def this(container: java.lang.String, parameters: scala.Null, app: firebaseLib.firebaseMod.firebaseNs.appNs.App) = this()
    def this(container: js.Any, parameters: js.Object, app: firebaseLib.firebaseMod.firebaseNs.appNs.App) = this()
    def this(container: js.Any, parameters: scala.Null, app: firebaseLib.firebaseMod.firebaseNs.appNs.App) = this()
    /**
      * Identifies the type of application verifier (e.g. "recaptcha").
      */
    /* CompleteClass */
    override var `type`: java.lang.String = js.native
    /**
      * Clears the reCAPTCHA widget from the page and destroys the current instance.
      */
    /* CompleteClass */
    override def clear(): scala.Unit = js.native
    /**
      * Renders the reCAPTCHA widget on the page.
      * @return A Promise that resolves with the
      *     reCAPTCHA widget ID.
      */
    /* CompleteClass */
    override def render(): js.Promise[scala.Double] = js.native
    /**
      * Executes the verification process.
      * @return A Promise for a token that can be used to
      *     assert the validity of a request.
      */
    /* CompleteClass */
    override def verify(): js.Promise[java.lang.String] = js.native
  }
  
  @js.native
  class SAMLAuthProvider ()
    extends firebaseLib.firebaseMod.firebaseNs.authNs.SAMLAuthProvider {
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
  class TwitterAuthProvider ()
    extends firebaseLib.firebaseMod.firebaseNs.authNs.TwitterAuthProvider {
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
    /* CompleteClass */
    override def setCustomParameters(customOAuthParameters: js.Object): firebaseLib.firebaseMod.firebaseNs.authNs.AuthProvider = js.native
  }
  
  /**
    * @hidden
    */
  @js.native
  class TwitterAuthProvider_Instance ()
    extends firebaseLib.firebaseMod.firebaseNs.authNs.TwitterAuthProvider_Instance {
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
    /* CompleteClass */
    override def setCustomParameters(customOAuthParameters: js.Object): firebaseLib.firebaseMod.firebaseNs.authNs.AuthProvider = js.native
  }
  
  @JSName("Auth")
  @js.native
  object AuthNs extends js.Object {
    /**
      * An enumeration of the possible persistence mechanism types.
      */
    var Persistence: firebaseLib.Anon_LOCAL = js.native
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
    def credential(email: java.lang.String, password: java.lang.String): firebaseLib.firebaseMod.firebaseNs.authNs.AuthCredential = js.native
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
    def credentialWithLink(email: java.lang.String, emailLink: java.lang.String): firebaseLib.firebaseMod.firebaseNs.authNs.AuthCredential = js.native
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
    def credential(token: java.lang.String): firebaseLib.firebaseMod.firebaseNs.authNs.OAuthCredential = js.native
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
    def credential(token: java.lang.String): firebaseLib.firebaseMod.firebaseNs.authNs.OAuthCredential = js.native
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
    def credential(): firebaseLib.firebaseMod.firebaseNs.authNs.OAuthCredential = js.native
    def credential(idToken: java.lang.String): firebaseLib.firebaseMod.firebaseNs.authNs.OAuthCredential = js.native
    def credential(idToken: java.lang.String, accessToken: java.lang.String): firebaseLib.firebaseMod.firebaseNs.authNs.OAuthCredential = js.native
    def credential(idToken: scala.Null, accessToken: java.lang.String): firebaseLib.firebaseMod.firebaseNs.authNs.OAuthCredential = js.native
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
    def credential(verificationId: java.lang.String, verificationCode: java.lang.String): firebaseLib.firebaseMod.firebaseNs.authNs.AuthCredential = js.native
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
    def credential(token: java.lang.String, secret: java.lang.String): firebaseLib.firebaseMod.firebaseNs.authNs.OAuthCredential = js.native
  }
  
}

