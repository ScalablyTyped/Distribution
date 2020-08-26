package typings.elasticsearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExplainParams extends GenericParams {
  var _source: js.UndefOr[NameList] = js.native
  var _sourceExclude: js.UndefOr[NameList] = js.native
  var _sourceInclude: js.UndefOr[NameList] = js.native
  var analyzeWildcard: js.UndefOr[Boolean] = js.native
  var analyzer: js.UndefOr[String] = js.native
  var defaultOperator: js.UndefOr[DefaultOperator] = js.native
  var df: js.UndefOr[String] = js.native
  var id: js.UndefOr[String] = js.native
  var index: js.UndefOr[String] = js.native
  var lenient: js.UndefOr[Boolean] = js.native
  var lowercaseExpandedTerms: js.UndefOr[Boolean] = js.native
  var parent: js.UndefOr[String] = js.native
  var preference: js.UndefOr[String] = js.native
  var q: js.UndefOr[String] = js.native
  var routing: js.UndefOr[String] = js.native
  var storedFields: js.UndefOr[NameList] = js.native
  var `type`: js.UndefOr[String] = js.native
}

object ExplainParams {
  @scala.inline
  def apply(): ExplainParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExplainParams]
  }
  @scala.inline
  implicit class ExplainParamsOps[Self <: ExplainParams] (val x: Self) extends AnyVal {
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setIndex(value: String): Self = this.set("index", value.asInstanceOf[js.Any])
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
    def setParent(value: String): Self = this.set("parent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParent: Self = this.set("parent", js.undefined)
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
    def setStoredFieldsVarargs(value: String*): Self = this.set("storedFields", js.Array(value :_*))
    @scala.inline
    def setStoredFields(value: NameList): Self = this.set("storedFields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStoredFields: Self = this.set("storedFields", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

