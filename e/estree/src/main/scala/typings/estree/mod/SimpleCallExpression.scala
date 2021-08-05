package typings.estree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SimpleCallExpression
  extends StObject
     with BaseCallExpression
     with CallExpression
     with ChainElement {
  
  var optional: Boolean
  
  @JSName("type")
  var type_SimpleCallExpression: typings.estree.estreeStrings.CallExpression
}
object SimpleCallExpression {
  
  inline def apply(arguments: js.Array[Expression | SpreadElement], callee: Expression | Super, optional: Boolean): SimpleCallExpression = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], callee = callee.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("CallExpression")
    __obj.asInstanceOf[SimpleCallExpression]
  }
  
  extension [Self <: SimpleCallExpression](x: Self) {
    
    inline def setOptional(value: Boolean): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.estree.estreeStrings.CallExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
