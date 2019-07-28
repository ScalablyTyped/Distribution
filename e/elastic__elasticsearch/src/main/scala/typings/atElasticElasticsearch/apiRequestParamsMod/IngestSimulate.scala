package typings.atElasticElasticsearch.apiRequestParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IngestSimulate[T] extends Generic {
  var body: T
  var id: js.UndefOr[String] = js.undefined
  var verbose: js.UndefOr[Boolean] = js.undefined
}

object IngestSimulate {
  @scala.inline
  def apply[T](
    body: T,
    error_trace: js.UndefOr[Boolean] = js.undefined,
    filter_path: String | js.Array[String] = null,
    human: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    ignore: Double | js.Array[Double] = null,
    method: String = null,
    pretty: js.UndefOr[Boolean] = js.undefined,
    source: String = null,
    verbose: js.UndefOr[Boolean] = js.undefined
  ): IngestSimulate[T] = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    if (!js.isUndefined(error_trace)) __obj.updateDynamic("error_trace")(error_trace)
    if (filter_path != null) __obj.updateDynamic("filter_path")(filter_path.asInstanceOf[js.Any])
    if (!js.isUndefined(human)) __obj.updateDynamic("human")(human)
    if (id != null) __obj.updateDynamic("id")(id)
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method)
    if (!js.isUndefined(pretty)) __obj.updateDynamic("pretty")(pretty)
    if (source != null) __obj.updateDynamic("source")(source)
    if (!js.isUndefined(verbose)) __obj.updateDynamic("verbose")(verbose)
    __obj.asInstanceOf[IngestSimulate[T]]
  }
}

