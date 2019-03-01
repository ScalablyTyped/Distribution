package typings
package gapiDotClientLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Clientid extends js.Object {
  /**
    * The application's client ID. Visit the Google Developers Console to get an OAuth 2.0 client ID.
    */
  var client_id: js.UndefOr[java.lang.String] = js.undefined
  /**
    * If true, then login uses "immediate mode", which means that the token is refreshed behind the scenes, and no UI is shown to the user.
    */
  var immediate: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The OAuth 2.0 response type property. Default: token
    */
  var response_type: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The auth scope or scopes to authorize. Auth scopes for individual APIs can be found in their documentation.
    */
  var scope: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
}

object Anon_Clientid {
  @scala.inline
  def apply(
    client_id: java.lang.String = null,
    immediate: js.UndefOr[scala.Boolean] = js.undefined,
    response_type: java.lang.String = null,
    scope: java.lang.String | js.Array[java.lang.String] = null
  ): Anon_Clientid = {
    val __obj = js.Dynamic.literal()
    if (client_id != null) __obj.updateDynamic("client_id")(client_id)
    if (!js.isUndefined(immediate)) __obj.updateDynamic("immediate")(immediate)
    if (response_type != null) __obj.updateDynamic("response_type")(response_type)
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Clientid]
  }
}

