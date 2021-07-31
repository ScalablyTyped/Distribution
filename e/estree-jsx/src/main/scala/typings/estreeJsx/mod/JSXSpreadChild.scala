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
  
  @scala.inline
  def apply(expression: Expression): JSXSpreadChild = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JSXSpreadChild")
    __obj.asInstanceOf[JSXSpreadChild]
  }
  
  @scala.inline
  implicit class JSXSpreadChildMutableBuilder[Self <: JSXSpreadChild] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpression(value: Expression): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typings.estreeJsx.estreeJsxStrings.JSXSpreadChild): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
