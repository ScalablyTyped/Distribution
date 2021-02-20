package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BlinkMemoryInfo extends StObject {
  
  /**
    * Size of all allocated objects in Kilobytes.
    */
  var allocated: Double = js.native
  
  /**
    * Size of all marked objects in Kilobytes.
    */
  var marked: Double = js.native
  
  /**
    * Total allocated space in Kilobytes.
    */
  var total: Double = js.native
}
object BlinkMemoryInfo {
  
  @scala.inline
  def apply(allocated: Double, marked: Double, total: Double): BlinkMemoryInfo = {
    val __obj = js.Dynamic.literal(allocated = allocated.asInstanceOf[js.Any], marked = marked.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlinkMemoryInfo]
  }
  
  @scala.inline
  implicit class BlinkMemoryInfoMutableBuilder[Self <: BlinkMemoryInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllocated(value: Double): Self = StObject.set(x, "allocated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarked(value: Double): Self = StObject.set(x, "marked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
  }
}
