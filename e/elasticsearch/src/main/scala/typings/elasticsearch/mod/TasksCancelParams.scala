package typings.elasticsearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TasksCancelParams extends GenericParams {
  var actions: js.UndefOr[NameList] = js.undefined
  var nodeId: js.UndefOr[NameList] = js.undefined
  var parentNode: js.UndefOr[String] = js.undefined
  var parentTask: js.UndefOr[String] = js.undefined
  var taskId: js.UndefOr[String] = js.undefined
}

object TasksCancelParams {
  @scala.inline
  def apply(
    actions: NameList = null,
    body: js.Any = null,
    filterPath: String | js.Array[String] = null,
    ignore: Double | js.Array[Double] = null,
    maxRetries: js.UndefOr[Double] = js.undefined,
    method: String = null,
    nodeId: NameList = null,
    parentNode: String = null,
    parentTask: String = null,
    requestTimeout: js.UndefOr[Double] = js.undefined,
    taskId: String = null
  ): TasksCancelParams = {
    val __obj = js.Dynamic.literal()
    if (actions != null) __obj.updateDynamic("actions")(actions.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (filterPath != null) __obj.updateDynamic("filterPath")(filterPath.asInstanceOf[js.Any])
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (!js.isUndefined(maxRetries)) __obj.updateDynamic("maxRetries")(maxRetries.get.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (nodeId != null) __obj.updateDynamic("nodeId")(nodeId.asInstanceOf[js.Any])
    if (parentNode != null) __obj.updateDynamic("parentNode")(parentNode.asInstanceOf[js.Any])
    if (parentTask != null) __obj.updateDynamic("parentTask")(parentTask.asInstanceOf[js.Any])
    if (!js.isUndefined(requestTimeout)) __obj.updateDynamic("requestTimeout")(requestTimeout.get.asInstanceOf[js.Any])
    if (taskId != null) __obj.updateDynamic("taskId")(taskId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TasksCancelParams]
  }
}

