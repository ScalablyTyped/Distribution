package typings.estree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FunctionExpression
  extends BaseFunction
     with Expression
     with Function {
  @JSName("body")
  var body_FunctionExpression: BlockStatement = js.native
  var id: js.UndefOr[Identifier | Null] = js.native
  @JSName("type")
  var type_FunctionExpression: typings.estree.estreeStrings.FunctionExpression = js.native
}

object FunctionExpression {
  @scala.inline
  def apply(
    body: BlockStatement,
    params: js.Array[Pattern],
    `type`: typings.estree.estreeStrings.FunctionExpression
  ): FunctionExpression = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FunctionExpression]
  }
  @scala.inline
  implicit class FunctionExpressionOps[Self <: FunctionExpression] (val x: Self) extends AnyVal {
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
    def setBody(value: BlockStatement): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: typings.estree.estreeStrings.FunctionExpression): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: Identifier): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setIdNull: Self = this.set("id", null)
  }
  
}

