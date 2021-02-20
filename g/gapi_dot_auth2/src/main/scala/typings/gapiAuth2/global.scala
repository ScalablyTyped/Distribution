package typings.gapiAuth2

import typings.gapiAuth2.anon.Apppackagename
import typings.gapiAuth2.gapi.auth2.AuthorizeConfig
import typings.gapiAuth2.gapi.auth2.AuthorizeResponse
import typings.gapiAuth2.gapi.auth2.ClientConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object auth2 {
      
      /**
        * GoogleAuth is a singleton class that provides methods to allow the user to sign in with a Google account,
        * get the user's current sign-in status, get specific data from the user's Google profile,
        * request additional scopes, and sign out from the current account.
        */
      @JSGlobal("gapi.auth2.GoogleAuth")
      @js.native
      class GoogleAuth ()
        extends typings.gapiAuth2.gapi.auth2.GoogleAuth
      
      @JSGlobal("gapi.auth2.SigninOptionsBuilder")
      @js.native
      class SigninOptionsBuilder ()
        extends typings.gapiAuth2.gapi.auth2.SigninOptionsBuilder
      
      /**
        * Performs a one time OAuth 2.0 authorization.
        * Reference: https://developers.google.com/api-client-library/javascript/reference/referencedocs#gapiauth2authorizeparams-callback
        */
      @JSGlobal("gapi.auth2.authorize")
      @js.native
      def authorize(params: AuthorizeConfig, callback: js.Function1[/* response */ AuthorizeResponse, Unit]): Unit = js.native
      
      /**
        * Returns the GoogleAuth object. You must initialize the GoogleAuth object with gapi.auth2.init() before calling this method.
        */
      @JSGlobal("gapi.auth2.getAuthInstance")
      @js.native
      def getAuthInstance(): typings.gapiAuth2.gapi.auth2.GoogleAuth = js.native
      
      /**
        * Initializes the GoogleAuth object.
        * Reference: https://developers.google.com/api-client-library/javascript/reference/referencedocs#gapiauth2initparams
        */
      @JSGlobal("gapi.auth2.init")
      @js.native
      def init(params: ClientConfig): typings.gapiAuth2.gapi.auth2.GoogleAuth = js.native
    }
    
    object signin2 {
      
      @JSGlobal("gapi.signin2.render")
      @js.native
      def render(id: js.Any, options: Apppackagename): Unit = js.native
    }
  }
}
