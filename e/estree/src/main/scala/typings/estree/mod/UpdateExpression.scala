package typings.estree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateExpression
  extends BaseNode
     with Expression {
  var argument: Expression = js.native
  var operator: UpdateOperator = js.native
  var prefix: Boolean = js.native
  @JSName("type")
  var type_UpdateExpression: typings.estree.estreeStrings.UpdateExpression = js.native
}

object UpdateExpression {
  @scala.inline
  def apply(
    argument: Expression,
    operator: UpdateOperator,
    prefix: Boolean,
    `type`: typings.estree.estreeStrings.UpdateExpression
  ): UpdateExpression = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateExpression]
  }
  @scala.inline
  implicit class UpdateExpressionOps[Self <: UpdateExpression] (val x: Self) extends AnyVal {
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
    def setOperator(value: UpdateOperator): Self = this.set("operator", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrefix(value: Boolean): Self = this.set("prefix", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: typings.estree.estreeStrings.UpdateExpression): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

