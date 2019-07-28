package typings.atElasticElasticsearch.libConnectionPoolMod

import typings.atElasticElasticsearch.TypeofClassConnection
import typings.atElasticElasticsearch.libConnectionMod.AgentOptions
import typings.node.tlsMod.SecureContextOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectionPoolOptions extends js.Object {
  var Connection: TypeofClassConnection
  var agent: js.UndefOr[AgentOptions] = js.undefined
  var pingTimeout: js.UndefOr[Double] = js.undefined
  var resurrectStrategy: js.UndefOr[String] = js.undefined
  var ssl: js.UndefOr[SecureContextOptions] = js.undefined
}

object ConnectionPoolOptions {
  @scala.inline
  def apply(
    Connection: TypeofClassConnection,
    agent: AgentOptions = null,
    pingTimeout: Int | Double = null,
    resurrectStrategy: String = null,
    ssl: SecureContextOptions = null
  ): ConnectionPoolOptions = {
    val __obj = js.Dynamic.literal(Connection = Connection)
    if (agent != null) __obj.updateDynamic("agent")(agent)
    if (pingTimeout != null) __obj.updateDynamic("pingTimeout")(pingTimeout.asInstanceOf[js.Any])
    if (resurrectStrategy != null) __obj.updateDynamic("resurrectStrategy")(resurrectStrategy)
    if (ssl != null) __obj.updateDynamic("ssl")(ssl)
    __obj.asInstanceOf[ConnectionPoolOptions]
  }
}

