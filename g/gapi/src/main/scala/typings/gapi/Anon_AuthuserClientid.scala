package typings.gapi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AuthuserClientid extends js.Object {
  /**
    * The user to sign in as. -1 to toggle a multi-account chooser, 0 to default to the user's current account, and 1 to automatically sign in if the user is signed into Google Plus.
    */
  var authuser: js.UndefOr[Double] = js.undefined
  /**
    * The application's client ID.
    */
  var client_id: js.UndefOr[String] = js.undefined
  /**
    * If true, then login uses "immediate mode", which means that the token is refreshed behind the scenes, and no UI is shown to the user.
    */
  var immediate: js.UndefOr[Boolean] = js.undefined
  /**
    * The OAuth 2.0 response type property. Default: token
    */
  var response_type: js.UndefOr[String] = js.undefined
  /**
    * The auth scope or scopes to authorize. Auth scopes for individual APIs can be found in their documentation.
    */
  var scope: js.UndefOr[js.Any] = js.undefined
}

object Anon_AuthuserClientid {
  @scala.inline
  def apply(
    authuser: Int | Double = null,
    client_id: String = null,
    immediate: js.UndefOr[Boolean] = js.undefined,
    response_type: String = null,
    scope: js.Any = null
  ): Anon_AuthuserClientid = {
    val __obj = js.Dynamic.literal()
    if (authuser != null) __obj.updateDynamic("authuser")(authuser.asInstanceOf[js.Any])
    if (client_id != null) __obj.updateDynamic("client_id")(client_id)
    if (!js.isUndefined(immediate)) __obj.updateDynamic("immediate")(immediate)
    if (response_type != null) __obj.updateDynamic("response_type")(response_type)
    if (scope != null) __obj.updateDynamic("scope")(scope)
    __obj.asInstanceOf[Anon_AuthuserClientid]
  }
}

