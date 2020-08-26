package typings.elasticsearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IndicesValidateQueryParams extends GenericParams {
  var allowNoIndices: js.UndefOr[Boolean] = js.native
  var analyzeWildcard: js.UndefOr[Boolean] = js.native
  var analyzer: js.UndefOr[String] = js.native
  var defaultOperator: js.UndefOr[DefaultOperator] = js.native
  var df: js.UndefOr[String] = js.native
  var expandWildcards: js.UndefOr[ExpandWildcards] = js.native
  var explain: js.UndefOr[Boolean] = js.native
  var ignoreUnavailable: js.UndefOr[Boolean] = js.native
  var index: NameList = js.native
  var lenient: js.UndefOr[Boolean] = js.native
  var lowercaseExpandedTerms: js.UndefOr[Boolean] = js.native
  var operationThreading: js.UndefOr[js.Any] = js.native
     // even the docs don't know what this does
  var q: js.UndefOr[String] = js.native
  var rewrite: js.UndefOr[Boolean] = js.native
  var `type`: js.UndefOr[NameList] = js.native
}

object IndicesValidateQueryParams {
  @scala.inline
  def apply(index: NameList): IndicesValidateQueryParams = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndicesValidateQueryParams]
  }
  @scala.inline
  implicit class IndicesValidateQueryParamsOps[Self <: IndicesValidateQueryParams] (val x: Self) extends AnyVal {
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
    def setIndexVarargs(value: String*): Self = this.set("index", js.Array(value :_*))
    @scala.inline
    def setIndex(value: NameList): Self = this.set("index", value.asInstanceOf[js.Any])
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
    def setExpandWildcards(value: ExpandWildcards): Self = this.set("expandWildcards", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpandWildcards: Self = this.set("expandWildcards", js.undefined)
    @scala.inline
    def setExplain(value: Boolean): Self = this.set("explain", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExplain: Self = this.set("explain", js.undefined)
    @scala.inline
    def setIgnoreUnavailable(value: Boolean): Self = this.set("ignoreUnavailable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnoreUnavailable: Self = this.set("ignoreUnavailable", js.undefined)
    @scala.inline
    def setLenient(value: Boolean): Self = this.set("lenient", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLenient: Self = this.set("lenient", js.undefined)
    @scala.inline
    def setLowercaseExpandedTerms(value: Boolean): Self = this.set("lowercaseExpandedTerms", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLowercaseExpandedTerms: Self = this.set("lowercaseExpandedTerms", js.undefined)
    @scala.inline
    def setOperationThreading(value: js.Any): Self = this.set("operationThreading", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOperationThreading: Self = this.set("operationThreading", js.undefined)
    @scala.inline
    def setQ(value: String): Self = this.set("q", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQ: Self = this.set("q", js.undefined)
    @scala.inline
    def setRewrite(value: Boolean): Self = this.set("rewrite", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRewrite: Self = this.set("rewrite", js.undefined)
    @scala.inline
    def setTypeVarargs(value: String*): Self = this.set("type", js.Array(value :_*))
    @scala.inline
    def setType(value: NameList): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

