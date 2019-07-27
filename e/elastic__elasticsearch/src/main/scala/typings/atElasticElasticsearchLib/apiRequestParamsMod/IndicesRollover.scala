package typings
package atElasticElasticsearchLib.apiRequestParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IndicesRollover[T] extends Generic {
  var alias: java.lang.String
  var body: js.UndefOr[T] = js.undefined
  var dry_run: js.UndefOr[scala.Boolean] = js.undefined
  var include_type_name: js.UndefOr[scala.Boolean] = js.undefined
  var master_timeout: js.UndefOr[java.lang.String] = js.undefined
  var new_index: js.UndefOr[java.lang.String] = js.undefined
  var timeout: js.UndefOr[java.lang.String] = js.undefined
  var wait_for_active_shards: js.UndefOr[java.lang.String] = js.undefined
}

object IndicesRollover {
  @scala.inline
  def apply[T](
    alias: java.lang.String,
    body: T = null,
    dry_run: js.UndefOr[scala.Boolean] = js.undefined,
    error_trace: js.UndefOr[scala.Boolean] = js.undefined,
    filter_path: java.lang.String | js.Array[java.lang.String] = null,
    human: js.UndefOr[scala.Boolean] = js.undefined,
    ignore: scala.Double | js.Array[scala.Double] = null,
    include_type_name: js.UndefOr[scala.Boolean] = js.undefined,
    master_timeout: java.lang.String = null,
    method: java.lang.String = null,
    new_index: java.lang.String = null,
    pretty: js.UndefOr[scala.Boolean] = js.undefined,
    source: java.lang.String = null,
    timeout: java.lang.String = null,
    wait_for_active_shards: java.lang.String = null
  ): IndicesRollover[T] = {
    val __obj = js.Dynamic.literal(alias = alias)
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (!js.isUndefined(dry_run)) __obj.updateDynamic("dry_run")(dry_run)
    if (!js.isUndefined(error_trace)) __obj.updateDynamic("error_trace")(error_trace)
    if (filter_path != null) __obj.updateDynamic("filter_path")(filter_path.asInstanceOf[js.Any])
    if (!js.isUndefined(human)) __obj.updateDynamic("human")(human)
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (!js.isUndefined(include_type_name)) __obj.updateDynamic("include_type_name")(include_type_name)
    if (master_timeout != null) __obj.updateDynamic("master_timeout")(master_timeout)
    if (method != null) __obj.updateDynamic("method")(method)
    if (new_index != null) __obj.updateDynamic("new_index")(new_index)
    if (!js.isUndefined(pretty)) __obj.updateDynamic("pretty")(pretty)
    if (source != null) __obj.updateDynamic("source")(source)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout)
    if (wait_for_active_shards != null) __obj.updateDynamic("wait_for_active_shards")(wait_for_active_shards)
    __obj.asInstanceOf[IndicesRollover[T]]
  }
}

