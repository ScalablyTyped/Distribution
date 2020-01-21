package typings.discordRpc.mod

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
    val __obj = js.Dynamic.literal(clientId = clientId.asInstanceOf[js.Any])
    if (accessToken != null) __obj.updateDynamic("accessToken")(accessToken.asInstanceOf[js.Any])
    if (clientSecret != null) __obj.updateDynamic("clientSecret")(clientSecret.asInstanceOf[js.Any])
    if (rpcToken != null) __obj.updateDynamic("rpcToken")(rpcToken.asInstanceOf[js.Any])
    if (scopes != null) __obj.updateDynamic("scopes")(scopes.asInstanceOf[js.Any])
    if (tokenEndpoint != null) __obj.updateDynamic("tokenEndpoint")(tokenEndpoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[RPCLoginOptions]
  }
}

