package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HeapStatistics extends StObject {
  
  var doesZapGarbage: Boolean
  
  var heapSizeLimit: Double
  
  var mallocedMemory: Double
  
  var peakMallocedMemory: Double
  
  var totalAvailableSize: Double
  
  var totalHeapSize: Double
  
  var totalHeapSizeExecutable: Double
  
  var totalPhysicalSize: Double
  
  var usedHeapSize: Double
}
object HeapStatistics {
  
  inline def apply(
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
  
  extension [Self <: HeapStatistics](x: Self) {
    
    inline def setDoesZapGarbage(value: Boolean): Self = StObject.set(x, "doesZapGarbage", value.asInstanceOf[js.Any])
    
    inline def setHeapSizeLimit(value: Double): Self = StObject.set(x, "heapSizeLimit", value.asInstanceOf[js.Any])
    
    inline def setMallocedMemory(value: Double): Self = StObject.set(x, "mallocedMemory", value.asInstanceOf[js.Any])
    
    inline def setPeakMallocedMemory(value: Double): Self = StObject.set(x, "peakMallocedMemory", value.asInstanceOf[js.Any])
    
    inline def setTotalAvailableSize(value: Double): Self = StObject.set(x, "totalAvailableSize", value.asInstanceOf[js.Any])
    
    inline def setTotalHeapSize(value: Double): Self = StObject.set(x, "totalHeapSize", value.asInstanceOf[js.Any])
    
    inline def setTotalHeapSizeExecutable(value: Double): Self = StObject.set(x, "totalHeapSizeExecutable", value.asInstanceOf[js.Any])
    
    inline def setTotalPhysicalSize(value: Double): Self = StObject.set(x, "totalPhysicalSize", value.asInstanceOf[js.Any])
    
    inline def setUsedHeapSize(value: Double): Self = StObject.set(x, "usedHeapSize", value.asInstanceOf[js.Any])
  }
}
