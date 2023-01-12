package typings.firebaseAppCheck

import typings.firebaseApp.mod.FirebaseApp
import typings.firebaseAppCheck.anon.Action
import typings.firebaseAppCheck.firebaseAppCheckStrings.invisible
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcRecaptchaMod {
  
  @JSImport("@firebase/app-check/dist/src/recaptcha", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@firebase/app-check/dist/src/recaptcha", "RECAPTCHA_ENTERPRISE_URL")
  @js.native
  val RECAPTCHA_ENTERPRISE_URL: /* "https://www.google.com/recaptcha/enterprise.js" */ String = js.native
  
  @JSImport("@firebase/app-check/dist/src/recaptcha", "RECAPTCHA_URL")
  @js.native
  val RECAPTCHA_URL: /* "https://www.google.com/recaptcha/api.js" */ String = js.native
  
  inline def getToken(app: FirebaseApp): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getToken")(app.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  inline def initializeEnterprise(app: FirebaseApp, siteKey: String): js.Promise[GreCAPTCHA] = (^.asInstanceOf[js.Dynamic].applyDynamic("initializeEnterprise")(app.asInstanceOf[js.Any], siteKey.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GreCAPTCHA]]
  
  inline def initializeV3(app: FirebaseApp, siteKey: String): js.Promise[GreCAPTCHA] = (^.asInstanceOf[js.Dynamic].applyDynamic("initializeV3")(app.asInstanceOf[js.Any], siteKey.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GreCAPTCHA]]
  
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
  
  object global {
    
    trait Window extends StObject {
      
      var grecaptcha: js.UndefOr[GreCAPTCHATopLevel] = js.undefined
    }
    object Window {
      
      inline def apply(): Window = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Window]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Window] (val x: Self) extends AnyVal {
        
        inline def setGrecaptcha(value: GreCAPTCHATopLevel): Self = StObject.set(x, "grecaptcha", value.asInstanceOf[js.Any])
        
        inline def setGrecaptchaUndefined: Self = StObject.set(x, "grecaptcha", js.undefined)
      }
    }
  }
}
