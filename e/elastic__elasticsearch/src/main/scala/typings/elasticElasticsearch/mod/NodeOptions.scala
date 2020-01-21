package typings.elasticElasticsearch.mod

import typings.elasticElasticsearch.AnonData
import typings.elasticElasticsearch.connectionMod.AgentOptions
import typings.node.tlsMod.ConnectionOptions
import typings.node.urlMod.URL_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// /Extend API
trait NodeOptions extends js.Object {
  var agent: js.UndefOr[AgentOptions] = js.undefined
  var headers: js.UndefOr[anyObject] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var roles: js.UndefOr[AnonData] = js.undefined
  var ssl: js.UndefOr[ConnectionOptions] = js.undefined
  var url: URL_
}

object NodeOptions {
  @scala.inline
  def apply(
    url: URL_,
    agent: AgentOptions = null,
    headers: anyObject = null,
    id: String = null,
    roles: AnonData = null,
    ssl: ConnectionOptions = null
  ): NodeOptions = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (agent != null) __obj.updateDynamic("agent")(agent.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (roles != null) __obj.updateDynamic("roles")(roles.asInstanceOf[js.Any])
    if (ssl != null) __obj.updateDynamic("ssl")(ssl.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeOptions]
  }
}

