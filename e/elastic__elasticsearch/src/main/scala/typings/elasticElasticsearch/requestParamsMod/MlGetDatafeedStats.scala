package typings.elasticElasticsearch.requestParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MlGetDatafeedStats extends Generic {
  var allow_no_datafeeds: js.UndefOr[Boolean] = js.undefined
  var datafeed_id: js.UndefOr[String] = js.undefined
}

object MlGetDatafeedStats {
  @scala.inline
  def apply(
    allow_no_datafeeds: js.UndefOr[Boolean] = js.undefined,
    datafeed_id: String = null,
    error_trace: js.UndefOr[Boolean] = js.undefined,
    filter_path: String | js.Array[String] = null,
    human: js.UndefOr[Boolean] = js.undefined,
    ignore: Double | js.Array[Double] = null,
    method: String = null,
    pretty: js.UndefOr[Boolean] = js.undefined,
    source: String = null
  ): MlGetDatafeedStats = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allow_no_datafeeds)) __obj.updateDynamic("allow_no_datafeeds")(allow_no_datafeeds.get.asInstanceOf[js.Any])
    if (datafeed_id != null) __obj.updateDynamic("datafeed_id")(datafeed_id.asInstanceOf[js.Any])
    if (!js.isUndefined(error_trace)) __obj.updateDynamic("error_trace")(error_trace.get.asInstanceOf[js.Any])
    if (filter_path != null) __obj.updateDynamic("filter_path")(filter_path.asInstanceOf[js.Any])
    if (!js.isUndefined(human)) __obj.updateDynamic("human")(human.get.asInstanceOf[js.Any])
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (!js.isUndefined(pretty)) __obj.updateDynamic("pretty")(pretty.get.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlGetDatafeedStats]
  }
}

