package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlDetectionRule extends StObject {
  
  var actions: js.UndefOr[js.Array[MlRuleAction]] = js.undefined
  
  var conditions: js.UndefOr[js.Array[MlRuleCondition]] = js.undefined
  
  var scope: js.UndefOr[Record[Field, MlFilterRef]] = js.undefined
}
object MlDetectionRule {
  
  inline def apply(): MlDetectionRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MlDetectionRule]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MlDetectionRule] (val x: Self) extends AnyVal {
    
    inline def setActions(value: js.Array[MlRuleAction]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    inline def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
    
    inline def setActionsVarargs(value: MlRuleAction*): Self = StObject.set(x, "actions", js.Array(value*))
    
    inline def setConditions(value: js.Array[MlRuleCondition]): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
    
    inline def setConditionsUndefined: Self = StObject.set(x, "conditions", js.undefined)
    
    inline def setConditionsVarargs(value: MlRuleCondition*): Self = StObject.set(x, "conditions", js.Array(value*))
    
    inline def setScope(value: Record[Field, MlFilterRef]): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
  }
}
