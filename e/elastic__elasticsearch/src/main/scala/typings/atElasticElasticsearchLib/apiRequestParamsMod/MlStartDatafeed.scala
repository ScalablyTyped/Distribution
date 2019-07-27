package typings
package atElasticElasticsearchLib.apiRequestParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MlStartDatafeed[T] extends Generic {
  var body: js.UndefOr[T] = js.undefined
  var datafeed_id: java.lang.String
  var end: js.UndefOr[java.lang.String] = js.undefined
  var start: js.UndefOr[java.lang.String] = js.undefined
  var timeout: js.UndefOr[java.lang.String] = js.undefined
}

object MlStartDatafeed {
  @scala.inline
  def apply[T](
    datafeed_id: java.lang.String,
    body: T = null,
    end: java.lang.String = null,
    error_trace: js.UndefOr[scala.Boolean] = js.undefined,
    filter_path: java.lang.String | js.Array[java.lang.String] = null,
    human: js.UndefOr[scala.Boolean] = js.undefined,
    ignore: scala.Double | js.Array[scala.Double] = null,
    method: java.lang.String = null,
    pretty: js.UndefOr[scala.Boolean] = js.undefined,
    source: java.lang.String = null,
    start: java.lang.String = null,
    timeout: java.lang.String = null
  ): MlStartDatafeed[T] = {
    val __obj = js.Dynamic.literal(datafeed_id = datafeed_id)
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end)
    if (!js.isUndefined(error_trace)) __obj.updateDynamic("error_trace")(error_trace)
    if (filter_path != null) __obj.updateDynamic("filter_path")(filter_path.asInstanceOf[js.Any])
    if (!js.isUndefined(human)) __obj.updateDynamic("human")(human)
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method)
    if (!js.isUndefined(pretty)) __obj.updateDynamic("pretty")(pretty)
    if (source != null) __obj.updateDynamic("source")(source)
    if (start != null) __obj.updateDynamic("start")(start)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout)
    __obj.asInstanceOf[MlStartDatafeed[T]]
  }
}

