package typings.atElasticElasticsearch.apiRequestParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MlGetOverallBuckets[T] extends Generic {
  var allow_no_jobs: js.UndefOr[Boolean] = js.undefined
  var body: js.UndefOr[T] = js.undefined
  var bucket_span: js.UndefOr[String] = js.undefined
  var end: js.UndefOr[String] = js.undefined
  var exclude_interim: js.UndefOr[Boolean] = js.undefined
  var job_id: String
  var overall_score: js.UndefOr[Double] = js.undefined
  var start: js.UndefOr[String] = js.undefined
  var top_n: js.UndefOr[Double] = js.undefined
}

object MlGetOverallBuckets {
  @scala.inline
  def apply[T](
    job_id: String,
    allow_no_jobs: js.UndefOr[Boolean] = js.undefined,
    body: T = null,
    bucket_span: String = null,
    end: String = null,
    error_trace: js.UndefOr[Boolean] = js.undefined,
    exclude_interim: js.UndefOr[Boolean] = js.undefined,
    filter_path: String | js.Array[String] = null,
    human: js.UndefOr[Boolean] = js.undefined,
    ignore: Double | js.Array[Double] = null,
    method: String = null,
    overall_score: Int | Double = null,
    pretty: js.UndefOr[Boolean] = js.undefined,
    source: String = null,
    start: String = null,
    top_n: Int | Double = null
  ): MlGetOverallBuckets[T] = {
    val __obj = js.Dynamic.literal(job_id = job_id.asInstanceOf[js.Any])
    if (!js.isUndefined(allow_no_jobs)) __obj.updateDynamic("allow_no_jobs")(allow_no_jobs.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (bucket_span != null) __obj.updateDynamic("bucket_span")(bucket_span.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (!js.isUndefined(error_trace)) __obj.updateDynamic("error_trace")(error_trace.asInstanceOf[js.Any])
    if (!js.isUndefined(exclude_interim)) __obj.updateDynamic("exclude_interim")(exclude_interim.asInstanceOf[js.Any])
    if (filter_path != null) __obj.updateDynamic("filter_path")(filter_path.asInstanceOf[js.Any])
    if (!js.isUndefined(human)) __obj.updateDynamic("human")(human.asInstanceOf[js.Any])
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (overall_score != null) __obj.updateDynamic("overall_score")(overall_score.asInstanceOf[js.Any])
    if (!js.isUndefined(pretty)) __obj.updateDynamic("pretty")(pretty.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (top_n != null) __obj.updateDynamic("top_n")(top_n.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlGetOverallBuckets[T]]
  }
}

