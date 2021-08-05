package typings.duoWebSdk

import typings.std.HTMLElement
import typings.std.HTMLFormElement
import typings.std.HTMLIFrameElement
import typings.std.MessageEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("duo_web_sdk", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def doPostBack(response: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_doPostBack")(response.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def init(options: InitOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def isDuoMessage(event: MessageEvent[js.Any]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("_isDuoMessage")(event.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def onReady(callback: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_onReady")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def parseSigRequest(sig: String): ParsedSig = ^.asInstanceOf[js.Dynamic].applyDynamic("_parseSigRequest")(sig.asInstanceOf[js.Any]).asInstanceOf[ParsedSig]
  
  trait InitOptions extends StObject {
    
    var host: String
    
    var iframe: js.UndefOr[String | HTMLIFrameElement] = js.undefined
    
    var iframeAttributes: js.UndefOr[js.Object] = js.undefined
    
    var iframeContainer: js.UndefOr[String | HTMLElement] = js.undefined
    
    var post_action: js.UndefOr[String] = js.undefined
    
    var post_argument: js.UndefOr[String] = js.undefined
    
    var sig_request: String
    
    var submit_callback: js.UndefOr[js.Function1[/* duo_form */ HTMLFormElement, Unit]] = js.undefined
  }
  object InitOptions {
    
    inline def apply(host: String, sig_request: String): InitOptions = {
      val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], sig_request = sig_request.asInstanceOf[js.Any])
      __obj.asInstanceOf[InitOptions]
    }
    
    extension [Self <: InitOptions](x: Self) {
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setIframe(value: String | HTMLIFrameElement): Self = StObject.set(x, "iframe", value.asInstanceOf[js.Any])
      
      inline def setIframeAttributes(value: js.Object): Self = StObject.set(x, "iframeAttributes", value.asInstanceOf[js.Any])
      
      inline def setIframeAttributesUndefined: Self = StObject.set(x, "iframeAttributes", js.undefined)
      
      inline def setIframeContainer(value: String | HTMLElement): Self = StObject.set(x, "iframeContainer", value.asInstanceOf[js.Any])
      
      inline def setIframeContainerUndefined: Self = StObject.set(x, "iframeContainer", js.undefined)
      
      inline def setIframeUndefined: Self = StObject.set(x, "iframe", js.undefined)
      
      inline def setPost_action(value: String): Self = StObject.set(x, "post_action", value.asInstanceOf[js.Any])
      
      inline def setPost_actionUndefined: Self = StObject.set(x, "post_action", js.undefined)
      
      inline def setPost_argument(value: String): Self = StObject.set(x, "post_argument", value.asInstanceOf[js.Any])
      
      inline def setPost_argumentUndefined: Self = StObject.set(x, "post_argument", js.undefined)
      
      inline def setSig_request(value: String): Self = StObject.set(x, "sig_request", value.asInstanceOf[js.Any])
      
      inline def setSubmit_callback(value: /* duo_form */ HTMLFormElement => Unit): Self = StObject.set(x, "submit_callback", js.Any.fromFunction1(value))
      
      inline def setSubmit_callbackUndefined: Self = StObject.set(x, "submit_callback", js.undefined)
    }
  }
  
  trait ParsedSig extends StObject {
    
    var appSig: String
    
    var duoSig: String
    
    var sigRequest: String
  }
  object ParsedSig {
    
    inline def apply(appSig: String, duoSig: String, sigRequest: String): ParsedSig = {
      val __obj = js.Dynamic.literal(appSig = appSig.asInstanceOf[js.Any], duoSig = duoSig.asInstanceOf[js.Any], sigRequest = sigRequest.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParsedSig]
    }
    
    extension [Self <: ParsedSig](x: Self) {
      
      inline def setAppSig(value: String): Self = StObject.set(x, "appSig", value.asInstanceOf[js.Any])
      
      inline def setDuoSig(value: String): Self = StObject.set(x, "duoSig", value.asInstanceOf[js.Any])
      
      inline def setSigRequest(value: String): Self = StObject.set(x, "sigRequest", value.asInstanceOf[js.Any])
    }
  }
}
