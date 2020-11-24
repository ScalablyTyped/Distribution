package typings.googleAppsScriptOauth2.GoogleAppsScriptOAuth2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OAuth2 extends js.Object {
  
  /**
    * The supported formats for the returned OAuth2 token.
    */
  var TOKEN_FORMAT: TokenFormat = js.native
  
  /**
    * Creates a new OAuth2 service with the name specified.
    * It's usually best to create and configure your service once at the start of your script,
    * and then reference them during the different phases of the authorization flow.
    */
  def createService(serviceName: String): OAuth2Service = js.native
  
  /**
    * Returns the redirect URI that will be used for a given script.  Defaults to the scriptID of the script being executed.
    * Often this URI needs to be entered into a configuration screen of your OAuth provider.
    */
  def getRedirectUri(): String = js.native
  def getRedirectUri(scriptId: String): String = js.native
}
