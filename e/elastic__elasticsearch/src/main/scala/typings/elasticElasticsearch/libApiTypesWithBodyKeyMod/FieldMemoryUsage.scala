package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FieldMemoryUsage extends StObject {
  
  var memory_size: js.UndefOr[ByteSize] = js.undefined
  
  var memory_size_in_bytes: long
}
object FieldMemoryUsage {
  
  inline def apply(memory_size_in_bytes: long): FieldMemoryUsage = {
    val __obj = js.Dynamic.literal(memory_size_in_bytes = memory_size_in_bytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldMemoryUsage]
  }
  
  extension [Self <: FieldMemoryUsage](x: Self) {
    
    inline def setMemory_size(value: ByteSize): Self = StObject.set(x, "memory_size", value.asInstanceOf[js.Any])
    
    inline def setMemory_sizeUndefined: Self = StObject.set(x, "memory_size", js.undefined)
    
    inline def setMemory_size_in_bytes(value: long): Self = StObject.set(x, "memory_size_in_bytes", value.asInstanceOf[js.Any])
  }
}
