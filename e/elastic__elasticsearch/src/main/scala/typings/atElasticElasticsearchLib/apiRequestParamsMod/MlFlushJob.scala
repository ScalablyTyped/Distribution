package typings
package atElasticElasticsearchLib.apiRequestParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MlFlushJob[T] extends Generic {
  var advance_time: js.UndefOr[java.lang.String] = js.undefined
  var body: js.UndefOr[T] = js.undefined
  var calc_interim: js.UndefOr[scala.Boolean] = js.undefined
  var end: js.UndefOr[java.lang.String] = js.undefined
  var job_id: java.lang.String
  var skip_time: js.UndefOr[java.lang.String] = js.undefined
  var start: js.UndefOr[java.lang.String] = js.undefined
}

object MlFlushJob {
  @scala.inline
  def apply[T](
    job_id: java.lang.String,
    advance_time: java.lang.String = null,
    body: T = null,
    calc_interim: js.UndefOr[scala.Boolean] = js.undefined,
    end: java.lang.String = null,
    error_trace: js.UndefOr[scala.Boolean] = js.undefined,
    filter_path: java.lang.String | js.Array[java.lang.String] = null,
    human: js.UndefOr[scala.Boolean] = js.undefined,
    ignore: scala.Double | js.Array[scala.Double] = null,
    method: java.lang.String = null,
    pretty: js.UndefOr[scala.Boolean] = js.undefined,
    skip_time: java.lang.String = null,
    source: java.lang.String = null,
    start: java.lang.String = null
  ): MlFlushJob[T] = {
    val __obj = js.Dynamic.literal(job_id = job_id)
    if (advance_time != null) __obj.updateDynamic("advance_time")(advance_time)
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (!js.isUndefined(calc_interim)) __obj.updateDynamic("calc_interim")(calc_interim)
    if (end != null) __obj.updateDynamic("end")(end)
    if (!js.isUndefined(error_trace)) __obj.updateDynamic("error_trace")(error_trace)
    if (filter_path != null) __obj.updateDynamic("filter_path")(filter_path.asInstanceOf[js.Any])
    if (!js.isUndefined(human)) __obj.updateDynamic("human")(human)
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method)
    if (!js.isUndefined(pretty)) __obj.updateDynamic("pretty")(pretty)
    if (skip_time != null) __obj.updateDynamic("skip_time")(skip_time)
    if (source != null) __obj.updateDynamic("source")(source)
    if (start != null) __obj.updateDynamic("start")(start)
    __obj.asInstanceOf[MlFlushJob[T]]
  }
}

