package typings
package atElasticElasticsearchLib.libConnectionPoolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait getConnectionOptions extends js.Object {
  var filter: js.UndefOr[atElasticElasticsearchLib.libTransportMod.nodeFilterFn] = js.undefined
  var selector: js.UndefOr[atElasticElasticsearchLib.libTransportMod.nodeSelectorFn] = js.undefined
}

object getConnectionOptions {
  @scala.inline
  def apply(
    filter: atElasticElasticsearchLib.libTransportMod.nodeFilterFn = null,
    selector: atElasticElasticsearchLib.libTransportMod.nodeSelectorFn = null
  ): getConnectionOptions = {
    val __obj = js.Dynamic.literal()
    if (filter != null) __obj.updateDynamic("filter")(filter)
    if (selector != null) __obj.updateDynamic("selector")(selector)
    __obj.asInstanceOf[getConnectionOptions]
  }
}

