package typings.googleapis.androidmanagementV1Mod.androidmanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaApplicationEvent extends StObject {
  
  /**
    * The creation time of the event.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * App event type.
    */
  var eventType: js.UndefOr[String | Null] = js.undefined
}
object SchemaApplicationEvent {
  
  inline def apply(): SchemaApplicationEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaApplicationEvent]
  }
  
  extension [Self <: SchemaApplicationEvent](x: Self) {
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setEventType(value: String): Self = StObject.set(x, "eventType", value.asInstanceOf[js.Any])
    
    inline def setEventTypeNull: Self = StObject.set(x, "eventType", null)
    
    inline def setEventTypeUndefined: Self = StObject.set(x, "eventType", js.undefined)
  }
}
