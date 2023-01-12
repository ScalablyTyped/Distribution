package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FielddataStats extends StObject {
  
  var evictions: js.UndefOr[long] = js.undefined
  
  var fields: js.UndefOr[Record[Field, FieldMemoryUsage]] = js.undefined
  
  var memory_size: js.UndefOr[ByteSize] = js.undefined
  
  var memory_size_in_bytes: long
}
object FielddataStats {
  
  inline def apply(memory_size_in_bytes: long): FielddataStats = {
    val __obj = js.Dynamic.literal(memory_size_in_bytes = memory_size_in_bytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[FielddataStats]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FielddataStats] (val x: Self) extends AnyVal {
    
    inline def setEvictions(value: long): Self = StObject.set(x, "evictions", value.asInstanceOf[js.Any])
    
    inline def setEvictionsUndefined: Self = StObject.set(x, "evictions", js.undefined)
    
    inline def setFields(value: Record[Field, FieldMemoryUsage]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setMemory_size(value: ByteSize): Self = StObject.set(x, "memory_size", value.asInstanceOf[js.Any])
    
    inline def setMemory_sizeUndefined: Self = StObject.set(x, "memory_size", js.undefined)
    
    inline def setMemory_size_in_bytes(value: long): Self = StObject.set(x, "memory_size_in_bytes", value.asInstanceOf[js.Any])
  }
}
