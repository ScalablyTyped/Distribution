package typings.atElasticElasticsearch.apiRequestParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MlStartDatafeed[T] extends Generic {
  var body: js.UndefOr[T] = js.undefined
  var datafeed_id: String
  var end: js.UndefOr[String] = js.undefined
  var start: js.UndefOr[String] = js.undefined
  var timeout: js.UndefOr[String] = js.undefined
}

object MlStartDatafeed {
  @scala.inline
  def apply[T](
    datafeed_id: String,
    body: T = null,
    end: String = null,
    error_trace: js.UndefOr[Boolean] = js.undefined,
    filter_path: String | js.Array[String] = null,
    human: js.UndefOr[Boolean] = js.undefined,
    ignore: Double | js.Array[Double] = null,
    method: String = null,
    pretty: js.UndefOr[Boolean] = js.undefined,
    source: String = null,
    start: String = null,
    timeout: String = null
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

