package typings
package atElasticElasticsearchLib.libConnectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectionOptions extends js.Object {
  var agent: js.UndefOr[AgentOptions | agentFn] = js.undefined
  var headers: js.UndefOr[js.Any] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var roles: js.UndefOr[js.Any] = js.undefined
  var ssl: js.UndefOr[nodeLib.tlsMod.ConnectionOptions] = js.undefined
  var status: js.UndefOr[java.lang.String] = js.undefined
  var url: nodeLib.urlMod.URL
}

object ConnectionOptions {
  @scala.inline
  def apply(
    url: nodeLib.urlMod.URL,
    agent: AgentOptions | agentFn = null,
    headers: js.Any = null,
    id: java.lang.String = null,
    roles: js.Any = null,
    ssl: nodeLib.tlsMod.ConnectionOptions = null,
    status: java.lang.String = null
  ): ConnectionOptions = {
    val __obj = js.Dynamic.literal(url = url)
    if (agent != null) __obj.updateDynamic("agent")(agent.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (id != null) __obj.updateDynamic("id")(id)
    if (roles != null) __obj.updateDynamic("roles")(roles)
    if (ssl != null) __obj.updateDynamic("ssl")(ssl)
    if (status != null) __obj.updateDynamic("status")(status)
    __obj.asInstanceOf[ConnectionOptions]
  }
}

