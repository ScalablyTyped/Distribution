package typings.estree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TemplateLiteral
  extends BaseNode
     with Expression {
  var expressions: js.Array[Expression] = js.native
  var quasis: js.Array[TemplateElement] = js.native
  @JSName("type")
  var type_TemplateLiteral: typings.estree.estreeStrings.TemplateLiteral = js.native
}

object TemplateLiteral {
  @scala.inline
  def apply(
    expressions: js.Array[Expression],
    quasis: js.Array[TemplateElement],
    `type`: typings.estree.estreeStrings.TemplateLiteral
  ): TemplateLiteral = {
    val __obj = js.Dynamic.literal(expressions = expressions.asInstanceOf[js.Any], quasis = quasis.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TemplateLiteral]
  }
  @scala.inline
  implicit class TemplateLiteralOps[Self <: TemplateLiteral] (val x: Self) extends AnyVal {
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
    def setExpressionsVarargs(value: Expression*): Self = this.set("expressions", js.Array(value :_*))
    @scala.inline
    def setExpressions(value: js.Array[Expression]): Self = this.set("expressions", value.asInstanceOf[js.Any])
    @scala.inline
    def setQuasisVarargs(value: TemplateElement*): Self = this.set("quasis", js.Array(value :_*))
    @scala.inline
    def setQuasis(value: js.Array[TemplateElement]): Self = this.set("quasis", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: typings.estree.estreeStrings.TemplateLiteral): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

