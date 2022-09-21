package typings.googleapis.chromemanagementV1Mod.chromemanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleChromeManagementV1OsUpdateStatus extends StObject {
  
  /**
    * Output only. Timestamp of the last reboot.
    */
  var lastRebootTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Timestamp of the last update check.
    */
  var lastUpdateCheckTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Timestamp of the last successful update.
    */
  var lastUpdateTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. New platform version of the os image being downloaded and applied. It is only set when update status is OS_IMAGE_DOWNLOAD_IN_PROGRESS or OS_UPDATE_NEED_REBOOT. Note this could be a dummy "0.0.0.0" for OS_UPDATE_NEED_REBOOT status for some edge cases, e.g. update engine is restarted without a reboot.
    */
  var newPlatformVersion: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. New requested platform version from the pending updated kiosk app.
    */
  var newRequestedPlatformVersion: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Current state of the os update.
    */
  var updateState: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleChromeManagementV1OsUpdateStatus {
  
  inline def apply(): SchemaGoogleChromeManagementV1OsUpdateStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleChromeManagementV1OsUpdateStatus]
  }
  
  extension [Self <: SchemaGoogleChromeManagementV1OsUpdateStatus](x: Self) {
    
    inline def setLastRebootTime(value: String): Self = StObject.set(x, "lastRebootTime", value.asInstanceOf[js.Any])
    
    inline def setLastRebootTimeNull: Self = StObject.set(x, "lastRebootTime", null)
    
    inline def setLastRebootTimeUndefined: Self = StObject.set(x, "lastRebootTime", js.undefined)
    
    inline def setLastUpdateCheckTime(value: String): Self = StObject.set(x, "lastUpdateCheckTime", value.asInstanceOf[js.Any])
    
    inline def setLastUpdateCheckTimeNull: Self = StObject.set(x, "lastUpdateCheckTime", null)
    
    inline def setLastUpdateCheckTimeUndefined: Self = StObject.set(x, "lastUpdateCheckTime", js.undefined)
    
    inline def setLastUpdateTime(value: String): Self = StObject.set(x, "lastUpdateTime", value.asInstanceOf[js.Any])
    
    inline def setLastUpdateTimeNull: Self = StObject.set(x, "lastUpdateTime", null)
    
    inline def setLastUpdateTimeUndefined: Self = StObject.set(x, "lastUpdateTime", js.undefined)
    
    inline def setNewPlatformVersion(value: String): Self = StObject.set(x, "newPlatformVersion", value.asInstanceOf[js.Any])
    
    inline def setNewPlatformVersionNull: Self = StObject.set(x, "newPlatformVersion", null)
    
    inline def setNewPlatformVersionUndefined: Self = StObject.set(x, "newPlatformVersion", js.undefined)
    
    inline def setNewRequestedPlatformVersion(value: String): Self = StObject.set(x, "newRequestedPlatformVersion", value.asInstanceOf[js.Any])
    
    inline def setNewRequestedPlatformVersionNull: Self = StObject.set(x, "newRequestedPlatformVersion", null)
    
    inline def setNewRequestedPlatformVersionUndefined: Self = StObject.set(x, "newRequestedPlatformVersion", js.undefined)
    
    inline def setUpdateState(value: String): Self = StObject.set(x, "updateState", value.asInstanceOf[js.Any])
    
    inline def setUpdateStateNull: Self = StObject.set(x, "updateState", null)
    
    inline def setUpdateStateUndefined: Self = StObject.set(x, "updateState", js.undefined)
  }
}
