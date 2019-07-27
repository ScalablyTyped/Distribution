package typings
package atElasticElasticsearchLib.apiRequestParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RollupRollupSearch[T] extends Generic {
  var body: T
  var index: java.lang.String | js.Array[java.lang.String]
  var rest_total_hits_as_int: js.UndefOr[scala.Boolean] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  var typed_keys: js.UndefOr[scala.Boolean] = js.undefined
}

object RollupRollupSearch {
  @scala.inline
  def apply[T](
    body: T,
    index: java.lang.String | js.Array[java.lang.String],
    error_trace: js.UndefOr[scala.Boolean] = js.undefined,
    filter_path: java.lang.String | js.Array[java.lang.String] = null,
    human: js.UndefOr[scala.Boolean] = js.undefined,
    ignore: scala.Double | js.Array[scala.Double] = null,
    method: java.lang.String = null,
    pretty: js.UndefOr[scala.Boolean] = js.undefined,
    rest_total_hits_as_int: js.UndefOr[scala.Boolean] = js.undefined,
    source: java.lang.String = null,
    `type`: java.lang.String = null,
    typed_keys: js.UndefOr[scala.Boolean] = js.undefined
  ): RollupRollupSearch[T] = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
    if (!js.isUndefined(error_trace)) __obj.updateDynamic("error_trace")(error_trace)
    if (filter_path != null) __obj.updateDynamic("filter_path")(filter_path.asInstanceOf[js.Any])
    if (!js.isUndefined(human)) __obj.updateDynamic("human")(human)
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method)
    if (!js.isUndefined(pretty)) __obj.updateDynamic("pretty")(pretty)
    if (!js.isUndefined(rest_total_hits_as_int)) __obj.updateDynamic("rest_total_hits_as_int")(rest_total_hits_as_int)
    if (source != null) __obj.updateDynamic("source")(source)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(typed_keys)) __obj.updateDynamic("typed_keys")(typed_keys)
    __obj.asInstanceOf[RollupRollupSearch[T]]
  }
}

