package typings
package elasticsearchLib.elasticsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TasksListParams extends GenericParams {
  var actions: js.UndefOr[NameList] = js.undefined
  var detailed: js.UndefOr[scala.Boolean] = js.undefined
  var groupBy: js.UndefOr[
    elasticsearchLib.elasticsearchLibStrings.nodes | elasticsearchLib.elasticsearchLibStrings.parents
  ] = js.undefined
  var nodeId: js.UndefOr[NameList] = js.undefined
  var parentNode: js.UndefOr[java.lang.String] = js.undefined
  var parentTask: js.UndefOr[java.lang.String] = js.undefined
  var waitForCompletion: js.UndefOr[scala.Boolean] = js.undefined
}

object TasksListParams {
  @scala.inline
  def apply(
    actions: NameList = null,
    body: js.Any = null,
    detailed: js.UndefOr[scala.Boolean] = js.undefined,
    filterPath: java.lang.String | js.Array[java.lang.String] = null,
    groupBy: elasticsearchLib.elasticsearchLibStrings.nodes | elasticsearchLib.elasticsearchLibStrings.parents = null,
    ignore: scala.Double | js.Array[scala.Double] = null,
    maxRetries: scala.Int | scala.Double = null,
    method: java.lang.String = null,
    nodeId: NameList = null,
    parentNode: java.lang.String = null,
    parentTask: java.lang.String = null,
    requestTimeout: scala.Int | scala.Double = null,
    waitForCompletion: js.UndefOr[scala.Boolean] = js.undefined
  ): TasksListParams = {
    val __obj = js.Dynamic.literal()
    if (actions != null) __obj.updateDynamic("actions")(actions.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body)
    if (!js.isUndefined(detailed)) __obj.updateDynamic("detailed")(detailed)
    if (filterPath != null) __obj.updateDynamic("filterPath")(filterPath.asInstanceOf[js.Any])
    if (groupBy != null) __obj.updateDynamic("groupBy")(groupBy.asInstanceOf[js.Any])
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (maxRetries != null) __obj.updateDynamic("maxRetries")(maxRetries.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method)
    if (nodeId != null) __obj.updateDynamic("nodeId")(nodeId.asInstanceOf[js.Any])
    if (parentNode != null) __obj.updateDynamic("parentNode")(parentNode)
    if (parentTask != null) __obj.updateDynamic("parentTask")(parentTask)
    if (requestTimeout != null) __obj.updateDynamic("requestTimeout")(requestTimeout.asInstanceOf[js.Any])
    if (!js.isUndefined(waitForCompletion)) __obj.updateDynamic("waitForCompletion")(waitForCompletion)
    __obj.asInstanceOf[TasksListParams]
  }
}

