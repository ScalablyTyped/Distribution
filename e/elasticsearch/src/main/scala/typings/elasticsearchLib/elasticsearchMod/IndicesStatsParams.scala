package typings
package elasticsearchLib.elasticsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IndicesStatsParams extends GenericParams {
  var completionFields: js.UndefOr[NameList] = js.undefined
  var fielddataFields: js.UndefOr[NameList] = js.undefined
  var fields: js.UndefOr[NameList] = js.undefined
  var groups: js.UndefOr[NameList] = js.undefined
  var human: js.UndefOr[scala.Boolean] = js.undefined
  var index: NameList
  var level: js.UndefOr[
    elasticsearchLib.elasticsearchLibStrings.cluster | elasticsearchLib.elasticsearchLibStrings.indices | elasticsearchLib.elasticsearchLibStrings.shards
  ] = js.undefined
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
    filterPath: java.lang.String | js.Array[java.lang.String] = null,
    groups: NameList = null,
    human: js.UndefOr[scala.Boolean] = js.undefined,
    ignore: scala.Double | js.Array[scala.Double] = null,
    level: elasticsearchLib.elasticsearchLibStrings.cluster | elasticsearchLib.elasticsearchLibStrings.indices | elasticsearchLib.elasticsearchLibStrings.shards = null,
    maxRetries: scala.Int | scala.Double = null,
    method: java.lang.String = null,
    metric: NameList = null,
    requestTimeout: scala.Int | scala.Double = null,
    types: NameList = null
  ): IndicesStatsParams = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body)
    if (completionFields != null) __obj.updateDynamic("completionFields")(completionFields.asInstanceOf[js.Any])
    if (fielddataFields != null) __obj.updateDynamic("fielddataFields")(fielddataFields.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (filterPath != null) __obj.updateDynamic("filterPath")(filterPath.asInstanceOf[js.Any])
    if (groups != null) __obj.updateDynamic("groups")(groups.asInstanceOf[js.Any])
    if (!js.isUndefined(human)) __obj.updateDynamic("human")(human)
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (maxRetries != null) __obj.updateDynamic("maxRetries")(maxRetries.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method)
    if (metric != null) __obj.updateDynamic("metric")(metric.asInstanceOf[js.Any])
    if (requestTimeout != null) __obj.updateDynamic("requestTimeout")(requestTimeout.asInstanceOf[js.Any])
    if (types != null) __obj.updateDynamic("types")(types.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndicesStatsParams]
  }
}

