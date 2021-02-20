package typings.estreeJsx.mod

import typings.estree.mod.BaseNode
import typings.estree.mod.Expression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JSXSpreadChild extends BaseNode {
  
  var expression: Expression = js.native
  
  @JSName("type")
  var type_JSXSpreadChild: typings.estreeJsx.estreeJsxStrings.JSXSpreadChild = js.native
}
object JSXSpreadChild {
  
  @scala.inline
  def apply(expression: Expression, `type`: typings.estreeJsx.estreeJsxStrings.JSXSpreadChild): JSXSpreadChild = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
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
