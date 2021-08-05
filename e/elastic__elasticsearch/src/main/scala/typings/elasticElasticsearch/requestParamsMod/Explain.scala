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
  
  inline def apply[T](id: String, index: String): Explain[T] = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[Explain[T]]
  }
  
  extension [Self <: Explain[?], T](x: Self & Explain[T]) {
    
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
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: String): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setLenient(value: Boolean): Self = StObject.set(x, "lenient", value.asInstanceOf[js.Any])
    
    inline def setLenientUndefined: Self = StObject.set(x, "lenient", js.undefined)
    
    inline def setPreference(value: String): Self = StObject.set(x, "preference", value.asInstanceOf[js.Any])
    
    inline def setPreferenceUndefined: Self = StObject.set(x, "preference", js.undefined)
    
    inline def setQ(value: String): Self = StObject.set(x, "q", value.asInstanceOf[js.Any])
    
    inline def setQUndefined: Self = StObject.set(x, "q", js.undefined)
    
    inline def setRouting(value: String): Self = StObject.set(x, "routing", value.asInstanceOf[js.Any])
    
    inline def setRoutingUndefined: Self = StObject.set(x, "routing", js.undefined)
    
    inline def setStored_fields(value: String | js.Array[String]): Self = StObject.set(x, "stored_fields", value.asInstanceOf[js.Any])
    
    inline def setStored_fieldsUndefined: Self = StObject.set(x, "stored_fields", js.undefined)
    
    inline def setStored_fieldsVarargs(value: String*): Self = StObject.set(x, "stored_fields", js.Array(value :_*))
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def set_source(value: String | js.Array[String]): Self = StObject.set(x, "_source", value.asInstanceOf[js.Any])
    
    inline def set_sourceUndefined: Self = StObject.set(x, "_source", js.undefined)
    
    inline def set_sourceVarargs(value: String*): Self = StObject.set(x, "_source", js.Array(value :_*))
    
    inline def set_source_exclude(value: String | js.Array[String]): Self = StObject.set(x, "_source_exclude", value.asInstanceOf[js.Any])
    
    inline def set_source_excludeUndefined: Self = StObject.set(x, "_source_exclude", js.undefined)
    
    inline def set_source_excludeVarargs(value: String*): Self = StObject.set(x, "_source_exclude", js.Array(value :_*))
    
    inline def set_source_excludes(value: String | js.Array[String]): Self = StObject.set(x, "_source_excludes", value.asInstanceOf[js.Any])
    
    inline def set_source_excludesUndefined: Self = StObject.set(x, "_source_excludes", js.undefined)
    
    inline def set_source_excludesVarargs(value: String*): Self = StObject.set(x, "_source_excludes", js.Array(value :_*))
    
    inline def set_source_include(value: String | js.Array[String]): Self = StObject.set(x, "_source_include", value.asInstanceOf[js.Any])
    
    inline def set_source_includeUndefined: Self = StObject.set(x, "_source_include", js.undefined)
    
    inline def set_source_includeVarargs(value: String*): Self = StObject.set(x, "_source_include", js.Array(value :_*))
    
    inline def set_source_includes(value: String | js.Array[String]): Self = StObject.set(x, "_source_includes", value.asInstanceOf[js.Any])
    
    inline def set_source_includesUndefined: Self = StObject.set(x, "_source_includes", js.undefined)
    
    inline def set_source_includesVarargs(value: String*): Self = StObject.set(x, "_source_includes", js.Array(value :_*))
  }
}
