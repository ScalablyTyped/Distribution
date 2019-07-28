package typings.atElasticElasticsearch.apiRequestParamsMod

import typings.atElasticElasticsearch.atElasticElasticsearchStrings.nodes
import typings.atElasticElasticsearch.atElasticElasticsearchStrings.none
import typings.atElasticElasticsearch.atElasticElasticsearchStrings.parents
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TasksList extends Generic {
  var actions: js.UndefOr[String | js.Array[String]] = js.undefined
  var detailed: js.UndefOr[Boolean] = js.undefined
  var group_by: js.UndefOr[nodes | parents | none] = js.undefined
  var nodes: js.UndefOr[String | js.Array[String]] = js.undefined
  var parent_task_id: js.UndefOr[String] = js.undefined
  var timeout: js.UndefOr[String] = js.undefined
  var wait_for_completion: js.UndefOr[Boolean] = js.undefined
}

object TasksList {
  @scala.inline
  def apply(
    actions: String | js.Array[String] = null,
    detailed: js.UndefOr[Boolean] = js.undefined,
    error_trace: js.UndefOr[Boolean] = js.undefined,
    filter_path: String | js.Array[String] = null,
    group_by: nodes | parents | none = null,
    human: js.UndefOr[Boolean] = js.undefined,
    ignore: Double | js.Array[Double] = null,
    method: String = null,
    nodes: String | js.Array[String] = null,
    parent_task_id: String = null,
    pretty: js.UndefOr[Boolean] = js.undefined,
    source: String = null,
    timeout: String = null,
    wait_for_completion: js.UndefOr[Boolean] = js.undefined
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

