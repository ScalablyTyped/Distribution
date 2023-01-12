package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MgetRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var _source: js.UndefOr[SearchSourceConfigParam] = js.undefined
  
  var _source_excludes: js.UndefOr[Fields] = js.undefined
  
  var _source_includes: js.UndefOr[Fields] = js.undefined
  
  var docs: js.UndefOr[js.Array[MgetOperation]] = js.undefined
  
  var ids: js.UndefOr[Ids] = js.undefined
  
  var index: js.UndefOr[IndexName] = js.undefined
  
  var preference: js.UndefOr[String] = js.undefined
  
  var realtime: js.UndefOr[Boolean] = js.undefined
  
  var refresh: js.UndefOr[Boolean] = js.undefined
  
  var routing: js.UndefOr[Routing] = js.undefined
  
  var stored_fields: js.UndefOr[Fields] = js.undefined
}
object MgetRequest {
  
  inline def apply(): MgetRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MgetRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MgetRequest] (val x: Self) extends AnyVal {
    
    inline def setDocs(value: js.Array[MgetOperation]): Self = StObject.set(x, "docs", value.asInstanceOf[js.Any])
    
    inline def setDocsUndefined: Self = StObject.set(x, "docs", js.undefined)
    
    inline def setDocsVarargs(value: MgetOperation*): Self = StObject.set(x, "docs", js.Array(value*))
    
    inline def setIds(value: Ids): Self = StObject.set(x, "ids", value.asInstanceOf[js.Any])
    
    inline def setIdsUndefined: Self = StObject.set(x, "ids", js.undefined)
    
    inline def setIdsVarargs(value: Id*): Self = StObject.set(x, "ids", js.Array(value*))
    
    inline def setIndex(value: IndexName): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setPreference(value: String): Self = StObject.set(x, "preference", value.asInstanceOf[js.Any])
    
    inline def setPreferenceUndefined: Self = StObject.set(x, "preference", js.undefined)
    
    inline def setRealtime(value: Boolean): Self = StObject.set(x, "realtime", value.asInstanceOf[js.Any])
    
    inline def setRealtimeUndefined: Self = StObject.set(x, "realtime", js.undefined)
    
    inline def setRefresh(value: Boolean): Self = StObject.set(x, "refresh", value.asInstanceOf[js.Any])
    
    inline def setRefreshUndefined: Self = StObject.set(x, "refresh", js.undefined)
    
    inline def setRouting(value: Routing): Self = StObject.set(x, "routing", value.asInstanceOf[js.Any])
    
    inline def setRoutingUndefined: Self = StObject.set(x, "routing", js.undefined)
    
    inline def setStored_fields(value: Fields): Self = StObject.set(x, "stored_fields", value.asInstanceOf[js.Any])
    
    inline def setStored_fieldsUndefined: Self = StObject.set(x, "stored_fields", js.undefined)
    
    inline def setStored_fieldsVarargs(value: Field*): Self = StObject.set(x, "stored_fields", js.Array(value*))
    
    inline def set_source(value: SearchSourceConfigParam): Self = StObject.set(x, "_source", value.asInstanceOf[js.Any])
    
    inline def set_sourceUndefined: Self = StObject.set(x, "_source", js.undefined)
    
    inline def set_sourceVarargs(value: Field*): Self = StObject.set(x, "_source", js.Array(value*))
    
    inline def set_source_excludes(value: Fields): Self = StObject.set(x, "_source_excludes", value.asInstanceOf[js.Any])
    
    inline def set_source_excludesUndefined: Self = StObject.set(x, "_source_excludes", js.undefined)
    
    inline def set_source_excludesVarargs(value: Field*): Self = StObject.set(x, "_source_excludes", js.Array(value*))
    
    inline def set_source_includes(value: Fields): Self = StObject.set(x, "_source_includes", value.asInstanceOf[js.Any])
    
    inline def set_source_includesUndefined: Self = StObject.set(x, "_source_includes", js.undefined)
    
    inline def set_source_includesVarargs(value: Field*): Self = StObject.set(x, "_source_includes", js.Array(value*))
  }
}
