package typings
package atElasticElasticsearchLib.apiRequestParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TasksList extends Generic {
  var actions: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var detailed: js.UndefOr[scala.Boolean] = js.undefined
  var group_by: js.UndefOr[
    atElasticElasticsearchLib.atElasticElasticsearchLibStrings.nodes | atElasticElasticsearchLib.atElasticElasticsearchLibStrings.parents | atElasticElasticsearchLib.atElasticElasticsearchLibStrings.none
  ] = js.undefined
  var nodes: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var parent_task_id: js.UndefOr[java.lang.String] = js.undefined
  var timeout: js.UndefOr[java.lang.String] = js.undefined
  var wait_for_completion: js.UndefOr[scala.Boolean] = js.undefined
}

object TasksList {
  @scala.inline
  def apply(
    actions: java.lang.String | js.Array[java.lang.String] = null,
    detailed: js.UndefOr[scala.Boolean] = js.undefined,
    error_trace: js.UndefOr[scala.Boolean] = js.undefined,
    filter_path: java.lang.String | js.Array[java.lang.String] = null,
    group_by: atElasticElasticsearchLib.atElasticElasticsearchLibStrings.nodes | atElasticElasticsearchLib.atElasticElasticsearchLibStrings.parents | atElasticElasticsearchLib.atElasticElasticsearchLibStrings.none = null,
    human: js.UndefOr[scala.Boolean] = js.undefined,
    ignore: scala.Double | js.Array[scala.Double] = null,
    method: java.lang.String = null,
    nodes: java.lang.String | js.Array[java.lang.String] = null,
    parent_task_id: java.lang.String = null,
    pretty: js.UndefOr[scala.Boolean] = js.undefined,
    source: java.lang.String = null,
    timeout: java.lang.String = null,
    wait_for_completion: js.UndefOr[scala.Boolean] = js.undefined
  ): TasksList = {
    val __obj = js.Dynamic.literal()
    if (actions != null) __obj.updateDynamic("actions")(actions.asInstanceOf[js.Any])
    if (!js.isUndefined(detailed)) __obj.updateDynamic("detailed")(detailed)
    if (!js.isUndefined(error_trace)) __obj.updateDynamic("error_trace")(error_trace)
    if (filter_path != null) __obj.updateDynamic("filter_path")(filter_path.asInstanceOf[js.Any])
    if (group_by != null) __obj.updateDynamic("group_by")(group_by.asInstanceOf[js.Any])
    if (!js.isUndefined(human)) __obj.updateDynamic("human")(human)
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method)
    if (nodes != null) __obj.updateDynamic("nodes")(nodes.asInstanceOf[js.Any])
    if (parent_task_id != null) __obj.updateDynamic("parent_task_id")(parent_task_id)
    if (!js.isUndefined(pretty)) __obj.updateDynamic("pretty")(pretty)
    if (source != null) __obj.updateDynamic("source")(source)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout)
    if (!js.isUndefined(wait_for_completion)) __obj.updateDynamic("wait_for_completion")(wait_for_completion)
    __obj.asInstanceOf[TasksList]
  }
}

