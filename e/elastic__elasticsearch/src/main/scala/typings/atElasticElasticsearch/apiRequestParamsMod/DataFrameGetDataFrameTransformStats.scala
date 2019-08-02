package typings.atElasticElasticsearch.apiRequestParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataFrameGetDataFrameTransformStats extends Generic {
  var allow_no_match: js.UndefOr[Boolean] = js.undefined
  var from: js.UndefOr[Double] = js.undefined
  var size: js.UndefOr[Double] = js.undefined
  var transform_id: js.UndefOr[String] = js.undefined
}

object DataFrameGetDataFrameTransformStats {
  @scala.inline
  def apply(
    allow_no_match: js.UndefOr[Boolean] = js.undefined,
    error_trace: js.UndefOr[Boolean] = js.undefined,
    filter_path: String | js.Array[String] = null,
    from: Int | Double = null,
    human: js.UndefOr[Boolean] = js.undefined,
    ignore: Double | js.Array[Double] = null,
    method: String = null,
    pretty: js.UndefOr[Boolean] = js.undefined,
    size: Int | Double = null,
    source: String = null,
    transform_id: String = null
  ): DataFrameGetDataFrameTransformStats = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allow_no_match)) __obj.updateDynamic("allow_no_match")(allow_no_match)
    if (!js.isUndefined(error_trace)) __obj.updateDynamic("error_trace")(error_trace)
    if (filter_path != null) __obj.updateDynamic("filter_path")(filter_path.asInstanceOf[js.Any])
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (!js.isUndefined(human)) __obj.updateDynamic("human")(human)
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method)
    if (!js.isUndefined(pretty)) __obj.updateDynamic("pretty")(pretty)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source)
    if (transform_id != null) __obj.updateDynamic("transform_id")(transform_id)
    __obj.asInstanceOf[DataFrameGetDataFrameTransformStats]
  }
}

