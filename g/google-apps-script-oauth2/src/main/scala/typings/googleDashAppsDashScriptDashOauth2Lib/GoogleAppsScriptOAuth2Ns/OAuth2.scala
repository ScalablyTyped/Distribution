package typings
package googleDashAppsDashScriptDashOauth2Lib.GoogleAppsScriptOAuth2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OAuth2 extends js.Object {
  /**
    * The supported locations for passing the state parameter.
    */
  var STATE_PARAMETER_LOCATION: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof StateParameterLocation */ js.Any
  /**
    * The supported formats for the returned OAuth2 token.
    */
  var TOKEN_FORMAT: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TokenFormat */ js.Any
  /**
    * Creates a new OAuth2 service with the name specified.
    * It's usually best to create and configure your service once at the start of your script,
    * and then reference them during the different phases of the authorization flow.
    */
  def createService(serviceName: java.lang.String): OAuth2Service
  /**
    * Returns the redirect URI that will be used for a given script.
    * Often this URI needs to be entered into a configuration screen of your OAuth provider.
    */
  def getRedirectUri(scriptId: java.lang.String): java.lang.String
}

object OAuth2 {
  @scala.inline
  def apply(
    STATE_PARAMETER_LOCATION: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof StateParameterLocation */ js.Any,
    TOKEN_FORMAT: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TokenFormat */ js.Any,
    createService: java.lang.String => OAuth2Service,
    getRedirectUri: java.lang.String => java.lang.String
  ): OAuth2 = {
    val __obj = js.Dynamic.literal(STATE_PARAMETER_LOCATION = STATE_PARAMETER_LOCATION, TOKEN_FORMAT = TOKEN_FORMAT, createService = js.Any.fromFunction1(createService), getRedirectUri = js.Any.fromFunction1(getRedirectUri))
  
    __obj.asInstanceOf[OAuth2]
  }
}

