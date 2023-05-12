package typings.fullcalendarCore.internalCommonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventTuple extends StObject {
  
  var `def`: EventDef
  
  var instance: EventInstance | Null
}
object EventTuple {
  
  inline def apply(`def`: EventDef): EventTuple = {
    val __obj = js.Dynamic.literal(instance = null)
    __obj.updateDynamic("def")(`def`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventTuple]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EventTuple] (val x: Self) extends AnyVal {
    
    inline def setDef(value: EventDef): Self = StObject.set(x, "def", value.asInstanceOf[js.Any])
    
    inline def setInstance(value: EventInstance): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
    
    inline def setInstanceNull: Self = StObject.set(x, "instance", null)
  }
}
