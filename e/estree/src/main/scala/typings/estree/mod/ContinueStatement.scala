package typings.estree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContinueStatement
  extends BaseNode
     with Statement {
  
  var label: js.UndefOr[Identifier | Null] = js.native
  
  @JSName("type")
  var type_ContinueStatement: typings.estree.estreeStrings.ContinueStatement = js.native
}
object ContinueStatement {
  
  @scala.inline
  def apply(`type`: typings.estree.estreeStrings.ContinueStatement): ContinueStatement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContinueStatement]
  }
  
  @scala.inline
  implicit class ContinueStatementOps[Self <: ContinueStatement] (val x: Self) extends AnyVal {
    
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
    def setType(value: typings.estree.estreeStrings.ContinueStatement): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: Identifier): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    
    @scala.inline
    def setLabelNull: Self = this.set("label", null)
  }
}
