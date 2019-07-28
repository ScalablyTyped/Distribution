package typings.atElasticElasticsearch.apiRequestParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SnapshotCreateRepository[T] extends Generic {
  var body: T
  var master_timeout: js.UndefOr[String] = js.undefined
  var repository: String
  var timeout: js.UndefOr[String] = js.undefined
  var verify: js.UndefOr[Boolean] = js.undefined
}

object SnapshotCreateRepository {
  @scala.inline
  def apply[T](
    body: T,
    repository: String,
    error_trace: js.UndefOr[Boolean] = js.undefined,
    filter_path: String | js.Array[String] = null,
    human: js.UndefOr[Boolean] = js.undefined,
    ignore: Double | js.Array[Double] = null,
    master_timeout: String = null,
    method: String = null,
    pretty: js.UndefOr[Boolean] = js.undefined,
    source: String = null,
    timeout: String = null,
    verify: js.UndefOr[Boolean] = js.undefined
  ): SnapshotCreateRepository[T] = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], repository = repository)
    if (!js.isUndefined(error_trace)) __obj.updateDynamic("error_trace")(error_trace)
    if (filter_path != null) __obj.updateDynamic("filter_path")(filter_path.asInstanceOf[js.Any])
    if (!js.isUndefined(human)) __obj.updateDynamic("human")(human)
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (master_timeout != null) __obj.updateDynamic("master_timeout")(master_timeout)
    if (method != null) __obj.updateDynamic("method")(method)
    if (!js.isUndefined(pretty)) __obj.updateDynamic("pretty")(pretty)
    if (source != null) __obj.updateDynamic("source")(source)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout)
    if (!js.isUndefined(verify)) __obj.updateDynamic("verify")(verify)
    __obj.asInstanceOf[SnapshotCreateRepository[T]]
  }
}

