package typings.estree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NewExpression
  extends StObject
     with BaseCallExpression
     with CallExpression {
  
  @JSName("type")
  var type_NewExpression: typings.estree.estreeStrings.NewExpression
}
object NewExpression {
  
  inline def apply(arguments: js.Array[Expression | SpreadElement], callee: Expression | Super): NewExpression = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], callee = callee.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("NewExpression")
    __obj.asInstanceOf[NewExpression]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NewExpression] (val x: Self) extends AnyVal {
    
    inline def setType(value: typings.estree.estreeStrings.NewExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
