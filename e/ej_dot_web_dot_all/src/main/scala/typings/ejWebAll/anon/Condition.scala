package typings.ejWebAll.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Condition extends StObject {
  
  var condition: String
  
  var field: String
  
  var ignoreCase: Boolean
  
  var isComplex: Boolean
  
  var operator: String
  
  var predicates: js.Any
  
  var value: js.Any
}
object Condition {
  
  @scala.inline
  def apply(
    condition: String,
    field: String,
    ignoreCase: Boolean,
    isComplex: Boolean,
    operator: String,
    predicates: js.Any,
    value: js.Any
  ): Condition = {
    val __obj = js.Dynamic.literal(condition = condition.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any], ignoreCase = ignoreCase.asInstanceOf[js.Any], isComplex = isComplex.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], predicates = predicates.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Condition]
  }
  
  @scala.inline
  implicit class ConditionMutableBuilder[Self <: Condition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCondition(value: String): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoreCase(value: Boolean): Self = StObject.set(x, "ignoreCase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsComplex(value: Boolean): Self = StObject.set(x, "isComplex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperator(value: String): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPredicates(value: js.Any): Self = StObject.set(x, "predicates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
