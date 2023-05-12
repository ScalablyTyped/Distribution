package typings.fullcalendarCore.internalCommonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventStore
  extends StObject
     with _Constraint {
  
  var defs: EventDefHash
  
  var instances: EventInstanceHash
}
object EventStore {
  
  inline def apply(defs: EventDefHash, instances: EventInstanceHash): EventStore = {
    val __obj = js.Dynamic.literal(defs = defs.asInstanceOf[js.Any], instances = instances.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventStore]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EventStore] (val x: Self) extends AnyVal {
    
    inline def setDefs(value: EventDefHash): Self = StObject.set(x, "defs", value.asInstanceOf[js.Any])
    
    inline def setInstances(value: EventInstanceHash): Self = StObject.set(x, "instances", value.asInstanceOf[js.Any])
  }
}
