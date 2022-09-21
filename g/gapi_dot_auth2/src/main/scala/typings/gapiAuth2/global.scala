package typings.gapiAuth2

import typings.gapiAuth2.anon.Apppackagename
import typings.gapiAuth2.gapi.auth2.AuthorizeConfig
import typings.gapiAuth2.gapi.auth2.AuthorizeResponse
import typings.gapiAuth2.gapi.auth2.ClientConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object auth2 {
      
      @JSGlobal("gapi.auth2")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * GoogleAuth is a singleton class that provides methods to allow the user to sign in with a Google account,
        * get the user's current sign-in status, get specific data from the user's Google profile,
        * request additional scopes, and sign out from the current account.
        */
      @JSGlobal("gapi.auth2.GoogleAuth")
      @js.native
      open class GoogleAuth ()
        extends StObject
           with typings.gapiAuth2.gapi.auth2.GoogleAuth
      
      @JSGlobal("gapi.auth2.GoogleAuthBase")
      @js.native
      open class GoogleAuthBase ()
        extends StObject
           with typings.gapiAuth2.gapi.auth2.GoogleAuthBase
      
      @JSGlobal("gapi.auth2.SigninOptionsBuilder")
      @js.native
      open class SigninOptionsBuilder ()
        extends StObject
           with typings.gapiAuth2.gapi.auth2.SigninOptionsBuilder {
        
        /* CompleteClass */
        override def setAppPackageName(name: String): Any = js.native
        
        /* CompleteClass */
        override def setFetchBasicProfile(fetch: Boolean): Any = js.native
        
        /* CompleteClass */
        override def setLoginHint(hint: String): Any = js.native
        
        /* CompleteClass */
        override def setPrompt(prompt: String): Any = js.native
        
        /* CompleteClass */
        override def setScope(scope: String): Any = js.native
      }
      
      /**
        * Performs a one time OAuth 2.0 authorization.
        * Reference: https://developers.google.com/api-client-library/javascript/reference/referencedocs#gapiauth2authorizeparams-callback
        */
      inline def authorize(params: AuthorizeConfig, callback: js.Function1[/* response */ AuthorizeResponse, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("authorize")(params.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      /**
        * Returns the GoogleAuth object. You must initialize the GoogleAuth object with gapi.auth2.init() before calling this method.
        */
      inline def getAuthInstance(): typings.gapiAuth2.gapi.auth2.GoogleAuth = ^.asInstanceOf[js.Dynamic].applyDynamic("getAuthInstance")().asInstanceOf[typings.gapiAuth2.gapi.auth2.GoogleAuth]
      
      /**
        * Initializes the GoogleAuth object.
        * Reference: https://developers.google.com/api-client-library/javascript/reference/referencedocs#gapiauth2initparams
        */
      inline def init(params: ClientConfig): typings.gapiAuth2.gapi.auth2.GoogleAuth = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(params.asInstanceOf[js.Any]).asInstanceOf[typings.gapiAuth2.gapi.auth2.GoogleAuth]
    }
    
    object signin2 {
      
      @JSGlobal("gapi.signin2")
      @js.native
      val ^ : js.Any = js.native
      
      inline def render(id: Any, options: Apppackagename): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(id.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    }
  }
}
