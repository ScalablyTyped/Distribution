package typings.atElasticElasticsearch.libConnectionPoolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@elastic/elasticsearch/lib/ConnectionPool", "internals")
@js.native
object internals extends js.Object {
  @JSName("defaultNodeFilter")
  var defaultNodeFilter_Original: js.Function1[/* node */ typings.atElasticElasticsearch.libConnectionMod.default, Boolean] = js.native
  @JSName("randomSelector")
  var randomSelector_Original: js.Function1[
    /* connections */ js.Array[typings.atElasticElasticsearch.libConnectionMod.default], 
    typings.atElasticElasticsearch.libConnectionMod.default
  ] = js.native
  @JSName("roundRobinSelector")
  var roundRobinSelector_Original: js.Function0[
    js.Function1[
      /* connections */ js.Array[typings.atElasticElasticsearch.libConnectionMod.default], 
      typings.atElasticElasticsearch.libConnectionMod.default
    ]
  ] = js.native
  def defaultNodeFilter(node: typings.atElasticElasticsearch.libConnectionMod.default): Boolean = js.native
  def randomSelector(connections: js.Array[typings.atElasticElasticsearch.libConnectionMod.default]): typings.atElasticElasticsearch.libConnectionMod.default = js.native
  def roundRobinSelector(): js.Function1[
    /* connections */ js.Array[typings.atElasticElasticsearch.libConnectionMod.default], 
    typings.atElasticElasticsearch.libConnectionMod.default
  ] = js.native
}

