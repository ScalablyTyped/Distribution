package typings.atElasticElasticsearch.apiRequestParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MlRevertModelSnapshot[T] extends Generic {
  var body: js.UndefOr[T] = js.undefined
  var delete_intervening_results: js.UndefOr[Boolean] = js.undefined
  var job_id: String
  var snapshot_id: String
}

object MlRevertModelSnapshot {
  @scala.inline
  def apply[T](
    job_id: String,
    snapshot_id: String,
    body: T = null,
    delete_intervening_results: js.UndefOr[Boolean] = js.undefined,
    error_trace: js.UndefOr[Boolean] = js.undefined,
    filter_path: String | js.Array[String] = null,
    human: js.UndefOr[Boolean] = js.undefined,
    ignore: Double | js.Array[Double] = null,
    method: String = null,
    pretty: js.UndefOr[Boolean] = js.undefined,
    source: String = null
  ): MlRevertModelSnapshot[T] = {
    val __obj = js.Dynamic.literal(job_id = job_id, snapshot_id = snapshot_id)
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (!js.isUndefined(delete_intervening_results)) __obj.updateDynamic("delete_intervening_results")(delete_intervening_results)
    if (!js.isUndefined(error_trace)) __obj.updateDynamic("error_trace")(error_trace)
    if (filter_path != null) __obj.updateDynamic("filter_path")(filter_path.asInstanceOf[js.Any])
    if (!js.isUndefined(human)) __obj.updateDynamic("human")(human)
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method)
    if (!js.isUndefined(pretty)) __obj.updateDynamic("pretty")(pretty)
    if (source != null) __obj.updateDynamic("source")(source)
    __obj.asInstanceOf[MlRevertModelSnapshot[T]]
  }
}

