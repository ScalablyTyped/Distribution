package typings.elasticsearch.elasticsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchShardsParams extends GenericParams {
  var allowNoIndices: js.UndefOr[Boolean] = js.undefined
  var expandWildcards: js.UndefOr[ExpandWildcards] = js.undefined
  var ignoreUnavailable: js.UndefOr[Boolean] = js.undefined
  var index: NameList
  var local: js.UndefOr[Boolean] = js.undefined
  var preference: js.UndefOr[String] = js.undefined
  var routing: js.UndefOr[String] = js.undefined
  var `type`: NameList
}

object SearchShardsParams {
  @scala.inline
  def apply(
    index: NameList,
    `type`: NameList,
    allowNoIndices: js.UndefOr[Boolean] = js.undefined,
    body: js.Any = null,
    expandWildcards: ExpandWildcards = null,
    filterPath: String | js.Array[String] = null,
    ignore: Double | js.Array[Double] = null,
    ignoreUnavailable: js.UndefOr[Boolean] = js.undefined,
    local: js.UndefOr[Boolean] = js.undefined,
    maxRetries: Int | Double = null,
    method: String = null,
    preference: String = null,
    requestTimeout: Int | Double = null,
    routing: String = null
  ): SearchShardsParams = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(allowNoIndices)) __obj.updateDynamic("allowNoIndices")(allowNoIndices)
    if (body != null) __obj.updateDynamic("body")(body)
    if (expandWildcards != null) __obj.updateDynamic("expandWildcards")(expandWildcards)
    if (filterPath != null) __obj.updateDynamic("filterPath")(filterPath.asInstanceOf[js.Any])
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreUnavailable)) __obj.updateDynamic("ignoreUnavailable")(ignoreUnavailable)
    if (!js.isUndefined(local)) __obj.updateDynamic("local")(local)
    if (maxRetries != null) __obj.updateDynamic("maxRetries")(maxRetries.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method)
    if (preference != null) __obj.updateDynamic("preference")(preference)
    if (requestTimeout != null) __obj.updateDynamic("requestTimeout")(requestTimeout.asInstanceOf[js.Any])
    if (routing != null) __obj.updateDynamic("routing")(routing)
    __obj.asInstanceOf[SearchShardsParams]
  }
}

