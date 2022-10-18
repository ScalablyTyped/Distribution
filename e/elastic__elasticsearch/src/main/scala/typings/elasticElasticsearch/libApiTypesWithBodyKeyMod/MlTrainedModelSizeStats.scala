package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlTrainedModelSizeStats extends StObject {
  
  var model_size_bytes: ByteSize
  
  var required_native_memory_bytes: integer
}
object MlTrainedModelSizeStats {
  
  inline def apply(model_size_bytes: ByteSize, required_native_memory_bytes: integer): MlTrainedModelSizeStats = {
    val __obj = js.Dynamic.literal(model_size_bytes = model_size_bytes.asInstanceOf[js.Any], required_native_memory_bytes = required_native_memory_bytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlTrainedModelSizeStats]
  }
  
  extension [Self <: MlTrainedModelSizeStats](x: Self) {
    
    inline def setModel_size_bytes(value: ByteSize): Self = StObject.set(x, "model_size_bytes", value.asInstanceOf[js.Any])
    
    inline def setRequired_native_memory_bytes(value: integer): Self = StObject.set(x, "required_native_memory_bytes", value.asInstanceOf[js.Any])
  }
}
