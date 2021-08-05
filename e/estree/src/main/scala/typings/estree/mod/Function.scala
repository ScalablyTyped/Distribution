package typings.estree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.estree.mod.FunctionDeclaration
  - typings.estree.mod.FunctionExpression
  - typings.estree.mod.ArrowFunctionExpression
*/
trait Function
  extends StObject
     with Node
object Function {
  
  inline def ArrowFunctionExpression(body: BlockStatement | Expression, expression: Boolean, params: js.Array[Pattern]): typings.estree.mod.ArrowFunctionExpression = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], expression = expression.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ArrowFunctionExpression")
    __obj.asInstanceOf[typings.estree.mod.ArrowFunctionExpression]
  }
  
  inline def FunctionDeclaration(body: BlockStatement, params: js.Array[Pattern]): typings.estree.mod.FunctionDeclaration = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], id = null)
    __obj.updateDynamic("type")("FunctionDeclaration")
    __obj.asInstanceOf[typings.estree.mod.FunctionDeclaration]
  }
  
  inline def FunctionExpression(body: BlockStatement, params: js.Array[Pattern]): typings.estree.mod.FunctionExpression = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("FunctionExpression")
    __obj.asInstanceOf[typings.estree.mod.FunctionExpression]
  }
}
