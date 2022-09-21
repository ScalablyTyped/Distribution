package typings.estree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SequenceExpression
  extends StObject
     with BaseNode {
  
  var expressions: js.Array[Expression]
  
  @JSName("type")
  var type_SequenceExpression: typings.estree.estreeStrings.SequenceExpression
}
object SequenceExpression {
  
  inline def apply(expressions: js.Array[Expression]): SequenceExpression = {
    val __obj = js.Dynamic.literal(expressions = expressions.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("SequenceExpression")
    __obj.asInstanceOf[SequenceExpression]
  }
  
  extension [Self <: SequenceExpression](x: Self) {
    
    inline def setExpressions(value: js.Array[Expression]): Self = StObject.set(x, "expressions", value.asInstanceOf[js.Any])
    
    inline def setExpressionsVarargs(value: Expression*): Self = StObject.set(x, "expressions", js.Array(value*))
    
    inline def setType(value: typings.estree.estreeStrings.SequenceExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
