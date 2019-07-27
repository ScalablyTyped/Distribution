package typings
package atElasticElasticsearchLib.atElasticElasticsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// /Extend API
trait NodeOptions extends js.Object {
  var agent: js.UndefOr[atElasticElasticsearchLib.libConnectionMod.AgentOptions] = js.undefined
  var headers: js.UndefOr[anyObject] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var roles: js.UndefOr[atElasticElasticsearchLib.Anon_Data] = js.undefined
  var ssl: js.UndefOr[nodeLib.tlsMod.ConnectionOptions] = js.undefined
  var url: nodeLib.urlMod.URL
}

object NodeOptions {
  @scala.inline
  def apply(
    url: nodeLib.urlMod.URL,
    agent: atElasticElasticsearchLib.libConnectionMod.AgentOptions = null,
    headers: anyObject = null,
    id: java.lang.String = null,
    roles: atElasticElasticsearchLib.Anon_Data = null,
    ssl: nodeLib.tlsMod.ConnectionOptions = null
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

