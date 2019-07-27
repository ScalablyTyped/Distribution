package typings
package atElasticElasticsearchLib.apiRequestParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClusterAllocationExplain[T] extends Generic {
  var body: js.UndefOr[T] = js.undefined
  var include_disk_info: js.UndefOr[scala.Boolean] = js.undefined
  var include_yes_decisions: js.UndefOr[scala.Boolean] = js.undefined
}

object ClusterAllocationExplain {
  @scala.inline
  def apply[T](
    body: T = null,
    error_trace: js.UndefOr[scala.Boolean] = js.undefined,
    filter_path: java.lang.String | js.Array[java.lang.String] = null,
    human: js.UndefOr[scala.Boolean] = js.undefined,
    ignore: scala.Double | js.Array[scala.Double] = null,
    include_disk_info: js.UndefOr[scala.Boolean] = js.undefined,
    include_yes_decisions: js.UndefOr[scala.Boolean] = js.undefined,
    method: java.lang.String = null,
    pretty: js.UndefOr[scala.Boolean] = js.undefined,
    source: java.lang.String = null
  ): ClusterAllocationExplain[T] = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (!js.isUndefined(error_trace)) __obj.updateDynamic("error_trace")(error_trace)
    if (filter_path != null) __obj.updateDynamic("filter_path")(filter_path.asInstanceOf[js.Any])
    if (!js.isUndefined(human)) __obj.updateDynamic("human")(human)
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (!js.isUndefined(include_disk_info)) __obj.updateDynamic("include_disk_info")(include_disk_info)
    if (!js.isUndefined(include_yes_decisions)) __obj.updateDynamic("include_yes_decisions")(include_yes_decisions)
    if (method != null) __obj.updateDynamic("method")(method)
    if (!js.isUndefined(pretty)) __obj.updateDynamic("pretty")(pretty)
    if (source != null) __obj.updateDynamic("source")(source)
    __obj.asInstanceOf[ClusterAllocationExplain[T]]
  }
}

