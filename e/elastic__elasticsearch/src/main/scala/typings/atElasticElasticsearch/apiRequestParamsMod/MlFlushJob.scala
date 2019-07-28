package typings.atElasticElasticsearch.apiRequestParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MlFlushJob[T] extends Generic {
  var advance_time: js.UndefOr[String] = js.undefined
  var body: js.UndefOr[T] = js.undefined
  var calc_interim: js.UndefOr[Boolean] = js.undefined
  var end: js.UndefOr[String] = js.undefined
  var job_id: String
  var skip_time: js.UndefOr[String] = js.undefined
  var start: js.UndefOr[String] = js.undefined
}

object MlFlushJob {
  @scala.inline
  def apply[T](
    job_id: String,
    advance_time: String = null,
    body: T = null,
    calc_interim: js.UndefOr[Boolean] = js.undefined,
    end: String = null,
    error_trace: js.UndefOr[Boolean] = js.undefined,
    filter_path: String | js.Array[String] = null,
    human: js.UndefOr[Boolean] = js.undefined,
    ignore: Double | js.Array[Double] = null,
    method: String = null,
    pretty: js.UndefOr[Boolean] = js.undefined,
    skip_time: String = null,
    source: String = null,
    start: String = null
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

