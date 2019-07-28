package typings.googleDashAppsDashScriptDashOauth2.GoogleAppsScriptOAuth2Ns

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
  sealed trait FORM_URL_ENCODED extends TokenFormat
  
  /**
    * JSON format, for example `{"access_token": "..."}`.
    */
  @js.native
  sealed trait JSON extends TokenFormat
  
  /* 1 */ val FORM_URL_ENCODED: typings.googleDashAppsDashScriptDashOauth2.GoogleAppsScriptOAuth2Ns.TokenFormat.FORM_URL_ENCODED with Double = js.native
  /* 0 */ val JSON: typings.googleDashAppsDashScriptDashOauth2.GoogleAppsScriptOAuth2Ns.TokenFormat.JSON with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TokenFormat with Double] = js.native
}

