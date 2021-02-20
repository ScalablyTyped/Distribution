package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MemoryUsageDetails extends StObject {
  
  // Docs: https://electronjs.org/docs/api/structures/memory-usage-details
  var count: Double = js.native
  
  var liveSize: Double = js.native
  
  var size: Double = js.native
}
object MemoryUsageDetails {
  
  @scala.inline
  def apply(count: Double, liveSize: Double, size: Double): MemoryUsageDetails = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], liveSize = liveSize.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[MemoryUsageDetails]
  }
  
  @scala.inline
  implicit class MemoryUsageDetailsMutableBuilder[Self <: MemoryUsageDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLiveSize(value: Double): Self = StObject.set(x, "liveSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
