package typings.atElasticElasticsearch.apiRequestParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MlGetModelSnapshots[T] extends Generic {
  var body: js.UndefOr[T] = js.undefined
  var desc: js.UndefOr[Boolean] = js.undefined
  var end: js.UndefOr[String] = js.undefined
  var from: js.UndefOr[Double] = js.undefined
  var job_id: String
  var size: js.UndefOr[Double] = js.undefined
  var snapshot_id: js.UndefOr[String] = js.undefined
  var sort: js.UndefOr[String] = js.undefined
  var start: js.UndefOr[String] = js.undefined
}

object MlGetModelSnapshots {
  @scala.inline
  def apply[T](
    job_id: String,
    body: T = null,
    desc: js.UndefOr[Boolean] = js.undefined,
    end: String = null,
    error_trace: js.UndefOr[Boolean] = js.undefined,
    filter_path: String | js.Array[String] = null,
    from: Int | Double = null,
    human: js.UndefOr[Boolean] = js.undefined,
    ignore: Double | js.Array[Double] = null,
    method: String = null,
    pretty: js.UndefOr[Boolean] = js.undefined,
    size: Int | Double = null,
    snapshot_id: String = null,
    sort: String = null,
    source: String = null,
    start: String = null
  ): MlGetModelSnapshots[T] = {
    val __obj = js.Dynamic.literal(job_id = job_id)
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (!js.isUndefined(desc)) __obj.updateDynamic("desc")(desc)
    if (end != null) __obj.updateDynamic("end")(end)
    if (!js.isUndefined(error_trace)) __obj.updateDynamic("error_trace")(error_trace)
    if (filter_path != null) __obj.updateDynamic("filter_path")(filter_path.asInstanceOf[js.Any])
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (!js.isUndefined(human)) __obj.updateDynamic("human")(human)
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method)
    if (!js.isUndefined(pretty)) __obj.updateDynamic("pretty")(pretty)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (snapshot_id != null) __obj.updateDynamic("snapshot_id")(snapshot_id)
    if (sort != null) __obj.updateDynamic("sort")(sort)
    if (source != null) __obj.updateDynamic("source")(source)
    if (start != null) __obj.updateDynamic("start")(start)
    __obj.asInstanceOf[MlGetModelSnapshots[T]]
  }
}

