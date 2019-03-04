package typings
package elasticsearchLib.elasticsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IndicesCloseParams extends GenericParams {
  var allowNoIndices: js.UndefOr[scala.Boolean] = js.undefined
  var expandWildcards: js.UndefOr[ExpandWildcards] = js.undefined
  var ignoreUnavailable: js.UndefOr[scala.Boolean] = js.undefined
  var index: NameList
  var masterTimeout: js.UndefOr[TimeSpan] = js.undefined
  var timeout: js.UndefOr[TimeSpan] = js.undefined
}

object IndicesCloseParams {
  @scala.inline
  def apply(
    index: NameList,
    allowNoIndices: js.UndefOr[scala.Boolean] = js.undefined,
    body: js.Any = null,
    expandWildcards: ExpandWildcards = null,
    filterPath: java.lang.String | js.Array[java.lang.String] = null,
    ignore: scala.Double | js.Array[scala.Double] = null,
    ignoreUnavailable: js.UndefOr[scala.Boolean] = js.undefined,
    masterTimeout: TimeSpan = null,
    maxRetries: scala.Int | scala.Double = null,
    method: java.lang.String = null,
    requestTimeout: scala.Int | scala.Double = null,
    timeout: TimeSpan = null
  ): IndicesCloseParams = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    if (!js.isUndefined(allowNoIndices)) __obj.updateDynamic("allowNoIndices")(allowNoIndices)
    if (body != null) __obj.updateDynamic("body")(body)
    if (expandWildcards != null) __obj.updateDynamic("expandWildcards")(expandWildcards)
    if (filterPath != null) __obj.updateDynamic("filterPath")(filterPath.asInstanceOf[js.Any])
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreUnavailable)) __obj.updateDynamic("ignoreUnavailable")(ignoreUnavailable)
    if (masterTimeout != null) __obj.updateDynamic("masterTimeout")(masterTimeout)
    if (maxRetries != null) __obj.updateDynamic("maxRetries")(maxRetries.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method)
    if (requestTimeout != null) __obj.updateDynamic("requestTimeout")(requestTimeout.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout)
    __obj.asInstanceOf[IndicesCloseParams]
  }
}

