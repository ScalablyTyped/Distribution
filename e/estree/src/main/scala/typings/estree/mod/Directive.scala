package typings.estree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Directive extends BaseNode {
  
  var directive: String = js.native
  
  var expression: Literal = js.native
  
  @JSName("type")
  var type_Directive: typings.estree.estreeStrings.ExpressionStatement = js.native
}
object Directive {
  
  @scala.inline
  def apply(directive: String, expression: Literal, `type`: typings.estree.estreeStrings.ExpressionStatement): Directive = {
    val __obj = js.Dynamic.literal(directive = directive.asInstanceOf[js.Any], expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Directive]
  }
  
  @scala.inline
  implicit class DirectiveOps[Self <: Directive] (val x: Self) extends AnyVal {
    
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
    def setDirective(value: String): Self = this.set("directive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpression(value: Literal): Self = this.set("expression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typings.estree.estreeStrings.ExpressionStatement): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
