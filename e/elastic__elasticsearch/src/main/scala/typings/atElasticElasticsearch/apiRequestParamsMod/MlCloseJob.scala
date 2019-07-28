package typings.atElasticElasticsearch.apiRequestParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MlCloseJob[T] extends Generic {
  var allow_no_jobs: js.UndefOr[Boolean] = js.undefined
  var body: js.UndefOr[T] = js.undefined
  var force: js.UndefOr[Boolean] = js.undefined
  var job_id: String
  var timeout: js.UndefOr[String] = js.undefined
}

object MlCloseJob {
  @scala.inline
  def apply[T](
    job_id: String,
    allow_no_jobs: js.UndefOr[Boolean] = js.undefined,
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
  ): MlCloseJob[T] = {
    val __obj = js.Dynamic.literal(job_id = job_id)
    if (!js.isUndefined(allow_no_jobs)) __obj.updateDynamic("allow_no_jobs")(allow_no_jobs)
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
    __obj.asInstanceOf[MlCloseJob[T]]
  }
}

