package typings.gapiDotClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Clientid extends js.Object {
  /**
    * The application's client ID. Visit the Google Developers Console to get an OAuth 2.0 client ID.
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
  var scope: js.UndefOr[String | js.Array[String]] = js.undefined
}

object Anon_Clientid {
  @scala.inline
  def apply(
    client_id: String = null,
    immediate: js.UndefOr[Boolean] = js.undefined,
    response_type: String = null,
    scope: String | js.Array[String] = null
  ): Anon_Clientid = {
    val __obj = js.Dynamic.literal()
    if (client_id != null) __obj.updateDynamic("client_id")(client_id.asInstanceOf[js.Any])
    if (!js.isUndefined(immediate)) __obj.updateDynamic("immediate")(immediate.asInstanceOf[js.Any])
    if (response_type != null) __obj.updateDynamic("response_type")(response_type.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Clientid]
  }
}

