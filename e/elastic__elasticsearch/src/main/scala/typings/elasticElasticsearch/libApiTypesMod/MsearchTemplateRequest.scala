package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MsearchTemplateRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var ccs_minimize_roundtrips: js.UndefOr[Boolean] = js.undefined
  
  var index: js.UndefOr[Indices] = js.undefined
  
  var max_concurrent_searches: js.UndefOr[long] = js.undefined
  
  var rest_total_hits_as_int: js.UndefOr[Boolean] = js.undefined
  
  var search_templates: js.UndefOr[js.Array[MsearchTemplateRequestItem]] = js.undefined
  
  var search_type: js.UndefOr[SearchType] = js.undefined
  
  var typed_keys: js.UndefOr[Boolean] = js.undefined
}
object MsearchTemplateRequest {
  
  inline def apply(): MsearchTemplateRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MsearchTemplateRequest]
  }
  
  extension [Self <: MsearchTemplateRequest](x: Self) {
    
    inline def setCcs_minimize_roundtrips(value: Boolean): Self = StObject.set(x, "ccs_minimize_roundtrips", value.asInstanceOf[js.Any])
    
    inline def setCcs_minimize_roundtripsUndefined: Self = StObject.set(x, "ccs_minimize_roundtrips", js.undefined)
    
    inline def setIndex(value: Indices): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setIndexVarargs(value: IndexName*): Self = StObject.set(x, "index", js.Array(value*))
    
    inline def setMax_concurrent_searches(value: long): Self = StObject.set(x, "max_concurrent_searches", value.asInstanceOf[js.Any])
    
    inline def setMax_concurrent_searchesUndefined: Self = StObject.set(x, "max_concurrent_searches", js.undefined)
    
    inline def setRest_total_hits_as_int(value: Boolean): Self = StObject.set(x, "rest_total_hits_as_int", value.asInstanceOf[js.Any])
    
    inline def setRest_total_hits_as_intUndefined: Self = StObject.set(x, "rest_total_hits_as_int", js.undefined)
    
    inline def setSearch_templates(value: js.Array[MsearchTemplateRequestItem]): Self = StObject.set(x, "search_templates", value.asInstanceOf[js.Any])
    
    inline def setSearch_templatesUndefined: Self = StObject.set(x, "search_templates", js.undefined)
    
    inline def setSearch_templatesVarargs(value: MsearchTemplateRequestItem*): Self = StObject.set(x, "search_templates", js.Array(value*))
    
    inline def setSearch_type(value: SearchType): Self = StObject.set(x, "search_type", value.asInstanceOf[js.Any])
    
    inline def setSearch_typeUndefined: Self = StObject.set(x, "search_type", js.undefined)
    
    inline def setTyped_keys(value: Boolean): Self = StObject.set(x, "typed_keys", value.asInstanceOf[js.Any])
    
    inline def setTyped_keysUndefined: Self = StObject.set(x, "typed_keys", js.undefined)
  }
}
