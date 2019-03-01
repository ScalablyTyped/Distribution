package typings
package elasticsearchLib.elasticsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodesStatsParams extends GenericParams {
  var completionFields: js.UndefOr[NameList] = js.undefined
  var fielddataFields: js.UndefOr[NameList] = js.undefined
  var fields: js.UndefOr[NameList] = js.undefined
  var groups: js.UndefOr[scala.Boolean] = js.undefined
  var human: js.UndefOr[scala.Boolean] = js.undefined
  var indexMetric: js.UndefOr[NameList] = js.undefined
  var level: js.UndefOr[
    elasticsearchLib.elasticsearchLibStrings.indices | elasticsearchLib.elasticsearchLibStrings.node | elasticsearchLib.elasticsearchLibStrings.shards
  ] = js.undefined
  var metric: js.UndefOr[NameList] = js.undefined
  var nodeId: js.UndefOr[NameList] = js.undefined
  var timeout: js.UndefOr[TimeSpan] = js.undefined
  var types: js.UndefOr[NameList] = js.undefined
}

object NodesStatsParams {
  @scala.inline
  def apply(
    body: js.Any = null,
    completionFields: NameList = null,
    fielddataFields: NameList = null,
    fields: NameList = null,
    filterPath: java.lang.String | js.Array[java.lang.String] = null,
    groups: js.UndefOr[scala.Boolean] = js.undefined,
    human: js.UndefOr[scala.Boolean] = js.undefined,
    ignore: scala.Double | js.Array[scala.Double] = null,
    indexMetric: NameList = null,
    level: elasticsearchLib.elasticsearchLibStrings.indices | elasticsearchLib.elasticsearchLibStrings.node | elasticsearchLib.elasticsearchLibStrings.shards = null,
    maxRetries: scala.Int | scala.Double = null,
    method: java.lang.String = null,
    metric: NameList = null,
    nodeId: NameList = null,
    requestTimeout: scala.Int | scala.Double = null,
    timeout: TimeSpan = null,
    types: NameList = null
  ): NodesStatsParams = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body)
    if (completionFields != null) __obj.updateDynamic("completionFields")(completionFields.asInstanceOf[js.Any])
    if (fielddataFields != null) __obj.updateDynamic("fielddataFields")(fielddataFields.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (filterPath != null) __obj.updateDynamic("filterPath")(filterPath.asInstanceOf[js.Any])
    if (!js.isUndefined(groups)) __obj.updateDynamic("groups")(groups)
    if (!js.isUndefined(human)) __obj.updateDynamic("human")(human)
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (indexMetric != null) __obj.updateDynamic("indexMetric")(indexMetric.asInstanceOf[js.Any])
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (maxRetries != null) __obj.updateDynamic("maxRetries")(maxRetries.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method)
    if (metric != null) __obj.updateDynamic("metric")(metric.asInstanceOf[js.Any])
    if (nodeId != null) __obj.updateDynamic("nodeId")(nodeId.asInstanceOf[js.Any])
    if (requestTimeout != null) __obj.updateDynamic("requestTimeout")(requestTimeout.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout)
    if (types != null) __obj.updateDynamic("types")(types.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodesStatsParams]
  }
}

