package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SystemMemoryInfo extends StObject {
  
  /**
    * The total amount of memory not being used by applications or disk cache.
    */
  var free: Double = js.native
  
  /**
    * The free amount of swap memory in Kilobytes available to the system.
    *
    * @platform win32,linux
    */
  var swapFree: Double = js.native
  
  /**
    * The total amount of swap memory in Kilobytes available to the system.
    *
    * @platform win32,linux
    */
  var swapTotal: Double = js.native
  
  /**
    * The total amount of physical memory in Kilobytes available to the system.
    */
  var total: Double = js.native
}
object SystemMemoryInfo {
  
  @scala.inline
  def apply(free: Double, swapFree: Double, swapTotal: Double, total: Double): SystemMemoryInfo = {
    val __obj = js.Dynamic.literal(free = free.asInstanceOf[js.Any], swapFree = swapFree.asInstanceOf[js.Any], swapTotal = swapTotal.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[SystemMemoryInfo]
  }
  
  @scala.inline
  implicit class SystemMemoryInfoMutableBuilder[Self <: SystemMemoryInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFree(value: Double): Self = StObject.set(x, "free", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwapFree(value: Double): Self = StObject.set(x, "swapFree", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwapTotal(value: Double): Self = StObject.set(x, "swapTotal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
  }
}
