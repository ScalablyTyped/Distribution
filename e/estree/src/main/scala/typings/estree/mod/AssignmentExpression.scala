package typings.estree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssignmentExpression
  extends StObject
     with BaseNode
     with Expression {
  
  var left: Pattern | MemberExpression
  
  var operator: AssignmentOperator
  
  var right: Expression
  
  @JSName("type")
  var type_AssignmentExpression: typings.estree.estreeStrings.AssignmentExpression
}
object AssignmentExpression {
  
  inline def apply(left: Pattern | MemberExpression, operator: AssignmentOperator, right: Expression): AssignmentExpression = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("AssignmentExpression")
    __obj.asInstanceOf[AssignmentExpression]
  }
  
  extension [Self <: AssignmentExpression](x: Self) {
    
    inline def setLeft(value: Pattern | MemberExpression): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setOperator(value: AssignmentOperator): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    inline def setRight(value: Expression): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.estree.estreeStrings.AssignmentExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
