package typings.firebaseAuth

import typings.firebaseAuth.distCordovaSrcApiMod.RecaptchaActionName
import typings.firebaseAuth.distCordovaSrcModelAuthMod.AuthInternal
import typings.firebaseAuth.distCordovaSrcModelPublicTypesMod.Auth
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCordovaSrcPlatformBrowserRecaptchaRecaptchaEnterpriseVerifierMod {
  
  @JSImport("@firebase/auth/dist/cordova/src/platform_browser/recaptcha/recaptcha_enterprise_verifier", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@firebase/auth/dist/cordova/src/platform_browser/recaptcha/recaptcha_enterprise_verifier", "FAKE_TOKEN")
  @js.native
  val FAKE_TOKEN: /* "NO_RECAPTCHA" */ String = js.native
  
  @JSImport("@firebase/auth/dist/cordova/src/platform_browser/recaptcha/recaptcha_enterprise_verifier", "RECAPTCHA_ENTERPRISE_VERIFIER_TYPE")
  @js.native
  val RECAPTCHA_ENTERPRISE_VERIFIER_TYPE: /* "recaptcha-enterprise" */ String = js.native
  
  @JSImport("@firebase/auth/dist/cordova/src/platform_browser/recaptcha/recaptcha_enterprise_verifier", "RecaptchaEnterpriseVerifier")
  @js.native
  open class RecaptchaEnterpriseVerifier protected () extends StObject {
    /**
      *
      * @param authExtern - The corresponding Firebase {@link Auth} instance.
      *
      */
    def this(authExtern: Auth) = this()
    
    /* private */ val auth: Any = js.native
    
    /**
      * Identifies the type of application verifier (e.g. "recaptcha-enterprise").
      */
    val `type`: /* "recaptcha-enterprise" */ String = js.native
    
    /**
      * Executes the verification process.
      *
      * @returns A Promise for a token that can be used to assert the validity of a request.
      */
    def verify(): js.Promise[String] = js.native
    def verify(action: String): js.Promise[String] = js.native
    def verify(action: String, forceRefresh: Boolean): js.Promise[String] = js.native
    def verify(action: Unit, forceRefresh: Boolean): js.Promise[String] = js.native
  }
  
  inline def injectRecaptchaFields[T](auth: AuthInternal, request: T, action: RecaptchaActionName): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("injectRecaptchaFields")(auth.asInstanceOf[js.Any], request.asInstanceOf[js.Any], action.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  inline def injectRecaptchaFields[T](auth: AuthInternal, request: T, action: RecaptchaActionName, captchaResp: Boolean): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("injectRecaptchaFields")(auth.asInstanceOf[js.Any], request.asInstanceOf[js.Any], action.asInstanceOf[js.Any], captchaResp.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
}
