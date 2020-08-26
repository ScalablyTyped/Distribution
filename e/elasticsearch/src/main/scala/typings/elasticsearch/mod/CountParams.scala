package typings.elasticsearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CountParams extends GenericParams {
  var allowNoIndices: js.UndefOr[Boolean] = js.native
  var analyzeWildcard: js.UndefOr[Boolean] = js.native
  var analyzer: js.UndefOr[String] = js.native
  var defaultOperator: js.UndefOr[DefaultOperator] = js.native
  var df: js.UndefOr[String] = js.native
  var expandWildcards: js.UndefOr[ExpandWildcards] = js.native
  var ignoreUnavailable: js.UndefOr[Boolean] = js.native
  var index: js.UndefOr[NameList] = js.native
  var lenient: js.UndefOr[Boolean] = js.native
  var lowercaseExpandedTerms: js.UndefOr[Boolean] = js.native
  var minScore: js.UndefOr[Double] = js.native
  var preference: js.UndefOr[String] = js.native
  var q: js.UndefOr[String] = js.native
  var routing: js.UndefOr[String] = js.native
  var `type`: js.UndefOr[NameList] = js.native
}

object CountParams {
  @scala.inline
  def apply(): CountParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CountParams]
  }
  @scala.inline
  implicit class CountParamsOps[Self <: CountParams] (val x: Self) extends AnyVal {
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
    def setMinScore(value: Double): Self = this.set("minScore", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinScore: Self = this.set("minScore", js.undefined)
    @scala.inline
    def setPreference(value: String): Self = this.set("preference", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreference: Self = this.set("preference", js.undefined)
    @scala.inline
    def setQ(value: String): Self = this.set("q", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQ: Self = this.set("q", js.undefined)
    @scala.inline
    def setRouting(value: String): Self = this.set("routing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRouting: Self = this.set("routing", js.undefined)
    @scala.inline
    def setTypeVarargs(value: String*): Self = this.set("type", js.Array(value :_*))
    @scala.inline
    def setType(value: NameList): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

