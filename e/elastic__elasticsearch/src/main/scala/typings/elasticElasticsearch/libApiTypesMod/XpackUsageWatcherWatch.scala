package typings.elasticElasticsearch.libApiTypesMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XpackUsageWatcherWatch extends StObject {
  
  var action: js.UndefOr[Record[Name, XpackUsageCounter]] = js.undefined
  
  var condition: js.UndefOr[Record[Name, XpackUsageCounter]] = js.undefined
  
  var input: Record[Name, XpackUsageCounter]
  
  var trigger: XpackUsageWatcherWatchTrigger
}
object XpackUsageWatcherWatch {
  
  inline def apply(input: Record[Name, XpackUsageCounter], trigger: XpackUsageWatcherWatchTrigger): XpackUsageWatcherWatch = {
    val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any], trigger = trigger.asInstanceOf[js.Any])
    __obj.asInstanceOf[XpackUsageWatcherWatch]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XpackUsageWatcherWatch] (val x: Self) extends AnyVal {
    
    inline def setAction(value: Record[Name, XpackUsageCounter]): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setCondition(value: Record[Name, XpackUsageCounter]): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    inline def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
    
    inline def setInput(value: Record[Name, XpackUsageCounter]): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    inline def setTrigger(value: XpackUsageWatcherWatchTrigger): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
  }
}
