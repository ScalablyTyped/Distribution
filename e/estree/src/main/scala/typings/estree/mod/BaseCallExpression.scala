package typings.estree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseCallExpression extends BaseNode {
  
  var arguments: js.Array[Expression | SpreadElement] = js.native
  
  var callee: Expression | Super = js.native
}
object BaseCallExpression {
  
  @scala.inline
  def apply(arguments: js.Array[Expression | SpreadElement], callee: Expression | Super, `type`: String): BaseCallExpression = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], callee = callee.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseCallExpression]
  }
  
  @scala.inline
  implicit class BaseCallExpressionOps[Self <: BaseCallExpression] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setArgumentsVarargs(value: (Expression | SpreadElement)*): Self = this.set("arguments", js.Array(value :_*))
    
    @scala.inline
    def setArguments(value: js.Array[Expression | SpreadElement]): Self = this.set("arguments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCallee(value: Expression | Super): Self = this.set("callee", value.asInstanceOf[js.Any])
  }
}
