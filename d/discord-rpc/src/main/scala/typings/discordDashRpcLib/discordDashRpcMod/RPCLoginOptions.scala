package typings
package discordDashRpcLib.discordDashRpcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RPCLoginOptions extends js.Object {
  var accessToken: js.UndefOr[java.lang.String] = js.undefined
  var clientId: java.lang.String
  var clientSecret: js.UndefOr[java.lang.String] = js.undefined
  var rpcToken: js.UndefOr[java.lang.String] = js.undefined
  var scopes: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var tokenEndpoint: js.UndefOr[java.lang.String] = js.undefined
}

object RPCLoginOptions {
  @scala.inline
  def apply(
    clientId: java.lang.String,
    accessToken: java.lang.String = null,
    clientSecret: java.lang.String = null,
    rpcToken: java.lang.String = null,
    scopes: js.Array[java.lang.String] = null,
    tokenEndpoint: java.lang.String = null
  ): RPCLoginOptions = {
    val __obj = js.Dynamic.literal(clientId = clientId)
    if (accessToken != null) __obj.updateDynamic("accessToken")(accessToken)
    if (clientSecret != null) __obj.updateDynamic("clientSecret")(clientSecret)
    if (rpcToken != null) __obj.updateDynamic("rpcToken")(rpcToken)
    if (scopes != null) __obj.updateDynamic("scopes")(scopes)
    if (tokenEndpoint != null) __obj.updateDynamic("tokenEndpoint")(tokenEndpoint)
    __obj.asInstanceOf[RPCLoginOptions]
  }
}

