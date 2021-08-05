package typings.fridaGum

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KernelMemoryScanMatch extends StObject {
  
  /**
    * Memory address where a match was found.
    */
  var address: UInt64
  
  /**
    * Size of this match.
    */
  var size: Double
}
object KernelMemoryScanMatch {
  
  inline def apply(address: UInt64, size: Double): KernelMemoryScanMatch = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[KernelMemoryScanMatch]
  }
  
  extension [Self <: KernelMemoryScanMatch](x: Self) {
    
    inline def setAddress(value: UInt64): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
