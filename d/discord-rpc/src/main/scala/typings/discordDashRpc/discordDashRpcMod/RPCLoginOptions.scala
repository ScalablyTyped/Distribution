package typings.discordDashRpc.discordDashRpcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RPCLoginOptions extends js.Object {
  var accessToken: js.UndefOr[String] = js.undefined
  var clientId: String
  var clientSecret: js.UndefOr[String] = js.undefined
  var rpcToken: js.UndefOr[String] = js.undefined
  var scopes: js.UndefOr[js.Array[String]] = js.undefined
  var tokenEndpoint: js.UndefOr[String] = js.undefined
}

object RPCLoginOptions {
  @scala.inline
  def apply(
    clientId: String,
    accessToken: String = null,
    clientSecret: String = null,
    rpcToken: String = null,
    scopes: js.Array[String] = null,
    tokenEndpoint: String = null
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

