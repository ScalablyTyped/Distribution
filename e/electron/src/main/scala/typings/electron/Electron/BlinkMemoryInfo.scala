package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BlinkMemoryInfo extends StObject {
  
  /**
    * Size of all allocated objects in Kilobytes.
    */
  var allocated: Double
  
  /**
    * Total allocated space in Kilobytes.
    */
  var total: Double
}
object BlinkMemoryInfo {
  
  inline def apply(allocated: Double, total: Double): BlinkMemoryInfo = {
    val __obj = js.Dynamic.literal(allocated = allocated.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlinkMemoryInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BlinkMemoryInfo] (val x: Self) extends AnyVal {
    
    inline def setAllocated(value: Double): Self = StObject.set(x, "allocated", value.asInstanceOf[js.Any])
    
    inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
  }
}
