package typings.estree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IfStatement
  extends BaseNode
     with Statement {
  var alternate: js.UndefOr[Statement | Null] = js.native
  var consequent: Statement = js.native
  var test: Expression = js.native
  @JSName("type")
  var type_IfStatement: typings.estree.estreeStrings.IfStatement = js.native
}

object IfStatement {
  @scala.inline
  def apply(consequent: Statement, test: Expression, `type`: typings.estree.estreeStrings.IfStatement): IfStatement = {
    val __obj = js.Dynamic.literal(consequent = consequent.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IfStatement]
  }
  @scala.inline
  implicit class IfStatementOps[Self <: IfStatement] (val x: Self) extends AnyVal {
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
    def setConsequent(value: Statement): Self = this.set("consequent", value.asInstanceOf[js.Any])
    @scala.inline
    def setTest(value: Expression): Self = this.set("test", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: typings.estree.estreeStrings.IfStatement): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setAlternate(value: Statement): Self = this.set("alternate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlternate: Self = this.set("alternate", js.undefined)
    @scala.inline
    def setAlternateNull: Self = this.set("alternate", null)
  }
  
}

