package typings.firebaseAuth

import typings.firebaseAuth.anon.Action
import typings.firebaseAuth.distBrowserCjsSrcApiAuthenticationRecaptchaMod.GetRecaptchaConfigResponse
import typings.firebaseAuth.distBrowserCjsSrcModelPublicTypesMod.RecaptchaParameters
import typings.firebaseAuth.firebaseAuthStrings.invisible
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distBrowserCjsSrcPlatformBrowserRecaptchaRecaptchaMod {
  
  @JSImport("@firebase/auth/dist/browser-cjs/src/platform_browser/recaptcha/recaptcha", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@firebase/auth/dist/browser-cjs/src/platform_browser/recaptcha/recaptcha", "RecaptchaConfig")
  @js.native
  open class RecaptchaConfig protected () extends StObject {
    def this(response: GetRecaptchaConfigResponse) = this()
    
    /**
      * The reCAPTCHA enablement status of the {@link EmailAuthProvider} for the current tenant.
      */
    var emailPasswordEnabled: Boolean = js.native
    
    /**
      * The reCAPTCHA site key.
      */
    var siteKey: String = js.native
  }
  
  inline def isEnterprise(): /* is @firebase/auth.@firebase/auth/dist/browser-cjs/src/platform_browser/recaptcha/recaptcha.GreCAPTCHATopLevel */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEnterprise")().asInstanceOf[/* is @firebase/auth.@firebase/auth/dist/browser-cjs/src/platform_browser/recaptcha/recaptcha.GreCAPTCHATopLevel */ Boolean]
  inline def isEnterprise(grecaptcha: GreCAPTCHA): /* is @firebase/auth.@firebase/auth/dist/browser-cjs/src/platform_browser/recaptcha/recaptcha.GreCAPTCHATopLevel */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEnterprise")(grecaptcha.asInstanceOf[js.Any]).asInstanceOf[/* is @firebase/auth.@firebase/auth/dist/browser-cjs/src/platform_browser/recaptcha/recaptcha.GreCAPTCHATopLevel */ Boolean]
  inline def isEnterprise(grecaptcha: Recaptcha): /* is @firebase/auth.@firebase/auth/dist/browser-cjs/src/platform_browser/recaptcha/recaptcha.GreCAPTCHATopLevel */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEnterprise")(grecaptcha.asInstanceOf[js.Any]).asInstanceOf[/* is @firebase/auth.@firebase/auth/dist/browser-cjs/src/platform_browser/recaptcha/recaptcha.GreCAPTCHATopLevel */ Boolean]
  
  inline def isV2(): /* is @firebase/auth.@firebase/auth/dist/browser-cjs/src/platform_browser/recaptcha/recaptcha.Recaptcha */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isV2")().asInstanceOf[/* is @firebase/auth.@firebase/auth/dist/browser-cjs/src/platform_browser/recaptcha/recaptcha.Recaptcha */ Boolean]
  inline def isV2(grecaptcha: GreCAPTCHA): /* is @firebase/auth.@firebase/auth/dist/browser-cjs/src/platform_browser/recaptcha/recaptcha.Recaptcha */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isV2")(grecaptcha.asInstanceOf[js.Any]).asInstanceOf[/* is @firebase/auth.@firebase/auth/dist/browser-cjs/src/platform_browser/recaptcha/recaptcha.Recaptcha */ Boolean]
  inline def isV2(grecaptcha: Recaptcha): /* is @firebase/auth.@firebase/auth/dist/browser-cjs/src/platform_browser/recaptcha/recaptcha.Recaptcha */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isV2")(grecaptcha.asInstanceOf[js.Any]).asInstanceOf[/* is @firebase/auth.@firebase/auth/dist/browser-cjs/src/platform_browser/recaptcha/recaptcha.Recaptcha */ Boolean]
  
  @js.native
  trait GreCAPTCHA extends StObject {
    
    def execute(siteKey: String, options: Action): js.Promise[String] = js.native
    
    def ready(callback: js.Function0[Unit]): Unit = js.native
    
    def render(container: String, parameters: GreCAPTCHARenderOption): String = js.native
    def render(container: HTMLElement, parameters: GreCAPTCHARenderOption): String = js.native
  }
  
  trait GreCAPTCHARenderOption extends StObject {
    
    var sitekey: String
    
    var size: invisible
  }
  object GreCAPTCHARenderOption {
    
    inline def apply(sitekey: String): GreCAPTCHARenderOption = {
      val __obj = js.Dynamic.literal(sitekey = sitekey.asInstanceOf[js.Any], size = "invisible")
      __obj.asInstanceOf[GreCAPTCHARenderOption]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GreCAPTCHARenderOption] (val x: Self) extends AnyVal {
      
      inline def setSitekey(value: String): Self = StObject.set(x, "sitekey", value.asInstanceOf[js.Any])
      
      inline def setSize(value: invisible): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait GreCAPTCHATopLevel
    extends StObject
       with GreCAPTCHA {
    
    var enterprise: GreCAPTCHA = js.native
  }
  
  trait Recaptcha extends StObject {
    
    def execute(id: Double): Any
    
    def getResponse(id: Double): String
    
    def render(container: HTMLElement, parameters: RecaptchaParameters): Double
    
    def reset(id: Double): Any
  }
  object Recaptcha {
    
    inline def apply(
      execute: Double => Any,
      getResponse: Double => String,
      render: (HTMLElement, RecaptchaParameters) => Double,
      reset: Double => Any
    ): Recaptcha = {
      val __obj = js.Dynamic.literal(execute = js.Any.fromFunction1(execute), getResponse = js.Any.fromFunction1(getResponse), render = js.Any.fromFunction2(render), reset = js.Any.fromFunction1(reset))
      __obj.asInstanceOf[Recaptcha]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Recaptcha] (val x: Self) extends AnyVal {
      
      inline def setExecute(value: Double => Any): Self = StObject.set(x, "execute", js.Any.fromFunction1(value))
      
      inline def setGetResponse(value: Double => String): Self = StObject.set(x, "getResponse", js.Any.fromFunction1(value))
      
      inline def setRender(value: (HTMLElement, RecaptchaParameters) => Double): Self = StObject.set(x, "render", js.Any.fromFunction2(value))
      
      inline def setReset(value: Double => Any): Self = StObject.set(x, "reset", js.Any.fromFunction1(value))
    }
  }
  
  object global {
    
    trait Window extends StObject {
      
      var grecaptcha: js.UndefOr[Recaptcha | GreCAPTCHATopLevel] = js.undefined
    }
    object Window {
      
      inline def apply(): Window = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Window]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Window] (val x: Self) extends AnyVal {
        
        inline def setGrecaptcha(value: Recaptcha | GreCAPTCHATopLevel): Self = StObject.set(x, "grecaptcha", value.asInstanceOf[js.Any])
        
        inline def setGrecaptchaUndefined: Self = StObject.set(x, "grecaptcha", js.undefined)
      }
    }
  }
}
