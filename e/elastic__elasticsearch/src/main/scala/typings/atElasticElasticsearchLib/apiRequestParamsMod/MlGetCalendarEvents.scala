package typings
package atElasticElasticsearchLib.apiRequestParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MlGetCalendarEvents extends Generic {
  var calendar_id: java.lang.String
  var end: js.UndefOr[java.lang.String] = js.undefined
  var from: js.UndefOr[scala.Double] = js.undefined
  var job_id: js.UndefOr[java.lang.String] = js.undefined
  var size: js.UndefOr[scala.Double] = js.undefined
  var start: js.UndefOr[java.lang.String] = js.undefined
}

object MlGetCalendarEvents {
  @scala.inline
  def apply(
    calendar_id: java.lang.String,
    end: java.lang.String = null,
    error_trace: js.UndefOr[scala.Boolean] = js.undefined,
    filter_path: java.lang.String | js.Array[java.lang.String] = null,
    from: scala.Int | scala.Double = null,
    human: js.UndefOr[scala.Boolean] = js.undefined,
    ignore: scala.Double | js.Array[scala.Double] = null,
    job_id: java.lang.String = null,
    method: java.lang.String = null,
    pretty: js.UndefOr[scala.Boolean] = js.undefined,
    size: scala.Int | scala.Double = null,
    source: java.lang.String = null,
    start: java.lang.String = null
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

