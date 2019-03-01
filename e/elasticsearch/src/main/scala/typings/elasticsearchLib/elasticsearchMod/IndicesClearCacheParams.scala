package typings
package elasticsearchLib.elasticsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IndicesClearCacheParams extends GenericParams {
  var allowNoIndices: js.UndefOr[scala.Boolean] = js.undefined
  var expandWildcards: js.UndefOr[ExpandWildcards] = js.undefined
  var fieldData: js.UndefOr[scala.Boolean] = js.undefined
  var fielddata: js.UndefOr[scala.Boolean] = js.undefined
      // yes the docs really have both
  var fields: js.UndefOr[NameList] = js.undefined
  var ignoreUnavailable: js.UndefOr[scala.Boolean] = js.undefined
  var index: js.UndefOr[NameList] = js.undefined
  var query: js.UndefOr[scala.Boolean] = js.undefined
  var recycler: js.UndefOr[scala.Boolean] = js.undefined
  var request: js.UndefOr[scala.Boolean] = js.undefined
}

object IndicesClearCacheParams {
  @scala.inline
  def apply(
    allowNoIndices: js.UndefOr[scala.Boolean] = js.undefined,
    body: js.Any = null,
    expandWildcards: ExpandWildcards = null,
    fieldData: js.UndefOr[scala.Boolean] = js.undefined,
    fielddata: js.UndefOr[scala.Boolean] = js.undefined,
    fields: NameList = null,
    filterPath: java.lang.String | js.Array[java.lang.String] = null,
    ignore: scala.Double | js.Array[scala.Double] = null,
    ignoreUnavailable: js.UndefOr[scala.Boolean] = js.undefined,
    index: NameList = null,
    maxRetries: scala.Int | scala.Double = null,
    method: java.lang.String = null,
    query: js.UndefOr[scala.Boolean] = js.undefined,
    recycler: js.UndefOr[scala.Boolean] = js.undefined,
    request: js.UndefOr[scala.Boolean] = js.undefined,
    requestTimeout: scala.Int | scala.Double = null
  ): IndicesClearCacheParams = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowNoIndices)) __obj.updateDynamic("allowNoIndices")(allowNoIndices)
    if (body != null) __obj.updateDynamic("body")(body)
    if (expandWildcards != null) __obj.updateDynamic("expandWildcards")(expandWildcards)
    if (!js.isUndefined(fieldData)) __obj.updateDynamic("fieldData")(fieldData)
    if (!js.isUndefined(fielddata)) __obj.updateDynamic("fielddata")(fielddata)
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (filterPath != null) __obj.updateDynamic("filterPath")(filterPath.asInstanceOf[js.Any])
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreUnavailable)) __obj.updateDynamic("ignoreUnavailable")(ignoreUnavailable)
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (maxRetries != null) __obj.updateDynamic("maxRetries")(maxRetries.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method)
    if (!js.isUndefined(query)) __obj.updateDynamic("query")(query)
    if (!js.isUndefined(recycler)) __obj.updateDynamic("recycler")(recycler)
    if (!js.isUndefined(request)) __obj.updateDynamic("request")(request)
    if (requestTimeout != null) __obj.updateDynamic("requestTimeout")(requestTimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndicesClearCacheParams]
  }
}

