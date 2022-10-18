package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlRuleCondition extends StObject {
  
  var applies_to: MlAppliesTo
  
  var operator: MlConditionOperator
  
  var value: double
}
object MlRuleCondition {
  
  inline def apply(applies_to: MlAppliesTo, operator: MlConditionOperator, value: double): MlRuleCondition = {
    val __obj = js.Dynamic.literal(applies_to = applies_to.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlRuleCondition]
  }
  
  extension [Self <: MlRuleCondition](x: Self) {
    
    inline def setApplies_to(value: MlAppliesTo): Self = StObject.set(x, "applies_to", value.asInstanceOf[js.Any])
    
    inline def setOperator(value: MlConditionOperator): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    inline def setValue(value: double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
