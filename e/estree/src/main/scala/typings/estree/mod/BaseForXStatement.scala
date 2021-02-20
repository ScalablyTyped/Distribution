package typings.estree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseForXStatement extends BaseNode {
  
  var body: Statement = js.native
  
  var left: VariableDeclaration | Pattern = js.native
  
  var right: Expression = js.native
}
object BaseForXStatement {
  
  @scala.inline
  def apply(body: Statement, left: VariableDeclaration | Pattern, right: Expression, `type`: String): BaseForXStatement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseForXStatement]
  }
  
  @scala.inline
  implicit class BaseForXStatementMutableBuilder[Self <: BaseForXStatement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: Statement): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeft(value: VariableDeclaration | Pattern): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRight(value: Expression): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
  }
}
