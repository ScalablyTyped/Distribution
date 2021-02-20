package typings.estree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExpressionStatement
  extends BaseNode
     with Statement {
  
  var expression: Expression = js.native
  
  @JSName("type")
  var type_ExpressionStatement: typings.estree.estreeStrings.ExpressionStatement = js.native
}
object ExpressionStatement {
  
  @scala.inline
  def apply(expression: Expression, `type`: typings.estree.estreeStrings.ExpressionStatement): ExpressionStatement = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpressionStatement]
  }
  
  @scala.inline
  implicit class ExpressionStatementMutableBuilder[Self <: ExpressionStatement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpression(value: Expression): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typings.estree.estreeStrings.ExpressionStatement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
