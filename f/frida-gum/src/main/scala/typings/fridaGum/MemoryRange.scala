package typings.fridaGum

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MemoryRange extends StObject {
  
  /**
    * Base address.
    */
  var base: NativePointer
  
  /**
    * Size in bytes.
    */
  var size: Double
}
object MemoryRange {
  
  inline def apply(base: NativePointer, size: Double): MemoryRange = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[MemoryRange]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MemoryRange] (val x: Self) extends AnyVal {
    
    inline def setBase(value: NativePointer): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
