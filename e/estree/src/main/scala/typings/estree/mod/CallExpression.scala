package typings.estree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.estree.mod.SimpleCallExpression
  - typings.estree.mod.NewExpression
*/
trait CallExpression extends StObject
object CallExpression {
  
  inline def NewExpression(arguments: js.Array[Expression | SpreadElement], callee: Expression | Super): typings.estree.mod.NewExpression = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], callee = callee.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("NewExpression")
    __obj.asInstanceOf[typings.estree.mod.NewExpression]
  }
  
  inline def SimpleCallExpression(arguments: js.Array[Expression | SpreadElement], callee: Expression | Super, optional: Boolean): typings.estree.mod.SimpleCallExpression = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], callee = callee.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("CallExpression")
    __obj.asInstanceOf[typings.estree.mod.SimpleCallExpression]
  }
}
