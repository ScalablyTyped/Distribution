package typings.googleapis.chromemanagementV1Mod.chromemanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleChromeManagementV1DiskInfo extends StObject {
  
  /**
    * Output only. Number of bytes read since last boot.
    */
  var bytesReadThisSession: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Number of bytes written since last boot.
    */
  var bytesWrittenThisSession: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Time spent discarding since last boot. Discarding is writing to clear blocks which are no longer in use. Supported on kernels 4.18+.
    */
  var discardTimeThisSession: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Disk health.
    */
  var health: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Counts the time the disk and queue were busy, so unlike the fields above, parallel requests are not counted multiple times.
    */
  var ioTimeThisSession: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Disk manufacturer.
    */
  var manufacturer: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Disk model.
    */
  var model: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Time spent reading from disk since last boot.
    */
  var readTimeThisSession: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Disk serial number.
    */
  var serialNumber: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Disk size.
    */
  var sizeBytes: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Disk type: eMMC / NVMe / ATA / SCSI.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Disk volumes.
    */
  var volumeIds: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Output only. Time spent writing to disk since last boot.
    */
  var writeTimeThisSession: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleChromeManagementV1DiskInfo {
  
  inline def apply(): SchemaGoogleChromeManagementV1DiskInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleChromeManagementV1DiskInfo]
  }
  
  extension [Self <: SchemaGoogleChromeManagementV1DiskInfo](x: Self) {
    
    inline def setBytesReadThisSession(value: String): Self = StObject.set(x, "bytesReadThisSession", value.asInstanceOf[js.Any])
    
    inline def setBytesReadThisSessionNull: Self = StObject.set(x, "bytesReadThisSession", null)
    
    inline def setBytesReadThisSessionUndefined: Self = StObject.set(x, "bytesReadThisSession", js.undefined)
    
    inline def setBytesWrittenThisSession(value: String): Self = StObject.set(x, "bytesWrittenThisSession", value.asInstanceOf[js.Any])
    
    inline def setBytesWrittenThisSessionNull: Self = StObject.set(x, "bytesWrittenThisSession", null)
    
    inline def setBytesWrittenThisSessionUndefined: Self = StObject.set(x, "bytesWrittenThisSession", js.undefined)
    
    inline def setDiscardTimeThisSession(value: String): Self = StObject.set(x, "discardTimeThisSession", value.asInstanceOf[js.Any])
    
    inline def setDiscardTimeThisSessionNull: Self = StObject.set(x, "discardTimeThisSession", null)
    
    inline def setDiscardTimeThisSessionUndefined: Self = StObject.set(x, "discardTimeThisSession", js.undefined)
    
    inline def setHealth(value: String): Self = StObject.set(x, "health", value.asInstanceOf[js.Any])
    
    inline def setHealthNull: Self = StObject.set(x, "health", null)
    
    inline def setHealthUndefined: Self = StObject.set(x, "health", js.undefined)
    
    inline def setIoTimeThisSession(value: String): Self = StObject.set(x, "ioTimeThisSession", value.asInstanceOf[js.Any])
    
    inline def setIoTimeThisSessionNull: Self = StObject.set(x, "ioTimeThisSession", null)
    
    inline def setIoTimeThisSessionUndefined: Self = StObject.set(x, "ioTimeThisSession", js.undefined)
    
    inline def setManufacturer(value: String): Self = StObject.set(x, "manufacturer", value.asInstanceOf[js.Any])
    
    inline def setManufacturerNull: Self = StObject.set(x, "manufacturer", null)
    
    inline def setManufacturerUndefined: Self = StObject.set(x, "manufacturer", js.undefined)
    
    inline def setModel(value: String): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setModelNull: Self = StObject.set(x, "model", null)
    
    inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
    
    inline def setReadTimeThisSession(value: String): Self = StObject.set(x, "readTimeThisSession", value.asInstanceOf[js.Any])
    
    inline def setReadTimeThisSessionNull: Self = StObject.set(x, "readTimeThisSession", null)
    
    inline def setReadTimeThisSessionUndefined: Self = StObject.set(x, "readTimeThisSession", js.undefined)
    
    inline def setSerialNumber(value: String): Self = StObject.set(x, "serialNumber", value.asInstanceOf[js.Any])
    
    inline def setSerialNumberNull: Self = StObject.set(x, "serialNumber", null)
    
    inline def setSerialNumberUndefined: Self = StObject.set(x, "serialNumber", js.undefined)
    
    inline def setSizeBytes(value: String): Self = StObject.set(x, "sizeBytes", value.asInstanceOf[js.Any])
    
    inline def setSizeBytesNull: Self = StObject.set(x, "sizeBytes", null)
    
    inline def setSizeBytesUndefined: Self = StObject.set(x, "sizeBytes", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setVolumeIds(value: js.Array[String]): Self = StObject.set(x, "volumeIds", value.asInstanceOf[js.Any])
    
    inline def setVolumeIdsNull: Self = StObject.set(x, "volumeIds", null)
    
    inline def setVolumeIdsUndefined: Self = StObject.set(x, "volumeIds", js.undefined)
    
    inline def setVolumeIdsVarargs(value: String*): Self = StObject.set(x, "volumeIds", js.Array(value*))
    
    inline def setWriteTimeThisSession(value: String): Self = StObject.set(x, "writeTimeThisSession", value.asInstanceOf[js.Any])
    
    inline def setWriteTimeThisSessionNull: Self = StObject.set(x, "writeTimeThisSession", null)
    
    inline def setWriteTimeThisSessionUndefined: Self = StObject.set(x, "writeTimeThisSession", js.undefined)
  }
}
