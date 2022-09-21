package typings.googleapis.chromemanagementV1Mod.chromemanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleChromeManagementV1MemoryStatusReport extends StObject {
  
  /**
    * Output only. Number of page faults during this collection
    */
  var pageFaults: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Output only. The timestamp in milliseconds representing time at which this report was sampled.
    */
  var reportTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Frequency the report is sampled.
    */
  var sampleFrequency: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Amount of free RAM in bytes (unreliable due to Garbage Collection).
    */
  var systemRamFreeBytes: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleChromeManagementV1MemoryStatusReport {
  
  inline def apply(): SchemaGoogleChromeManagementV1MemoryStatusReport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleChromeManagementV1MemoryStatusReport]
  }
  
  extension [Self <: SchemaGoogleChromeManagementV1MemoryStatusReport](x: Self) {
    
    inline def setPageFaults(value: Double): Self = StObject.set(x, "pageFaults", value.asInstanceOf[js.Any])
    
    inline def setPageFaultsNull: Self = StObject.set(x, "pageFaults", null)
    
    inline def setPageFaultsUndefined: Self = StObject.set(x, "pageFaults", js.undefined)
    
    inline def setReportTime(value: String): Self = StObject.set(x, "reportTime", value.asInstanceOf[js.Any])
    
    inline def setReportTimeNull: Self = StObject.set(x, "reportTime", null)
    
    inline def setReportTimeUndefined: Self = StObject.set(x, "reportTime", js.undefined)
    
    inline def setSampleFrequency(value: String): Self = StObject.set(x, "sampleFrequency", value.asInstanceOf[js.Any])
    
    inline def setSampleFrequencyNull: Self = StObject.set(x, "sampleFrequency", null)
    
    inline def setSampleFrequencyUndefined: Self = StObject.set(x, "sampleFrequency", js.undefined)
    
    inline def setSystemRamFreeBytes(value: String): Self = StObject.set(x, "systemRamFreeBytes", value.asInstanceOf[js.Any])
    
    inline def setSystemRamFreeBytesNull: Self = StObject.set(x, "systemRamFreeBytes", null)
    
    inline def setSystemRamFreeBytesUndefined: Self = StObject.set(x, "systemRamFreeBytes", js.undefined)
  }
}
