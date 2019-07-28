package typings.elasticsearch.elasticsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IndicesShardStoresParams extends GenericParams {
  var allowNoIndices: js.UndefOr[Boolean] = js.undefined
  var expandWildcards: js.UndefOr[ExpandWildcards] = js.undefined
  var ignoreUnavailable: js.UndefOr[Boolean] = js.undefined
     // even the docs don't know what this does
  var index: NameList
  var operationThreading: js.UndefOr[js.Any] = js.undefined
  var status: js.UndefOr[NameList] = js.undefined
}

object IndicesShardStoresParams {
  @scala.inline
  def apply(
    index: NameList,
    allowNoIndices: js.UndefOr[Boolean] = js.undefined,
    body: js.Any = null,
    expandWildcards: ExpandWildcards = null,
    filterPath: String | js.Array[String] = null,
    ignore: Double | js.Array[Double] = null,
    ignoreUnavailable: js.UndefOr[Boolean] = js.undefined,
    maxRetries: Int | Double = null,
    method: String = null,
    operationThreading: js.Any = null,
    requestTimeout: Int | Double = null,
    status: NameList = null
  ): IndicesShardStoresParams = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    if (!js.isUndefined(allowNoIndices)) __obj.updateDynamic("allowNoIndices")(allowNoIndices)
    if (body != null) __obj.updateDynamic("body")(body)
    if (expandWildcards != null) __obj.updateDynamic("expandWildcards")(expandWildcards)
    if (filterPath != null) __obj.updateDynamic("filterPath")(filterPath.asInstanceOf[js.Any])
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreUnavailable)) __obj.updateDynamic("ignoreUnavailable")(ignoreUnavailable)
    if (maxRetries != null) __obj.updateDynamic("maxRetries")(maxRetries.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method)
    if (operationThreading != null) __obj.updateDynamic("operationThreading")(operationThreading)
    if (requestTimeout != null) __obj.updateDynamic("requestTimeout")(requestTimeout.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndicesShardStoresParams]
  }
}

