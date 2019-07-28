package typings.elasticsearch.elasticsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IndicesForcemergeParams extends GenericParams {
  var allowNoIndices: js.UndefOr[Boolean] = js.undefined
  var expandWildcards: js.UndefOr[ExpandWildcards] = js.undefined
  var flush: js.UndefOr[Boolean] = js.undefined
  var ignoreUnavailable: js.UndefOr[Boolean] = js.undefined
  var index: NameList
  var maxNumSegments: js.UndefOr[Double] = js.undefined
  var onlyExpungeDeletes: js.UndefOr[Boolean] = js.undefined
  var operationThreading: js.UndefOr[js.Any] = js.undefined
     // even the docs don't know what this does
  var waitForMerge: js.UndefOr[Boolean] = js.undefined
}

object IndicesForcemergeParams {
  @scala.inline
  def apply(
    index: NameList,
    allowNoIndices: js.UndefOr[Boolean] = js.undefined,
    body: js.Any = null,
    expandWildcards: ExpandWildcards = null,
    filterPath: String | js.Array[String] = null,
    flush: js.UndefOr[Boolean] = js.undefined,
    ignore: Double | js.Array[Double] = null,
    ignoreUnavailable: js.UndefOr[Boolean] = js.undefined,
    maxNumSegments: Int | Double = null,
    maxRetries: Int | Double = null,
    method: String = null,
    onlyExpungeDeletes: js.UndefOr[Boolean] = js.undefined,
    operationThreading: js.Any = null,
    requestTimeout: Int | Double = null,
    waitForMerge: js.UndefOr[Boolean] = js.undefined
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

