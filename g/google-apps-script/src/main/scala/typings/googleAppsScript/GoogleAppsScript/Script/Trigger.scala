package typings.googleAppsScript.GoogleAppsScript.Script

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A script trigger.
  */
@js.native
trait Trigger extends StObject {
  
  def getEventType(): EventType = js.native
  
  def getHandlerFunction(): String = js.native
  
  def getTriggerSource(): TriggerSource = js.native
  
  def getTriggerSourceId(): String = js.native
  
  def getUniqueId(): String = js.native
}
object Trigger {
  
  @scala.inline
  def apply(
    getEventType: () => EventType,
    getHandlerFunction: () => String,
    getTriggerSource: () => TriggerSource,
    getTriggerSourceId: () => String,
    getUniqueId: () => String
  ): Trigger = {
    val __obj = js.Dynamic.literal(getEventType = js.Any.fromFunction0(getEventType), getHandlerFunction = js.Any.fromFunction0(getHandlerFunction), getTriggerSource = js.Any.fromFunction0(getTriggerSource), getTriggerSourceId = js.Any.fromFunction0(getTriggerSourceId), getUniqueId = js.Any.fromFunction0(getUniqueId))
    __obj.asInstanceOf[Trigger]
  }
  
  @scala.inline
  implicit class TriggerMutableBuilder[Self <: Trigger] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetEventType(value: () => EventType): Self = StObject.set(x, "getEventType", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetHandlerFunction(value: () => String): Self = StObject.set(x, "getHandlerFunction", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTriggerSource(value: () => TriggerSource): Self = StObject.set(x, "getTriggerSource", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTriggerSourceId(value: () => String): Self = StObject.set(x, "getTriggerSourceId", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetUniqueId(value: () => String): Self = StObject.set(x, "getUniqueId", js.Any.fromFunction0(value))
  }
}
