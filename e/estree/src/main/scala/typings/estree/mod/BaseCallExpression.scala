package typings.estree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseCallExpression
  extends StObject
     with BaseNode {
  
  var arguments: js.Array[Expression | SpreadElement]
  
  var callee: Expression | Super
}
object BaseCallExpression {
  
  @scala.inline
  def apply(arguments: js.Array[Expression | SpreadElement], callee: Expression | Super, `type`: String): BaseCallExpression = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], callee = callee.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseCallExpression]
  }
  
  @scala.inline
  implicit class BaseCallExpressionMutableBuilder[Self <: BaseCallExpression] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArguments(value: js.Array[Expression | SpreadElement]): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgumentsVarargs(value: (Expression | SpreadElement)*): Self = StObject.set(x, "arguments", js.Array(value :_*))
    
    @scala.inline
    def setCallee(value: Expression | Super): Self = StObject.set(x, "callee", value.asInstanceOf[js.Any])
  }
}
