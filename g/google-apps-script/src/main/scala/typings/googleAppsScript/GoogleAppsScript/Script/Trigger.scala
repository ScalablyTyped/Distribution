package typings.googleAppsScript.GoogleAppsScript.Script

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A script trigger.
  */
trait Trigger extends StObject {
  
  def getEventType(): EventType
  
  def getHandlerFunction(): String
  
  def getTriggerSource(): TriggerSource
  
  def getTriggerSourceId(): String
  
  def getUniqueId(): String
}
object Trigger {
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: Trigger] (val x: Self) extends AnyVal {
    
    inline def setGetEventType(value: () => EventType): Self = StObject.set(x, "getEventType", js.Any.fromFunction0(value))
    
    inline def setGetHandlerFunction(value: () => String): Self = StObject.set(x, "getHandlerFunction", js.Any.fromFunction0(value))
    
    inline def setGetTriggerSource(value: () => TriggerSource): Self = StObject.set(x, "getTriggerSource", js.Any.fromFunction0(value))
    
    inline def setGetTriggerSourceId(value: () => String): Self = StObject.set(x, "getTriggerSourceId", js.Any.fromFunction0(value))
    
    inline def setGetUniqueId(value: () => String): Self = StObject.set(x, "getUniqueId", js.Any.fromFunction0(value))
  }
}
