package typings.elasticsearch.elasticsearchMod

import typings.elasticsearch.elasticsearchStrings.dfs_query_then_fetch
import typings.elasticsearch.elasticsearchStrings.query_then_fetch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteDocumentByQueryParams extends GenericParams {
  var _source: js.UndefOr[NameList] = js.undefined
  var _sourceExclude: js.UndefOr[NameList] = js.undefined
  var _sourceInclude: js.UndefOr[NameList] = js.undefined
  var allowNoIndices: js.UndefOr[Boolean] = js.undefined
  var analyzeWildcard: js.UndefOr[Boolean] = js.undefined
  var analyzer: js.UndefOr[String] = js.undefined
  var conflicts: js.UndefOr[Conflicts] = js.undefined
  var defaultOperator: js.UndefOr[DefaultOperator] = js.undefined
  var df: js.UndefOr[String] = js.undefined
  var expandWildcards: js.UndefOr[ExpandWildcards] = js.undefined
  var from: js.UndefOr[Double] = js.undefined
  var ignoreUnavailable: js.UndefOr[Boolean] = js.undefined
  var index: js.UndefOr[String] = js.undefined
  var lenient: js.UndefOr[Boolean] = js.undefined
  var lowercaseExpandedTerms: js.UndefOr[Boolean] = js.undefined
  var preference: js.UndefOr[String] = js.undefined
  var q: js.UndefOr[String] = js.undefined
  var refresh: js.UndefOr[Refresh] = js.undefined
  var requestCache: js.UndefOr[Boolean] = js.undefined
  var requestsPerSecond: js.UndefOr[Double] = js.undefined
  var routing: js.UndefOr[String | js.Array[String] | Boolean] = js.undefined
  var scroll: js.UndefOr[String] = js.undefined
  var scrollSize: js.UndefOr[Double] = js.undefined
  var searchTimeout: js.UndefOr[TimeSpan] = js.undefined
  var searchType: js.UndefOr[query_then_fetch | dfs_query_then_fetch] = js.undefined
  var size: js.UndefOr[Double] = js.undefined
  var slices: js.UndefOr[Double] = js.undefined
  var sort: js.UndefOr[NameList] = js.undefined
  var stats: js.UndefOr[String | js.Array[String] | Boolean] = js.undefined
  var terminateAfter: js.UndefOr[Double] = js.undefined
  var timeout: js.UndefOr[TimeSpan] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var version: js.UndefOr[Double] = js.undefined
  var waitForActiveShards: js.UndefOr[String] = js.undefined
  var waitForCompletion: js.UndefOr[Boolean] = js.undefined
}

