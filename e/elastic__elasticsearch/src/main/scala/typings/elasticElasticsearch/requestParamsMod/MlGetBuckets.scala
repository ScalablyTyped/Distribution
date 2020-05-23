package typings.elasticElasticsearch.requestParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MlGetBuckets[T] extends Generic {
  var anomaly_score: js.UndefOr[Double] = js.undefined
  var body: js.UndefOr[T] = js.undefined
  var desc: js.UndefOr[Boolean] = js.undefined
  var end: js.UndefOr[String] = js.undefined
  var exclude_interim: js.UndefOr[Boolean] = js.undefined
  var expand: js.UndefOr[Boolean] = js.undefined
  var from: js.UndefOr[Double] = js.undefined
  var job_id: String
  var size: js.UndefOr[Double] = js.undefined
  var sort: js.UndefOr[String] = js.undefined
  var start: js.UndefOr[String] = js.undefined
  var timestamp: js.UndefOr[String] = js.undefined
}

object MlGetBuckets {
  @scala.inline
  def apply[T](
    job_id: String,
    anomaly_score: js.UndefOr[Double] = js.undefined,
    body: T = null,
    desc: js.UndefOr[Boolean] = js.undefined,
    end: String = null,
    error_trace: js.UndefOr[Boolean] = js.undefined,
    exclude_interim: js.UndefOr[Boolean] = js.undefined,
    expand: js.UndefOr[Boolean] = js.undefined,
    filter_path: String | js.Array[String] = null,
    from: js.UndefOr[Double] = js.undefined,
    human: js.UndefOr[Boolean] = js.undefined,
    ignore: Double | js.Array[Double] = null,
    method: String = null,
    pretty: js.UndefOr[Boolean] = js.undefined,
    size: js.UndefOr[Double] = js.undefined,
    sort: String = null,
    source: String = null,
    start: String = null,
    timestamp: String = null
  ): MlGetBuckets[T] = {
    val __obj = js.Dynamic.literal(job_id = job_id.asInstanceOf[js.Any])
    if (!js.isUndefined(anomaly_score)) __obj.updateDynamic("anomaly_score")(anomaly_score.get.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (!js.isUndefined(desc)) __obj.updateDynamic("desc")(desc.get.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (!js.isUndefined(error_trace)) __obj.updateDynamic("error_trace")(error_trace.get.asInstanceOf[js.Any])
    if (!js.isUndefined(exclude_interim)) __obj.updateDynamic("exclude_interim")(exclude_interim.get.asInstanceOf[js.Any])
    if (!js.isUndefined(expand)) __obj.updateDynamic("expand")(expand.get.asInstanceOf[js.Any])
    if (filter_path != null) __obj.updateDynamic("filter_path")(filter_path.asInstanceOf[js.Any])
    if (!js.isUndefined(from)) __obj.updateDynamic("from")(from.get.asInstanceOf[js.Any])
    if (!js.isUndefined(human)) __obj.updateDynamic("human")(human.get.asInstanceOf[js.Any])
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (!js.isUndefined(pretty)) __obj.updateDynamic("pretty")(pretty.get.asInstanceOf[js.Any])
    if (!js.isUndefined(size)) __obj.updateDynamic("size")(size.get.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (timestamp != null) __obj.updateDynamic("timestamp")(timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlGetBuckets[T]]
  }
}

