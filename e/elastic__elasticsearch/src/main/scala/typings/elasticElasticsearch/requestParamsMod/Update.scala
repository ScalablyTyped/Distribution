package typings.elasticElasticsearch.requestParamsMod

import typings.elasticElasticsearch.elasticElasticsearchStrings.wait_for
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Update[T]
  extends StObject
     with Generic {
  
  var _source: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var _source_exclude: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var _source_excludes: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var _source_include: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var _source_includes: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var body: T
  
  var id: String
  
  var if_primary_term: js.UndefOr[Double] = js.undefined
  
  var if_seq_no: js.UndefOr[Double] = js.undefined
  
  var index: String
  
  var lang: js.UndefOr[String] = js.undefined
  
  var refresh: js.UndefOr[wait_for | Boolean] = js.undefined
  
  var require_alias: js.UndefOr[Boolean] = js.undefined
  
  var retry_on_conflict: js.UndefOr[Double] = js.undefined
  
  var routing: js.UndefOr[String] = js.undefined
  
  var timeout: js.UndefOr[String] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
  
  var wait_for_active_shards: js.UndefOr[String] = js.undefined
}
object Update {
  
  @scala.inline
  def apply[T](body: T, id: String, index: String): Update[T] = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[Update[T]]
  }
  
  @scala.inline
  implicit class UpdateMutableBuilder[Self <: Update[?], T] (val x: Self & Update[T]) extends AnyVal {
    
    @scala.inline
    def setBody(value: T): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIf_primary_term(value: Double): Self = StObject.set(x, "if_primary_term", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIf_primary_termUndefined: Self = StObject.set(x, "if_primary_term", js.undefined)
    
    @scala.inline
    def setIf_seq_no(value: Double): Self = StObject.set(x, "if_seq_no", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIf_seq_noUndefined: Self = StObject.set(x, "if_seq_no", js.undefined)
    
    @scala.inline
    def setIndex(value: String): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
    
    @scala.inline
    def setRefresh(value: wait_for | Boolean): Self = StObject.set(x, "refresh", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefreshUndefined: Self = StObject.set(x, "refresh", js.undefined)
    
    @scala.inline
    def setRequire_alias(value: Boolean): Self = StObject.set(x, "require_alias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequire_aliasUndefined: Self = StObject.set(x, "require_alias", js.undefined)
    
    @scala.inline
    def setRetry_on_conflict(value: Double): Self = StObject.set(x, "retry_on_conflict", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetry_on_conflictUndefined: Self = StObject.set(x, "retry_on_conflict", js.undefined)
    
    @scala.inline
    def setRouting(value: String): Self = StObject.set(x, "routing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoutingUndefined: Self = StObject.set(x, "routing", js.undefined)
    
    @scala.inline
    def setTimeout(value: String): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setWait_for_active_shards(value: String): Self = StObject.set(x, "wait_for_active_shards", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWait_for_active_shardsUndefined: Self = StObject.set(x, "wait_for_active_shards", js.undefined)
    
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