object DeleteDocumentByQueryParams {
  @scala.inline
  def apply(
    _source: NameList = null,
    _sourceExclude: NameList = null,
    _sourceInclude: NameList = null,
    allowNoIndices: js.UndefOr[Boolean] = js.undefined,
    analyzeWildcard: js.UndefOr[Boolean] = js.undefined,
    analyzer: String = null,
    body: js.Any = null,
    conflicts: Conflicts = null,
    defaultOperator: DefaultOperator = null,
    df: String = null,
    expandWildcards: ExpandWildcards = null,
    filterPath: String | js.Array[String] = null,
    from: Int | Double = null,
    ignore: Double | js.Array[Double] = null,
    ignoreUnavailable: js.UndefOr[Boolean] = js.undefined,
    index: String = null,
    lenient: js.UndefOr[Boolean] = js.undefined,
    lowercaseExpandedTerms: js.UndefOr[Boolean] = js.undefined,
    maxRetries: Int | Double = null,
    method: String = null,
    preference: String = null,
    q: String = null,
    refresh: Refresh = null,
    requestCache: js.UndefOr[Boolean] = js.undefined,
    requestTimeout: Int | Double = null,
    requestsPerSecond: Int | Double = null,
    routing: String | js.Array[String] | Boolean = null,
    scroll: String = null,
    scrollSize: Int | Double = null,
    searchTimeout: TimeSpan = null,
    searchType: query_then_fetch | dfs_query_then_fetch = null,
    size: Int | Double = null,
    slices: Int | Double = null,
    sort: NameList = null,
    stats: String | js.Array[String] | Boolean = null,
    terminateAfter: Int | Double = null,
    timeout: TimeSpan = null,
    `type`: String = null,
    version: Int | Double = null,
    waitForActiveShards: String = null,
    waitForCompletion: js.UndefOr[Boolean] = js.undefined
  ): DeleteDocumentByQueryParams = {
    val __obj = js.Dynamic.literal()
    if (_source != null) __obj.updateDynamic("_source")(_source.asInstanceOf[js.Any])
    if (_sourceExclude != null) __obj.updateDynamic("_sourceExclude")(_sourceExclude.asInstanceOf[js.Any])
    if (_sourceInclude != null) __obj.updateDynamic("_sourceInclude")(_sourceInclude.asInstanceOf[js.Any])
    if (!js.isUndefined(allowNoIndices)) __obj.updateDynamic("allowNoIndices")(allowNoIndices)
    if (!js.isUndefined(analyzeWildcard)) __obj.updateDynamic("analyzeWildcard")(analyzeWildcard)
    if (analyzer != null) __obj.updateDynamic("analyzer")(analyzer)
    if (body != null) __obj.updateDynamic("body")(body)
    if (conflicts != null) __obj.updateDynamic("conflicts")(conflicts)
    if (defaultOperator != null) __obj.updateDynamic("defaultOperator")(defaultOperator)
    if (df != null) __obj.updateDynamic("df")(df)
    if (expandWildcards != null) __obj.updateDynamic("expandWildcards")(expandWildcards)
    if (filterPath != null) __obj.updateDynamic("filterPath")(filterPath.asInstanceOf[js.Any])
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreUnavailable)) __obj.updateDynamic("ignoreUnavailable")(ignoreUnavailable)
    if (index != null) __obj.updateDynamic("index")(index)
    if (!js.isUndefined(lenient)) __obj.updateDynamic("lenient")(lenient)
    if (!js.isUndefined(lowercaseExpandedTerms)) __obj.updateDynamic("lowercaseExpandedTerms")(lowercaseExpandedTerms)
    if (maxRetries != null) __obj.updateDynamic("maxRetries")(maxRetries.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method)
    if (preference != null) __obj.updateDynamic("preference")(preference)
    if (q != null) __obj.updateDynamic("q")(q)
    if (refresh != null) __obj.updateDynamic("refresh")(refresh.asInstanceOf[js.Any])
    if (!js.isUndefined(requestCache)) __obj.updateDynamic("requestCache")(requestCache)
    if (requestTimeout != null) __obj.updateDynamic("requestTimeout")(requestTimeout.asInstanceOf[js.Any])
    if (requestsPerSecond != null) __obj.updateDynamic("requestsPerSecond")(requestsPerSecond.asInstanceOf[js.Any])
    if (routing != null) __obj.updateDynamic("routing")(routing.asInstanceOf[js.Any])
    if (scroll != null) __obj.updateDynamic("scroll")(scroll)
    if (scrollSize != null) __obj.updateDynamic("scrollSize")(scrollSize.asInstanceOf[js.Any])
    if (searchTimeout != null) __obj.updateDynamic("searchTimeout")(searchTimeout)
    if (searchType != null) __obj.updateDynamic("searchType")(searchType.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (slices != null) __obj.updateDynamic("slices")(slices.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    if (stats != null) __obj.updateDynamic("stats")(stats.asInstanceOf[js.Any])
    if (terminateAfter != null) __obj.updateDynamic("terminateAfter")(terminateAfter.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    if (waitForActiveShards != null) __obj.updateDynamic("waitForActiveShards")(waitForActiveShards)
    if (!js.isUndefined(waitForCompletion)) __obj.updateDynamic("waitForCompletion")(waitForCompletion)
    __obj.asInstanceOf[DeleteDocumentByQueryParams]
  }
}

