package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndicesGetMappingIndexMappingRecord extends StObject {
  
  var item: js.UndefOr[MappingTypeMapping] = js.undefined
  
  var mappings: MappingTypeMapping
}
object IndicesGetMappingIndexMappingRecord {
  
  inline def apply(mappings: MappingTypeMapping): IndicesGetMappingIndexMappingRecord = {
    val __obj = js.Dynamic.literal(mappings = mappings.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndicesGetMappingIndexMappingRecord]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IndicesGetMappingIndexMappingRecord] (val x: Self) extends AnyVal {
    
    inline def setItem(value: MappingTypeMapping): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
    
    inline def setMappings(value: MappingTypeMapping): Self = StObject.set(x, "mappings", value.asInstanceOf[js.Any])
  }
}
