package typings
package atElasticElasticsearchLib.apiRequestParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SnapshotCreate[T] extends Generic {
  var body: js.UndefOr[T] = js.undefined
  var master_timeout: js.UndefOr[java.lang.String] = js.undefined
  var repository: java.lang.String
  var snapshot: java.lang.String
  var wait_for_completion: js.UndefOr[scala.Boolean] = js.undefined
}

object SnapshotCreate {
  @scala.inline
  def apply[T](
    repository: java.lang.String,
    snapshot: java.lang.String,
    body: T = null,
    error_trace: js.UndefOr[scala.Boolean] = js.undefined,
    filter_path: java.lang.String | js.Array[java.lang.String] = null,
    human: js.UndefOr[scala.Boolean] = js.undefined,
    ignore: scala.Double | js.Array[scala.Double] = null,
    master_timeout: java.lang.String = null,
    method: java.lang.String = null,
    pretty: js.UndefOr[scala.Boolean] = js.undefined,
    source: java.lang.String = null,
    wait_for_completion: js.UndefOr[scala.Boolean] = js.undefined
  ): SnapshotCreate[T] = {
    val __obj = js.Dynamic.literal(repository = repository, snapshot = snapshot)
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (!js.isUndefined(error_trace)) __obj.updateDynamic("error_trace")(error_trace)
    if (filter_path != null) __obj.updateDynamic("filter_path")(filter_path.asInstanceOf[js.Any])
    if (!js.isUndefined(human)) __obj.updateDynamic("human")(human)
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (master_timeout != null) __obj.updateDynamic("master_timeout")(master_timeout)
    if (method != null) __obj.updateDynamic("method")(method)
    if (!js.isUndefined(pretty)) __obj.updateDynamic("pretty")(pretty)
    if (source != null) __obj.updateDynamic("source")(source)
    if (!js.isUndefined(wait_for_completion)) __obj.updateDynamic("wait_for_completion")(wait_for_completion)
    __obj.asInstanceOf[SnapshotCreate[T]]
  }
}

