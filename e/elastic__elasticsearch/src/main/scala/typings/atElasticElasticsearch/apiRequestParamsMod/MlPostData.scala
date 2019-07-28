package typings.atElasticElasticsearch.apiRequestParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MlPostData[T] extends Generic {
  var body: T
  var job_id: String
  var reset_end: js.UndefOr[String] = js.undefined
  var reset_start: js.UndefOr[String] = js.undefined
}

object MlPostData {
  @scala.inline
  def apply[T](
    body: T,
    job_id: String,
    error_trace: js.UndefOr[Boolean] = js.undefined,
    filter_path: String | js.Array[String] = null,
    human: js.UndefOr[Boolean] = js.undefined,
    ignore: Double | js.Array[Double] = null,
    method: String = null,
    pretty: js.UndefOr[Boolean] = js.undefined,
    reset_end: String = null,
    reset_start: String = null,
    source: String = null
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

