package typings.atElasticElasticsearch.apiRequestParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MlGetCalendarEvents extends Generic {
  var calendar_id: String
  var end: js.UndefOr[String] = js.undefined
  var from: js.UndefOr[Double] = js.undefined
  var job_id: js.UndefOr[String] = js.undefined
  var size: js.UndefOr[Double] = js.undefined
  var start: js.UndefOr[String] = js.undefined
}

object MlGetCalendarEvents {
  @scala.inline
  def apply(
    calendar_id: String,
    end: String = null,
    error_trace: js.UndefOr[Boolean] = js.undefined,
    filter_path: String | js.Array[String] = null,
    from: Int | Double = null,
    human: js.UndefOr[Boolean] = js.undefined,
    ignore: Double | js.Array[Double] = null,
    job_id: String = null,
    method: String = null,
    pretty: js.UndefOr[Boolean] = js.undefined,
    size: Int | Double = null,
    source: String = null,
    start: String = null
  ): MlGetCalendarEvents = {
    val __obj = js.Dynamic.literal(calendar_id = calendar_id)
    if (end != null) __obj.updateDynamic("end")(end)
    if (!js.isUndefined(error_trace)) __obj.updateDynamic("error_trace")(error_trace)
    if (filter_path != null) __obj.updateDynamic("filter_path")(filter_path.asInstanceOf[js.Any])
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (!js.isUndefined(human)) __obj.updateDynamic("human")(human)
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (job_id != null) __obj.updateDynamic("job_id")(job_id)
    if (method != null) __obj.updateDynamic("method")(method)
    if (!js.isUndefined(pretty)) __obj.updateDynamic("pretty")(pretty)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source)
    if (start != null) __obj.updateDynamic("start")(start)
    __obj.asInstanceOf[MlGetCalendarEvents]
  }
}

