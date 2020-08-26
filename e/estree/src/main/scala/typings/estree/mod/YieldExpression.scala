package typings.estree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait YieldExpression
  extends BaseNode
     with Expression {
  var argument: js.UndefOr[Expression | Null] = js.native
  var delegate: Boolean = js.native
  @JSName("type")
  var type_YieldExpression: typings.estree.estreeStrings.YieldExpression = js.native
}

object YieldExpression {
  @scala.inline
  def apply(delegate: Boolean, `type`: typings.estree.estreeStrings.YieldExpression): YieldExpression = {
    val __obj = js.Dynamic.literal(delegate = delegate.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[YieldExpression]
  }
  @scala.inline
  implicit class YieldExpressionOps[Self <: YieldExpression] (val x: Self) extends AnyVal {
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
    def setDelegate(value: Boolean): Self = this.set("delegate", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: typings.estree.estreeStrings.YieldExpression): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setArgument(value: Expression): Self = this.set("argument", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArgument: Self = this.set("argument", js.undefined)
    @scala.inline
    def setArgumentNull: Self = this.set("argument", null)
  }
  
}

