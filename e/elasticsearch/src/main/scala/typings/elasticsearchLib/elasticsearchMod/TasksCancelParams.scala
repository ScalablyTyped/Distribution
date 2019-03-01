package typings
package elasticsearchLib.elasticsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TasksCancelParams extends GenericParams {
  var actions: js.UndefOr[NameList] = js.undefined
  var nodeId: js.UndefOr[NameList] = js.undefined
  var parentNode: js.UndefOr[java.lang.String] = js.undefined
  var parentTask: js.UndefOr[java.lang.String] = js.undefined
  var taskId: js.UndefOr[java.lang.String] = js.undefined
}

object TasksCancelParams {
  @scala.inline
  def apply(
    actions: NameList = null,
    body: js.Any = null,
    filterPath: java.lang.String | js.Array[java.lang.String] = null,
    ignore: scala.Double | js.Array[scala.Double] = null,
    maxRetries: scala.Int | scala.Double = null,
    method: java.lang.String = null,
    nodeId: NameList = null,
    parentNode: java.lang.String = null,
    parentTask: java.lang.String = null,
    requestTimeout: scala.Int | scala.Double = null,
    taskId: java.lang.String = null
  ): TasksCancelParams = {
    val __obj = js.Dynamic.literal()
    if (actions != null) __obj.updateDynamic("actions")(actions.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body)
    if (filterPath != null) __obj.updateDynamic("filterPath")(filterPath.asInstanceOf[js.Any])
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (maxRetries != null) __obj.updateDynamic("maxRetries")(maxRetries.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method)
    if (nodeId != null) __obj.updateDynamic("nodeId")(nodeId.asInstanceOf[js.Any])
    if (parentNode != null) __obj.updateDynamic("parentNode")(parentNode)
    if (parentTask != null) __obj.updateDynamic("parentTask")(parentTask)
    if (requestTimeout != null) __obj.updateDynamic("requestTimeout")(requestTimeout.asInstanceOf[js.Any])
    if (taskId != null) __obj.updateDynamic("taskId")(taskId)
    __obj.asInstanceOf[TasksCancelParams]
  }
}

