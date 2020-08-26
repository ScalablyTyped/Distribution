package typings.estree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArrowFunctionExpression
  extends BaseFunction
     with Expression
     with Function {
  var expression: Boolean = js.native
  @JSName("type")
  var type_ArrowFunctionExpression: typings.estree.estreeStrings.ArrowFunctionExpression = js.native
}

object ArrowFunctionExpression {
  @scala.inline
  def apply(
    body: BlockStatement | Expression,
    expression: Boolean,
    params: js.Array[Pattern],
    `type`: typings.estree.estreeStrings.ArrowFunctionExpression
  ): ArrowFunctionExpression = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], expression = expression.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrowFunctionExpression]
  }
  @scala.inline
  implicit class ArrowFunctionExpressionOps[Self <: ArrowFunctionExpression] (val x: Self) extends AnyVal {
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
    def setExpression(value: Boolean): Self = this.set("expression", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: typings.estree.estreeStrings.ArrowFunctionExpression): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

