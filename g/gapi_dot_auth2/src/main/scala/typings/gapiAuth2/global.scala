package typings.gapiAuth2

import typings.gapiAuth2.anon.Apppackagename
import typings.gapiAuth2.gapi.auth2.AuthorizeConfig
import typings.gapiAuth2.gapi.auth2.AuthorizeResponse
import typings.gapiAuth2.gapi.auth2.ClientConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  @js.native
  object gapi extends js.Object {
    @js.native
    object auth2 extends js.Object {
      /**
        * GoogleAuth is a singleton class that provides methods to allow the user to sign in with a Google account,
        * get the user's current sign-in status, get specific data from the user's Google profile,
        * request additional scopes, and sign out from the current account.
        */
      @js.native
      class GoogleAuth ()
        extends typings.gapiAuth2.gapi.auth2.GoogleAuth
      
      @js.native
      class SigninOptionsBuilder ()
        extends typings.gapiAuth2.gapi.auth2.SigninOptionsBuilder
      
      /**
        * Performs a one time OAuth 2.0 authorization.
        * Reference: https://developers.google.com/api-client-library/javascript/reference/referencedocs#gapiauth2authorizeparams-callback
        */
      def authorize(params: AuthorizeConfig, callback: js.Function1[/* response */ AuthorizeResponse, Unit]): Unit = js.native
      /**
        * Returns the GoogleAuth object. You must initialize the GoogleAuth object with gapi.auth2.init() before calling this method.
        */
      def getAuthInstance(): typings.gapiAuth2.gapi.auth2.GoogleAuth = js.native
      /**
        * Initializes the GoogleAuth object.
        * Reference: https://developers.google.com/api-client-library/javascript/reference/referencedocs#gapiauth2initparams
        */
      def init(params: ClientConfig): typings.gapiAuth2.gapi.auth2.GoogleAuth = js.native
    }
    
    @js.native
    object signin2 extends js.Object {
      def render(id: js.Any, options: Apppackagename): Unit = js.native
    }
    
  }
  
}

