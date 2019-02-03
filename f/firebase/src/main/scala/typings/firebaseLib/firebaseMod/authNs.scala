package typings
package firebaseLib.firebaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("firebase", "auth")
@js.native
object authNs extends js.Object {
  @js.native
  class EmailAuthProvider ()
    extends firebaseLib.firebaseMod.firebaseNs.authNs.EmailAuthProvider {
    /* CompleteClass */
    override var providerId: java.lang.String = js.native
  }
  
  @js.native
  class EmailAuthProvider_Instance ()
    extends firebaseLib.firebaseMod.firebaseNs.authNs.EmailAuthProvider_Instance {
    /* CompleteClass */
    override var providerId: java.lang.String = js.native
  }
  
  @js.native
  class FacebookAuthProvider ()
    extends firebaseLib.firebaseMod.firebaseNs.authNs.FacebookAuthProvider {
    /* CompleteClass */
    override var providerId: java.lang.String = js.native
    /* CompleteClass */
    override def addScope(scope: java.lang.String): firebaseLib.firebaseMod.firebaseNs.authNs.AuthProvider = js.native
    /* CompleteClass */
    override def setCustomParameters(customOAuthParameters: coreDashJsLib.Object): firebaseLib.firebaseMod.firebaseNs.authNs.AuthProvider = js.native
  }
  
  @js.native
  class FacebookAuthProvider_Instance ()
    extends firebaseLib.firebaseMod.firebaseNs.authNs.FacebookAuthProvider_Instance {
    /* CompleteClass */
    override var providerId: java.lang.String = js.native
    /* CompleteClass */
    override def addScope(scope: java.lang.String): firebaseLib.firebaseMod.firebaseNs.authNs.AuthProvider = js.native
    /* CompleteClass */
    override def setCustomParameters(customOAuthParameters: coreDashJsLib.Object): firebaseLib.firebaseMod.firebaseNs.authNs.AuthProvider = js.native
  }
  
  @js.native
  class GithubAuthProvider ()
    extends firebaseLib.firebaseMod.firebaseNs.authNs.GithubAuthProvider {
    /* CompleteClass */
    override var providerId: java.lang.String = js.native
    /* CompleteClass */
    override def addScope(scope: java.lang.String): firebaseLib.firebaseMod.firebaseNs.authNs.AuthProvider = js.native
    /* CompleteClass */
    override def setCustomParameters(customOAuthParameters: coreDashJsLib.Object): firebaseLib.firebaseMod.firebaseNs.authNs.AuthProvider = js.native
  }
  
  @js.native
  class GithubAuthProvider_Instance ()
    extends firebaseLib.firebaseMod.firebaseNs.authNs.GithubAuthProvider_Instance {
    /* CompleteClass */
    override var providerId: java.lang.String = js.native
    /* CompleteClass */
    override def addScope(scope: java.lang.String): firebaseLib.firebaseMod.firebaseNs.authNs.AuthProvider = js.native
    /* CompleteClass */
    override def setCustomParameters(customOAuthParameters: coreDashJsLib.Object): firebaseLib.firebaseMod.firebaseNs.authNs.AuthProvider = js.native
  }
  
  @js.native
  class GoogleAuthProvider ()
    extends firebaseLib.firebaseMod.firebaseNs.authNs.GoogleAuthProvider {
    /* CompleteClass */
    override var providerId: java.lang.String = js.native
    /* CompleteClass */
    override def addScope(scope: java.lang.String): firebaseLib.firebaseMod.firebaseNs.authNs.AuthProvider = js.native
    /* CompleteClass */
    override def setCustomParameters(customOAuthParameters: coreDashJsLib.Object): firebaseLib.firebaseMod.firebaseNs.authNs.AuthProvider = js.native
  }
  
