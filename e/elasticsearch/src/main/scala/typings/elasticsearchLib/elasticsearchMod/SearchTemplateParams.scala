package typings
package elasticsearchLib.elasticsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchTemplateParams extends GenericParams {
  var allowNoIndices: js.UndefOr[scala.Boolean] = js.undefined
  var expandWildcards: js.UndefOr[ExpandWildcards] = js.undefined
  var ignoreUnavailable: js.UndefOr[scala.Boolean] = js.undefined
  var index: NameList
  var preference: js.UndefOr[java.lang.String] = js.undefined
  var routing: js.UndefOr[NameList] = js.undefined
  var scroll: js.UndefOr[TimeSpan] = js.undefined
  var searchType: js.UndefOr[
    elasticsearchLib.elasticsearchLibStrings.query_then_fetch | elasticsearchLib.elasticsearchLibStrings.query_and_fetch | elasticsearchLib.elasticsearchLibStrings.dfs_query_then_fetch | elasticsearchLib.elasticsearchLibStrings.dfs_query_and_fetch
  ] = js.undefined
  var `type`: NameList
}

object SearchTemplateParams {
  @scala.inline
  def apply(
    index: NameList,
    `type`: NameList,
    allowNoIndices: js.UndefOr[scala.Boolean] = js.undefined,
    body: js.Any = null,
    expandWildcards: ExpandWildcards = null,
    filterPath: java.lang.String | js.Array[java.lang.String] = null,
    ignore: scala.Double | js.Array[scala.Double] = null,
    ignoreUnavailable: js.UndefOr[scala.Boolean] = js.undefined,
    maxRetries: scala.Int | scala.Double = null,
    method: java.lang.String = null,
    preference: java.lang.String = null,
    requestTimeout: scala.Int | scala.Double = null,
    routing: NameList = null,
    scroll: TimeSpan = null,
    searchType: elasticsearchLib.elasticsearchLibStrings.query_then_fetch | elasticsearchLib.elasticsearchLibStrings.query_and_fetch | elasticsearchLib.elasticsearchLibStrings.dfs_query_then_fetch | elasticsearchLib.elasticsearchLibStrings.dfs_query_and_fetch = null
  ): SearchTemplateParams = {
    val __obj = js.Dynamic.literal(`type` = `type`.asInstanceOf[js.Any])
    __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (!js.isUndefined(allowNoIndices)) __obj.updateDynamic("allowNoIndices")(allowNoIndices)
    if (body != null) __obj.updateDynamic("body")(body)
    if (expandWildcards != null) __obj.updateDynamic("expandWildcards")(expandWildcards)
    if (filterPath != null) __obj.updateDynamic("filterPath")(filterPath.asInstanceOf[js.Any])
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreUnavailable)) __obj.updateDynamic("ignoreUnavailable")(ignoreUnavailable)
    if (maxRetries != null) __obj.updateDynamic("maxRetries")(maxRetries.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method)
    if (preference != null) __obj.updateDynamic("preference")(preference)
    if (requestTimeout != null) __obj.updateDynamic("requestTimeout")(requestTimeout.asInstanceOf[js.Any])
    if (routing != null) __obj.updateDynamic("routing")(routing.asInstanceOf[js.Any])
    if (scroll != null) __obj.updateDynamic("scroll")(scroll)
    if (searchType != null) __obj.updateDynamic("searchType")(searchType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchTemplateParams]
  }
}

