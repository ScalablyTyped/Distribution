package typings.firebaseAuth

import typings.firebaseAuth.distNodeSrcModelAuthMod.AuthInternal
import typings.firebaseAuth.distNodeSrcPlatformBrowserRecaptchaRecaptchaMod.Recaptcha
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNodeSrcPlatformBrowserRecaptchaRecaptchaLoaderMod {
  
  @JSImport("@firebase/auth/dist/node/src/platform_browser/recaptcha/recaptcha_loader", "MockReCaptchaLoaderImpl")
  @js.native
  open class MockReCaptchaLoaderImpl ()
    extends StObject
       with ReCaptchaLoader
  
  @JSImport("@firebase/auth/dist/node/src/platform_browser/recaptcha/recaptcha_loader", "ReCaptchaLoaderImpl")
  @js.native
  open class ReCaptchaLoaderImpl ()
    extends StObject
       with ReCaptchaLoader {
    
    /* private */ var counter: Any = js.native
    
    /* private */ var hostLanguage: Any = js.native
    
    /**
      * Check for `render()` method. `window.grecaptcha` will exist if the Enterprise
      * version of the ReCAPTCHA script was loaded by someone else (e.g. App Check) but
      * `window.grecaptcha.render()` will not. Another load will add it.
      */
    /* private */ val librarySeparatelyLoaded: Any = js.native
    
    /* private */ var shouldResolveImmediately: Any = js.native
  }
  
  @JSImport("@firebase/auth/dist/node/src/platform_browser/recaptcha/recaptcha_loader", "_JSLOAD_CALLBACK")
  @js.native
  val _JSLOAD_CALLBACK: String = js.native
  
  @js.native
  trait ReCaptchaLoader extends StObject {
    
    def clearedOneInstance(): Unit = js.native
    
    def load(auth: AuthInternal): js.Promise[Recaptcha] = js.native
    def load(auth: AuthInternal, hl: String): js.Promise[Recaptcha] = js.native
  }
}
