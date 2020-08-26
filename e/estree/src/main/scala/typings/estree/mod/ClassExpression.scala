package typings.estree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClassExpression
  extends BaseClass
     with Class
     with Expression {
  var id: js.UndefOr[Identifier | Null] = js.native
  @JSName("type")
  var type_ClassExpression: typings.estree.estreeStrings.ClassExpression = js.native
}

object ClassExpression {
  @scala.inline
  def apply(body: ClassBody, `type`: typings.estree.estreeStrings.ClassExpression): ClassExpression = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassExpression]
  }
  @scala.inline
  implicit class ClassExpressionOps[Self <: ClassExpression] (val x: Self) extends AnyVal {
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
    def setType(value: typings.estree.estreeStrings.ClassExpression): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: Identifier): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setIdNull: Self = this.set("id", null)
  }
  
}

