package typings.elasticElasticsearch.poolMod

import typings.elasticElasticsearch.connectionMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@elastic/elasticsearch/lib/pool", "internals")
@js.native
object internals extends js.Object {
  
  def defaultNodeFilter(node: default): Boolean = js.native
  @JSName("defaultNodeFilter")
  var defaultNodeFilter_Original: js.Function1[/* node */ default, Boolean] = js.native
  
  def randomSelector(connections: js.Array[default]): default = js.native
  @JSName("randomSelector")
  var randomSelector_Original: js.Function1[/* connections */ js.Array[default], default] = js.native
  
  def roundRobinSelector(): js.Function1[/* connections */ js.Array[default], default] = js.native
  @JSName("roundRobinSelector")
  var roundRobinSelector_Original: js.Function0[js.Function1[/* connections */ js.Array[default], default]] = js.native
}
