package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MemoryInfo extends StObject {
  
  // Docs: https://electronjs.org/docs/api/structures/memory-info
  /**
    * The maximum amount of memory that has ever been pinned to actual physical RAM.
    */
  var peakWorkingSetSize: Double
  
  /**
    * The amount of memory not shared by other processes, such as JS heap or HTML
    * content.
    *
    * @platform win32
    */
  var privateBytes: js.UndefOr[Double] = js.undefined
  
  /**
    * The amount of memory currently pinned to actual physical RAM.
    */
  var workingSetSize: Double
}
object MemoryInfo {
  
  inline def apply(peakWorkingSetSize: Double, workingSetSize: Double): MemoryInfo = {
    val __obj = js.Dynamic.literal(peakWorkingSetSize = peakWorkingSetSize.asInstanceOf[js.Any], workingSetSize = workingSetSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[MemoryInfo]
  }
  
  extension [Self <: MemoryInfo](x: Self) {
    
    inline def setPeakWorkingSetSize(value: Double): Self = StObject.set(x, "peakWorkingSetSize", value.asInstanceOf[js.Any])
    
    inline def setPrivateBytes(value: Double): Self = StObject.set(x, "privateBytes", value.asInstanceOf[js.Any])
    
    inline def setPrivateBytesUndefined: Self = StObject.set(x, "privateBytes", js.undefined)
    
    inline def setWorkingSetSize(value: Double): Self = StObject.set(x, "workingSetSize", value.asInstanceOf[js.Any])
  }
}
