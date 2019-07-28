package typings.atElasticElasticsearch.apiRequestParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MlGetDatafeeds extends Generic {
  var allow_no_datafeeds: js.UndefOr[Boolean] = js.undefined
  var datafeed_id: js.UndefOr[String] = js.undefined
}

object MlGetDatafeeds {
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
  ): MlGetDatafeeds = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allow_no_datafeeds)) __obj.updateDynamic("allow_no_datafeeds")(allow_no_datafeeds)
    if (datafeed_id != null) __obj.updateDynamic("datafeed_id")(datafeed_id)
    if (!js.isUndefined(error_trace)) __obj.updateDynamic("error_trace")(error_trace)
    if (filter_path != null) __obj.updateDynamic("filter_path")(filter_path.asInstanceOf[js.Any])
    if (!js.isUndefined(human)) __obj.updateDynamic("human")(human)
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method)
    if (!js.isUndefined(pretty)) __obj.updateDynamic("pretty")(pretty)
    if (source != null) __obj.updateDynamic("source")(source)
    __obj.asInstanceOf[MlGetDatafeeds]
  }
}

