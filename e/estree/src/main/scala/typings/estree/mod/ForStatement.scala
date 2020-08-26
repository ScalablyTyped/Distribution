package typings.estree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ForStatement
  extends BaseNode
     with Statement {
  var body: Statement = js.native
  var init: js.UndefOr[VariableDeclaration | Expression | Null] = js.native
  var test: js.UndefOr[Expression | Null] = js.native
  @JSName("type")
  var type_ForStatement: typings.estree.estreeStrings.ForStatement = js.native
  var update: js.UndefOr[Expression | Null] = js.native
}

object ForStatement {
  @scala.inline
  def apply(body: Statement, `type`: typings.estree.estreeStrings.ForStatement): ForStatement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ForStatement]
  }
  @scala.inline
  implicit class ForStatementOps[Self <: ForStatement] (val x: Self) extends AnyVal {
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
    def setBody(value: Statement): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: typings.estree.estreeStrings.ForStatement): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setInit(value: VariableDeclaration | Expression): Self = this.set("init", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInit: Self = this.set("init", js.undefined)
    @scala.inline
    def setInitNull: Self = this.set("init", null)
    @scala.inline
    def setTest(value: Expression): Self = this.set("test", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTest: Self = this.set("test", js.undefined)
    @scala.inline
    def setTestNull: Self = this.set("test", null)
    @scala.inline
    def setUpdate(value: Expression): Self = this.set("update", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdate: Self = this.set("update", js.undefined)
    @scala.inline
    def setUpdateNull: Self = this.set("update", null)
  }
  
}

