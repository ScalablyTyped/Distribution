package typings.googleapis.alphaMod.computeAlpha

import typings.googleapis.anon.Code
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaForwardingRulesScopedList extends StObject {
  
  /**
    * A list of forwarding rules contained in this scope.
    */
  var forwardingRules: js.UndefOr[js.Array[SchemaForwardingRule]] = js.undefined
  
  /**
    * Informational warning which replaces the list of forwarding rules when the list is empty.
    */
  var warning: js.UndefOr[Code | Null] = js.undefined
}
object SchemaForwardingRulesScopedList {
  
  inline def apply(): SchemaForwardingRulesScopedList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaForwardingRulesScopedList]
  }
  
  extension [Self <: SchemaForwardingRulesScopedList](x: Self) {
    
    inline def setForwardingRules(value: js.Array[SchemaForwardingRule]): Self = StObject.set(x, "forwardingRules", value.asInstanceOf[js.Any])
    
    inline def setForwardingRulesUndefined: Self = StObject.set(x, "forwardingRules", js.undefined)
    
    inline def setForwardingRulesVarargs(value: SchemaForwardingRule*): Self = StObject.set(x, "forwardingRules", js.Array(value*))
    
    inline def setWarning(value: Code): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
    
    inline def setWarningNull: Self = StObject.set(x, "warning", null)
    
    inline def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
  }
}
