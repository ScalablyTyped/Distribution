package typings.atElasticElasticsearch.apiRequestParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MlGetJobStats extends Generic {
  var allow_no_jobs: js.UndefOr[Boolean] = js.undefined
  var job_id: js.UndefOr[String] = js.undefined
}

object MlGetJobStats {
  @scala.inline
  def apply(
    allow_no_jobs: js.UndefOr[Boolean] = js.undefined,
    error_trace: js.UndefOr[Boolean] = js.undefined,
    filter_path: String | js.Array[String] = null,
    human: js.UndefOr[Boolean] = js.undefined,
    ignore: Double | js.Array[Double] = null,
    job_id: String = null,
    method: String = null,
    pretty: js.UndefOr[Boolean] = js.undefined,
    source: String = null
  ): MlGetJobStats = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allow_no_jobs)) __obj.updateDynamic("allow_no_jobs")(allow_no_jobs)
    if (!js.isUndefined(error_trace)) __obj.updateDynamic("error_trace")(error_trace)
    if (filter_path != null) __obj.updateDynamic("filter_path")(filter_path.asInstanceOf[js.Any])
    if (!js.isUndefined(human)) __obj.updateDynamic("human")(human)
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (job_id != null) __obj.updateDynamic("job_id")(job_id)
    if (method != null) __obj.updateDynamic("method")(method)
    if (!js.isUndefined(pretty)) __obj.updateDynamic("pretty")(pretty)
    if (source != null) __obj.updateDynamic("source")(source)
    __obj.asInstanceOf[MlGetJobStats]
  }
}

