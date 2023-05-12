package typings.firebaseAuth

import typings.firebaseAuth.distEsm2017SrcModelAuthMod.AuthInternal
import typings.firebaseAuth.distEsm2017SrcModelPublicTypesMod.RecaptchaParameters
import typings.firebaseAuth.distEsm2017SrcPlatformBrowserRecaptchaRecaptchaMod.GreCAPTCHA
import typings.firebaseAuth.distEsm2017SrcPlatformBrowserRecaptchaRecaptchaMod.GreCAPTCHATopLevel
import typings.firebaseAuth.distEsm2017SrcPlatformBrowserRecaptchaRecaptchaMod.Recaptcha
import typings.std.HTMLElement
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsm2017SrcPlatformBrowserRecaptchaRecaptchaMockMod {
  
  @JSImport("@firebase/auth/dist/esm2017/src/platform_browser/recaptcha/recaptcha_mock", "MockGreCAPTCHA")
  @js.native
  open class MockGreCAPTCHA ()
    extends StObject
       with GreCAPTCHA
  
  @JSImport("@firebase/auth/dist/esm2017/src/platform_browser/recaptcha/recaptcha_mock", "MockGreCAPTCHATopLevel")
  @js.native
  open class MockGreCAPTCHATopLevel ()
    extends StObject
       with GreCAPTCHATopLevel
  
  @JSImport("@firebase/auth/dist/esm2017/src/platform_browser/recaptcha/recaptcha_mock", "MockReCaptcha")
  @js.native
  open class MockReCaptcha protected ()
    extends StObject
       with Recaptcha {
    def this(auth: AuthInternal) = this()
    
    var _widgets: Map[Double, Widget] = js.native
    
    /* private */ val auth: Any = js.native
    
    /* private */ var counter: Any = js.native
    
    def execute(): js.Promise[String] = js.native
    /* CompleteClass */
    override def execute(id: Double): Any = js.native
    def execute(optWidgetId: String): js.Promise[String] = js.native
    
    def getResponse(): String = js.native
    /* CompleteClass */
    override def getResponse(id: Double): String = js.native
    
    def render(container: String): Double = js.native
    def render(container: String, parameters: RecaptchaParameters): Double = js.native
    def render(container: HTMLElement): Double = js.native
    /* CompleteClass */
    override def render(container: HTMLElement, parameters: RecaptchaParameters): Double = js.native
    
    def reset(): Unit = js.native
    /* CompleteClass */
    override def reset(id: Double): Any = js.native
  }
  
  @JSImport("@firebase/auth/dist/esm2017/src/platform_browser/recaptcha/recaptcha_mock", "MockWidget")
  @js.native
  open class MockWidget protected () extends StObject {
    def this(containerOrId: String, appName: String, params: RecaptchaParameters) = this()
    def this(containerOrId: HTMLElement, appName: String, params: RecaptchaParameters) = this()
    
    /* private */ var checkIfDeleted: Any = js.native
    
    /* private */ val clickHandler: Any = js.native
    
    /* private */ val container: Any = js.native
    
    def delete(): Unit = js.native
    
    /* private */ var deleted: Any = js.native
    
    def execute(): Unit = js.native
    
    def getResponse(): String | Null = js.native
    
    /* private */ val isVisible: Any = js.native
    
    /* private */ val params: Any = js.native
    
    /* private */ var responseToken: Any = js.native
    
    /* private */ var timerId: Any = js.native
  }
  
  @JSImport("@firebase/auth/dist/esm2017/src/platform_browser/recaptcha/recaptcha_mock", "_EXPIRATION_TIME_MS")
  @js.native
  val _EXPIRATION_TIME_MS: /* 60000 */ Double = js.native
  
  @JSImport("@firebase/auth/dist/esm2017/src/platform_browser/recaptcha/recaptcha_mock", "_SOLVE_TIME_MS")
  @js.native
  val _SOLVE_TIME_MS: /* 500 */ Double = js.native
  
  @JSImport("@firebase/auth/dist/esm2017/src/platform_browser/recaptcha/recaptcha_mock", "_WIDGET_ID_START")
  @js.native
  val _WIDGET_ID_START: /* 1000000000000.0 */ Double = js.native
  
  trait Widget extends StObject {
    
    def delete(): Unit
    
    def execute(): Unit
    
    def getResponse(): String | Null
  }
  object Widget {
    
    inline def apply(delete: () => Unit, execute: () => Unit, getResponse: () => String | Null): Widget = {
      val __obj = js.Dynamic.literal(delete = js.Any.fromFunction0(delete), execute = js.Any.fromFunction0(execute), getResponse = js.Any.fromFunction0(getResponse))
      __obj.asInstanceOf[Widget]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Widget] (val x: Self) extends AnyVal {
      
      inline def setDelete(value: () => Unit): Self = StObject.set(x, "delete", js.Any.fromFunction0(value))
      
      inline def setExecute(value: () => Unit): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
      
      inline def setGetResponse(value: () => String | Null): Self = StObject.set(x, "getResponse", js.Any.fromFunction0(value))
    }
  }
}
