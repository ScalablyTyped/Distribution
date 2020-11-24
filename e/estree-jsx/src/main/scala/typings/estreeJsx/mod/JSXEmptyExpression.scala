package typings.estreeJsx.mod

import typings.estree.mod.BaseNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JSXEmptyExpression
  extends BaseNode
     with _Node {
  
  @JSName("type")
  var type_JSXEmptyExpression: typings.estreeJsx.estreeJsxStrings.JSXEmptyExpression = js.native
}
object JSXEmptyExpression {
  
  @scala.inline
  def apply(`type`: typings.estreeJsx.estreeJsxStrings.JSXEmptyExpression): JSXEmptyExpression = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSXEmptyExpression]
  }
  
  @scala.inline
  implicit class JSXEmptyExpressionOps[Self <: JSXEmptyExpression] (val x: Self) extends AnyVal {
    
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
    def setType(value: typings.estreeJsx.estreeJsxStrings.JSXEmptyExpression): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
