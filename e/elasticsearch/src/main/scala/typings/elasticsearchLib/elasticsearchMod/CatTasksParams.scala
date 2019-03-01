package typings
package elasticsearchLib.elasticsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CatTasksParams extends GenericParams {
  var actions: js.UndefOr[NameList] = js.undefined
  var detailed: js.UndefOr[scala.Boolean] = js.undefined
  var format: java.lang.String
  var h: js.UndefOr[NameList] = js.undefined
  var help: js.UndefOr[scala.Boolean] = js.undefined
  var nodeId: js.UndefOr[NameList] = js.undefined
  var parentNode: js.UndefOr[java.lang.String] = js.undefined
  var parentTask: js.UndefOr[scala.Double] = js.undefined
  var v: js.UndefOr[scala.Boolean] = js.undefined
}

object CatTasksParams {
  @scala.inline
  def apply(
    format: java.lang.String,
    actions: NameList = null,
    body: js.Any = null,
    detailed: js.UndefOr[scala.Boolean] = js.undefined,
    filterPath: java.lang.String | js.Array[java.lang.String] = null,
    h: NameList = null,
    help: js.UndefOr[scala.Boolean] = js.undefined,
    ignore: scala.Double | js.Array[scala.Double] = null,
    maxRetries: scala.Int | scala.Double = null,
    method: java.lang.String = null,
    nodeId: NameList = null,
    parentNode: java.lang.String = null,
    parentTask: scala.Int | scala.Double = null,
    requestTimeout: scala.Int | scala.Double = null,
    v: js.UndefOr[scala.Boolean] = js.undefined
  ): CatTasksParams = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("format")(format)
    if (actions != null) __obj.updateDynamic("actions")(actions.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body)
    if (!js.isUndefined(detailed)) __obj.updateDynamic("detailed")(detailed)
    if (filterPath != null) __obj.updateDynamic("filterPath")(filterPath.asInstanceOf[js.Any])
    if (h != null) __obj.updateDynamic("h")(h.asInstanceOf[js.Any])
    if (!js.isUndefined(help)) __obj.updateDynamic("help")(help)
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (maxRetries != null) __obj.updateDynamic("maxRetries")(maxRetries.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method)
    if (nodeId != null) __obj.updateDynamic("nodeId")(nodeId.asInstanceOf[js.Any])
    if (parentNode != null) __obj.updateDynamic("parentNode")(parentNode)
    if (parentTask != null) __obj.updateDynamic("parentTask")(parentTask.asInstanceOf[js.Any])
    if (requestTimeout != null) __obj.updateDynamic("requestTimeout")(requestTimeout.asInstanceOf[js.Any])
    if (!js.isUndefined(v)) __obj.updateDynamic("v")(v)
    __obj.asInstanceOf[CatTasksParams]
  }
}

