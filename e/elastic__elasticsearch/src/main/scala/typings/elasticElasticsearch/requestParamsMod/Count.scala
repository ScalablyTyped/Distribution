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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Count[T]
  extends StObject
     with Generic {
  
  var allow_no_indices: js.UndefOr[Boolean] = js.undefined
  
  var analyze_wildcard: js.UndefOr[Boolean] = js.undefined
  
  var analyzer: js.UndefOr[String] = js.undefined
  
  var body: js.UndefOr[T] = js.undefined
  
  var default_operator: js.UndefOr[AND | OR] = js.undefined
  
  var df: js.UndefOr[String] = js.undefined
  
  var expand_wildcards: js.UndefOr[open | closed | hidden | none | all] = js.undefined
  
  var ignore_throttled: js.UndefOr[Boolean] = js.undefined
  
  var ignore_unavailable: js.UndefOr[Boolean] = js.undefined
  
  var index: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var lenient: js.UndefOr[Boolean] = js.undefined
  
  var min_score: js.UndefOr[Double] = js.undefined
  
  var preference: js.UndefOr[String] = js.undefined
  
  var q: js.UndefOr[String] = js.undefined
  
  var routing: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var terminate_after: js.UndefOr[Double] = js.undefined
  
  var `type`: js.UndefOr[String | js.Array[String]] = js.undefined
}
object Count {
  
  inline def apply[T](): Count[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Count[T]]
  }
  
  extension [Self <: Count[?], T](x: Self & Count[T]) {
    
    inline def setAllow_no_indices(value: Boolean): Self = StObject.set(x, "allow_no_indices", value.asInstanceOf[js.Any])
    
    inline def setAllow_no_indicesUndefined: Self = StObject.set(x, "allow_no_indices", js.undefined)
    
    inline def setAnalyze_wildcard(value: Boolean): Self = StObject.set(x, "analyze_wildcard", value.asInstanceOf[js.Any])
    
    inline def setAnalyze_wildcardUndefined: Self = StObject.set(x, "analyze_wildcard", js.undefined)
    
    inline def setAnalyzer(value: String): Self = StObject.set(x, "analyzer", value.asInstanceOf[js.Any])
    
    inline def setAnalyzerUndefined: Self = StObject.set(x, "analyzer", js.undefined)
    
    inline def setBody(value: T): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setDefault_operator(value: AND | OR): Self = StObject.set(x, "default_operator", value.asInstanceOf[js.Any])
    
    inline def setDefault_operatorUndefined: Self = StObject.set(x, "default_operator", js.undefined)
    
    inline def setDf(value: String): Self = StObject.set(x, "df", value.asInstanceOf[js.Any])
    
    inline def setDfUndefined: Self = StObject.set(x, "df", js.undefined)
    
    inline def setExpand_wildcards(value: open | closed | hidden | none | all): Self = StObject.set(x, "expand_wildcards", value.asInstanceOf[js.Any])
    
    inline def setExpand_wildcardsUndefined: Self = StObject.set(x, "expand_wildcards", js.undefined)
    
    inline def setIgnore_throttled(value: Boolean): Self = StObject.set(x, "ignore_throttled", value.asInstanceOf[js.Any])
    
    inline def setIgnore_throttledUndefined: Self = StObject.set(x, "ignore_throttled", js.undefined)
    
    inline def setIgnore_unavailable(value: Boolean): Self = StObject.set(x, "ignore_unavailable", value.asInstanceOf[js.Any])
    
    inline def setIgnore_unavailableUndefined: Self = StObject.set(x, "ignore_unavailable", js.undefined)
    
    inline def setIndex(value: String | js.Array[String]): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setIndexVarargs(value: String*): Self = StObject.set(x, "index", js.Array(value :_*))
    
    inline def setLenient(value: Boolean): Self = StObject.set(x, "lenient", value.asInstanceOf[js.Any])
    
    inline def setLenientUndefined: Self = StObject.set(x, "lenient", js.undefined)
    
    inline def setMin_score(value: Double): Self = StObject.set(x, "min_score", value.asInstanceOf[js.Any])
    
    inline def setMin_scoreUndefined: Self = StObject.set(x, "min_score", js.undefined)
    
    inline def setPreference(value: String): Self = StObject.set(x, "preference", value.asInstanceOf[js.Any])
    
    inline def setPreferenceUndefined: Self = StObject.set(x, "preference", js.undefined)
    
    inline def setQ(value: String): Self = StObject.set(x, "q", value.asInstanceOf[js.Any])
    
    inline def setQUndefined: Self = StObject.set(x, "q", js.undefined)
    
    inline def setRouting(value: String | js.Array[String]): Self = StObject.set(x, "routing", value.asInstanceOf[js.Any])
    
    inline def setRoutingUndefined: Self = StObject.set(x, "routing", js.undefined)
    
    inline def setRoutingVarargs(value: String*): Self = StObject.set(x, "routing", js.Array(value :_*))
    
    inline def setTerminate_after(value: Double): Self = StObject.set(x, "terminate_after", value.asInstanceOf[js.Any])
    
    inline def setTerminate_afterUndefined: Self = StObject.set(x, "terminate_after", js.undefined)
    
    inline def setType(value: String | js.Array[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setTypeVarargs(value: String*): Self = StObject.set(x, "type", js.Array(value :_*))
  }
}
