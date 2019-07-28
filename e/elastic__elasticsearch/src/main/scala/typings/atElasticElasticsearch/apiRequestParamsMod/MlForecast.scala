package typings.atElasticElasticsearch.apiRequestParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MlForecast extends Generic {
  var duration: js.UndefOr[String] = js.undefined
  var expires_in: js.UndefOr[String] = js.undefined
  var job_id: String
}

object MlForecast {
  @scala.inline
  def apply(
    job_id: String,
    duration: String = null,
    error_trace: js.UndefOr[Boolean] = js.undefined,
    expires_in: String = null,
    filter_path: String | js.Array[String] = null,
    human: js.UndefOr[Boolean] = js.undefined,
    ignore: Double | js.Array[Double] = null,
    method: String = null,
    pretty: js.UndefOr[Boolean] = js.undefined,
    source: String = null
  ): MlForecast = {
    val __obj = js.Dynamic.literal(job_id = job_id)
    if (duration != null) __obj.updateDynamic("duration")(duration)
    if (!js.isUndefined(error_trace)) __obj.updateDynamic("error_trace")(error_trace)
    if (expires_in != null) __obj.updateDynamic("expires_in")(expires_in)
    if (filter_path != null) __obj.updateDynamic("filter_path")(filter_path.asInstanceOf[js.Any])
    if (!js.isUndefined(human)) __obj.updateDynamic("human")(human)
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method)
    if (!js.isUndefined(pretty)) __obj.updateDynamic("pretty")(pretty)
    if (source != null) __obj.updateDynamic("source")(source)
    __obj.asInstanceOf[MlForecast]
  }
}

