package typings.googleDashAppsDashScriptDashOauth2.GoogleAppsScriptOAuth2

import org.scalablytyped.runtime.TopLevel
import typings.googleDashAppsDashScriptDashOauth2.GoogleAppsScriptOAuth2.StateParameterLocation.AUTHORIZATION_URL
import typings.googleDashAppsDashScriptDashOauth2.GoogleAppsScriptOAuth2.StateParameterLocation.REDIRECT_URL
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
  sealed trait AUTHORIZATION_URL extends StateParameterLocation
  
  /**
    * Pass the state token in the redirect URL, as a workaround for APIs that don't support the state parameter.
    */
  @js.native
  sealed trait REDIRECT_URL extends StateParameterLocation
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[StateParameterLocation with Double] = js.native
  /* 0 */ @js.native
  object AUTHORIZATION_URL extends TopLevel[AUTHORIZATION_URL with Double]
  
  /* 1 */ @js.native
  object REDIRECT_URL extends TopLevel[REDIRECT_URL with Double]
  
}

