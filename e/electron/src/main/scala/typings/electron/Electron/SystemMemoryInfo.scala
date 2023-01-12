package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SystemMemoryInfo extends StObject {
  
  /**
    * The total amount of memory not being used by applications or disk cache.
    */
  var free: Double
  
  /**
    * The free amount of swap memory in Kilobytes available to the system.
    *
    * @platform win32,linux
    */
  var swapFree: Double
  
  /**
    * The total amount of swap memory in Kilobytes available to the system.
    *
    * @platform win32,linux
    */
  var swapTotal: Double
  
  /**
    * The total amount of physical memory in Kilobytes available to the system.
    */
  var total: Double
}
object SystemMemoryInfo {
  
  inline def apply(free: Double, swapFree: Double, swapTotal: Double, total: Double): SystemMemoryInfo = {
    val __obj = js.Dynamic.literal(free = free.asInstanceOf[js.Any], swapFree = swapFree.asInstanceOf[js.Any], swapTotal = swapTotal.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[SystemMemoryInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SystemMemoryInfo] (val x: Self) extends AnyVal {
    
    inline def setFree(value: Double): Self = StObject.set(x, "free", value.asInstanceOf[js.Any])
    
    inline def setSwapFree(value: Double): Self = StObject.set(x, "swapFree", value.asInstanceOf[js.Any])
    
    inline def setSwapTotal(value: Double): Self = StObject.set(x, "swapTotal", value.asInstanceOf[js.Any])
    
    inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
  }
}
