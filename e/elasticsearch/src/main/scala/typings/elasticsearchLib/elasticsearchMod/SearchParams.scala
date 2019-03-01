package typings
package elasticsearchLib.elasticsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchParams extends GenericParams {
  var _source: js.UndefOr[NameList] = js.undefined
  var _sourceExclude: js.UndefOr[NameList] = js.undefined
  var _sourceInclude: js.UndefOr[NameList] = js.undefined
  var allowNoIndices: js.UndefOr[scala.Boolean] = js.undefined
  var analyzeWildcard: js.UndefOr[scala.Boolean] = js.undefined
  var analyzer: js.UndefOr[java.lang.String] = js.undefined
  var defaultOperator: js.UndefOr[DefaultOperator] = js.undefined
  var df: js.UndefOr[java.lang.String] = js.undefined
  var docvalueFields: js.UndefOr[NameList] = js.undefined
  var expandWildcards: js.UndefOr[ExpandWildcards] = js.undefined
  var explain: js.UndefOr[scala.Boolean] = js.undefined
  var fielddataFields: js.UndefOr[NameList] = js.undefined
  var from: js.UndefOr[scala.Double] = js.undefined
  var ignoreUnavailable: js.UndefOr[scala.Boolean] = js.undefined
  var index: js.UndefOr[NameList] = js.undefined
  var lenient: js.UndefOr[scala.Boolean] = js.undefined
  var lowercaseExpandedTerms: js.UndefOr[scala.Boolean] = js.undefined
  var preference: js.UndefOr[java.lang.String] = js.undefined
  var q: js.UndefOr[java.lang.String] = js.undefined
  var requestCache: js.UndefOr[scala.Boolean] = js.undefined
  var routing: js.UndefOr[NameList] = js.undefined
  var scroll: js.UndefOr[TimeSpan] = js.undefined
  var searchType: js.UndefOr[
    elasticsearchLib.elasticsearchLibStrings.query_then_fetch | elasticsearchLib.elasticsearchLibStrings.dfs_query_then_fetch
  ] = js.undefined
  var size: js.UndefOr[scala.Double] = js.undefined
  var sort: js.UndefOr[NameList] = js.undefined
  var stats: js.UndefOr[NameList] = js.undefined
  var storedFields: js.UndefOr[NameList] = js.undefined
  var suggestField: js.UndefOr[java.lang.String] = js.undefined
  var suggestMode: js.UndefOr[
    elasticsearchLib.elasticsearchLibStrings.missing | elasticsearchLib.elasticsearchLibStrings.popular | elasticsearchLib.elasticsearchLibStrings.always
  ] = js.undefined
  var suggestSize: js.UndefOr[scala.Double] = js.undefined
  var suggestText: js.UndefOr[java.lang.String] = js.undefined
  var terminateAfter: js.UndefOr[scala.Double] = js.undefined
  var timeout: js.UndefOr[TimeSpan] = js.undefined
  var trackScores: js.UndefOr[scala.Boolean] = js.undefined
  var `type`: js.UndefOr[NameList] = js.undefined
  var version: js.UndefOr[scala.Boolean] = js.undefined
}

