package typings.googleapis.androidmanagementV1Mod.androidmanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSystemUpdateInfo extends StObject {
  
  /**
    * The time when the update was first available. A zero value indicates that this field is not set. This field is set only if an update is available (that is, updateStatus is neither UPDATE_STATUS_UNKNOWN nor UP_TO_DATE).
    */
  var updateReceivedTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The status of an update: whether an update exists and what type it is.
    */
  var updateStatus: js.UndefOr[String | Null] = js.undefined
}
object SchemaSystemUpdateInfo {
  
  inline def apply(): SchemaSystemUpdateInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSystemUpdateInfo]
  }
  
  extension [Self <: SchemaSystemUpdateInfo](x: Self) {
    
    inline def setUpdateReceivedTime(value: String): Self = StObject.set(x, "updateReceivedTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateReceivedTimeNull: Self = StObject.set(x, "updateReceivedTime", null)
    
    inline def setUpdateReceivedTimeUndefined: Self = StObject.set(x, "updateReceivedTime", js.undefined)
    
    inline def setUpdateStatus(value: String): Self = StObject.set(x, "updateStatus", value.asInstanceOf[js.Any])
    
    inline def setUpdateStatusNull: Self = StObject.set(x, "updateStatus", null)
    
    inline def setUpdateStatusUndefined: Self = StObject.set(x, "updateStatus", js.undefined)
  }
}
