package typings.devtoolsProtocol.mod.Protocol.Preload

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RuleSetUpdatedEvent extends StObject {
  
  var ruleSet: RuleSet
}
object RuleSetUpdatedEvent {
  
  inline def apply(ruleSet: RuleSet): RuleSetUpdatedEvent = {
    val __obj = js.Dynamic.literal(ruleSet = ruleSet.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleSetUpdatedEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RuleSetUpdatedEvent] (val x: Self) extends AnyVal {
    
    inline def setRuleSet(value: RuleSet): Self = StObject.set(x, "ruleSet", value.asInstanceOf[js.Any])
  }
}
