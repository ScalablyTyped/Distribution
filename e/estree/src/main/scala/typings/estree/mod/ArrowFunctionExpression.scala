package typings.estree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArrowFunctionExpression
  extends StObject
     with BaseFunction
     with Expression
     with Function {
  
  var expression: Boolean
  
  @JSName("type")
  var type_ArrowFunctionExpression: typings.estree.estreeStrings.ArrowFunctionExpression
}
object ArrowFunctionExpression {
  
  inline def apply(body: BlockStatement | Expression, expression: Boolean, params: js.Array[Pattern]): ArrowFunctionExpression = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], expression = expression.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ArrowFunctionExpression")
    __obj.asInstanceOf[ArrowFunctionExpression]
  }
  
  extension [Self <: ArrowFunctionExpression](x: Self) {
    
    inline def setExpression(value: Boolean): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.estree.estreeStrings.ArrowFunctionExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
