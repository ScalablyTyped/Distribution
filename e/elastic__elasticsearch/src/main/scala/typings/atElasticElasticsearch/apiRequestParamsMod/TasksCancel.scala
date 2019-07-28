package typings.atElasticElasticsearch.apiRequestParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TasksCancel extends Generic {
  var actions: js.UndefOr[String | js.Array[String]] = js.undefined
  var nodes: js.UndefOr[String | js.Array[String]] = js.undefined
  var parent_task_id: js.UndefOr[String] = js.undefined
  var task_id: js.UndefOr[String] = js.undefined
}

object TasksCancel {
  @scala.inline
  def apply(
    actions: String | js.Array[String] = null,
    error_trace: js.UndefOr[Boolean] = js.undefined,
    filter_path: String | js.Array[String] = null,
    human: js.UndefOr[Boolean] = js.undefined,
    ignore: Double | js.Array[Double] = null,
    method: String = null,
    nodes: String | js.Array[String] = null,
    parent_task_id: String = null,
    pretty: js.UndefOr[Boolean] = js.undefined,
    source: String = null,
    task_id: String = null
  ): TasksCancel = {
    val __obj = js.Dynamic.literal()
    if (actions != null) __obj.updateDynamic("actions")(actions.asInstanceOf[js.Any])
    if (!js.isUndefined(error_trace)) __obj.updateDynamic("error_trace")(error_trace)
    if (filter_path != null) __obj.updateDynamic("filter_path")(filter_path.asInstanceOf[js.Any])
    if (!js.isUndefined(human)) __obj.updateDynamic("human")(human)
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method)
    if (nodes != null) __obj.updateDynamic("nodes")(nodes.asInstanceOf[js.Any])
    if (parent_task_id != null) __obj.updateDynamic("parent_task_id")(parent_task_id)
    if (!js.isUndefined(pretty)) __obj.updateDynamic("pretty")(pretty)
    if (source != null) __obj.updateDynamic("source")(source)
    if (task_id != null) __obj.updateDynamic("task_id")(task_id)
    __obj.asInstanceOf[TasksCancel]
  }
}

