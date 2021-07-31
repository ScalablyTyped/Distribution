package typings.dropboxjs.Dropbox

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthDriver extends StObject {
  
  def authType(): String
  
  def doAuthorize(authUrl: String, stateParam: String, client: Client, callback: QueryParamsCallback): Unit
  
  def getStateParam(client: Client, callback: js.Function1[/* state */ String, Unit]): Unit
  
  def onAuthStepChange(client: Client, callback: js.Function0[Unit]): Unit
  
  def resumeAuthorize(stateParam: String, client: Client, callback: QueryParamsCallback): Unit
  
  def url(): String
}
object AuthDriver {
  
  @scala.inline
  def apply(
    authType: () => String,
    doAuthorize: (String, String, Client, QueryParamsCallback) => Unit,
    getStateParam: (Client, js.Function1[/* state */ String, Unit]) => Unit,
    onAuthStepChange: (Client, js.Function0[Unit]) => Unit,
    resumeAuthorize: (String, Client, QueryParamsCallback) => Unit,
    url: () => String
  ): AuthDriver = {
    val __obj = js.Dynamic.literal(authType = js.Any.fromFunction0(authType), doAuthorize = js.Any.fromFunction4(doAuthorize), getStateParam = js.Any.fromFunction2(getStateParam), onAuthStepChange = js.Any.fromFunction2(onAuthStepChange), resumeAuthorize = js.Any.fromFunction3(resumeAuthorize), url = js.Any.fromFunction0(url))
    __obj.asInstanceOf[AuthDriver]
  }
  
  @scala.inline
  implicit class AuthDriverMutableBuilder[Self <: AuthDriver] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthType(value: () => String): Self = StObject.set(x, "authType", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDoAuthorize(value: (String, String, Client, QueryParamsCallback) => Unit): Self = StObject.set(x, "doAuthorize", js.Any.fromFunction4(value))
    
    @scala.inline
    def setGetStateParam(value: (Client, js.Function1[/* state */ String, Unit]) => Unit): Self = StObject.set(x, "getStateParam", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnAuthStepChange(value: (Client, js.Function0[Unit]) => Unit): Self = StObject.set(x, "onAuthStepChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def setResumeAuthorize(value: (String, Client, QueryParamsCallback) => Unit): Self = StObject.set(x, "resumeAuthorize", js.Any.fromFunction3(value))
    
    @scala.inline
    def setUrl(value: () => String): Self = StObject.set(x, "url", js.Any.fromFunction0(value))
  }
  
  trait BrowserBase extends StObject {
    
    def authType(): String
    
    def locationStateParam(url: String): String
    
    def onAuthStepChange(client: Client, callback: js.Function0[Unit]): Unit
  }
  object BrowserBase {
    
    @scala.inline
    def apply(
      authType: () => String,
      locationStateParam: String => String,
      onAuthStepChange: (Client, js.Function0[Unit]) => Unit
    ): BrowserBase = {
      val __obj = js.Dynamic.literal(authType = js.Any.fromFunction0(authType), locationStateParam = js.Any.fromFunction1(locationStateParam), onAuthStepChange = js.Any.fromFunction2(onAuthStepChange))
      __obj.asInstanceOf[BrowserBase]
    }
    
    @scala.inline
    implicit class BrowserBaseMutableBuilder[Self <: BrowserBase] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuthType(value: () => String): Self = StObject.set(x, "authType", js.Any.fromFunction0(value))
      
      @scala.inline
      def setLocationStateParam(value: String => String): Self = StObject.set(x, "locationStateParam", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnAuthStepChange(value: (Client, js.Function0[Unit]) => Unit): Self = StObject.set(x, "onAuthStepChange", js.Any.fromFunction2(value))
    }
  }
  
  type ChromeApp = IAuthDriver
  
  type ChromeExtension = IAuthDriver
  
  @js.native
  trait Cordova
    extends StObject
       with IAuthDriver {
    
    def url(): String = js.native
  }
  
  /** Do not use class! TypeScript definition implementation detail : https://github.com/Microsoft/TypeScript/issues/371 */
  @js.native
  trait IAuthDriver extends StObject {
    
    def doAuthorize(authUrl: String, stateParam: String, client: Client): Unit = js.native
    def doAuthorize(authUrl: String, stateParam: String, client: Client, callback: QueryParamsCallback): Unit = js.native
  }
  
  @js.native
  trait NodeServer
    extends StObject
       with IAuthDriver {
    
    def authType(): String = js.native
    
    def closeBrowser(response: js.Any): Unit = js.native
    
    def closeServer(): Unit = js.native
    
    def createApp(): Unit = js.native
    
    // TODO check request response types
    def doRequest(request: js.Any, response: js.Any): Unit = js.native
    
    def openBrowser(url: String): Unit = js.native
    
    def url(): String = js.native
  }
  
  @js.native
  trait Popup
    extends StObject
       with IAuthDriver {
    
    def url(): String = js.native
  }
  
  trait Redirect extends StObject {
    
    def doAuthorize(authUrl: String, stateParam: String, client: Client): Unit
    
    def resumeAuthorize(stateParam: String, client: Client, callback: QueryParamsCallback): Unit
    
    def url(): String
  }
  object Redirect {
    
    @scala.inline
    def apply(
      doAuthorize: (String, String, Client) => Unit,
      resumeAuthorize: (String, Client, QueryParamsCallback) => Unit,
      url: () => String
    ): Redirect = {
      val __obj = js.Dynamic.literal(doAuthorize = js.Any.fromFunction3(doAuthorize), resumeAuthorize = js.Any.fromFunction3(resumeAuthorize), url = js.Any.fromFunction0(url))
      __obj.asInstanceOf[Redirect]
    }
    
    @scala.inline
    implicit class RedirectMutableBuilder[Self <: Redirect] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDoAuthorize(value: (String, String, Client) => Unit): Self = StObject.set(x, "doAuthorize", js.Any.fromFunction3(value))
      
      @scala.inline
      def setResumeAuthorize(value: (String, Client, QueryParamsCallback) => Unit): Self = StObject.set(x, "resumeAuthorize", js.Any.fromFunction3(value))
      
      @scala.inline
      def setUrl(value: () => String): Self = StObject.set(x, "url", js.Any.fromFunction0(value))
    }
  }
}
