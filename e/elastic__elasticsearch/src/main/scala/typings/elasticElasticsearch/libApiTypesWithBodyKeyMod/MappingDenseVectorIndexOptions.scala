package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MappingDenseVectorIndexOptions extends StObject {
  
  var ef_construction: integer
  
  var m: integer
  
  var `type`: String
}
object MappingDenseVectorIndexOptions {
  
  inline def apply(ef_construction: integer, m: integer, `type`: String): MappingDenseVectorIndexOptions = {
    val __obj = js.Dynamic.literal(ef_construction = ef_construction.asInstanceOf[js.Any], m = m.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MappingDenseVectorIndexOptions]
  }
  
  extension [Self <: MappingDenseVectorIndexOptions](x: Self) {
    
    inline def setEf_construction(value: integer): Self = StObject.set(x, "ef_construction", value.asInstanceOf[js.Any])
    
    inline def setM(value: integer): Self = StObject.set(x, "m", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
