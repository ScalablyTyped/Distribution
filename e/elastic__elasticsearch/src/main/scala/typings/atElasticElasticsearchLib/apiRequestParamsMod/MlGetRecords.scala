package typings
package atElasticElasticsearchLib.apiRequestParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MlGetRecords[T] extends Generic {
  var body: js.UndefOr[T] = js.undefined
  var desc: js.UndefOr[scala.Boolean] = js.undefined
  var end: js.UndefOr[java.lang.String] = js.undefined
  var exclude_interim: js.UndefOr[scala.Boolean] = js.undefined
  var from: js.UndefOr[scala.Double] = js.undefined
  var job_id: java.lang.String
  var record_score: js.UndefOr[scala.Double] = js.undefined
  var size: js.UndefOr[scala.Double] = js.undefined
  var sort: js.UndefOr[java.lang.String] = js.undefined
  var start: js.UndefOr[java.lang.String] = js.undefined
}

object MlGetRecords {
  @scala.inline
  def apply[T](
    job_id: java.lang.String,
    body: T = null,
    desc: js.UndefOr[scala.Boolean] = js.undefined,
    end: java.lang.String = null,
    error_trace: js.UndefOr[scala.Boolean] = js.undefined,
    exclude_interim: js.UndefOr[scala.Boolean] = js.undefined,
    filter_path: java.lang.String | js.Array[java.lang.String] = null,
    from: scala.Int | scala.Double = null,
    human: js.UndefOr[scala.Boolean] = js.undefined,
    ignore: scala.Double | js.Array[scala.Double] = null,
    method: java.lang.String = null,
    pretty: js.UndefOr[scala.Boolean] = js.undefined,
    record_score: scala.Int | scala.Double = null,
    size: scala.Int | scala.Double = null,
    sort: java.lang.String = null,
    source: java.lang.String = null,
    start: java.lang.String = null
  ): MlGetRecords[T] = {
    val __obj = js.Dynamic.literal(job_id = job_id)
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (!js.isUndefined(desc)) __obj.updateDynamic("desc")(desc)
    if (end != null) __obj.updateDynamic("end")(end)
    if (!js.isUndefined(error_trace)) __obj.updateDynamic("error_trace")(error_trace)
    if (!js.isUndefined(exclude_interim)) __obj.updateDynamic("exclude_interim")(exclude_interim)
    if (filter_path != null) __obj.updateDynamic("filter_path")(filter_path.asInstanceOf[js.Any])
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (!js.isUndefined(human)) __obj.updateDynamic("human")(human)
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method)
    if (!js.isUndefined(pretty)) __obj.updateDynamic("pretty")(pretty)
    if (record_score != null) __obj.updateDynamic("record_score")(record_score.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort)
    if (source != null) __obj.updateDynamic("source")(source)
    if (start != null) __obj.updateDynamic("start")(start)
    __obj.asInstanceOf[MlGetRecords[T]]
  }
}

