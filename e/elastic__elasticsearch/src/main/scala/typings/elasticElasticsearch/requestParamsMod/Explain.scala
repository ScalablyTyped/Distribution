package typings.elasticElasticsearch.requestParamsMod

import typings.elasticElasticsearch.elasticElasticsearchStrings.AND
import typings.elasticElasticsearch.elasticElasticsearchStrings.OR
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Explain[T]
  extends StObject
     with Generic {
  
  var _source: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var _source_exclude: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var _source_excludes: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var _source_include: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var _source_includes: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var analyze_wildcard: js.UndefOr[Boolean] = js.undefined
  
  var analyzer: js.UndefOr[String] = js.undefined
  
  var body: js.UndefOr[T] = js.undefined
  
  var default_operator: js.UndefOr[AND | OR] = js.undefined
  
  var df: js.UndefOr[String] = js.undefined
  
  var id: String
  
  var index: String
  
  var lenient: js.UndefOr[Boolean] = js.undefined
  
  var preference: js.UndefOr[String] = js.undefined
  
  var q: js.UndefOr[String] = js.undefined
  
  var routing: js.UndefOr[String] = js.undefined
  
  var stored_fields: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
}
object Explain {
  
  @scala.inline
  def apply[T](id: String, index: String): Explain[T] = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[Explain[T]]
  }
  
  @scala.inline
  implicit class ExplainMutableBuilder[Self <: Explain[?], T] (val x: Self & Explain[T]) extends AnyVal {
    
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
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex(value: String): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLenient(value: Boolean): Self = StObject.set(x, "lenient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLenientUndefined: Self = StObject.set(x, "lenient", js.undefined)
    
    @scala.inline
    def setPreference(value: String): Self = StObject.set(x, "preference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreferenceUndefined: Self = StObject.set(x, "preference", js.undefined)
    
    @scala.inline
    def setQ(value: String): Self = StObject.set(x, "q", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQUndefined: Self = StObject.set(x, "q", js.undefined)
    
    @scala.inline
    def setRouting(value: String): Self = StObject.set(x, "routing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoutingUndefined: Self = StObject.set(x, "routing", js.undefined)
    
    @scala.inline
    def setStored_fields(value: String | js.Array[String]): Self = StObject.set(x, "stored_fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStored_fieldsUndefined: Self = StObject.set(x, "stored_fields", js.undefined)
    
    @scala.inline
    def setStored_fieldsVarargs(value: String*): Self = StObject.set(x, "stored_fields", js.Array(value :_*))
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def set_source(value: String | js.Array[String]): Self = StObject.set(x, "_source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_sourceUndefined: Self = StObject.set(x, "_source", js.undefined)
    
    @scala.inline
    def set_sourceVarargs(value: String*): Self = StObject.set(x, "_source", js.Array(value :_*))
    
    @scala.inline
    def set_source_exclude(value: String | js.Array[String]): Self = StObject.set(x, "_source_exclude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_source_excludeUndefined: Self = StObject.set(x, "_source_exclude", js.undefined)
    
    @scala.inline
    def set_source_excludeVarargs(value: String*): Self = StObject.set(x, "_source_exclude", js.Array(value :_*))
    
    @scala.inline
    def set_source_excludes(value: String | js.Array[String]): Self = StObject.set(x, "_source_excludes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_source_excludesUndefined: Self = StObject.set(x, "_source_excludes", js.undefined)
    
    @scala.inline
    def set_source_excludesVarargs(value: String*): Self = StObject.set(x, "_source_excludes", js.Array(value :_*))
    
    @scala.inline
    def set_source_include(value: String | js.Array[String]): Self = StObject.set(x, "_source_include", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_source_includeUndefined: Self = StObject.set(x, "_source_include", js.undefined)
    
    @scala.inline
    def set_source_includeVarargs(value: String*): Self = StObject.set(x, "_source_include", js.Array(value :_*))
    
    @scala.inline
    def set_source_includes(value: String | js.Array[String]): Self = StObject.set(x, "_source_includes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_source_includesUndefined: Self = StObject.set(x, "_source_includes", js.undefined)
    
    @scala.inline
    def set_source_includesVarargs(value: String*): Self = StObject.set(x, "_source_includes", js.Array(value :_*))
  }
}
