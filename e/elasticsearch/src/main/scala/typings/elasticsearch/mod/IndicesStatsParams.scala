package typings.elasticsearch.mod

import typings.elasticsearch.elasticsearchStrings.cluster
import typings.elasticsearch.elasticsearchStrings.indices
import typings.elasticsearch.elasticsearchStrings.shards
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IndicesStatsParams extends GenericParams {
  var completionFields: js.UndefOr[NameList] = js.undefined
  var fielddataFields: js.UndefOr[NameList] = js.undefined
  var fields: js.UndefOr[NameList] = js.undefined
  var groups: js.UndefOr[NameList] = js.undefined
  var human: js.UndefOr[Boolean] = js.undefined
  var index: NameList
  var level: js.UndefOr[cluster | indices | shards] = js.undefined
  var metric: js.UndefOr[NameList] = js.undefined
  var types: js.UndefOr[NameList] = js.undefined
}

object IndicesStatsParams {
  @scala.inline
  def apply(
    index: NameList,
    body: js.Any = null,
    completionFields: NameList = null,
    fielddataFields: NameList = null,
    fields: NameList = null,
    filterPath: String | js.Array[String] = null,
    groups: NameList = null,
    human: js.UndefOr[Boolean] = js.undefined,
    ignore: Double | js.Array[Double] = null,
    level: cluster | indices | shards = null,
    maxRetries: js.UndefOr[Double] = js.undefined,
    method: String = null,
    metric: NameList = null,
    requestTimeout: js.UndefOr[Double] = js.undefined,
    types: NameList = null
  ): IndicesStatsParams = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (completionFields != null) __obj.updateDynamic("completionFields")(completionFields.asInstanceOf[js.Any])
    if (fielddataFields != null) __obj.updateDynamic("fielddataFields")(fielddataFields.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (filterPath != null) __obj.updateDynamic("filterPath")(filterPath.asInstanceOf[js.Any])
    if (groups != null) __obj.updateDynamic("groups")(groups.asInstanceOf[js.Any])
    if (!js.isUndefined(human)) __obj.updateDynamic("human")(human.get.asInstanceOf[js.Any])
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (!js.isUndefined(maxRetries)) __obj.updateDynamic("maxRetries")(maxRetries.get.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (metric != null) __obj.updateDynamic("metric")(metric.asInstanceOf[js.Any])
    if (!js.isUndefined(requestTimeout)) __obj.updateDynamic("requestTimeout")(requestTimeout.get.asInstanceOf[js.Any])
    if (types != null) __obj.updateDynamic("types")(types.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndicesStatsParams]
  }
}

