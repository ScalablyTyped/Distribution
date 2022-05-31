package typings.firebase.global.firebase

import typings.firebase.mod.firebase.app.App
import typings.firebase.mod.firebase.auth.Auth
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object auth {
  
  /**
    * Gets the {@link firebase.auth.Auth `Auth`} service for the default app or a
    * given app.
    *
    * `firebase.auth()` can be called with no arguments to access the default app's
    * {@link firebase.auth.Auth `Auth`} service or as `firebase.auth(app)` to
    * access the {@link firebase.auth.Auth `Auth`} service associated with a
    * specific app.
    *
    * @example
    * ```javascript
    *
    * // Get the Auth service for the default app
    * var defaultAuth = firebase.auth();
    * ```
    * @example
    * ```javascript
    *
    * // Get the Auth service for a given app
    * var otherAuth = firebase.auth(otherApp);
    * ```
    * @param app
    */
  inline def apply(): Auth = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Auth]
  inline def apply(app: App): Auth = ^.asInstanceOf[js.Dynamic].apply(app.asInstanceOf[js.Any]).asInstanceOf[Auth]
  
  @JSGlobal("firebase.auth")
  @js.native
  val ^ : js.Any = js.native
  
  object ActionCodeInfo {
    
    /**
      * An enumeration of the possible email action types.
      */
    object Operation {
      
      @JSGlobal("firebase.auth.ActionCodeInfo.Operation")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * The email link sign-in action.
        */
      @JSGlobal("firebase.auth.ActionCodeInfo.Operation.EMAIL_SIGNIN")
      @js.native
      def EMAIL_SIGNIN: typings.firebase.mod.firebase.auth.ActionCodeInfo.Operation = js.native
      inline def EMAIL_SIGNIN_=(x: typings.firebase.mod.firebase.auth.ActionCodeInfo.Operation): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EMAIL_SIGNIN")(x.asInstanceOf[js.Any])
      
      /**
        * The password reset action.
        */
      @JSGlobal("firebase.auth.ActionCodeInfo.Operation.PASSWORD_RESET")
      @js.native
      def PASSWORD_RESET: typings.firebase.mod.firebase.auth.ActionCodeInfo.Operation = js.native
      inline def PASSWORD_RESET_=(x: typings.firebase.mod.firebase.auth.ActionCodeInfo.Operation): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PASSWORD_RESET")(x.asInstanceOf[js.Any])
      
      /**
        * The email revocation action.
        */
      @JSGlobal("firebase.auth.ActionCodeInfo.Operation.RECOVER_EMAIL")
      @js.native
      def RECOVER_EMAIL: typings.firebase.mod.firebase.auth.ActionCodeInfo.Operation = js.native
      inline def RECOVER_EMAIL_=(x: typings.firebase.mod.firebase.auth.ActionCodeInfo.Operation): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RECOVER_EMAIL")(x.asInstanceOf[js.Any])
      
      /**
        * The revert second factor addition email action.
        */
      @JSGlobal("firebase.auth.ActionCodeInfo.Operation.REVERT_SECOND_FACTOR_ADDITION")
      @js.native
      def REVERT_SECOND_FACTOR_ADDITION: typings.firebase.mod.firebase.auth.ActionCodeInfo.Operation = js.native
      inline def REVERT_SECOND_FACTOR_ADDITION_=(x: typings.firebase.mod.firebase.auth.ActionCodeInfo.Operation): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("REVERT_SECOND_FACTOR_ADDITION")(x.asInstanceOf[js.Any])
      
      /**
        * The verify and update email action.
        */
      @JSGlobal("firebase.auth.ActionCodeInfo.Operation.VERIFY_AND_CHANGE_EMAIL")
      @js.native
      def VERIFY_AND_CHANGE_EMAIL: typings.firebase.mod.firebase.auth.ActionCodeInfo.Operation = js.native
      inline def VERIFY_AND_CHANGE_EMAIL_=(x: typings.firebase.mod.firebase.auth.ActionCodeInfo.Operation): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VERIFY_AND_CHANGE_EMAIL")(x.asInstanceOf[js.Any])
      
      /**
        * The email verification action.
        */
      @JSGlobal("firebase.auth.ActionCodeInfo.Operation.VERIFY_EMAIL")
      @js.native
      def VERIFY_EMAIL: typings.firebase.mod.firebase.auth.ActionCodeInfo.Operation = js.native
      inline def VERIFY_EMAIL_=(x: typings.firebase.mod.firebase.auth.ActionCodeInfo.Operation): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VERIFY_EMAIL")(x.asInstanceOf[js.Any])
    }
  }
  
  /**
    * A utility class to parse email action URLs.
    */
  @JSGlobal("firebase.auth.ActionCodeURL")
  @js.native
  /* private */ class ActionCodeURL ()
    extends typings.firebase.mod.default.auth.ActionCodeURL
  object ActionCodeURL {
    
    @JSGlobal("firebase.auth.ActionCodeURL")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Parses the email action link string and returns an ActionCodeURL object
      * if the link is valid, otherwise returns null.
      *
      * @param link The email action link string.
      * @return The ActionCodeURL object, or null if the link is invalid.
      */
    /* static member */
    inline def parseLink(link: String): typings.firebase.mod.firebase.auth.ActionCodeURL | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("parseLink")(link.asInstanceOf[js.Any]).asInstanceOf[typings.firebase.mod.firebase.auth.ActionCodeURL | Null]
  }
  
  object Auth {
    
    /**
      * An enumeration of the possible persistence mechanism types.
      */
    object Persistence {
      
      @JSGlobal("firebase.auth.Auth.Persistence")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Indicates that the state will be persisted even when the browser window is
        * closed or the activity is destroyed in react-native.
        */
      @JSGlobal("firebase.auth.Auth.Persistence.LOCAL")
      @js.native
      def LOCAL: typings.firebase.mod.firebase.auth.Auth.Persistence = js.native
      inline def LOCAL_=(x: typings.firebase.mod.firebase.auth.Auth.Persistence): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LOCAL")(x.asInstanceOf[js.Any])
      
      /**
        * Indicates that the state will only be stored in memory and will be cleared
        * when the window or activity is refreshed.
        */
      @JSGlobal("firebase.auth.Auth.Persistence.NONE")
      @js.native
      def NONE: typings.firebase.mod.firebase.auth.Auth.Persistence = js.native
      inline def NONE_=(x: typings.firebase.mod.firebase.auth.Auth.Persistence): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NONE")(x.asInstanceOf[js.Any])
      
      /**
        * Indicates that the state will only persist in current session/tab, relevant
        * to web only, and will be cleared when the tab is closed.
        */
      @JSGlobal("firebase.auth.Auth.Persistence.SESSION")
      @js.native
      def SESSION: typings.firebase.mod.firebase.auth.Auth.Persistence = js.native
      inline def SESSION_=(x: typings.firebase.mod.firebase.auth.Auth.Persistence): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SESSION")(x.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Interface that represents the credentials returned by an auth provider.
    * Implementations specify the details about each auth provider's credential
    * requirements.
    *
    */
  @JSGlobal("firebase.auth.AuthCredential")
  @js.native
  abstract class AuthCredential ()
    extends typings.firebase.mod.default.auth.AuthCredential
  object AuthCredential {
    
    @JSGlobal("firebase.auth.AuthCredential")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromJSON(json: String): typings.firebase.mod.firebase.auth.AuthCredential | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.firebase.mod.firebase.auth.AuthCredential | Null]
    /**
      * Static method to deserialize a JSON representation of an object into an
      * {@link firebase.auth.AuthCredential}. Input can be either Object or the
      * stringified representation of the object. When string is provided,
      * JSON.parse would be called first. If the JSON input does not represent
      * an`AuthCredential`, null is returned.
      * @param json The plain object representation of an
      *     AuthCredential.
      */
    /* static member */
    inline def fromJSON(json: js.Object): typings.firebase.mod.firebase.auth.AuthCredential | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.firebase.mod.firebase.auth.AuthCredential | Null]
  }
  
  /**
    * Email and password auth provider implementation.
    *
    * To authenticate: {@link firebase.auth.Auth.createUserWithEmailAndPassword}
    * and {@link firebase.auth.Auth.signInWithEmailAndPassword}.
    */
  @JSGlobal("firebase.auth.EmailAuthProvider")
  @js.native
  class EmailAuthProvider ()
    extends typings.firebase.mod.default.auth.EmailAuthProvider
  object EmailAuthProvider {
    
    @JSGlobal("firebase.auth.EmailAuthProvider")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * This corresponds to the sign-in method identifier as returned in
      * {@link firebase.auth.Auth.fetchSignInMethodsForEmail}.
      */
    /* static member */
    @JSGlobal("firebase.auth.EmailAuthProvider.EMAIL_LINK_SIGN_IN_METHOD")
    @js.native
    def EMAIL_LINK_SIGN_IN_METHOD: String = js.native
    inline def EMAIL_LINK_SIGN_IN_METHOD_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EMAIL_LINK_SIGN_IN_METHOD")(x.asInstanceOf[js.Any])
    
    /**
      * This corresponds to the sign-in method identifier as returned in
      * {@link firebase.auth.Auth.fetchSignInMethodsForEmail}.
      */
    /* static member */
    @JSGlobal("firebase.auth.EmailAuthProvider.EMAIL_PASSWORD_SIGN_IN_METHOD")
    @js.native
    def EMAIL_PASSWORD_SIGN_IN_METHOD: String = js.native
    inline def EMAIL_PASSWORD_SIGN_IN_METHOD_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EMAIL_PASSWORD_SIGN_IN_METHOD")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("firebase.auth.EmailAuthProvider.PROVIDER_ID")
    @js.native
    def PROVIDER_ID: String = js.native
    inline def PROVIDER_ID_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PROVIDER_ID")(x.asInstanceOf[js.Any])
    
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
    /* static member */
    inline def credential(email: String, password: String): typings.firebase.mod.firebase.auth.AuthCredential = (^.asInstanceOf[js.Dynamic].applyDynamic("credential")(email.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[typings.firebase.mod.firebase.auth.AuthCredential]
    
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
    /* static member */
    inline def credentialWithLink(email: String, emailLink: String): typings.firebase.mod.firebase.auth.AuthCredential = (^.asInstanceOf[js.Dynamic].applyDynamic("credentialWithLink")(email.asInstanceOf[js.Any], emailLink.asInstanceOf[js.Any])).asInstanceOf[typings.firebase.mod.firebase.auth.AuthCredential]
  }
  
  /**
    * @hidden
    */
  @JSGlobal("firebase.auth.EmailAuthProvider_Instance")
  @js.native
  class EmailAuthProviderInstance ()
    extends typings.firebase.mod.default.auth.EmailAuthProviderInstance
  
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
  @JSGlobal("firebase.auth.FacebookAuthProvider")
  @js.native
  class FacebookAuthProvider ()
    extends typings.firebase.mod.default.auth.FacebookAuthProvider
  object FacebookAuthProvider {
    
    @JSGlobal("firebase.auth.FacebookAuthProvider")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * This corresponds to the sign-in method identifier as returned in
      * {@link firebase.auth.Auth.fetchSignInMethodsForEmail}.
      */
    /* static member */
    @JSGlobal("firebase.auth.FacebookAuthProvider.FACEBOOK_SIGN_IN_METHOD")
    @js.native
    def FACEBOOK_SIGN_IN_METHOD: String = js.native
    inline def FACEBOOK_SIGN_IN_METHOD_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FACEBOOK_SIGN_IN_METHOD")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("firebase.auth.FacebookAuthProvider.PROVIDER_ID")
    @js.native
    def PROVIDER_ID: String = js.native
    inline def PROVIDER_ID_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PROVIDER_ID")(x.asInstanceOf[js.Any])
    
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
    /* static member */
    inline def credential(token: String): typings.firebase.mod.firebase.auth.OAuthCredential = ^.asInstanceOf[js.Dynamic].applyDynamic("credential")(token.asInstanceOf[js.Any]).asInstanceOf[typings.firebase.mod.firebase.auth.OAuthCredential]
  }
  
  /**
    * @hidden
    */
  @JSGlobal("firebase.auth.FacebookAuthProvider_Instance")
  @js.native
  class FacebookAuthProviderInstance ()
    extends typings.firebase.mod.default.auth.FacebookAuthProviderInstance
  
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
  @JSGlobal("firebase.auth.GithubAuthProvider")
  @js.native
  class GithubAuthProvider ()
    extends typings.firebase.mod.default.auth.GithubAuthProvider
  object GithubAuthProvider {
    
    @JSGlobal("firebase.auth.GithubAuthProvider")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * This corresponds to the sign-in method identifier as returned in
      * {@link firebase.auth.Auth.fetchSignInMethodsForEmail}.
      */
    /* static member */
    @JSGlobal("firebase.auth.GithubAuthProvider.GITHUB_SIGN_IN_METHOD")
    @js.native
    def GITHUB_SIGN_IN_METHOD: String = js.native
    inline def GITHUB_SIGN_IN_METHOD_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GITHUB_SIGN_IN_METHOD")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("firebase.auth.GithubAuthProvider.PROVIDER_ID")
    @js.native
    def PROVIDER_ID: String = js.native
    inline def PROVIDER_ID_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PROVIDER_ID")(x.asInstanceOf[js.Any])
    
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
    /* static member */
    inline def credential(token: String): typings.firebase.mod.firebase.auth.OAuthCredential = ^.asInstanceOf[js.Dynamic].applyDynamic("credential")(token.asInstanceOf[js.Any]).asInstanceOf[typings.firebase.mod.firebase.auth.OAuthCredential]
  }
  
  /**
    * @hidden
    */
  @JSGlobal("firebase.auth.GithubAuthProvider_Instance")
  @js.native
  class GithubAuthProviderInstance ()
    extends typings.firebase.mod.default.auth.GithubAuthProviderInstance
  
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
  @JSGlobal("firebase.auth.GoogleAuthProvider")
  @js.native
  class GoogleAuthProvider ()
    extends typings.firebase.mod.default.auth.GoogleAuthProvider
  object GoogleAuthProvider {
    
    @JSGlobal("firebase.auth.GoogleAuthProvider")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * This corresponds to the sign-in method identifier as returned in
      * {@link firebase.auth.Auth.fetchSignInMethodsForEmail}.
      */
    /* static member */
    @JSGlobal("firebase.auth.GoogleAuthProvider.GOOGLE_SIGN_IN_METHOD")
    @js.native
    def GOOGLE_SIGN_IN_METHOD: String = js.native
    inline def GOOGLE_SIGN_IN_METHOD_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GOOGLE_SIGN_IN_METHOD")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("firebase.auth.GoogleAuthProvider.PROVIDER_ID")
    @js.native
    def PROVIDER_ID: String = js.native
    inline def PROVIDER_ID_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PROVIDER_ID")(x.asInstanceOf[js.Any])
    
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
    /* static member */
    inline def credential(): typings.firebase.mod.firebase.auth.OAuthCredential = ^.asInstanceOf[js.Dynamic].applyDynamic("credential")().asInstanceOf[typings.firebase.mod.firebase.auth.OAuthCredential]
    inline def credential(idToken: String): typings.firebase.mod.firebase.auth.OAuthCredential = ^.asInstanceOf[js.Dynamic].applyDynamic("credential")(idToken.asInstanceOf[js.Any]).asInstanceOf[typings.firebase.mod.firebase.auth.OAuthCredential]
    inline def credential(idToken: String, accessToken: String): typings.firebase.mod.firebase.auth.OAuthCredential = (^.asInstanceOf[js.Dynamic].applyDynamic("credential")(idToken.asInstanceOf[js.Any], accessToken.asInstanceOf[js.Any])).asInstanceOf[typings.firebase.mod.firebase.auth.OAuthCredential]
    inline def credential(idToken: Null, accessToken: String): typings.firebase.mod.firebase.auth.OAuthCredential = (^.asInstanceOf[js.Dynamic].applyDynamic("credential")(idToken.asInstanceOf[js.Any], accessToken.asInstanceOf[js.Any])).asInstanceOf[typings.firebase.mod.firebase.auth.OAuthCredential]
    inline def credential(idToken: Unit, accessToken: String): typings.firebase.mod.firebase.auth.OAuthCredential = (^.asInstanceOf[js.Dynamic].applyDynamic("credential")(idToken.asInstanceOf[js.Any], accessToken.asInstanceOf[js.Any])).asInstanceOf[typings.firebase.mod.firebase.auth.OAuthCredential]
  }
  
  /**
    * @hidden
    */
  @JSGlobal("firebase.auth.GoogleAuthProvider_Instance")
  @js.native
  class GoogleAuthProviderInstance ()
    extends typings.firebase.mod.default.auth.GoogleAuthProviderInstance
  
  /**
    * The base class for asserting ownership of a second factor. This is used to
    * facilitate enrollment of a second factor on an existing user
    * or sign-in of a user who already verified the first factor.
    *
    */
  @JSGlobal("firebase.auth.MultiFactorAssertion")
  @js.native
  abstract class MultiFactorAssertion ()
    extends typings.firebase.mod.default.auth.MultiFactorAssertion
  
  /**
    * The class used to facilitate recovery from
    * {@link firebase.auth.MultiFactorError} when a user needs to provide a second
    * factor to sign in.
    *
    * @example
    * ```javascript
    * firebase.auth().signInWithEmailAndPassword()
    *     .then(function(result) {
    *       // User signed in. No 2nd factor challenge is needed.
    *     })
    *     .catch(function(error) {
    *       if (error.code == 'auth/multi-factor-auth-required') {
    *         var resolver = error.resolver;
    *         // Show UI to let user select second factor.
    *         var multiFactorHints = resolver.hints;
    *       } else {
    *         // Handle other errors.
    *       }
    *     });
    *
    * // The enrolled second factors that can be used to complete
    * // sign-in are returned in the `MultiFactorResolver.hints` list.
    * // UI needs to be presented to allow the user to select a second factor
    * // from that list.
    *
    * var selectedHint = // ; selected from multiFactorHints
    * var phoneAuthProvider = new firebase.auth.PhoneAuthProvider();
    * var phoneInfoOptions = {
    *   multiFactorHint: selectedHint,
    *   session: resolver.session
    * };
    * phoneAuthProvider.verifyPhoneNumber(
    *   phoneInfoOptions,
    *   appVerifier
    * ).then(function(verificationId) {
    *   // store verificationID and show UI to let user enter verification code.
    * });
    *
    * // UI to enter verification code and continue.
    * // Continue button click handler
    * var phoneAuthCredential =
    *     firebase.auth.PhoneAuthProvider.credential(verificationId, verificationCode);
    * var multiFactorAssertion =
    *     firebase.auth.PhoneMultiFactorGenerator.assertion(phoneAuthCredential);
    * resolver.resolveSignIn(multiFactorAssertion)
    *     .then(function(userCredential) {
    *       // User signed in.
    *     });
    * ```
    */
  @JSGlobal("firebase.auth.MultiFactorResolver")
  @js.native
  /* private */ class MultiFactorResolver ()
    extends typings.firebase.mod.default.auth.MultiFactorResolver
  
  /**
    * The multi-factor session object used for enrolling a second factor on a
    * user or helping sign in an enrolled user with a second factor.
    */
  @JSGlobal("firebase.auth.MultiFactorSession")
  @js.native
  /* private */ class MultiFactorSession ()
    extends typings.firebase.mod.default.auth.MultiFactorSession
  
  /**
    * Interface that represents the OAuth credentials returned by an OAuth
    * provider. Implementations specify the details about each auth provider's
    * credential requirements.
    *
    */
  @JSGlobal("firebase.auth.OAuthCredential")
  @js.native
  /* private */ class OAuthCredential ()
    extends typings.firebase.mod.default.auth.OAuthCredential
  
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
  @JSGlobal("firebase.auth.OAuthProvider")
  @js.native
  class OAuthProvider protected ()
    extends typings.firebase.mod.default.auth.OAuthProvider {
    def this(providerId: String) = this()
  }
  
  /**
    * Classes that represents the Phone Auth credentials returned by a
    * {@link firebase.auth.PhoneAuthProvider}.
    *
    */
  @JSGlobal("firebase.auth.PhoneAuthCredential")
  @js.native
  /* private */ class PhoneAuthCredential ()
    extends typings.firebase.mod.default.auth.PhoneAuthCredential
  
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
  @JSGlobal("firebase.auth.PhoneAuthProvider")
  @js.native
  class PhoneAuthProvider ()
    extends typings.firebase.mod.default.auth.PhoneAuthProvider
  object PhoneAuthProvider {
    
    @JSGlobal("firebase.auth.PhoneAuthProvider")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * This corresponds to the sign-in method identifier as returned in
      * {@link firebase.auth.Auth.fetchSignInMethodsForEmail}.
      */
    /* static member */
    @JSGlobal("firebase.auth.PhoneAuthProvider.PHONE_SIGN_IN_METHOD")
    @js.native
    def PHONE_SIGN_IN_METHOD: String = js.native
    inline def PHONE_SIGN_IN_METHOD_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PHONE_SIGN_IN_METHOD")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("firebase.auth.PhoneAuthProvider.PROVIDER_ID")
    @js.native
    def PROVIDER_ID: String = js.native
    inline def PROVIDER_ID_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PROVIDER_ID")(x.asInstanceOf[js.Any])
    
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
    /* static member */
    inline def credential(verificationId: String, verificationCode: String): typings.firebase.mod.firebase.auth.AuthCredential = (^.asInstanceOf[js.Dynamic].applyDynamic("credential")(verificationId.asInstanceOf[js.Any], verificationCode.asInstanceOf[js.Any])).asInstanceOf[typings.firebase.mod.firebase.auth.AuthCredential]
  }
  
  /**
    * @hidden
    */
  @JSGlobal("firebase.auth.PhoneAuthProvider_Instance")
  @js.native
  class PhoneAuthProviderInstance ()
    extends typings.firebase.mod.default.auth.PhoneAuthProviderInstance {
    def this(auth: Auth) = this()
  }
  
  /**
    * The class for asserting ownership of a phone second factor.
    */
  @JSGlobal("firebase.auth.PhoneMultiFactorAssertion")
  @js.native
  /* private */ class PhoneMultiFactorAssertion ()
    extends typings.firebase.mod.default.auth.PhoneMultiFactorAssertion
  
  /**
    * The class used to initialize {@link firebase.auth.PhoneMultiFactorAssertion}.
    */
  @JSGlobal("firebase.auth.PhoneMultiFactorGenerator")
  @js.native
  /* private */ class PhoneMultiFactorGenerator ()
    extends typings.firebase.mod.default.auth.PhoneMultiFactorGenerator
  object PhoneMultiFactorGenerator {
    
    @JSGlobal("firebase.auth.PhoneMultiFactorGenerator")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * The identifier of the phone second factor: `phone`.
      */
    /* static member */
    @JSGlobal("firebase.auth.PhoneMultiFactorGenerator.FACTOR_ID")
    @js.native
    def FACTOR_ID: String = js.native
    inline def FACTOR_ID_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FACTOR_ID")(x.asInstanceOf[js.Any])
    
    /**
      * Initializes the {@link firebase.auth.PhoneMultiFactorAssertion} to confirm ownership
      * of the phone second factor.
      */
    /* static member */
    inline def assertion(phoneAuthCredential: typings.firebase.mod.firebase.auth.PhoneAuthCredential): typings.firebase.mod.firebase.auth.PhoneMultiFactorAssertion = ^.asInstanceOf[js.Dynamic].applyDynamic("assertion")(phoneAuthCredential.asInstanceOf[js.Any]).asInstanceOf[typings.firebase.mod.firebase.auth.PhoneMultiFactorAssertion]
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
  @JSGlobal("firebase.auth.RecaptchaVerifier")
  @js.native
  class RecaptchaVerifier ()
    extends typings.firebase.mod.default.auth.RecaptchaVerifier
  
  /**
    * @webonly
    * @hidden
    */
  @JSGlobal("firebase.auth.RecaptchaVerifier_Instance")
  @js.native
  class RecaptchaVerifierInstance protected ()
    extends typings.firebase.mod.default.auth.RecaptchaVerifierInstance {
    def this(container: String) = this()
    def this(container: js.Any) = this()
    def this(container: String, parameters: js.Object) = this()
    def this(container: js.Any, parameters: js.Object) = this()
    def this(container: String, parameters: js.Object, app: App) = this()
    def this(container: String, parameters: Null, app: App) = this()
    def this(container: String, parameters: Unit, app: App) = this()
    def this(container: js.Any, parameters: js.Object, app: App) = this()
    def this(container: js.Any, parameters: Null, app: App) = this()
    def this(container: js.Any, parameters: Unit, app: App) = this()
  }
  
  @JSGlobal("firebase.auth.SAMLAuthProvider")
  @js.native
  class SAMLAuthProvider protected ()
    extends typings.firebase.mod.default.auth.SAMLAuthProvider {
    def this(providerId: String) = this()
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
  @JSGlobal("firebase.auth.TwitterAuthProvider")
  @js.native
  class TwitterAuthProvider ()
    extends typings.firebase.mod.default.auth.TwitterAuthProvider
  object TwitterAuthProvider {
    
    @JSGlobal("firebase.auth.TwitterAuthProvider")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSGlobal("firebase.auth.TwitterAuthProvider.PROVIDER_ID")
    @js.native
    def PROVIDER_ID: String = js.native
    inline def PROVIDER_ID_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PROVIDER_ID")(x.asInstanceOf[js.Any])
    
    /**
      * This corresponds to the sign-in method identifier as returned in
      * {@link firebase.auth.Auth.fetchSignInMethodsForEmail}.
      *
      */
    /* static member */
    @JSGlobal("firebase.auth.TwitterAuthProvider.TWITTER_SIGN_IN_METHOD")
    @js.native
    def TWITTER_SIGN_IN_METHOD: String = js.native
    inline def TWITTER_SIGN_IN_METHOD_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TWITTER_SIGN_IN_METHOD")(x.asInstanceOf[js.Any])
    
    /**
      * @param token Twitter access token.
      * @param secret Twitter secret.
      * @return The auth provider credential.
      */
    /* static member */
    inline def credential(token: String, secret: String): typings.firebase.mod.firebase.auth.OAuthCredential = (^.asInstanceOf[js.Dynamic].applyDynamic("credential")(token.asInstanceOf[js.Any], secret.asInstanceOf[js.Any])).asInstanceOf[typings.firebase.mod.firebase.auth.OAuthCredential]
  }
  
  /**
    * @hidden
    */
  @JSGlobal("firebase.auth.TwitterAuthProvider_Instance")
  @js.native
  class TwitterAuthProviderInstance ()
    extends typings.firebase.mod.default.auth.TwitterAuthProviderInstance
}
