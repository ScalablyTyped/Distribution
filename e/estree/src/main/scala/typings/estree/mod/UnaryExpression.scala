package typings.estree.mod

import typings.estree.estreeBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnaryExpression
  extends BaseNode
     with Expression {
  var argument: Expression = js.native
  var operator: UnaryOperator = js.native
  var prefix: `true` = js.native
  @JSName("type")
  var type_UnaryExpression: typings.estree.estreeStrings.UnaryExpression = js.native
}

object UnaryExpression {
  @scala.inline
  def apply(
    argument: Expression,
    operator: UnaryOperator,
    prefix: `true`,
    `type`: typings.estree.estreeStrings.UnaryExpression
  ): UnaryExpression = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnaryExpression]
  }
  @scala.inline
  implicit class UnaryExpressionOps[Self <: UnaryExpression] (val x: Self) extends AnyVal {
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
    def setArgument(value: Expression): Self = this.set("argument", value.asInstanceOf[js.Any])
    @scala.inline
    def setOperator(value: UnaryOperator): Self = this.set("operator", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrefix(value: `true`): Self = this.set("prefix", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: typings.estree.estreeStrings.UnaryExpression): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

