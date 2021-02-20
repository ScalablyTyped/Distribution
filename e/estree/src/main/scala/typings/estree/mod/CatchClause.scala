package typings.estree.mod

import org.scalablytyped.runtime.StObject
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
  implicit class CatchClauseMutableBuilder[Self <: CatchClause] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: BlockStatement): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParam(value: Pattern): Self = StObject.set(x, "param", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamNull: Self = StObject.set(x, "param", null)
    
    @scala.inline
    def setType(value: typings.estree.estreeStrings.CatchClause): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
