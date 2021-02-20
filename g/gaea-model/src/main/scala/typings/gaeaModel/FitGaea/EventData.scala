package typings.gaeaModel.FitGaea

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventData extends StObject {
  
  var event: String = js.native
  
  var eventData: js.UndefOr[EventActionJumpUrl | EventActionCall | EventActionEvent] = js.native
  
  var eventIndex: Double = js.native
  
  var `type`: String = js.native
  
  var typeData: js.UndefOr[EventTriggerEvent] = js.native
  
  /**
    * 因为事件可能 type 相同，因此记录是第几个
    */
  var typeIndex: Double = js.native
}
object EventData {
  
  @scala.inline
  def apply(event: String, eventIndex: Double, `type`: String, typeIndex: Double): EventData = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], eventIndex = eventIndex.asInstanceOf[js.Any], typeIndex = typeIndex.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventData]
  }
  
  @scala.inline
  implicit class EventDataMutableBuilder[Self <: EventData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEvent(value: String): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventData(value: EventActionJumpUrl | EventActionCall | EventActionEvent): Self = StObject.set(x, "eventData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventDataUndefined: Self = StObject.set(x, "eventData", js.undefined)
    
    @scala.inline
    def setEventIndex(value: Double): Self = StObject.set(x, "eventIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeData(value: EventTriggerEvent): Self = StObject.set(x, "typeData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeDataUndefined: Self = StObject.set(x, "typeData", js.undefined)
    
    @scala.inline
    def setTypeIndex(value: Double): Self = StObject.set(x, "typeIndex", value.asInstanceOf[js.Any])
  }
}
