package typings.estreeJsx.mod

import typings.estree.mod.BaseNode
import typings.estree.mod.Expression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JSXSpreadChild
  extends StObject
     with BaseNode {
  
  var expression: Expression
  
  @JSName("type")
  var type_JSXSpreadChild: typings.estreeJsx.estreeJsxStrings.JSXSpreadChild
}
object JSXSpreadChild {
  
  inline def apply(expression: Expression): JSXSpreadChild = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JSXSpreadChild")
    __obj.asInstanceOf[JSXSpreadChild]
  }
  
  extension [Self <: JSXSpreadChild](x: Self) {
    
    inline def setExpression(value: Expression): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.estreeJsx.estreeJsxStrings.JSXSpreadChild): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
