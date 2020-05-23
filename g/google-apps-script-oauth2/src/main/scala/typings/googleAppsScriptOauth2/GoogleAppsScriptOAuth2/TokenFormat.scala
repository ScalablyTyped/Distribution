package typings.googleAppsScriptOauth2.GoogleAppsScriptOAuth2

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
  
}

