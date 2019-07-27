package typings
package atElasticElasticsearchLib.apiRequestParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MlForecast extends Generic {
  var duration: js.UndefOr[java.lang.String] = js.undefined
  var expires_in: js.UndefOr[java.lang.String] = js.undefined
  var job_id: java.lang.String
}

object MlForecast {
  @scala.inline
  def apply(
    job_id: java.lang.String,
    duration: java.lang.String = null,
    error_trace: js.UndefOr[scala.Boolean] = js.undefined,
    expires_in: java.lang.String = null,
    filter_path: java.lang.String | js.Array[java.lang.String] = null,
    human: js.UndefOr[scala.Boolean] = js.undefined,
    ignore: scala.Double | js.Array[scala.Double] = null,
    method: java.lang.String = null,
    pretty: js.UndefOr[scala.Boolean] = js.undefined,
    source: java.lang.String = null
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

