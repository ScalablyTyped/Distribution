package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompletionStats extends StObject {
  
  var fields: js.UndefOr[Record[Field, FieldSizeUsage]] = js.undefined
  
  var size: js.UndefOr[ByteSize] = js.undefined
  
  var size_in_bytes: long
}
object CompletionStats {
  
  inline def apply(size_in_bytes: long): CompletionStats = {
    val __obj = js.Dynamic.literal(size_in_bytes = size_in_bytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompletionStats]
  }
  
  extension [Self <: CompletionStats](x: Self) {
    
    inline def setFields(value: Record[Field, FieldSizeUsage]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setSize(value: ByteSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setSize_in_bytes(value: long): Self = StObject.set(x, "size_in_bytes", value.asInstanceOf[js.Any])
  }
}
