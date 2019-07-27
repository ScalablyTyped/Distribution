package typings
package atElasticElasticsearchLib.libConnectionPoolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectionPoolOptions extends js.Object {
  var Connection: atElasticElasticsearchLib.TypeofClassConnection
  var agent: js.UndefOr[atElasticElasticsearchLib.libConnectionMod.AgentOptions] = js.undefined
  var pingTimeout: js.UndefOr[scala.Double] = js.undefined
  var resurrectStrategy: js.UndefOr[java.lang.String] = js.undefined
  var ssl: js.UndefOr[nodeLib.tlsMod.SecureContextOptions] = js.undefined
}

object ConnectionPoolOptions {
  @scala.inline
  def apply(
    Connection: atElasticElasticsearchLib.TypeofClassConnection,
    agent: atElasticElasticsearchLib.libConnectionMod.AgentOptions = null,
    pingTimeout: scala.Int | scala.Double = null,
    resurrectStrategy: java.lang.String = null,
    ssl: nodeLib.tlsMod.SecureContextOptions = null
  ): ConnectionPoolOptions = {
    val __obj = js.Dynamic.literal(Connection = Connection)
    if (agent != null) __obj.updateDynamic("agent")(agent)
    if (pingTimeout != null) __obj.updateDynamic("pingTimeout")(pingTimeout.asInstanceOf[js.Any])
    if (resurrectStrategy != null) __obj.updateDynamic("resurrectStrategy")(resurrectStrategy)
    if (ssl != null) __obj.updateDynamic("ssl")(ssl)
    __obj.asInstanceOf[ConnectionPoolOptions]
  }
}

