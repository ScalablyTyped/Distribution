package typings
package elasticsearchLib.elasticsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IndicesRefreshParams extends GenericParams {
  var allowNoIndices: js.UndefOr[scala.Boolean] = js.undefined
  var expandWildcards: js.UndefOr[ExpandWildcards] = js.undefined
  var force: js.UndefOr[scala.Boolean] = js.undefined
  var ignoreUnavailable: js.UndefOr[scala.Boolean] = js.undefined
     // even the docs don't know what this does
  var index: NameList
  var operationThreading: js.UndefOr[js.Any] = js.undefined
}

object IndicesRefreshParams {
  @scala.inline
  def apply(
    index: NameList,
    allowNoIndices: js.UndefOr[scala.Boolean] = js.undefined,
    body: js.Any = null,
    expandWildcards: ExpandWildcards = null,
    filterPath: java.lang.String | js.Array[java.lang.String] = null,
    force: js.UndefOr[scala.Boolean] = js.undefined,
    ignore: scala.Double | js.Array[scala.Double] = null,
    ignoreUnavailable: js.UndefOr[scala.Boolean] = js.undefined,
    maxRetries: scala.Int | scala.Double = null,
    method: java.lang.String = null,
    operationThreading: js.Any = null,
    requestTimeout: scala.Int | scala.Double = null
  ): IndicesRefreshParams = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    if (!js.isUndefined(allowNoIndices)) __obj.updateDynamic("allowNoIndices")(allowNoIndices)
    if (body != null) __obj.updateDynamic("body")(body)
    if (expandWildcards != null) __obj.updateDynamic("expandWildcards")(expandWildcards)
    if (filterPath != null) __obj.updateDynamic("filterPath")(filterPath.asInstanceOf[js.Any])
    if (!js.isUndefined(force)) __obj.updateDynamic("force")(force)
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreUnavailable)) __obj.updateDynamic("ignoreUnavailable")(ignoreUnavailable)
    if (maxRetries != null) __obj.updateDynamic("maxRetries")(maxRetries.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method)
    if (operationThreading != null) __obj.updateDynamic("operationThreading")(operationThreading)
    if (requestTimeout != null) __obj.updateDynamic("requestTimeout")(requestTimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndicesRefreshParams]
  }
}

