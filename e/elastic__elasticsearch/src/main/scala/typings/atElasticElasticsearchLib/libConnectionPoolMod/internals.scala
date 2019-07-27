package typings
package atElasticElasticsearchLib.libConnectionPoolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@elastic/elasticsearch/lib/ConnectionPool", "internals")
@js.native
object internals extends js.Object {
  @JSName("defaultNodeFilter")
  var defaultNodeFilter_Original: js.Function1[/* node */ atElasticElasticsearchLib.libConnectionMod.default, scala.Boolean] = js.native
  @JSName("randomSelector")
  var randomSelector_Original: js.Function1[
    /* connections */ js.Array[atElasticElasticsearchLib.libConnectionMod.default], 
    atElasticElasticsearchLib.libConnectionMod.default
  ] = js.native
  @JSName("roundRobinSelector")
  var roundRobinSelector_Original: js.Function0[
    js.Function1[
      /* connections */ js.Array[atElasticElasticsearchLib.libConnectionMod.default], 
      atElasticElasticsearchLib.libConnectionMod.default
    ]
  ] = js.native
  def defaultNodeFilter(node: atElasticElasticsearchLib.libConnectionMod.default): scala.Boolean = js.native
  def randomSelector(connections: js.Array[atElasticElasticsearchLib.libConnectionMod.default]): atElasticElasticsearchLib.libConnectionMod.default = js.native
  def roundRobinSelector(): js.Function1[
    /* connections */ js.Array[atElasticElasticsearchLib.libConnectionMod.default], 
    atElasticElasticsearchLib.libConnectionMod.default
  ] = js.native
}

