package typings.atElasticElasticsearch.apiRequestParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MlStopDataFrameAnalytics[T] extends Generic {
  var allow_no_match: js.UndefOr[Boolean] = js.undefined
  var body: js.UndefOr[T] = js.undefined
  var force: js.UndefOr[Boolean] = js.undefined
  var id: String
  var timeout: js.UndefOr[String] = js.undefined
}

object MlStopDataFrameAnalytics {
  @scala.inline
  def apply[T](
    id: String,
    allow_no_match: js.UndefOr[Boolean] = js.undefined,
    body: T = null,
    error_trace: js.UndefOr[Boolean] = js.undefined,
    filter_path: String | js.Array[String] = null,
    force: js.UndefOr[Boolean] = js.undefined,
    human: js.UndefOr[Boolean] = js.undefined,
    ignore: Double | js.Array[Double] = null,
    method: String = null,
    pretty: js.UndefOr[Boolean] = js.undefined,
    source: String = null,
    timeout: String = null
  ): MlStopDataFrameAnalytics[T] = {
    val __obj = js.Dynamic.literal(id = id)
    if (!js.isUndefined(allow_no_match)) __obj.updateDynamic("allow_no_match")(allow_no_match)
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (!js.isUndefined(error_trace)) __obj.updateDynamic("error_trace")(error_trace)
    if (filter_path != null) __obj.updateDynamic("filter_path")(filter_path.asInstanceOf[js.Any])
    if (!js.isUndefined(force)) __obj.updateDynamic("force")(force)
    if (!js.isUndefined(human)) __obj.updateDynamic("human")(human)
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method)
    if (!js.isUndefined(pretty)) __obj.updateDynamic("pretty")(pretty)
    if (source != null) __obj.updateDynamic("source")(source)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout)
    __obj.asInstanceOf[MlStopDataFrameAnalytics[T]]
  }
}

