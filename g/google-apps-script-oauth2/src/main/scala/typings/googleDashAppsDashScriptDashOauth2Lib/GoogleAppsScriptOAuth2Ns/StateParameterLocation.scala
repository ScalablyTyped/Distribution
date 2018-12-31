package typings
package googleDashAppsDashScriptDashOauth2Lib.GoogleAppsScriptOAuth2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait StateParameterLocation extends js.Object

@JSGlobal("GoogleAppsScriptOAuth2.StateParameterLocation")
@js.native
object StateParameterLocation extends js.Object {
  /**
    * Pass the state parameter in the authorization URL.
    */
  @js.native
  sealed trait AUTHORIZATION_URL
    extends googleDashAppsDashScriptDashOauth2Lib.GoogleAppsScriptOAuth2Ns.StateParameterLocation
  
  /**
    * Pass the state token in the redirect URL, as a workaround for APIs that don't support the state parameter.
    */
  @js.native
  sealed trait REDIRECT_URL
    extends googleDashAppsDashScriptDashOauth2Lib.GoogleAppsScriptOAuth2Ns.StateParameterLocation
  
  val AUTHORIZATION_URL: AUTHORIZATION_URL with java.lang.String = js.native
  val REDIRECT_URL: REDIRECT_URL with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    googleDashAppsDashScriptDashOauth2Lib.GoogleAppsScriptOAuth2Ns.StateParameterLocation with java.lang.String
  ] = js.native
}

