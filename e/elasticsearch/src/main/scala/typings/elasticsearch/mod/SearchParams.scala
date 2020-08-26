package typings.elasticsearch.mod

import typings.elasticsearch.elasticsearchStrings.always
import typings.elasticsearch.elasticsearchStrings.dfs_query_then_fetch
import typings.elasticsearch.elasticsearchStrings.missing
import typings.elasticsearch.elasticsearchStrings.popular
import typings.elasticsearch.elasticsearchStrings.query_then_fetch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchParams extends GenericParams {
  var _source: js.UndefOr[NameList] = js.native
  var _sourceExclude: js.UndefOr[NameList] = js.native
  var _sourceInclude: js.UndefOr[NameList] = js.native
  var allowNoIndices: js.UndefOr[Boolean] = js.native
  var analyzeWildcard: js.UndefOr[Boolean] = js.native
  var analyzer: js.UndefOr[String] = js.native
  var defaultOperator: js.UndefOr[DefaultOperator] = js.native
  var df: js.UndefOr[String] = js.native
  var docvalueFields: js.UndefOr[NameList] = js.native
  var expandWildcards: js.UndefOr[ExpandWildcards] = js.native
  var explain: js.UndefOr[Boolean] = js.native
  var fielddataFields: js.UndefOr[NameList] = js.native
  var from: js.UndefOr[Double] = js.native
  var ignoreUnavailable: js.UndefOr[Boolean] = js.native
  var index: js.UndefOr[NameList] = js.native
  var lenient: js.UndefOr[Boolean] = js.native
  var lowercaseExpandedTerms: js.UndefOr[Boolean] = js.native
  var preference: js.UndefOr[String] = js.native
  var q: js.UndefOr[String] = js.native
  var requestCache: js.UndefOr[Boolean] = js.native
  var routing: js.UndefOr[NameList] = js.native
  var scroll: js.UndefOr[TimeSpan] = js.native
  var searchType: js.UndefOr[query_then_fetch | dfs_query_then_fetch] = js.native
  var size: js.UndefOr[Double] = js.native
  var sort: js.UndefOr[NameList] = js.native
  var stats: js.UndefOr[NameList] = js.native
  var storedFields: js.UndefOr[NameList] = js.native
  var suggestField: js.UndefOr[String] = js.native
  var suggestMode: js.UndefOr[missing | popular | always] = js.native
  var suggestSize: js.UndefOr[Double] = js.native
  var suggestText: js.UndefOr[String] = js.native
  var terminateAfter: js.UndefOr[Double] = js.native
  var timeout: js.UndefOr[TimeSpan] = js.native
  var trackScores: js.UndefOr[Boolean] = js.native
  var `type`: js.UndefOr[NameList] = js.native
  var version: js.UndefOr[Boolean] = js.native
}

