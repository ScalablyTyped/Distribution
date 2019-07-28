package typings.atElasticElasticsearch.apiRequestParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MlStopDatafeed extends Generic {
  var allow_no_datafeeds: js.UndefOr[Boolean] = js.undefined
  var datafeed_id: String
  var force: js.UndefOr[Boolean] = js.undefined
  var timeout: js.UndefOr[String] = js.undefined
}

object MlStopDatafeed {
  @scala.inline
  def apply(
    datafeed_id: String,
    allow_no_datafeeds: js.UndefOr[Boolean] = js.undefined,
    error_trace: js.UndefOr[Boolean] = js.undefined,
    filter_path: String | js.Array[String] = null,
    force: js.UndefOr[Boolean] = js.undefined,
    human: js.UndefOr[Boolean] = js.undefined,
    ignore: Double | js.Array[Double] = null,
    method: String = null,
    pretty: js.UndefOr[Boolean] = js.undefined,
    source: String = null,
    timeout: String = null
  ): MlStopDatafeed = {
    val __obj = js.Dynamic.literal(datafeed_id = datafeed_id)
    if (!js.isUndefined(allow_no_datafeeds)) __obj.updateDynamic("allow_no_datafeeds")(allow_no_datafeeds)
    if (!js.isUndefined(error_trace)) __obj.updateDynamic("error_trace")(error_trace)
    if (filter_path != null) __obj.updateDynamic("filter_path")(filter_path.asInstanceOf[js.Any])
    if (!js.isUndefined(force)) __obj.updateDynamic("force")(force)
    if (!js.isUndefined(human)) __obj.updateDynamic("human")(human)
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method)
    if (!js.isUndefined(pretty)) __obj.updateDynamic("pretty")(pretty)
    if (source != null) __obj.updateDynamic("source")(source)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout)
    __obj.asInstanceOf[MlStopDatafeed]
  }
}

