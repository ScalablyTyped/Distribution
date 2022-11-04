package typings.elasticElasticsearch.anon

import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.Field
import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.MappingRuntimeFields
import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.QueryDslQueryContainer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Fields extends StObject {
  
  var fields: js.UndefOr[typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.Fields] = js.undefined
  
  var index_filter: js.UndefOr[QueryDslQueryContainer] = js.undefined
  
  var runtime_mappings: js.UndefOr[MappingRuntimeFields] = js.undefined
}
object Fields {
  
  inline def apply(): Fields = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Fields]
  }
  
  extension [Self <: Fields](x: Self) {
    
    inline def setFields(value: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.Fields): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setFieldsVarargs(value: Field*): Self = StObject.set(x, "fields", js.Array(value*))
    
    inline def setIndex_filter(value: QueryDslQueryContainer): Self = StObject.set(x, "index_filter", value.asInstanceOf[js.Any])
    
    inline def setIndex_filterUndefined: Self = StObject.set(x, "index_filter", js.undefined)
    
    inline def setRuntime_mappings(value: MappingRuntimeFields): Self = StObject.set(x, "runtime_mappings", value.asInstanceOf[js.Any])
    
    inline def setRuntime_mappingsUndefined: Self = StObject.set(x, "runtime_mappings", js.undefined)
  }
}
