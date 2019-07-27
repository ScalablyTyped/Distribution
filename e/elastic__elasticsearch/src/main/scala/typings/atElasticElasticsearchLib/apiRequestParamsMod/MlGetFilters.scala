package typings
package atElasticElasticsearchLib.apiRequestParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MlGetFilters extends Generic {
  var filter_id: js.UndefOr[java.lang.String] = js.undefined
  var from: js.UndefOr[scala.Double] = js.undefined
  var size: js.UndefOr[scala.Double] = js.undefined
}

object MlGetFilters {
  @scala.inline
  def apply(
    error_trace: js.UndefOr[scala.Boolean] = js.undefined,
    filter_id: java.lang.String = null,
    filter_path: java.lang.String | js.Array[java.lang.String] = null,
    from: scala.Int | scala.Double = null,
    human: js.UndefOr[scala.Boolean] = js.undefined,
    ignore: scala.Double | js.Array[scala.Double] = null,
    method: java.lang.String = null,
    pretty: js.UndefOr[scala.Boolean] = js.undefined,
    size: scala.Int | scala.Double = null,
    source: java.lang.String = null
  ): MlGetFilters = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(error_trace)) __obj.updateDynamic("error_trace")(error_trace)
    if (filter_id != null) __obj.updateDynamic("filter_id")(filter_id)
    if (filter_path != null) __obj.updateDynamic("filter_path")(filter_path.asInstanceOf[js.Any])
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (!js.isUndefined(human)) __obj.updateDynamic("human")(human)
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method)
    if (!js.isUndefined(pretty)) __obj.updateDynamic("pretty")(pretty)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source)
    __obj.asInstanceOf[MlGetFilters]
  }
}

