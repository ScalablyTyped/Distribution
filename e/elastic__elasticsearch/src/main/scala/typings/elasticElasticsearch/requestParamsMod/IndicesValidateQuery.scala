package typings.elasticElasticsearch.requestParamsMod

import typings.elasticElasticsearch.elasticElasticsearchStrings.AND
import typings.elasticElasticsearch.elasticElasticsearchStrings.OR
import typings.elasticElasticsearch.elasticElasticsearchStrings.all
import typings.elasticElasticsearch.elasticElasticsearchStrings.closed
import typings.elasticElasticsearch.elasticElasticsearchStrings.hidden
import typings.elasticElasticsearch.elasticElasticsearchStrings.none
import typings.elasticElasticsearch.elasticElasticsearchStrings.open
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IndicesValidateQuery[T] extends Generic {
  
  var all_shards: js.UndefOr[Boolean] = js.native
  
  var allow_no_indices: js.UndefOr[Boolean] = js.native
  
  var analyze_wildcard: js.UndefOr[Boolean] = js.native
  
  var analyzer: js.UndefOr[String] = js.native
  
  var body: js.UndefOr[T] = js.native
  
  var default_operator: js.UndefOr[AND | OR] = js.native
  
  var df: js.UndefOr[String] = js.native
  
  var expand_wildcards: js.UndefOr[open | closed | hidden | none | all] = js.native
  
  var explain: js.UndefOr[Boolean] = js.native
  
  var ignore_unavailable: js.UndefOr[Boolean] = js.native
  
  var index: js.UndefOr[String | js.Array[String]] = js.native
  
  var lenient: js.UndefOr[Boolean] = js.native
  
  var q: js.UndefOr[String] = js.native
  
  var rewrite: js.UndefOr[Boolean] = js.native
  
  var `type`: js.UndefOr[String | js.Array[String]] = js.native
}
object IndicesValidateQuery {
  
  @scala.inline
  def apply[T](): IndicesValidateQuery[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IndicesValidateQuery[T]]
  }
  
  @scala.inline
  implicit class IndicesValidateQueryMutableBuilder[Self <: IndicesValidateQuery[_], T] (val x: Self with IndicesValidateQuery[T]) extends AnyVal {
    
    @scala.inline
    def setAll_shards(value: Boolean): Self = StObject.set(x, "all_shards", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAll_shardsUndefined: Self = StObject.set(x, "all_shards", js.undefined)
    
    @scala.inline
    def setAllow_no_indices(value: Boolean): Self = StObject.set(x, "allow_no_indices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllow_no_indicesUndefined: Self = StObject.set(x, "allow_no_indices", js.undefined)
    
    @scala.inline
    def setAnalyze_wildcard(value: Boolean): Self = StObject.set(x, "analyze_wildcard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnalyze_wildcardUndefined: Self = StObject.set(x, "analyze_wildcard", js.undefined)
    
    @scala.inline
    def setAnalyzer(value: String): Self = StObject.set(x, "analyzer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnalyzerUndefined: Self = StObject.set(x, "analyzer", js.undefined)
    
    @scala.inline
    def setBody(value: T): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    @scala.inline
    def setDefault_operator(value: AND | OR): Self = StObject.set(x, "default_operator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefault_operatorUndefined: Self = StObject.set(x, "default_operator", js.undefined)
    
    @scala.inline
    def setDf(value: String): Self = StObject.set(x, "df", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDfUndefined: Self = StObject.set(x, "df", js.undefined)
    
    @scala.inline
    def setExpand_wildcards(value: open | closed | hidden | none | all): Self = StObject.set(x, "expand_wildcards", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpand_wildcardsUndefined: Self = StObject.set(x, "expand_wildcards", js.undefined)
    
    @scala.inline
    def setExplain(value: Boolean): Self = StObject.set(x, "explain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExplainUndefined: Self = StObject.set(x, "explain", js.undefined)
    
    @scala.inline
    def setIgnore_unavailable(value: Boolean): Self = StObject.set(x, "ignore_unavailable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnore_unavailableUndefined: Self = StObject.set(x, "ignore_unavailable", js.undefined)
    
    @scala.inline
    def setIndex(value: String | js.Array[String]): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    @scala.inline
    def setIndexVarargs(value: String*): Self = StObject.set(x, "index", js.Array(value :_*))
    
    @scala.inline
    def setLenient(value: Boolean): Self = StObject.set(x, "lenient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLenientUndefined: Self = StObject.set(x, "lenient", js.undefined)
    
    @scala.inline
    def setQ(value: String): Self = StObject.set(x, "q", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQUndefined: Self = StObject.set(x, "q", js.undefined)
    
    @scala.inline
    def setRewrite(value: Boolean): Self = StObject.set(x, "rewrite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRewriteUndefined: Self = StObject.set(x, "rewrite", js.undefined)
    
    @scala.inline
    def setType(value: String | js.Array[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setTypeVarargs(value: String*): Self = StObject.set(x, "type", js.Array(value :_*))
  }
}
