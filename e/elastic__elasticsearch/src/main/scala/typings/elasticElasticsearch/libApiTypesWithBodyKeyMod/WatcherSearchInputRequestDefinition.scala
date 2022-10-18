package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WatcherSearchInputRequestDefinition extends StObject {
  
  var body: js.UndefOr[WatcherSearchInputRequestBody] = js.undefined
  
  var indices: js.UndefOr[js.Array[IndexName]] = js.undefined
  
  var indices_options: js.UndefOr[IndicesOptions] = js.undefined
  
  var rest_total_hits_as_int: js.UndefOr[Boolean] = js.undefined
  
  var search_type: js.UndefOr[SearchType] = js.undefined
  
  var template: js.UndefOr[WatcherSearchTemplateRequestBody] = js.undefined
}
object WatcherSearchInputRequestDefinition {
  
  inline def apply(): WatcherSearchInputRequestDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WatcherSearchInputRequestDefinition]
  }
  
  extension [Self <: WatcherSearchInputRequestDefinition](x: Self) {
    
    inline def setBody(value: WatcherSearchInputRequestBody): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setIndices(value: js.Array[IndexName]): Self = StObject.set(x, "indices", value.asInstanceOf[js.Any])
    
    inline def setIndicesUndefined: Self = StObject.set(x, "indices", js.undefined)
    
    inline def setIndicesVarargs(value: IndexName*): Self = StObject.set(x, "indices", js.Array(value*))
    
    inline def setIndices_options(value: IndicesOptions): Self = StObject.set(x, "indices_options", value.asInstanceOf[js.Any])
    
    inline def setIndices_optionsUndefined: Self = StObject.set(x, "indices_options", js.undefined)
    
    inline def setRest_total_hits_as_int(value: Boolean): Self = StObject.set(x, "rest_total_hits_as_int", value.asInstanceOf[js.Any])
    
    inline def setRest_total_hits_as_intUndefined: Self = StObject.set(x, "rest_total_hits_as_int", js.undefined)
    
    inline def setSearch_type(value: SearchType): Self = StObject.set(x, "search_type", value.asInstanceOf[js.Any])
    
    inline def setSearch_typeUndefined: Self = StObject.set(x, "search_type", js.undefined)
    
    inline def setTemplate(value: WatcherSearchTemplateRequestBody): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
  }
}
