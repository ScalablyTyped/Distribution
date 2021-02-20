package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HeapStatistics extends StObject {
  
  var doesZapGarbage: Boolean = js.native
  
  var heapSizeLimit: Double = js.native
  
  var mallocedMemory: Double = js.native
  
  var peakMallocedMemory: Double = js.native
  
  var totalAvailableSize: Double = js.native
  
  var totalHeapSize: Double = js.native
  
  var totalHeapSizeExecutable: Double = js.native
  
  var totalPhysicalSize: Double = js.native
  
  var usedHeapSize: Double = js.native
}
object HeapStatistics {
  
  @scala.inline
  def apply(
    doesZapGarbage: Boolean,
    heapSizeLimit: Double,
    mallocedMemory: Double,
    peakMallocedMemory: Double,
    totalAvailableSize: Double,
    totalHeapSize: Double,
    totalHeapSizeExecutable: Double,
    totalPhysicalSize: Double,
    usedHeapSize: Double
  ): HeapStatistics = {
    val __obj = js.Dynamic.literal(doesZapGarbage = doesZapGarbage.asInstanceOf[js.Any], heapSizeLimit = heapSizeLimit.asInstanceOf[js.Any], mallocedMemory = mallocedMemory.asInstanceOf[js.Any], peakMallocedMemory = peakMallocedMemory.asInstanceOf[js.Any], totalAvailableSize = totalAvailableSize.asInstanceOf[js.Any], totalHeapSize = totalHeapSize.asInstanceOf[js.Any], totalHeapSizeExecutable = totalHeapSizeExecutable.asInstanceOf[js.Any], totalPhysicalSize = totalPhysicalSize.asInstanceOf[js.Any], usedHeapSize = usedHeapSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeapStatistics]
  }
  
  @scala.inline
  implicit class HeapStatisticsMutableBuilder[Self <: HeapStatistics] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDoesZapGarbage(value: Boolean): Self = StObject.set(x, "doesZapGarbage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeapSizeLimit(value: Double): Self = StObject.set(x, "heapSizeLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMallocedMemory(value: Double): Self = StObject.set(x, "mallocedMemory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeakMallocedMemory(value: Double): Self = StObject.set(x, "peakMallocedMemory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalAvailableSize(value: Double): Self = StObject.set(x, "totalAvailableSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalHeapSize(value: Double): Self = StObject.set(x, "totalHeapSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalHeapSizeExecutable(value: Double): Self = StObject.set(x, "totalHeapSizeExecutable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalPhysicalSize(value: Double): Self = StObject.set(x, "totalPhysicalSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsedHeapSize(value: Double): Self = StObject.set(x, "usedHeapSize", value.asInstanceOf[js.Any])
  }
}
