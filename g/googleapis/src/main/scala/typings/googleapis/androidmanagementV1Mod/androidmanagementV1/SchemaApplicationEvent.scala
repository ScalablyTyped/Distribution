package typings.googleapis.androidmanagementV1Mod.androidmanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An app-related event.
  */
trait SchemaApplicationEvent extends StObject {
  
  /**
    * The creation time of the event.
    */
  var createTime: js.UndefOr[String] = js.undefined
  
  /**
    * App event type.
    */
  var eventType: js.UndefOr[String] = js.undefined
}
object SchemaApplicationEvent {
  
  @scala.inline
  def apply(): SchemaApplicationEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaApplicationEvent]
  }
  
  @scala.inline
  implicit class SchemaApplicationEventMutableBuilder[Self <: SchemaApplicationEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    @scala.inline
    def setEventType(value: String): Self = StObject.set(x, "eventType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventTypeUndefined: Self = StObject.set(x, "eventType", js.undefined)
  }
}