object SearchParams {
  @scala.inline
  def apply(): SearchParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchParams]
  }
  @scala.inline
  implicit class SearchParamsOps[Self <: SearchParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def set_sourceVarargs(value: String*): Self = this.set("_source", js.Array(value :_*))
    @scala.inline
    def set_source(value: NameList): Self = this.set("_source", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_source: Self = this.set("_source", js.undefined)
    @scala.inline
    def set_sourceExcludeVarargs(value: String*): Self = this.set("_sourceExclude", js.Array(value :_*))
    @scala.inline
    def set_sourceExclude(value: NameList): Self = this.set("_sourceExclude", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_sourceExclude: Self = this.set("_sourceExclude", js.undefined)
    @scala.inline
    def set_sourceIncludeVarargs(value: String*): Self = this.set("_sourceInclude", js.Array(value :_*))
    @scala.inline
    def set_sourceInclude(value: NameList): Self = this.set("_sourceInclude", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_sourceInclude: Self = this.set("_sourceInclude", js.undefined)
    @scala.inline
    def setAllowNoIndices(value: Boolean): Self = this.set("allowNoIndices", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowNoIndices: Self = this.set("allowNoIndices", js.undefined)
    @scala.inline
    def setAnalyzeWildcard(value: Boolean): Self = this.set("analyzeWildcard", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnalyzeWildcard: Self = this.set("analyzeWildcard", js.undefined)
    @scala.inline
    def setAnalyzer(value: String): Self = this.set("analyzer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnalyzer: Self = this.set("analyzer", js.undefined)
    @scala.inline
    def setDefaultOperator(value: DefaultOperator): Self = this.set("defaultOperator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultOperator: Self = this.set("defaultOperator", js.undefined)
    @scala.inline
    def setDf(value: String): Self = this.set("df", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDf: Self = this.set("df", js.undefined)
    @scala.inline
    def setDocvalueFieldsVarargs(value: String*): Self = this.set("docvalueFields", js.Array(value :_*))
    @scala.inline
    def setDocvalueFields(value: NameList): Self = this.set("docvalueFields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDocvalueFields: Self = this.set("docvalueFields", js.undefined)
    @scala.inline
    def setExpandWildcards(value: ExpandWildcards): Self = this.set("expandWildcards", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpandWildcards: Self = this.set("expandWildcards", js.undefined)
    @scala.inline
    def setExplain(value: Boolean): Self = this.set("explain", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExplain: Self = this.set("explain", js.undefined)
    @scala.inline
    def setFielddataFieldsVarargs(value: String*): Self = this.set("fielddataFields", js.Array(value :_*))
    @scala.inline
    def setFielddataFields(value: NameList): Self = this.set("fielddataFields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFielddataFields: Self = this.set("fielddataFields", js.undefined)
    @scala.inline
    def setFrom(value: Double): Self = this.set("from", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFrom: Self = this.set("from", js.undefined)
    @scala.inline
    def setIgnoreUnavailable(value: Boolean): Self = this.set("ignoreUnavailable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnoreUnavailable: Self = this.set("ignoreUnavailable", js.undefined)
    @scala.inline
    def setIndexVarargs(value: String*): Self = this.set("index", js.Array(value :_*))
    @scala.inline
    def setIndex(value: NameList): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
    @scala.inline
    def setLenient(value: Boolean): Self = this.set("lenient", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLenient: Self = this.set("lenient", js.undefined)
    @scala.inline
    def setLowercaseExpandedTerms(value: Boolean): Self = this.set("lowercaseExpandedTerms", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLowercaseExpandedTerms: Self = this.set("lowercaseExpandedTerms", js.undefined)
    @scala.inline
    def setPreference(value: String): Self = this.set("preference", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreference: Self = this.set("preference", js.undefined)
    @scala.inline
    def setQ(value: String): Self = this.set("q", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQ: Self = this.set("q", js.undefined)
    @scala.inline
    def setRequestCache(value: Boolean): Self = this.set("requestCache", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestCache: Self = this.set("requestCache", js.undefined)
    @scala.inline
    def setRoutingVarargs(value: String*): Self = this.set("routing", js.Array(value :_*))
    @scala.inline
    def setRouting(value: NameList): Self = this.set("routing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRouting: Self = this.set("routing", js.undefined)
    @scala.inline
    def setScroll(value: TimeSpan): Self = this.set("scroll", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScroll: Self = this.set("scroll", js.undefined)
    @scala.inline
    def setSearchType(value: query_then_fetch | dfs_query_then_fetch): Self = this.set("searchType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSearchType: Self = this.set("searchType", js.undefined)
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setSortVarargs(value: String*): Self = this.set("sort", js.Array(value :_*))
    @scala.inline
    def setSort(value: NameList): Self = this.set("sort", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSort: Self = this.set("sort", js.undefined)
    @scala.inline
    def setStatsVarargs(value: String*): Self = this.set("stats", js.Array(value :_*))
    @scala.inline
    def setStats(value: NameList): Self = this.set("stats", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStats: Self = this.set("stats", js.undefined)
    @scala.inline
    def setStoredFieldsVarargs(value: String*): Self = this.set("storedFields", js.Array(value :_*))
    @scala.inline
    def setStoredFields(value: NameList): Self = this.set("storedFields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStoredFields: Self = this.set("storedFields", js.undefined)
    @scala.inline
    def setSuggestField(value: String): Self = this.set("suggestField", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuggestField: Self = this.set("suggestField", js.undefined)
    @scala.inline
    def setSuggestMode(value: missing | popular | always): Self = this.set("suggestMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuggestMode: Self = this.set("suggestMode", js.undefined)
    @scala.inline
    def setSuggestSize(value: Double): Self = this.set("suggestSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuggestSize: Self = this.set("suggestSize", js.undefined)
    @scala.inline
    def setSuggestText(value: String): Self = this.set("suggestText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuggestText: Self = this.set("suggestText", js.undefined)
    @scala.inline
    def setTerminateAfter(value: Double): Self = this.set("terminateAfter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTerminateAfter: Self = this.set("terminateAfter", js.undefined)
    @scala.inline
    def setTimeout(value: TimeSpan): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    @scala.inline
    def setTrackScores(value: Boolean): Self = this.set("trackScores", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrackScores: Self = this.set("trackScores", js.undefined)
    @scala.inline
    def setTypeVarargs(value: String*): Self = this.set("type", js.Array(value :_*))
    @scala.inline
    def setType(value: NameList): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setVersion(value: Boolean): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
  
}

