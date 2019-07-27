package typings
package atElasticElasticsearchLib.apiRequestParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MlPostData[T] extends Generic {
  var body: T
  var job_id: java.lang.String
  var reset_end: js.UndefOr[java.lang.String] = js.undefined
  var reset_start: js.UndefOr[java.lang.String] = js.undefined
}

object MlPostData {
  @scala.inline
  def apply[T](
    body: T,
    job_id: java.lang.String,
    error_trace: js.UndefOr[scala.Boolean] = js.undefined,
    filter_path: java.lang.String | js.Array[java.lang.String] = null,
    human: js.UndefOr[scala.Boolean] = js.undefined,
    ignore: scala.Double | js.Array[scala.Double] = null,
    method: java.lang.String = null,
    pretty: js.UndefOr[scala.Boolean] = js.undefined,
    reset_end: java.lang.String = null,
    reset_start: java.lang.String = null,
    source: java.lang.String = null
  ): MlPostData[T] = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], job_id = job_id)
    if (!js.isUndefined(error_trace)) __obj.updateDynamic("error_trace")(error_trace)
    if (filter_path != null) __obj.updateDynamic("filter_path")(filter_path.asInstanceOf[js.Any])
    if (!js.isUndefined(human)) __obj.updateDynamic("human")(human)
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method)
    if (!js.isUndefined(pretty)) __obj.updateDynamic("pretty")(pretty)
    if (reset_end != null) __obj.updateDynamic("reset_end")(reset_end)
    if (reset_start != null) __obj.updateDynamic("reset_start")(reset_start)
    if (source != null) __obj.updateDynamic("source")(source)
    __obj.asInstanceOf[MlPostData[T]]
  }
}