object SearchParams {
  @scala.inline
  def apply(
    _source: NameList = null,
    _sourceExclude: NameList = null,
    _sourceInclude: NameList = null,
    allowNoIndices: js.UndefOr[scala.Boolean] = js.undefined,
    analyzeWildcard: js.UndefOr[scala.Boolean] = js.undefined,
    analyzer: java.lang.String = null,
    body: js.Any = null,
    defaultOperator: DefaultOperator = null,
    df: java.lang.String = null,
    docvalueFields: NameList = null,
    expandWildcards: ExpandWildcards = null,
    explain: js.UndefOr[scala.Boolean] = js.undefined,
    fielddataFields: NameList = null,
    filterPath: java.lang.String | js.Array[java.lang.String] = null,
    from: scala.Int | scala.Double = null,
    ignore: scala.Double | js.Array[scala.Double] = null,
    ignoreUnavailable: js.UndefOr[scala.Boolean] = js.undefined,
    index: NameList = null,
    lenient: js.UndefOr[scala.Boolean] = js.undefined,
    lowercaseExpandedTerms: js.UndefOr[scala.Boolean] = js.undefined,
    maxRetries: scala.Int | scala.Double = null,
    method: java.lang.String = null,
    preference: java.lang.String = null,
    q: java.lang.String = null,
    requestCache: js.UndefOr[scala.Boolean] = js.undefined,
    requestTimeout: scala.Int | scala.Double = null,
    routing: NameList = null,
    scroll: TimeSpan = null,
    searchType: elasticsearchLib.elasticsearchLibStrings.query_then_fetch | elasticsearchLib.elasticsearchLibStrings.dfs_query_then_fetch = null,
    size: scala.Int | scala.Double = null,
    sort: NameList = null,
    stats: NameList = null,
    storedFields: NameList = null,
    suggestField: java.lang.String = null,
    suggestMode: elasticsearchLib.elasticsearchLibStrings.missing | elasticsearchLib.elasticsearchLibStrings.popular | elasticsearchLib.elasticsearchLibStrings.always = null,
    suggestSize: scala.Int | scala.Double = null,
    suggestText: java.lang.String = null,
    terminateAfter: scala.Int | scala.Double = null,
    timeout: TimeSpan = null,
    trackScores: js.UndefOr[scala.Boolean] = js.undefined,
    `type`: NameList = null,
    version: js.UndefOr[scala.Boolean] = js.undefined
  ): SearchParams = {
    val __obj = js.Dynamic.literal()
    if (_source != null) __obj.updateDynamic("_source")(_source.asInstanceOf[js.Any])
    if (_sourceExclude != null) __obj.updateDynamic("_sourceExclude")(_sourceExclude.asInstanceOf[js.Any])
    if (_sourceInclude != null) __obj.updateDynamic("_sourceInclude")(_sourceInclude.asInstanceOf[js.Any])
    if (!js.isUndefined(allowNoIndices)) __obj.updateDynamic("allowNoIndices")(allowNoIndices)
    if (!js.isUndefined(analyzeWildcard)) __obj.updateDynamic("analyzeWildcard")(analyzeWildcard)
    if (analyzer != null) __obj.updateDynamic("analyzer")(analyzer)
    if (body != null) __obj.updateDynamic("body")(body)
    if (defaultOperator != null) __obj.updateDynamic("defaultOperator")(defaultOperator)
    if (df != null) __obj.updateDynamic("df")(df)
    if (docvalueFields != null) __obj.updateDynamic("docvalueFields")(docvalueFields.asInstanceOf[js.Any])
    if (expandWildcards != null) __obj.updateDynamic("expandWildcards")(expandWildcards)
    if (!js.isUndefined(explain)) __obj.updateDynamic("explain")(explain)
    if (fielddataFields != null) __obj.updateDynamic("fielddataFields")(fielddataFields.asInstanceOf[js.Any])
    if (filterPath != null) __obj.updateDynamic("filterPath")(filterPath.asInstanceOf[js.Any])
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreUnavailable)) __obj.updateDynamic("ignoreUnavailable")(ignoreUnavailable)
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (!js.isUndefined(lenient)) __obj.updateDynamic("lenient")(lenient)
    if (!js.isUndefined(lowercaseExpandedTerms)) __obj.updateDynamic("lowercaseExpandedTerms")(lowercaseExpandedTerms)
    if (maxRetries != null) __obj.updateDynamic("maxRetries")(maxRetries.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method)
    if (preference != null) __obj.updateDynamic("preference")(preference)
    if (q != null) __obj.updateDynamic("q")(q)
    if (!js.isUndefined(requestCache)) __obj.updateDynamic("requestCache")(requestCache)
    if (requestTimeout != null) __obj.updateDynamic("requestTimeout")(requestTimeout.asInstanceOf[js.Any])
    if (routing != null) __obj.updateDynamic("routing")(routing.asInstanceOf[js.Any])
    if (scroll != null) __obj.updateDynamic("scroll")(scroll)
    if (searchType != null) __obj.updateDynamic("searchType")(searchType.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    if (stats != null) __obj.updateDynamic("stats")(stats.asInstanceOf[js.Any])
    if (storedFields != null) __obj.updateDynamic("storedFields")(storedFields.asInstanceOf[js.Any])
    if (suggestField != null) __obj.updateDynamic("suggestField")(suggestField)
    if (suggestMode != null) __obj.updateDynamic("suggestMode")(suggestMode.asInstanceOf[js.Any])
    if (suggestSize != null) __obj.updateDynamic("suggestSize")(suggestSize.asInstanceOf[js.Any])
    if (suggestText != null) __obj.updateDynamic("suggestText")(suggestText)
    if (terminateAfter != null) __obj.updateDynamic("terminateAfter")(terminateAfter.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout)
    if (!js.isUndefined(trackScores)) __obj.updateDynamic("trackScores")(trackScores)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(version)) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[SearchParams]
  }
}

