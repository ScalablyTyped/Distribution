package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndicesGetFieldMappingTypeFieldMappings extends StObject {
  
  var mappings: Record[Field, MappingFieldMapping]
}
object IndicesGetFieldMappingTypeFieldMappings {
  
  inline def apply(mappings: Record[Field, MappingFieldMapping]): IndicesGetFieldMappingTypeFieldMappings = {
    val __obj = js.Dynamic.literal(mappings = mappings.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndicesGetFieldMappingTypeFieldMappings]
  }
  
  extension [Self <: IndicesGetFieldMappingTypeFieldMappings](x: Self) {
    
    inline def setMappings(value: Record[Field, MappingFieldMapping]): Self = StObject.set(x, "mappings", value.asInstanceOf[js.Any])
  }
}
