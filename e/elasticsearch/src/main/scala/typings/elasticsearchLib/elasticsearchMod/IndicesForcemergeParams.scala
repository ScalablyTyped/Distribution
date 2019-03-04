package typings
package elasticsearchLib.elasticsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IndicesForcemergeParams extends GenericParams {
  var allowNoIndices: js.UndefOr[scala.Boolean] = js.undefined
  var expandWildcards: js.UndefOr[ExpandWildcards] = js.undefined
  var flush: js.UndefOr[scala.Boolean] = js.undefined
  var ignoreUnavailable: js.UndefOr[scala.Boolean] = js.undefined
  var index: NameList
  var maxNumSegments: js.UndefOr[scala.Double] = js.undefined
  var onlyExpungeDeletes: js.UndefOr[scala.Boolean] = js.undefined
  var operationThreading: js.UndefOr[js.Any] = js.undefined
     // even the docs don't know what this does
  var waitForMerge: js.UndefOr[scala.Boolean] = js.undefined
}

object IndicesForcemergeParams {
  @scala.inline
  def apply(
    index: NameList,
    allowNoIndices: js.UndefOr[scala.Boolean] = js.undefined,
    body: js.Any = null,
    expandWildcards: ExpandWildcards = null,
    filterPath: java.lang.String | js.Array[java.lang.String] = null,
    flush: js.UndefOr[scala.Boolean] = js.undefined,
    ignore: scala.Double | js.Array[scala.Double] = null,
    ignoreUnavailable: js.UndefOr[scala.Boolean] = js.undefined,
    maxNumSegments: scala.Int | scala.Double = null,
    maxRetries: scala.Int | scala.Double = null,
    method: java.lang.String = null,
    onlyExpungeDeletes: js.UndefOr[scala.Boolean] = js.undefined,
    operationThreading: js.Any = null,
    requestTimeout: scala.Int | scala.Double = null,
    waitForMerge: js.UndefOr[scala.Boolean] = js.undefined
  ): IndicesForcemergeParams = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    if (!js.isUndefined(allowNoIndices)) __obj.updateDynamic("allowNoIndices")(allowNoIndices)
    if (body != null) __obj.updateDynamic("body")(body)
    if (expandWildcards != null) __obj.updateDynamic("expandWildcards")(expandWildcards)
    if (filterPath != null) __obj.updateDynamic("filterPath")(filterPath.asInstanceOf[js.Any])
    if (!js.isUndefined(flush)) __obj.updateDynamic("flush")(flush)
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreUnavailable)) __obj.updateDynamic("ignoreUnavailable")(ignoreUnavailable)
    if (maxNumSegments != null) __obj.updateDynamic("maxNumSegments")(maxNumSegments.asInstanceOf[js.Any])
    if (maxRetries != null) __obj.updateDynamic("maxRetries")(maxRetries.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method)
    if (!js.isUndefined(onlyExpungeDeletes)) __obj.updateDynamic("onlyExpungeDeletes")(onlyExpungeDeletes)
    if (operationThreading != null) __obj.updateDynamic("operationThreading")(operationThreading)
    if (requestTimeout != null) __obj.updateDynamic("requestTimeout")(requestTimeout.asInstanceOf[js.Any])
    if (!js.isUndefined(waitForMerge)) __obj.updateDynamic("waitForMerge")(waitForMerge)
    __obj.asInstanceOf[IndicesForcemergeParams]
  }
}

