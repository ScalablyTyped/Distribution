package typings.firebaseAuth

import org.scalablytyped.runtime.StringDictionary
import typings.firebaseAuth.anon.Typeofgapi
import typings.firebaseAuth.distEsm2017SrcPlatformBrowserRecaptchaRecaptchaMod.GreCAPTCHATopLevel
import typings.firebaseAuth.distEsm2017SrcPlatformBrowserRecaptchaRecaptchaMod.Recaptcha
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsm2017SrcPlatformBrowserAuthWindowMod {
  
  @JSImport("@firebase/auth/dist/esm2017/src/platform_browser/auth_window", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def setWindowLocation(url: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_setWindowLocation")(url.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def window(): AuthWindow = ^.asInstanceOf[js.Dynamic].applyDynamic("_window")().asInstanceOf[AuthWindow]
  
  /* Inlined {  grecaptcha :@firebase/auth.@firebase/auth/dist/esm2017/src/platform_browser/recaptcha/recaptcha.Recaptcha | @firebase/auth.@firebase/auth/dist/esm2017/src/platform_browser/recaptcha/recaptcha.GreCAPTCHATopLevel | undefined,   ___jsl :std.Record<string, any> | undefined,   gapi :{readonly load (features : 'gapi.iframes', options : @firebase/auth.gapi.LoadOptions | @firebase/auth.gapi.LoadCallback | undefined): void,  readonly iframes :{  Context :new (): @firebase/auth.gapi.iframes.Context,   Iframe :new (): @firebase/auth.gapi.iframes.Iframe,  readonly CROSS_ORIGIN_IFRAMES_FILTER :@firebase/auth.gapi.iframes.IframesFilter, readonly getContext (): @firebase/auth.gapi.iframes.Context}} | undefined, [callback: string] : (args : ...unknown): void} & {[ T in keyof @firebase/auth.@firebase/auth/dist/src/platform_browser/recaptcha/recaptcha.<global>.Window ]: @firebase/auth.@firebase/auth/dist/src/platform_browser/recaptcha/recaptcha.<global>.Window[T]} */
  trait AuthWindow
    extends StObject
       with /* callback */ StringDictionary[js.Function1[/* repeated */ Any, Unit]] {
    
    var ___jsl: js.UndefOr[Record[String, Any]] = js.undefined
    
    var gapi: js.UndefOr[Typeofgapi] = js.undefined
    
    var grecaptcha: js.UndefOr[Recaptcha | GreCAPTCHATopLevel] = js.undefined
  }
  object AuthWindow {
    
    inline def apply(): AuthWindow = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AuthWindow]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AuthWindow] (val x: Self) extends AnyVal {
      
      inline def setGapi(value: Typeofgapi): Self = StObject.set(x, "gapi", value.asInstanceOf[js.Any])
      
      inline def setGapiUndefined: Self = StObject.set(x, "gapi", js.undefined)
      
      inline def setGrecaptcha(value: Recaptcha | GreCAPTCHATopLevel): Self = StObject.set(x, "grecaptcha", value.asInstanceOf[js.Any])
      
      inline def setGrecaptchaUndefined: Self = StObject.set(x, "grecaptcha", js.undefined)
      
      inline def set___jsl(value: Record[String, Any]): Self = StObject.set(x, "___jsl", value.asInstanceOf[js.Any])
      
      inline def set___jslUndefined: Self = StObject.set(x, "___jsl", js.undefined)
    }
  }
}