  @js.native
  class GoogleAuthProvider_Instance ()
    extends firebaseLib.firebaseMod.firebaseNs.authNs.GoogleAuthProvider_Instance {
    /* CompleteClass */
    override var providerId: java.lang.String = js.native
    /* CompleteClass */
    override def addScope(scope: java.lang.String): firebaseLib.firebaseMod.firebaseNs.authNs.AuthProvider = js.native
    /* CompleteClass */
    override def setCustomParameters(customOAuthParameters: coreDashJsLib.Object): firebaseLib.firebaseMod.firebaseNs.authNs.AuthProvider = js.native
  }
  
  @js.native
  class OAuthProvider ()
    extends firebaseLib.firebaseMod.firebaseNs.authNs.OAuthProvider {
    /* CompleteClass */
    override var providerId: java.lang.String = js.native
  }
  
  @js.native
  class PhoneAuthProvider ()
    extends firebaseLib.firebaseMod.firebaseNs.authNs.PhoneAuthProvider {
    /* CompleteClass */
    override var providerId: java.lang.String = js.native
    /* CompleteClass */
    override def verifyPhoneNumber(
      phoneNumber: java.lang.String,
      applicationVerifier: firebaseLib.firebaseMod.firebaseNs.authNs.ApplicationVerifier
    ): js.Promise[java.lang.String] = js.native
  }
  
  @js.native
  class PhoneAuthProvider_Instance ()
    extends firebaseLib.firebaseMod.firebaseNs.authNs.PhoneAuthProvider_Instance {
    def this(auth: firebaseLib.firebaseMod.firebaseNs.authNs.Auth) = this()
    /* CompleteClass */
    override var providerId: java.lang.String = js.native
    /* CompleteClass */
    override def verifyPhoneNumber(
      phoneNumber: java.lang.String,
      applicationVerifier: firebaseLib.firebaseMod.firebaseNs.authNs.ApplicationVerifier
    ): js.Promise[java.lang.String] = js.native
  }
  
  @js.native
  class RecaptchaVerifier ()
    extends firebaseLib.firebaseMod.firebaseNs.authNs.RecaptchaVerifier {
    /* CompleteClass */
    override var `type`: java.lang.String = js.native
    /* CompleteClass */
    override def clear(): scala.Unit = js.native
    /* CompleteClass */
    override def render(): js.Promise[scala.Double] = js.native
    /* CompleteClass */
    override def verify(): js.Promise[java.lang.String] = js.native
  }
  
  @js.native
  class RecaptchaVerifier_Instance protected ()
    extends firebaseLib.firebaseMod.firebaseNs.authNs.RecaptchaVerifier_Instance {
    def this(container: java.lang.String) = this()
    def this(container: js.Any) = this()
    def this(container: java.lang.String, parameters: coreDashJsLib.Object) = this()
    def this(container: js.Any, parameters: coreDashJsLib.Object) = this()
    def this(container: java.lang.String, parameters: coreDashJsLib.Object, app: firebaseLib.firebaseMod.firebaseNs.appNs.App) = this()
    def this(container: java.lang.String, parameters: scala.Null, app: firebaseLib.firebaseMod.firebaseNs.appNs.App) = this()
    def this(container: js.Any, parameters: coreDashJsLib.Object, app: firebaseLib.firebaseMod.firebaseNs.appNs.App) = this()
    def this(container: js.Any, parameters: scala.Null, app: firebaseLib.firebaseMod.firebaseNs.appNs.App) = this()
    /* CompleteClass */
    override var `type`: java.lang.String = js.native
    /* CompleteClass */
    override def clear(): scala.Unit = js.native
    /* CompleteClass */
    override def render(): js.Promise[scala.Double] = js.native
    /* CompleteClass */
    override def verify(): js.Promise[java.lang.String] = js.native
  }
  
  @js.native
  class SAMLAuthProvider ()
    extends firebaseLib.firebaseMod.firebaseNs.authNs.SAMLAuthProvider {
    /* CompleteClass */
    override var providerId: java.lang.String = js.native
  }
  
