package typings.atElasticElasticsearch.atElasticElasticsearchMod

import typings.atElasticElasticsearch.Anon_Data
import typings.atElasticElasticsearch.libConnectionMod.AgentOptions
import typings.node.tlsMod.ConnectionOptions
import typings.node.urlMod.URL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// /Extend API
trait NodeOptions extends js.Object {
  var agent: js.UndefOr[AgentOptions] = js.undefined
  var headers: js.UndefOr[anyObject] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var roles: js.UndefOr[Anon_Data] = js.undefined
  var ssl: js.UndefOr[ConnectionOptions] = js.undefined
  var url: URL
}

object NodeOptions {
  @scala.inline
  def apply(
    url: URL,
    agent: AgentOptions = null,
    headers: anyObject = null,
    id: String = null,
    roles: Anon_Data = null,
    ssl: ConnectionOptions = null
  ): NodeOptions = {
    val __obj = js.Dynamic.literal(url = url)
    if (agent != null) __obj.updateDynamic("agent")(agent)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (id != null) __obj.updateDynamic("id")(id)
    if (roles != null) __obj.updateDynamic("roles")(roles)
    if (ssl != null) __obj.updateDynamic("ssl")(ssl)
    __obj.asInstanceOf[NodeOptions]
  }
}

