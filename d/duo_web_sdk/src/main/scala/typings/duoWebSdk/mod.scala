package typings.duoWebSdk

import typings.std.HTMLElement
import typings.std.HTMLFormElement
import typings.std.HTMLIFrameElement
import typings.std.MessageEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("duo_web_sdk", "_doPostBack")
  @js.native
  def doPostBack(response: String): Unit = js.native
  
  @JSImport("duo_web_sdk", "init")
  @js.native
  def init(options: InitOptions): Unit = js.native
  
  @JSImport("duo_web_sdk", "_isDuoMessage")
  @js.native
  def isDuoMessage(event: MessageEvent[_]): Boolean = js.native
  
  @JSImport("duo_web_sdk", "_onReady")
  @js.native
  def onReady(callback: js.Function0[Unit]): Unit = js.native
  
  @JSImport("duo_web_sdk", "_parseSigRequest")
  @js.native
  def parseSigRequest(sig: String): ParsedSig = js.native
  
  @js.native
  trait InitOptions extends StObject {
    
    var host: String = js.native
    
    var iframe: js.UndefOr[String | HTMLIFrameElement] = js.native
    
    var iframeAttributes: js.UndefOr[js.Object] = js.native
    
    var iframeContainer: js.UndefOr[String | HTMLElement] = js.native
    
    var post_action: js.UndefOr[String] = js.native
    
    var post_argument: js.UndefOr[String] = js.native
    
    var sig_request: String = js.native
    
    var submit_callback: js.UndefOr[js.Function1[/* duo_form */ HTMLFormElement, Unit]] = js.native
  }
  object InitOptions {
    
    @scala.inline
    def apply(host: String, sig_request: String): InitOptions = {
      val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], sig_request = sig_request.asInstanceOf[js.Any])
      __obj.asInstanceOf[InitOptions]
    }
    
    @scala.inline
    implicit class InitOptionsMutableBuilder[Self <: InitOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIframe(value: String | HTMLIFrameElement): Self = StObject.set(x, "iframe", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIframeAttributes(value: js.Object): Self = StObject.set(x, "iframeAttributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIframeAttributesUndefined: Self = StObject.set(x, "iframeAttributes", js.undefined)
      
      @scala.inline
      def setIframeContainer(value: String | HTMLElement): Self = StObject.set(x, "iframeContainer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIframeContainerUndefined: Self = StObject.set(x, "iframeContainer", js.undefined)
      
      @scala.inline
      def setIframeUndefined: Self = StObject.set(x, "iframe", js.undefined)
      
      @scala.inline
      def setPost_action(value: String): Self = StObject.set(x, "post_action", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPost_actionUndefined: Self = StObject.set(x, "post_action", js.undefined)
      
      @scala.inline
      def setPost_argument(value: String): Self = StObject.set(x, "post_argument", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPost_argumentUndefined: Self = StObject.set(x, "post_argument", js.undefined)
      
      @scala.inline
      def setSig_request(value: String): Self = StObject.set(x, "sig_request", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubmit_callback(value: /* duo_form */ HTMLFormElement => Unit): Self = StObject.set(x, "submit_callback", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSubmit_callbackUndefined: Self = StObject.set(x, "submit_callback", js.undefined)
    }
  }
  
  @js.native
  trait ParsedSig extends StObject {
    
    var appSig: String = js.native
    
    var duoSig: String = js.native
    
    var sigRequest: String = js.native
  }
  object ParsedSig {
    
    @scala.inline
    def apply(appSig: String, duoSig: String, sigRequest: String): ParsedSig = {
      val __obj = js.Dynamic.literal(appSig = appSig.asInstanceOf[js.Any], duoSig = duoSig.asInstanceOf[js.Any], sigRequest = sigRequest.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParsedSig]
    }
    
    @scala.inline
    implicit class ParsedSigMutableBuilder[Self <: ParsedSig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAppSig(value: String): Self = StObject.set(x, "appSig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDuoSig(value: String): Self = StObject.set(x, "duoSig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSigRequest(value: String): Self = StObject.set(x, "sigRequest", value.asInstanceOf[js.Any])
    }
  }
}
