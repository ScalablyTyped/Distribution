package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Mget[T] extends Generic {
  
  var _source: js.UndefOr[String | js.Array[String]] = js.native
  
  var _source_exclude: js.UndefOr[String | js.Array[String]] = js.native
  
  var _source_excludes: js.UndefOr[String | js.Array[String]] = js.native
  
  var _source_include: js.UndefOr[String | js.Array[String]] = js.native
  
  var _source_includes: js.UndefOr[String | js.Array[String]] = js.native
  
  var body: T = js.native
  
  var index: js.UndefOr[String] = js.native
  
  var preference: js.UndefOr[String] = js.native
  
  var realtime: js.UndefOr[Boolean] = js.native
  
  var refresh: js.UndefOr[Boolean] = js.native
  
  var routing: js.UndefOr[String] = js.native
  
  var stored_fields: js.UndefOr[String | js.Array[String]] = js.native
  
  var `type`: js.UndefOr[String] = js.native
}
object Mget {
  
  @scala.inline
  def apply[T](body: T): Mget[T] = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mget[T]]
  }
  
  @scala.inline
  implicit class MgetMutableBuilder[Self <: Mget[_], T] (val x: Self with Mget[T]) extends AnyVal {
    
    @scala.inline
    def setBody(value: T): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex(value: String): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    @scala.inline
    def setPreference(value: String): Self = StObject.set(x, "preference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreferenceUndefined: Self = StObject.set(x, "preference", js.undefined)
    
    @scala.inline
    def setRealtime(value: Boolean): Self = StObject.set(x, "realtime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRealtimeUndefined: Self = StObject.set(x, "realtime", js.undefined)
    
    @scala.inline
    def setRefresh(value: Boolean): Self = StObject.set(x, "refresh", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefreshUndefined: Self = StObject.set(x, "refresh", js.undefined)
    
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
