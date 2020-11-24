package typings.estree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EmptyStatement
  extends BaseNode
     with Statement {
  
  @JSName("type")
  var type_EmptyStatement: typings.estree.estreeStrings.EmptyStatement = js.native
}
object EmptyStatement {
  
  @scala.inline
  def apply(`type`: typings.estree.estreeStrings.EmptyStatement): EmptyStatement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmptyStatement]
  }
  
  @scala.inline
  implicit class EmptyStatementOps[Self <: EmptyStatement] (val x: Self) extends AnyVal {
    
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
    def setType(value: typings.estree.estreeStrings.EmptyStatement): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
