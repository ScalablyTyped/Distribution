package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExistsRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var _source: js.UndefOr[SearchSourceConfigParam] = js.undefined
  
  var _source_excludes: js.UndefOr[Fields] = js.undefined
  
  var _source_includes: js.UndefOr[Fields] = js.undefined
  
  var id: Id
  
  var index: IndexName
  
  var preference: js.UndefOr[String] = js.undefined
  
  var realtime: js.UndefOr[Boolean] = js.undefined
  
  var refresh: js.UndefOr[Boolean] = js.undefined
  
  var routing: js.UndefOr[Routing] = js.undefined
  
  var stored_fields: js.UndefOr[Fields] = js.undefined
  
  var version: js.UndefOr[VersionNumber] = js.undefined
  
  var version_type: js.UndefOr[VersionType] = js.undefined
}
object ExistsRequest {
  
  inline def apply(id: Id, index: IndexName): ExistsRequest = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExistsRequest]
  }
  
  extension [Self <: ExistsRequest](x: Self) {
    
    inline def setId(value: Id): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: IndexName): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
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
    
    inline def setVersion(value: VersionNumber): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    inline def setVersion_type(value: VersionType): Self = StObject.set(x, "version_type", value.asInstanceOf[js.Any])
    
    inline def setVersion_typeUndefined: Self = StObject.set(x, "version_type", js.undefined)
    
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
