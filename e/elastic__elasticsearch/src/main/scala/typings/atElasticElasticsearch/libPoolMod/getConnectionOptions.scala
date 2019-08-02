package typings.atElasticElasticsearch.libPoolMod

import typings.atElasticElasticsearch.libTransportMod.nodeFilterFn
import typings.atElasticElasticsearch.libTransportMod.nodeSelectorFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait getConnectionOptions extends js.Object {
  var filter: js.UndefOr[nodeFilterFn] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var now: js.UndefOr[Double] = js.undefined
  var requestId: js.UndefOr[String | Double] = js.undefined
  var selector: js.UndefOr[nodeSelectorFn] = js.undefined
}

object getConnectionOptions {
  @scala.inline
  def apply(
    filter: nodeFilterFn = null,
    name: String = null,
    now: Int | Double = null,
    requestId: String | Double = null,
    selector: nodeSelectorFn = null
  ): getConnectionOptions = {
    val __obj = js.Dynamic.literal()
    if (filter != null) __obj.updateDynamic("filter")(filter)
    if (name != null) __obj.updateDynamic("name")(name)
    if (now != null) __obj.updateDynamic("now")(now.asInstanceOf[js.Any])
    if (requestId != null) __obj.updateDynamic("requestId")(requestId.asInstanceOf[js.Any])
    if (selector != null) __obj.updateDynamic("selector")(selector)
    __obj.asInstanceOf[getConnectionOptions]
  }
}

