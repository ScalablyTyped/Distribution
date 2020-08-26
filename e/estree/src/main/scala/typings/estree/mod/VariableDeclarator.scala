package typings.estree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VariableDeclarator
  extends BaseNode
     with Node {
  var id: Pattern = js.native
  var init: js.UndefOr[Expression | Null] = js.native
  @JSName("type")
  var type_VariableDeclarator: typings.estree.estreeStrings.VariableDeclarator = js.native
}

object VariableDeclarator {
  @scala.inline
  def apply(id: Pattern, `type`: typings.estree.estreeStrings.VariableDeclarator): VariableDeclarator = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[VariableDeclarator]
  }
  @scala.inline
  implicit class VariableDeclaratorOps[Self <: VariableDeclarator] (val x: Self) extends AnyVal {
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
    def setId(value: Pattern): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: typings.estree.estreeStrings.VariableDeclarator): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setInit(value: Expression): Self = this.set("init", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInit: Self = this.set("init", js.undefined)
    @scala.inline
    def setInitNull: Self = this.set("init", null)
  }
  
}

