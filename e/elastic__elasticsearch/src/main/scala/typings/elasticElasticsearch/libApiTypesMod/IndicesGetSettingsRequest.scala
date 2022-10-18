package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndicesGetSettingsRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var allow_no_indices: js.UndefOr[Boolean] = js.undefined
  
  var expand_wildcards: js.UndefOr[ExpandWildcards] = js.undefined
  
  var flat_settings: js.UndefOr[Boolean] = js.undefined
  
  var ignore_unavailable: js.UndefOr[Boolean] = js.undefined
  
  var include_defaults: js.UndefOr[Boolean] = js.undefined
  
  var index: js.UndefOr[Indices] = js.undefined
  
  var local: js.UndefOr[Boolean] = js.undefined
  
  var master_timeout: js.UndefOr[Duration] = js.undefined
  
  var name: js.UndefOr[Names] = js.undefined
}
object IndicesGetSettingsRequest {
  
  inline def apply(): IndicesGetSettingsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IndicesGetSettingsRequest]
  }
  
  extension [Self <: IndicesGetSettingsRequest](x: Self) {
    
    inline def setAllow_no_indices(value: Boolean): Self = StObject.set(x, "allow_no_indices", value.asInstanceOf[js.Any])
    
    inline def setAllow_no_indicesUndefined: Self = StObject.set(x, "allow_no_indices", js.undefined)
    
    inline def setExpand_wildcards(value: ExpandWildcards): Self = StObject.set(x, "expand_wildcards", value.asInstanceOf[js.Any])
    
    inline def setExpand_wildcardsUndefined: Self = StObject.set(x, "expand_wildcards", js.undefined)
    
    inline def setExpand_wildcardsVarargs(value: ExpandWildcard*): Self = StObject.set(x, "expand_wildcards", js.Array(value*))
    
    inline def setFlat_settings(value: Boolean): Self = StObject.set(x, "flat_settings", value.asInstanceOf[js.Any])
    
    inline def setFlat_settingsUndefined: Self = StObject.set(x, "flat_settings", js.undefined)
    
    inline def setIgnore_unavailable(value: Boolean): Self = StObject.set(x, "ignore_unavailable", value.asInstanceOf[js.Any])
    
    inline def setIgnore_unavailableUndefined: Self = StObject.set(x, "ignore_unavailable", js.undefined)
    
    inline def setInclude_defaults(value: Boolean): Self = StObject.set(x, "include_defaults", value.asInstanceOf[js.Any])
    
    inline def setInclude_defaultsUndefined: Self = StObject.set(x, "include_defaults", js.undefined)
    
    inline def setIndex(value: Indices): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setIndexVarargs(value: IndexName*): Self = StObject.set(x, "index", js.Array(value*))
    
    inline def setLocal(value: Boolean): Self = StObject.set(x, "local", value.asInstanceOf[js.Any])
    
    inline def setLocalUndefined: Self = StObject.set(x, "local", js.undefined)
    
    inline def setMaster_timeout(value: Duration): Self = StObject.set(x, "master_timeout", value.asInstanceOf[js.Any])
    
    inline def setMaster_timeoutUndefined: Self = StObject.set(x, "master_timeout", js.undefined)
    
    inline def setName(value: Names): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNameVarargs(value: Name*): Self = StObject.set(x, "name", js.Array(value*))
  }
}
