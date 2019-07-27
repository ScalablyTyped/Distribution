package typings
package atElasticElasticsearchLib.apiRequestParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WatcherStats extends Generic {
  var emit_stacktraces: js.UndefOr[scala.Boolean] = js.undefined
  var metric: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
}

object WatcherStats {
  @scala.inline
  def apply(
    emit_stacktraces: js.UndefOr[scala.Boolean] = js.undefined,
    error_trace: js.UndefOr[scala.Boolean] = js.undefined,
    filter_path: java.lang.String | js.Array[java.lang.String] = null,
    human: js.UndefOr[scala.Boolean] = js.undefined,
    ignore: scala.Double | js.Array[scala.Double] = null,
    method: java.lang.String = null,
    metric: java.lang.String | js.Array[java.lang.String] = null,
    pretty: js.UndefOr[scala.Boolean] = js.undefined,
    source: java.lang.String = null
  ): WatcherStats = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(emit_stacktraces)) __obj.updateDynamic("emit_stacktraces")(emit_stacktraces)
    if (!js.isUndefined(error_trace)) __obj.updateDynamic("error_trace")(error_trace)
    if (filter_path != null) __obj.updateDynamic("filter_path")(filter_path.asInstanceOf[js.Any])
    if (!js.isUndefined(human)) __obj.updateDynamic("human")(human)
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method)
    if (metric != null) __obj.updateDynamic("metric")(metric.asInstanceOf[js.Any])
    if (!js.isUndefined(pretty)) __obj.updateDynamic("pretty")(pretty)
    if (source != null) __obj.updateDynamic("source")(source)
    __obj.asInstanceOf[WatcherStats]
  }
}

