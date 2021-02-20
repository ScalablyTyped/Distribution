package typings.estree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SequenceExpression
  extends BaseNode
     with Expression {
  
  var expressions: js.Array[Expression] = js.native
  
  @JSName("type")
  var type_SequenceExpression: typings.estree.estreeStrings.SequenceExpression = js.native
}
object SequenceExpression {
  
  @scala.inline
  def apply(expressions: js.Array[Expression], `type`: typings.estree.estreeStrings.SequenceExpression): SequenceExpression = {
    val __obj = js.Dynamic.literal(expressions = expressions.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SequenceExpression]
  }
  
  @scala.inline
  implicit class SequenceExpressionMutableBuilder[Self <: SequenceExpression] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpressions(value: js.Array[Expression]): Self = StObject.set(x, "expressions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpressionsVarargs(value: Expression*): Self = StObject.set(x, "expressions", js.Array(value :_*))
    
    @scala.inline
    def setType(value: typings.estree.estreeStrings.SequenceExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
