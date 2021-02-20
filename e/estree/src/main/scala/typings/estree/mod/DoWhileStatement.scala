package typings.estree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DoWhileStatement
  extends BaseNode
     with Statement {
  
  var body: Statement = js.native
  
  var test: Expression = js.native
  
  @JSName("type")
  var type_DoWhileStatement: typings.estree.estreeStrings.DoWhileStatement = js.native
}
object DoWhileStatement {
  
  @scala.inline
  def apply(body: Statement, test: Expression, `type`: typings.estree.estreeStrings.DoWhileStatement): DoWhileStatement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DoWhileStatement]
  }
  
  @scala.inline
  implicit class DoWhileStatementMutableBuilder[Self <: DoWhileStatement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: Statement): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTest(value: Expression): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typings.estree.estreeStrings.DoWhileStatement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
