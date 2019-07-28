package typings.elasticsearch.elasticsearchMod

import typings.elasticsearch.elasticsearchStrings.dfs_query_and_fetch
import typings.elasticsearch.elasticsearchStrings.dfs_query_then_fetch
import typings.elasticsearch.elasticsearchStrings.query_and_fetch
import typings.elasticsearch.elasticsearchStrings.query_then_fetch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MSearchParams extends GenericParams {
  var index: js.UndefOr[NameList] = js.undefined
  var maxConcurrentSearches: js.UndefOr[Double] = js.undefined
  var search_type: js.UndefOr[query_then_fetch | query_and_fetch | dfs_query_then_fetch | dfs_query_and_fetch] = js.undefined
  var `type`: js.UndefOr[NameList] = js.undefined
}

object MSearchParams {
  @scala.inline
  def apply(
    body: js.Any = null,
    filterPath: String | js.Array[String] = null,
    ignore: Double | js.Array[Double] = null,
    index: NameList = null,
    maxConcurrentSearches: Int | Double = null,
    maxRetries: Int | Double = null,
    method: String = null,
    requestTimeout: Int | Double = null,
    search_type: query_then_fetch | query_and_fetch | dfs_query_then_fetch | dfs_query_and_fetch = null,
    `type`: NameList = null
  ): MSearchParams = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body)
    if (filterPath != null) __obj.updateDynamic("filterPath")(filterPath.asInstanceOf[js.Any])
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (maxConcurrentSearches != null) __obj.updateDynamic("maxConcurrentSearches")(maxConcurrentSearches.asInstanceOf[js.Any])
    if (maxRetries != null) __obj.updateDynamic("maxRetries")(maxRetries.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method)
    if (requestTimeout != null) __obj.updateDynamic("requestTimeout")(requestTimeout.asInstanceOf[js.Any])
    if (search_type != null) __obj.updateDynamic("search_type")(search_type.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MSearchParams]
  }
}

