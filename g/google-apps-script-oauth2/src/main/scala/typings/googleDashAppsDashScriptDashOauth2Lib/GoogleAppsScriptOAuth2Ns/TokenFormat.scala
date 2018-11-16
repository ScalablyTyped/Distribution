package typings
package googleDashAppsDashScriptDashOauth2Lib.GoogleAppsScriptOAuth2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TokenFormat extends js.Object

@JSGlobal("GoogleAppsScriptOAuth2.TokenFormat")
@js.native
object TokenFormat extends js.Object {
  /**
           * Form URL-encoded, for example `access_token=...`.
           */
  @js.native
  sealed trait FORM_URL_ENCODED
    extends googleDashAppsDashScriptDashOauth2Lib.GoogleAppsScriptOAuth2Ns.TokenFormat
  
  /**
           * JSON format, for example `{"access_token": "..."}`.
           */
  @js.native
  sealed trait JSON
    extends googleDashAppsDashScriptDashOauth2Lib.GoogleAppsScriptOAuth2Ns.TokenFormat
  
  val FORM_URL_ENCODED: FORM_URL_ENCODED with java.lang.String = js.native
  val JSON: JSON with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    googleDashAppsDashScriptDashOauth2Lib.GoogleAppsScriptOAuth2Ns.TokenFormat with java.lang.String
  ] = js.native
}

