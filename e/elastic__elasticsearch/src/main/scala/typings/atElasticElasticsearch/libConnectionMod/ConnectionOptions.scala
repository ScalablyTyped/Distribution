package typings.atElasticElasticsearch.libConnectionMod

import typings.atElasticElasticsearch.libPoolMod.ApiKeyAuth
import typings.atElasticElasticsearch.libPoolMod.BasicAuth
import typings.node.urlMod.URL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectionOptions extends js.Object {
  var agent: js.UndefOr[AgentOptions | agentFn] = js.undefined
  var auth: js.UndefOr[BasicAuth | ApiKeyAuth] = js.undefined
  var headers: js.UndefOr[js.Any] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var roles: js.UndefOr[js.Any] = js.undefined
  var ssl: js.UndefOr[typings.node.tlsMod.ConnectionOptions] = js.undefined
  var status: js.UndefOr[String] = js.undefined
  var url: URL
}

object ConnectionOptions {
  @scala.inline
  def apply(
    url: URL,
    agent: AgentOptions | agentFn = null,
    auth: BasicAuth | ApiKeyAuth = null,
    headers: js.Any = null,
    id: String = null,
    roles: js.Any = null,
    ssl: typings.node.tlsMod.ConnectionOptions = null,
    status: String = null
  ): ConnectionOptions = {
    val __obj = js.Dynamic.literal(url = url)
    if (agent != null) __obj.updateDynamic("agent")(agent.asInstanceOf[js.Any])
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (id != null) __obj.updateDynamic("id")(id)
    if (roles != null) __obj.updateDynamic("roles")(roles)
    if (ssl != null) __obj.updateDynamic("ssl")(ssl)
    if (status != null) __obj.updateDynamic("status")(status)
    __obj.asInstanceOf[ConnectionOptions]
  }
}

