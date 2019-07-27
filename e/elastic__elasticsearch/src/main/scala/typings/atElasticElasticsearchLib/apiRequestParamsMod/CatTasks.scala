package typings
package atElasticElasticsearchLib.apiRequestParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CatTasks extends Generic {
  var actions: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var detailed: js.UndefOr[scala.Boolean] = js.undefined
  var format: js.UndefOr[java.lang.String] = js.undefined
  var h: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var help: js.UndefOr[scala.Boolean] = js.undefined
  var node_id: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var parent_task: js.UndefOr[scala.Double] = js.undefined
  var s: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var v: js.UndefOr[scala.Boolean] = js.undefined
}

object CatTasks {
  @scala.inline
  def apply(
    actions: java.lang.String | js.Array[java.lang.String] = null,
    detailed: js.UndefOr[scala.Boolean] = js.undefined,
    error_trace: js.UndefOr[scala.Boolean] = js.undefined,
    filter_path: java.lang.String | js.Array[java.lang.String] = null,
    format: java.lang.String = null,
    h: java.lang.String | js.Array[java.lang.String] = null,
    help: js.UndefOr[scala.Boolean] = js.undefined,
    human: js.UndefOr[scala.Boolean] = js.undefined,
    ignore: scala.Double | js.Array[scala.Double] = null,
    method: java.lang.String = null,
    node_id: java.lang.String | js.Array[java.lang.String] = null,
    parent_task: scala.Int | scala.Double = null,
    pretty: js.UndefOr[scala.Boolean] = js.undefined,
    s: java.lang.String | js.Array[java.lang.String] = null,
    source: java.lang.String = null,
    v: js.UndefOr[scala.Boolean] = js.undefined
  ): CatTasks = {
    val __obj = js.Dynamic.literal()
    if (actions != null) __obj.updateDynamic("actions")(actions.asInstanceOf[js.Any])
    if (!js.isUndefined(detailed)) __obj.updateDynamic("detailed")(detailed)
    if (!js.isUndefined(error_trace)) __obj.updateDynamic("error_trace")(error_trace)
    if (filter_path != null) __obj.updateDynamic("filter_path")(filter_path.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format)
    if (h != null) __obj.updateDynamic("h")(h.asInstanceOf[js.Any])
    if (!js.isUndefined(help)) __obj.updateDynamic("help")(help)
    if (!js.isUndefined(human)) __obj.updateDynamic("human")(human)
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method)
    if (node_id != null) __obj.updateDynamic("node_id")(node_id.asInstanceOf[js.Any])
    if (parent_task != null) __obj.updateDynamic("parent_task")(parent_task.asInstanceOf[js.Any])
    if (!js.isUndefined(pretty)) __obj.updateDynamic("pretty")(pretty)
    if (s != null) __obj.updateDynamic("s")(s.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source)
    if (!js.isUndefined(v)) __obj.updateDynamic("v")(v)
    __obj.asInstanceOf[CatTasks]
  }
}

