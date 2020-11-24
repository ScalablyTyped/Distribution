package typings.estree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TryStatement
  extends BaseNode
     with Statement {
  
  var block: BlockStatement = js.native
  
  var finalizer: js.UndefOr[BlockStatement | Null] = js.native
  
  var handler: js.UndefOr[CatchClause | Null] = js.native
  
  @JSName("type")
  var type_TryStatement: typings.estree.estreeStrings.TryStatement = js.native
}
object TryStatement {
  
  @scala.inline
  def apply(block: BlockStatement, `type`: typings.estree.estreeStrings.TryStatement): TryStatement = {
    val __obj = js.Dynamic.literal(block = block.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TryStatement]
  }
  
  @scala.inline
  implicit class TryStatementOps[Self <: TryStatement] (val x: Self) extends AnyVal {
    
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
    def setBlock(value: BlockStatement): Self = this.set("block", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typings.estree.estreeStrings.TryStatement): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFinalizer(value: BlockStatement): Self = this.set("finalizer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFinalizer: Self = this.set("finalizer", js.undefined)
    
    @scala.inline
    def setFinalizerNull: Self = this.set("finalizer", null)
    
    @scala.inline
    def setHandler(value: CatchClause): Self = this.set("handler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHandler: Self = this.set("handler", js.undefined)
    
    @scala.inline
    def setHandlerNull: Self = this.set("handler", null)
  }
}
