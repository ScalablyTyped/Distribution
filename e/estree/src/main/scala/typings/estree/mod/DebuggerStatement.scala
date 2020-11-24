package typings.estree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DebuggerStatement
  extends BaseNode
     with Statement {
  
  @JSName("type")
  var type_DebuggerStatement: typings.estree.estreeStrings.DebuggerStatement = js.native
}
object DebuggerStatement {
  
  @scala.inline
  def apply(`type`: typings.estree.estreeStrings.DebuggerStatement): DebuggerStatement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DebuggerStatement]
  }
  
  @scala.inline
  implicit class DebuggerStatementOps[Self <: DebuggerStatement] (val x: Self) extends AnyVal {
    
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
    def setType(value: typings.estree.estreeStrings.DebuggerStatement): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
