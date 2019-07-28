package typings.atElasticElasticsearch.libConnectionPoolMod

import typings.atElasticElasticsearch.libTransportMod.nodeFilterFn
import typings.atElasticElasticsearch.libTransportMod.nodeSelectorFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait getConnectionOptions extends js.Object {
  var filter: js.UndefOr[nodeFilterFn] = js.undefined
  var selector: js.UndefOr[nodeSelectorFn] = js.undefined
}

object getConnectionOptions {
  @scala.inline
  def apply(filter: nodeFilterFn = null, selector: nodeSelectorFn = null): getConnectionOptions = {
    val __obj = js.Dynamic.literal()
    if (filter != null) __obj.updateDynamic("filter")(filter)
    if (selector != null) __obj.updateDynamic("selector")(selector)
    __obj.asInstanceOf[getConnectionOptions]
  }
}

