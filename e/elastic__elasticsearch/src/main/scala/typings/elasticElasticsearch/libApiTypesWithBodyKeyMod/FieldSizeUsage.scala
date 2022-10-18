package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FieldSizeUsage extends StObject {
  
  var size: js.UndefOr[ByteSize] = js.undefined
  
  var size_in_bytes: long
}
object FieldSizeUsage {
  
  inline def apply(size_in_bytes: long): FieldSizeUsage = {
    val __obj = js.Dynamic.literal(size_in_bytes = size_in_bytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldSizeUsage]
  }
  
  extension [Self <: FieldSizeUsage](x: Self) {
    
    inline def setSize(value: ByteSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setSize_in_bytes(value: long): Self = StObject.set(x, "size_in_bytes", value.asInstanceOf[js.Any])
  }
}
