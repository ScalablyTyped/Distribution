package typings.devtoolsProtocol.mod.Protocol.Preload

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RuleSetRemovedEvent extends StObject {
  
  var id: RuleSetId
}
object RuleSetRemovedEvent {
  
  inline def apply(id: RuleSetId): RuleSetRemovedEvent = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleSetRemovedEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RuleSetRemovedEvent] (val x: Self) extends AnyVal {
    
    inline def setId(value: RuleSetId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
