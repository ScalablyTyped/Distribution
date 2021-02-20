package typings.estree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArrowFunctionExpression
  extends BaseFunction
     with Expression
     with Function {
  
  var expression: Boolean = js.native
  
  @JSName("type")
  var type_ArrowFunctionExpression: typings.estree.estreeStrings.ArrowFunctionExpression = js.native
}
object ArrowFunctionExpression {
  
  @scala.inline
  def apply(
    body: BlockStatement | Expression,
    expression: Boolean,
    params: js.Array[Pattern],
    `type`: typings.estree.estreeStrings.ArrowFunctionExpression
  ): ArrowFunctionExpression = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], expression = expression.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrowFunctionExpression]
  }
  
  @scala.inline
  implicit class ArrowFunctionExpressionMutableBuilder[Self <: ArrowFunctionExpression] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpression(value: Boolean): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typings.estree.estreeStrings.ArrowFunctionExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
