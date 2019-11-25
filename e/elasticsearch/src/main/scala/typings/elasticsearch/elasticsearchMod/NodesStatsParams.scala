package typings.elasticsearch.elasticsearchMod

import typings.elasticsearch.elasticsearchStrings.indices
import typings.elasticsearch.elasticsearchStrings.node
import typings.elasticsearch.elasticsearchStrings.shards
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodesStatsParams extends GenericParams {
  var completionFields: js.UndefOr[NameList] = js.undefined
  var fielddataFields: js.UndefOr[NameList] = js.undefined
  var fields: js.UndefOr[NameList] = js.undefined
  var groups: js.UndefOr[Boolean] = js.undefined
  var human: js.UndefOr[Boolean] = js.undefined
  var indexMetric: js.UndefOr[NameList] = js.undefined
  var level: js.UndefOr[indices | node | shards] = js.undefined
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
    filterPath: String | js.Array[String] = null,
    groups: js.UndefOr[Boolean] = js.undefined,
    human: js.UndefOr[Boolean] = js.undefined,
    ignore: Double | js.Array[Double] = null,
    indexMetric: NameList = null,
    level: indices | node | shards = null,
    maxRetries: Int | Double = null,
    method: String = null,
    metric: NameList = null,
    nodeId: NameList = null,
    requestTimeout: Int | Double = null,
    timeout: TimeSpan = null,
    types: NameList = null
  ): NodesStatsParams = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (completionFields != null) __obj.updateDynamic("completionFields")(completionFields.asInstanceOf[js.Any])
    if (fielddataFields != null) __obj.updateDynamic("fielddataFields")(fielddataFields.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (filterPath != null) __obj.updateDynamic("filterPath")(filterPath.asInstanceOf[js.Any])
    if (!js.isUndefined(groups)) __obj.updateDynamic("groups")(groups.asInstanceOf[js.Any])
    if (!js.isUndefined(human)) __obj.updateDynamic("human")(human.asInstanceOf[js.Any])
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (indexMetric != null) __obj.updateDynamic("indexMetric")(indexMetric.asInstanceOf[js.Any])
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (maxRetries != null) __obj.updateDynamic("maxRetries")(maxRetries.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (metric != null) __obj.updateDynamic("metric")(metric.asInstanceOf[js.Any])
    if (nodeId != null) __obj.updateDynamic("nodeId")(nodeId.asInstanceOf[js.Any])
    if (requestTimeout != null) __obj.updateDynamic("requestTimeout")(requestTimeout.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (types != null) __obj.updateDynamic("types")(types.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodesStatsParams]
  }
}

