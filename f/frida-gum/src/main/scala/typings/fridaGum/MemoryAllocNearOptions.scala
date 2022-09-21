package typings.fridaGum

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MemoryAllocNearOptions extends StObject {
  
  /**
    * Maximum distance to the given memory address, in bytes.
    */
  var maxDistance: Double
  
  /**
    * Memory address to try allocating near.
    */
  var near: NativePointer
}
object MemoryAllocNearOptions {
  
  inline def apply(maxDistance: Double, near: NativePointer): MemoryAllocNearOptions = {
    val __obj = js.Dynamic.literal(maxDistance = maxDistance.asInstanceOf[js.Any], near = near.asInstanceOf[js.Any])
    __obj.asInstanceOf[MemoryAllocNearOptions]
  }
  
  extension [Self <: MemoryAllocNearOptions](x: Self) {
    
    inline def setMaxDistance(value: Double): Self = StObject.set(x, "maxDistance", value.asInstanceOf[js.Any])
    
    inline def setNear(value: NativePointer): Self = StObject.set(x, "near", value.asInstanceOf[js.Any])
  }
}
