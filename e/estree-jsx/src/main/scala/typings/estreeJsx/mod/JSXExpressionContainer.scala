package typings.estreeJsx.mod

import typings.estree.mod.BaseNode
import typings.estree.mod.Expression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JSXExpressionContainer
  extends StObject
     with BaseNode
     with _Node {
  
  var expression: Expression | JSXEmptyExpression
  
  @JSName("type")
  var type_JSXExpressionContainer: typings.estreeJsx.estreeJsxStrings.JSXExpressionContainer
}
object JSXExpressionContainer {
  
  inline def apply(expression: Expression | JSXEmptyExpression): JSXExpressionContainer = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JSXExpressionContainer")
    __obj.asInstanceOf[JSXExpressionContainer]
  }
  
  extension [Self <: JSXExpressionContainer](x: Self) {
    
    inline def setExpression(value: Expression | JSXEmptyExpression): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.estreeJsx.estreeJsxStrings.JSXExpressionContainer): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
