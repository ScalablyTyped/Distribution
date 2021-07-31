package typings.estree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateExpression
  extends StObject
     with BaseNode
     with Expression {
  
  var argument: Expression
  
  var operator: UpdateOperator
  
  var prefix: Boolean
  
  @JSName("type")
  var type_UpdateExpression: typings.estree.estreeStrings.UpdateExpression
}
object UpdateExpression {
  
  @scala.inline
  def apply(argument: Expression, operator: UpdateOperator, prefix: Boolean): UpdateExpression = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("UpdateExpression")
    __obj.asInstanceOf[UpdateExpression]
  }
  
  @scala.inline
  implicit class UpdateExpressionMutableBuilder[Self <: UpdateExpression] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArgument(value: Expression): Self = StObject.set(x, "argument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperator(value: UpdateOperator): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefix(value: Boolean): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typings.estree.estreeStrings.UpdateExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
