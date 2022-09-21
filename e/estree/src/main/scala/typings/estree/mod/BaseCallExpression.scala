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
  
  inline def apply(arguments: js.Array[Expression | SpreadElement], callee: Expression | Super, `type`: String): BaseCallExpression = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], callee = callee.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseCallExpression]
  }
  
  extension [Self <: BaseCallExpression](x: Self) {
    
    inline def setArguments(value: js.Array[Expression | SpreadElement]): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
    
    inline def setArgumentsVarargs(value: (Expression | SpreadElement)*): Self = StObject.set(x, "arguments", js.Array(value*))
    
    inline def setCallee(value: Expression | Super): Self = StObject.set(x, "callee", value.asInstanceOf[js.Any])
  }
}
