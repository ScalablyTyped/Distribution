package typings.elasticsearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IndicesClearCacheParams extends GenericParams {
  var allowNoIndices: js.UndefOr[Boolean] = js.undefined
  var expandWildcards: js.UndefOr[ExpandWildcards] = js.undefined
  var fieldData: js.UndefOr[Boolean] = js.undefined
  var fielddata: js.UndefOr[Boolean] = js.undefined
      // yes the docs really have both
  var fields: js.UndefOr[NameList] = js.undefined
  var ignoreUnavailable: js.UndefOr[Boolean] = js.undefined
  var index: js.UndefOr[NameList] = js.undefined
  var query: js.UndefOr[Boolean] = js.undefined
  var recycler: js.UndefOr[Boolean] = js.undefined
  var request: js.UndefOr[Boolean] = js.undefined
}

object IndicesClearCacheParams {
  @scala.inline
  def apply(
    allowNoIndices: js.UndefOr[Boolean] = js.undefined,
    body: js.Any = null,
    expandWildcards: ExpandWildcards = null,
    fieldData: js.UndefOr[Boolean] = js.undefined,
    fielddata: js.UndefOr[Boolean] = js.undefined,
    fields: NameList = null,
    filterPath: String | js.Array[String] = null,
    ignore: Double | js.Array[Double] = null,
    ignoreUnavailable: js.UndefOr[Boolean] = js.undefined,
    index: NameList = null,
    maxRetries: js.UndefOr[Double] = js.undefined,
    method: String = null,
    query: js.UndefOr[Boolean] = js.undefined,
    recycler: js.UndefOr[Boolean] = js.undefined,
    request: js.UndefOr[Boolean] = js.undefined,
    requestTimeout: js.UndefOr[Double] = js.undefined
  ): IndicesClearCacheParams = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowNoIndices)) __obj.updateDynamic("allowNoIndices")(allowNoIndices.get.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (expandWildcards != null) __obj.updateDynamic("expandWildcards")(expandWildcards.asInstanceOf[js.Any])
    if (!js.isUndefined(fieldData)) __obj.updateDynamic("fieldData")(fieldData.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fielddata)) __obj.updateDynamic("fielddata")(fielddata.get.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (filterPath != null) __obj.updateDynamic("filterPath")(filterPath.asInstanceOf[js.Any])
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreUnavailable)) __obj.updateDynamic("ignoreUnavailable")(ignoreUnavailable.get.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (!js.isUndefined(maxRetries)) __obj.updateDynamic("maxRetries")(maxRetries.get.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (!js.isUndefined(query)) __obj.updateDynamic("query")(query.get.asInstanceOf[js.Any])
    if (!js.isUndefined(recycler)) __obj.updateDynamic("recycler")(recycler.get.asInstanceOf[js.Any])
    if (!js.isUndefined(request)) __obj.updateDynamic("request")(request.get.asInstanceOf[js.Any])
    if (!js.isUndefined(requestTimeout)) __obj.updateDynamic("requestTimeout")(requestTimeout.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndicesClearCacheParams]
  }
}

