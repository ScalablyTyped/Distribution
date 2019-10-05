package typings.gapiDotClient.gapi.auth

import typings.gapiDotClient.Anon_Clientid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.auth.authorize")
@js.native
object authorize extends js.Object {
  /**
    * Initiates the OAuth 2.0 authorization process. The browser displays a popup window prompting the user authenticate and authorize.
    * After the user authorizes, the popup closes and the callback function fires.
    * @param params A key/value map of parameters for the request. If the key is not one of the expected OAuth 2.0 parameters, it is added to the
    * URI as a query parameter.
    * @param callback The function to call once the login process is complete. The function takes an OAuth 2.0 token object as its only parameter.
    */
  def apply(params: Anon_Clientid, callback: js.Function1[/* authResult */ GoogleApiOAuth2TokenObject, Unit]): Unit = js.native
}

