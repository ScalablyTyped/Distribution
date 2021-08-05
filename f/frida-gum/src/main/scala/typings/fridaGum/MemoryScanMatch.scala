package typings.fridaGum

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MemoryScanMatch extends StObject {
  
  /**
    * Memory address where a match was found.
    */
  var address: NativePointer
  
  /**
    * Size of this match.
    */
  var size: Double
}
object MemoryScanMatch {
  
  inline def apply(address: NativePointer, size: Double): MemoryScanMatch = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[MemoryScanMatch]
  }
  
  extension [Self <: MemoryScanMatch](x: Self) {
    
    inline def setAddress(value: NativePointer): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
