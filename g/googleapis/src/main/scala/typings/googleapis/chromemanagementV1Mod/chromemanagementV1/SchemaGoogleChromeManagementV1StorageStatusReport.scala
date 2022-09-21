package typings.googleapis.chromemanagementV1Mod.chromemanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleChromeManagementV1StorageStatusReport extends StObject {
  
  /**
    * Output only. Reports on disk.
    */
  var disk: js.UndefOr[js.Array[SchemaGoogleChromeManagementV1DiskInfo]] = js.undefined
  
  /**
    * Output only. Timestamp of when the sample was collected on device
    */
  var reportTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleChromeManagementV1StorageStatusReport {
  
  inline def apply(): SchemaGoogleChromeManagementV1StorageStatusReport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleChromeManagementV1StorageStatusReport]
  }
  
  extension [Self <: SchemaGoogleChromeManagementV1StorageStatusReport](x: Self) {
    
    inline def setDisk(value: js.Array[SchemaGoogleChromeManagementV1DiskInfo]): Self = StObject.set(x, "disk", value.asInstanceOf[js.Any])
    
    inline def setDiskUndefined: Self = StObject.set(x, "disk", js.undefined)
    
    inline def setDiskVarargs(value: SchemaGoogleChromeManagementV1DiskInfo*): Self = StObject.set(x, "disk", js.Array(value*))
    
    inline def setReportTime(value: String): Self = StObject.set(x, "reportTime", value.asInstanceOf[js.Any])
    
    inline def setReportTimeNull: Self = StObject.set(x, "reportTime", null)
    
    inline def setReportTimeUndefined: Self = StObject.set(x, "reportTime", js.undefined)
  }
}
