package typings
package atElasticElasticsearchLib.apiRequestParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MlGetOverallBuckets[T] extends Generic {
  var allow_no_jobs: js.UndefOr[scala.Boolean] = js.undefined
  var body: js.UndefOr[T] = js.undefined
  var bucket_span: js.UndefOr[java.lang.String] = js.undefined
  var end: js.UndefOr[java.lang.String] = js.undefined
  var exclude_interim: js.UndefOr[scala.Boolean] = js.undefined
  var job_id: java.lang.String
  var overall_score: js.UndefOr[scala.Double] = js.undefined
  var start: js.UndefOr[java.lang.String] = js.undefined
  var top_n: js.UndefOr[scala.Double] = js.undefined
}

object MlGetOverallBuckets {
  @scala.inline
  def apply[T](
    job_id: java.lang.String,
    allow_no_jobs: js.UndefOr[scala.Boolean] = js.undefined,
    body: T = null,
    bucket_span: java.lang.String = null,
    end: java.lang.String = null,
    error_trace: js.UndefOr[scala.Boolean] = js.undefined,
    exclude_interim: js.UndefOr[scala.Boolean] = js.undefined,
    filter_path: java.lang.String | js.Array[java.lang.String] = null,
    human: js.UndefOr[scala.Boolean] = js.undefined,
    ignore: scala.Double | js.Array[scala.Double] = null,
    method: java.lang.String = null,
    overall_score: scala.Int | scala.Double = null,
    pretty: js.UndefOr[scala.Boolean] = js.undefined,
    source: java.lang.String = null,
    start: java.lang.String = null,
    top_n: scala.Int | scala.Double = null
  ): MlGetOverallBuckets[T] = {
    val __obj = js.Dynamic.literal(job_id = job_id)
    if (!js.isUndefined(allow_no_jobs)) __obj.updateDynamic("allow_no_jobs")(allow_no_jobs)
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (bucket_span != null) __obj.updateDynamic("bucket_span")(bucket_span)
    if (end != null) __obj.updateDynamic("end")(end)
    if (!js.isUndefined(error_trace)) __obj.updateDynamic("error_trace")(error_trace)
    if (!js.isUndefined(exclude_interim)) __obj.updateDynamic("exclude_interim")(exclude_interim)
    if (filter_path != null) __obj.updateDynamic("filter_path")(filter_path.asInstanceOf[js.Any])
    if (!js.isUndefined(human)) __obj.updateDynamic("human")(human)
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method)
    if (overall_score != null) __obj.updateDynamic("overall_score")(overall_score.asInstanceOf[js.Any])
    if (!js.isUndefined(pretty)) __obj.updateDynamic("pretty")(pretty)
    if (source != null) __obj.updateDynamic("source")(source)
    if (start != null) __obj.updateDynamic("start")(start)
    if (top_n != null) __obj.updateDynamic("top_n")(top_n.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlGetOverallBuckets[T]]
  }
}

