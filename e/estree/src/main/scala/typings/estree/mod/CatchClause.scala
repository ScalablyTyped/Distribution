package typings.estree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CatchClause
  extends BaseNode
     with Node {
  
  var body: BlockStatement = js.native
  
  var param: Pattern | Null = js.native
  
  @JSName("type")
  var type_CatchClause: typings.estree.estreeStrings.CatchClause = js.native
}
object CatchClause {
  
  @scala.inline
  def apply(body: BlockStatement, `type`: typings.estree.estreeStrings.CatchClause): CatchClause = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CatchClause]
  }
  
  @scala.inline
  implicit class CatchClauseOps[Self <: CatchClause] (val x: Self) extends AnyVal {
    
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
    def setBody(value: BlockStatement): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typings.estree.estreeStrings.CatchClause): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParam(value: Pattern): Self = this.set("param", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamNull: Self = this.set("param", null)
  }
}
