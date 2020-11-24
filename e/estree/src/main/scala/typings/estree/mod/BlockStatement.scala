package typings.estree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BlockStatement
  extends BaseNode
     with Statement {
  
  var body: js.Array[Statement] = js.native
  
  var innerComments: js.UndefOr[js.Array[Comment]] = js.native
  
  @JSName("type")
  var type_BlockStatement: typings.estree.estreeStrings.BlockStatement = js.native
}
object BlockStatement {
  
  @scala.inline
  def apply(body: js.Array[Statement], `type`: typings.estree.estreeStrings.BlockStatement): BlockStatement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockStatement]
  }
  
  @scala.inline
  implicit class BlockStatementOps[Self <: BlockStatement] (val x: Self) extends AnyVal {
    
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
    def setBodyVarargs(value: Statement*): Self = this.set("body", js.Array(value :_*))
    
    @scala.inline
    def setBody(value: js.Array[Statement]): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typings.estree.estreeStrings.BlockStatement): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInnerCommentsVarargs(value: Comment*): Self = this.set("innerComments", js.Array(value :_*))
    
    @scala.inline
    def setInnerComments(value: js.Array[Comment]): Self = this.set("innerComments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInnerComments: Self = this.set("innerComments", js.undefined)
  }
}