  @js.native
  class TwitterAuthProvider ()
    extends firebaseLib.firebaseMod.firebaseNs.authNs.TwitterAuthProvider {
    /* CompleteClass */
    override var providerId: java.lang.String = js.native
    /* CompleteClass */
    override def setCustomParameters(customOAuthParameters: coreDashJsLib.Object): firebaseLib.firebaseMod.firebaseNs.authNs.AuthProvider = js.native
  }
  
  @js.native
  class TwitterAuthProvider_Instance ()
    extends firebaseLib.firebaseMod.firebaseNs.authNs.TwitterAuthProvider_Instance {
    /* CompleteClass */
    override var providerId: java.lang.String = js.native
    /* CompleteClass */
    override def setCustomParameters(customOAuthParameters: coreDashJsLib.Object): firebaseLib.firebaseMod.firebaseNs.authNs.AuthProvider = js.native
  }
  
  @JSName("Auth")
  @js.native
  object AuthNs extends js.Object {
    var Persistence: firebaseLib.Anon_LOCAL = js.native
  }
  
  /* static members */
  @js.native
  object EmailAuthProvider extends js.Object {
    var EMAIL_LINK_SIGN_IN_METHOD: java.lang.String = js.native
    var EMAIL_PASSWORD_SIGN_IN_METHOD: java.lang.String = js.native
    var PROVIDER_ID: java.lang.String = js.native
    def credential(email: java.lang.String, password: java.lang.String): firebaseLib.firebaseMod.firebaseNs.authNs.AuthCredential = js.native
    def credentialWithLink(email: java.lang.String, emailLink: java.lang.String): firebaseLib.firebaseMod.firebaseNs.authNs.AuthCredential = js.native
  }
  
  /* static members */
  @js.native
  object FacebookAuthProvider extends js.Object {
    var FACEBOOK_SIGN_IN_METHOD: java.lang.String = js.native
    var PROVIDER_ID: java.lang.String = js.native
    def credential(token: java.lang.String): firebaseLib.firebaseMod.firebaseNs.authNs.AuthCredential = js.native
  }
  
  /* static members */
  @js.native
  object GithubAuthProvider extends js.Object {
    var GITHUB_SIGN_IN_METHOD: java.lang.String = js.native
    var PROVIDER_ID: java.lang.String = js.native
    def credential(token: java.lang.String): firebaseLib.firebaseMod.firebaseNs.authNs.AuthCredential = js.native
  }
  
  /* static members */
  @js.native
  object GoogleAuthProvider extends js.Object {
    var GOOGLE_SIGN_IN_METHOD: java.lang.String = js.native
    var PROVIDER_ID: java.lang.String = js.native
    def credential(): firebaseLib.firebaseMod.firebaseNs.authNs.AuthCredential = js.native
    def credential(idToken: java.lang.String): firebaseLib.firebaseMod.firebaseNs.authNs.AuthCredential = js.native
    def credential(idToken: java.lang.String, accessToken: java.lang.String): firebaseLib.firebaseMod.firebaseNs.authNs.AuthCredential = js.native
    def credential(idToken: scala.Null, accessToken: java.lang.String): firebaseLib.firebaseMod.firebaseNs.authNs.AuthCredential = js.native
  }
  
  /* static members */
  @js.native
  object PhoneAuthProvider extends js.Object {
    var PHONE_SIGN_IN_METHOD: java.lang.String = js.native
    var PROVIDER_ID: java.lang.String = js.native
    def credential(verificationId: java.lang.String, verificationCode: java.lang.String): firebaseLib.firebaseMod.firebaseNs.authNs.AuthCredential = js.native
  }
  
  /* static members */
  @js.native
  object TwitterAuthProvider extends js.Object {
    var PROVIDER_ID: java.lang.String = js.native
    var TWITTER_SIGN_IN_METHOD: java.lang.String = js.native
    def credential(token: java.lang.String, secret: java.lang.String): firebaseLib.firebaseMod.firebaseNs.authNs.AuthCredential = js.native
  }
  
}

