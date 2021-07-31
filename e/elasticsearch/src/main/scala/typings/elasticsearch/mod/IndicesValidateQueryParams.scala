package typings.elasticsearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndicesValidateQueryParams
  extends StObject
     with GenericParams {
  
  var allowNoIndices: js.UndefOr[Boolean] = js.undefined
  
  var analyzeWildcard: js.UndefOr[Boolean] = js.undefined
  
  var analyzer: js.UndefOr[String] = js.undefined
  
  var defaultOperator: js.UndefOr[DefaultOperator] = js.undefined
  
  var df: js.UndefOr[String] = js.undefined
  
  var expandWildcards: js.UndefOr[ExpandWildcards] = js.undefined
  
  var explain: js.UndefOr[Boolean] = js.undefined
  
  var ignoreUnavailable: js.UndefOr[Boolean] = js.undefined
  
  var index: NameList
  
  var lenient: js.UndefOr[Boolean] = js.undefined
  
  var lowercaseExpandedTerms: js.UndefOr[Boolean] = js.undefined
  
  var operationThreading: js.UndefOr[js.Any] = js.undefined
  
  // even the docs don't know what this does
  var q: js.UndefOr[String] = js.undefined
  
  var rewrite: js.UndefOr[Boolean] = js.undefined
  
  var `type`: js.UndefOr[NameList] = js.undefined
}
object IndicesValidateQueryParams {
  
  @scala.inline
  def apply(index: NameList): IndicesValidateQueryParams = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndicesValidateQueryParams]
  }
  
  @scala.inline
  implicit class IndicesValidateQueryParamsMutableBuilder[Self <: IndicesValidateQueryParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowNoIndices(value: Boolean): Self = StObject.set(x, "allowNoIndices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowNoIndicesUndefined: Self = StObject.set(x, "allowNoIndices", js.undefined)
    
    @scala.inline
    def setAnalyzeWildcard(value: Boolean): Self = StObject.set(x, "analyzeWildcard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnalyzeWildcardUndefined: Self = StObject.set(x, "analyzeWildcard", js.undefined)
    
    @scala.inline
    def setAnalyzer(value: String): Self = StObject.set(x, "analyzer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnalyzerUndefined: Self = StObject.set(x, "analyzer", js.undefined)
    
    @scala.inline
    def setDefaultOperator(value: DefaultOperator): Self = StObject.set(x, "defaultOperator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultOperatorUndefined: Self = StObject.set(x, "defaultOperator", js.undefined)
    
    @scala.inline
    def setDf(value: String): Self = StObject.set(x, "df", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDfUndefined: Self = StObject.set(x, "df", js.undefined)
    
    @scala.inline
    def setExpandWildcards(value: ExpandWildcards): Self = StObject.set(x, "expandWildcards", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpandWildcardsUndefined: Self = StObject.set(x, "expandWildcards", js.undefined)
    
    @scala.inline
    def setExplain(value: Boolean): Self = StObject.set(x, "explain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExplainUndefined: Self = StObject.set(x, "explain", js.undefined)
    
    @scala.inline
    def setIgnoreUnavailable(value: Boolean): Self = StObject.set(x, "ignoreUnavailable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoreUnavailableUndefined: Self = StObject.set(x, "ignoreUnavailable", js.undefined)
    
    @scala.inline
    def setIndex(value: NameList): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexVarargs(value: String*): Self = StObject.set(x, "index", js.Array(value :_*))
    
    @scala.inline
    def setLenient(value: Boolean): Self = StObject.set(x, "lenient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLenientUndefined: Self = StObject.set(x, "lenient", js.undefined)
    
    @scala.inline
    def setLowercaseExpandedTerms(value: Boolean): Self = StObject.set(x, "lowercaseExpandedTerms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLowercaseExpandedTermsUndefined: Self = StObject.set(x, "lowercaseExpandedTerms", js.undefined)
    
    @scala.inline
    def setOperationThreading(value: js.Any): Self = StObject.set(x, "operationThreading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperationThreadingUndefined: Self = StObject.set(x, "operationThreading", js.undefined)
    
    @scala.inline
    def setQ(value: String): Self = StObject.set(x, "q", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQUndefined: Self = StObject.set(x, "q", js.undefined)
    
    @scala.inline
    def setRewrite(value: Boolean): Self = StObject.set(x, "rewrite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRewriteUndefined: Self = StObject.set(x, "rewrite", js.undefined)
    
    @scala.inline
    def setType(value: NameList): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setTypeVarargs(value: String*): Self = StObject.set(x, "type", js.Array(value :_*))
  }
}
