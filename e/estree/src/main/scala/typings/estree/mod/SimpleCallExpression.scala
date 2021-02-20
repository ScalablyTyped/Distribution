package typings.estree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SimpleCallExpression
  extends BaseCallExpression
     with CallExpression
     with ChainElement {
  
  var optional: Boolean = js.native
  
  @JSName("type")
  var type_SimpleCallExpression: typings.estree.estreeStrings.CallExpression = js.native
}
object SimpleCallExpression {
  
  @scala.inline
  def apply(
    arguments: js.Array[Expression | SpreadElement],
    callee: Expression | Super,
    optional: Boolean,
    `type`: typings.estree.estreeStrings.CallExpression
  ): SimpleCallExpression = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], callee = callee.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SimpleCallExpression]
  }
  
  @scala.inline
  implicit class SimpleCallExpressionMutableBuilder[Self <: SimpleCallExpression] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOptional(value: Boolean): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typings.estree.estreeStrings.CallExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
