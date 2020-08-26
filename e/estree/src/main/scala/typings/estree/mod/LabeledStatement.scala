package typings.estree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LabeledStatement
  extends BaseNode
     with Statement {
  var body: Statement = js.native
  var label: Identifier = js.native
  @JSName("type")
  var type_LabeledStatement: typings.estree.estreeStrings.LabeledStatement = js.native
}

object LabeledStatement {
  @scala.inline
  def apply(body: Statement, label: Identifier, `type`: typings.estree.estreeStrings.LabeledStatement): LabeledStatement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabeledStatement]
  }
  @scala.inline
  implicit class LabeledStatementOps[Self <: LabeledStatement] (val x: Self) extends AnyVal {
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
    def setLabel(value: Identifier): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: typings.estree.estreeStrings.LabeledStatement): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

