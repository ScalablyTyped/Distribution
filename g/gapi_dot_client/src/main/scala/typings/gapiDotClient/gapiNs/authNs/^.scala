package typings.gapiDotClient.gapiNs.authNs

import typings.gapiDotClient.Anon_Clientid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.auth")
@js.native
object ^ extends js.Object {
  /**
    * Initiates the OAuth 2.0 authorization process. The browser displays a popup window prompting the user authenticate and authorize.
    * After the user authorizes, the popup closes and the callback function fires.
    * @param params A key/value map of parameters for the request. If the key is not one of the expected OAuth 2.0 parameters, it is added to the
    * URI as a query parameter.
    * @param callback The function to call once the login process is complete. The function takes an OAuth 2.0 token object as its only parameter.
    */
  def authorize(params: Anon_Clientid, callback: js.Function1[/* authResult */ GoogleApiOAuth2TokenObject, Unit]): Unit = js.native
  /**
    * Retrieves the OAuth 2.0 token for the application.
    * @return The OAuth 2.0 token.
    */
  def getToken(): GoogleApiOAuth2TokenObject = js.native
  /**
    * Initializes the authorization feature. Call this when the client loads to prevent popup blockers from blocking the auth window on gapi.auth.authorize calls.
    * @param callback A callback to execute when the auth feature is ready to make authorization calls.
    */
  def init(callback: js.Function0[_]): Unit = js.native
  /**
    * Sets the OAuth 2.0 token for the application.
    * @param token The token to set.
    */
  def setToken(token: GoogleApiOAuth2TokenObject): Unit = js.native
}

