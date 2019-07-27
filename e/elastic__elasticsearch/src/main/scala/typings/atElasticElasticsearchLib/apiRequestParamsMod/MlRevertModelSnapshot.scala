package typings
package atElasticElasticsearchLib.apiRequestParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MlRevertModelSnapshot[T] extends Generic {
  var body: js.UndefOr[T] = js.undefined
  var delete_intervening_results: js.UndefOr[scala.Boolean] = js.undefined
  var job_id: java.lang.String
  var snapshot_id: java.lang.String
}

object MlRevertModelSnapshot {
  @scala.inline
  def apply[T](
    job_id: java.lang.String,
    snapshot_id: java.lang.String,
    body: T = null,
    delete_intervening_results: js.UndefOr[scala.Boolean] = js.undefined,
    error_trace: js.UndefOr[scala.Boolean] = js.undefined,
    filter_path: java.lang.String | js.Array[java.lang.String] = null,
    human: js.UndefOr[scala.Boolean] = js.undefined,
    ignore: scala.Double | js.Array[scala.Double] = null,
    method: java.lang.String = null,
    pretty: js.UndefOr[scala.Boolean] = js.undefined,
    source: java.lang.String = null
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

