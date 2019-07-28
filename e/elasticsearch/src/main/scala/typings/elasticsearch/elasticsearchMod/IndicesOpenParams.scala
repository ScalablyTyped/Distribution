package typings.elasticsearch.elasticsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IndicesOpenParams extends GenericParams {
  var allowNoIndices: js.UndefOr[Boolean] = js.undefined
  var expandWildcards: js.UndefOr[ExpandWildcards] = js.undefined
  var ignoreUnavailable: js.UndefOr[Boolean] = js.undefined
  var index: js.UndefOr[NameList] = js.undefined
  var masterTimeout: js.UndefOr[TimeSpan] = js.undefined
  var timeout: js.UndefOr[TimeSpan] = js.undefined
}

object IndicesOpenParams {
  @scala.inline
  def apply(
    allowNoIndices: js.UndefOr[Boolean] = js.undefined,
    body: js.Any = null,
    expandWildcards: ExpandWildcards = null,
    filterPath: String | js.Array[String] = null,
    ignore: Double | js.Array[Double] = null,
    ignoreUnavailable: js.UndefOr[Boolean] = js.undefined,
    index: NameList = null,
    masterTimeout: TimeSpan = null,
    maxRetries: Int | Double = null,
    method: String = null,
    requestTimeout: Int | Double = null,
    timeout: TimeSpan = null
  ): IndicesOpenParams = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowNoIndices)) __obj.updateDynamic("allowNoIndices")(allowNoIndices)
    if (body != null) __obj.updateDynamic("body")(body)
    if (expandWildcards != null) __obj.updateDynamic("expandWildcards")(expandWildcards)
    if (filterPath != null) __obj.updateDynamic("filterPath")(filterPath.asInstanceOf[js.Any])
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreUnavailable)) __obj.updateDynamic("ignoreUnavailable")(ignoreUnavailable)
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (masterTimeout != null) __obj.updateDynamic("masterTimeout")(masterTimeout)
    if (maxRetries != null) __obj.updateDynamic("maxRetries")(maxRetries.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method)
    if (requestTimeout != null) __obj.updateDynamic("requestTimeout")(requestTimeout.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout)
    __obj.asInstanceOf[IndicesOpenParams]
  }
}

