package typings.googleapis.androidmanagementV1Mod.androidmanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An event related to memory and storage measurements.
  */
trait SchemaMemoryEvent extends StObject {
  
  /**
    * The number of free bytes in the medium, or for EXTERNAL_STORAGE_DETECTED,
    * the total capacity in bytes of the storage medium.
    */
  var byteCount: js.UndefOr[String] = js.undefined
  
  /**
    * The creation time of the event.
    */
  var createTime: js.UndefOr[String] = js.undefined
  
  /**
    * Event type.
    */
  var eventType: js.UndefOr[String] = js.undefined
}
object SchemaMemoryEvent {
  
  inline def apply(): SchemaMemoryEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMemoryEvent]
  }
  
  extension [Self <: SchemaMemoryEvent](x: Self) {
    
    inline def setByteCount(value: String): Self = StObject.set(x, "byteCount", value.asInstanceOf[js.Any])
    
    inline def setByteCountUndefined: Self = StObject.set(x, "byteCount", js.undefined)
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setEventType(value: String): Self = StObject.set(x, "eventType", value.asInstanceOf[js.Any])
    
    inline def setEventTypeUndefined: Self = StObject.set(x, "eventType", js.undefined)
  }
}
