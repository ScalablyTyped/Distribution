package typings.estree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LogicalExpression
  extends StObject
     with BaseNode
     with Expression {
  
  var left: Expression
  
  var operator: LogicalOperator
  
  var right: Expression
  
  @JSName("type")
  var type_LogicalExpression: typings.estree.estreeStrings.LogicalExpression
}
object LogicalExpression {
  
  inline def apply(left: Expression, operator: LogicalOperator, right: Expression): LogicalExpression = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("LogicalExpression")
    __obj.asInstanceOf[LogicalExpression]
  }
  
  extension [Self <: LogicalExpression](x: Self) {
    
    inline def setLeft(value: Expression): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setOperator(value: LogicalOperator): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    inline def setRight(value: Expression): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.estree.estreeStrings.LogicalExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
