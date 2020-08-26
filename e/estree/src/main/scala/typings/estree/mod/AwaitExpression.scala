package typings.estree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AwaitExpression
  extends BaseNode
     with Expression {
  var argument: Expression = js.native
  @JSName("type")
  var type_AwaitExpression: typings.estree.estreeStrings.AwaitExpression = js.native
}

object AwaitExpression {
  @scala.inline
  def apply(argument: Expression, `type`: typings.estree.estreeStrings.AwaitExpression): AwaitExpression = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AwaitExpression]
  }
  @scala.inline
  implicit class AwaitExpressionOps[Self <: AwaitExpression] (val x: Self) extends AnyVal {
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
    def setType(value: typings.estree.estreeStrings.AwaitExpression): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

