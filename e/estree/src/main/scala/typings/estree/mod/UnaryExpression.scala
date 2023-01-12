package typings.estree.mod

import typings.estree.estreeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnaryExpression
  extends StObject
     with BaseNode {
  
  var argument: Expression
  
  var operator: UnaryOperator
  
  var prefix: `true`
  
  @JSName("type")
  var type_UnaryExpression: typings.estree.estreeStrings.UnaryExpression
}
object UnaryExpression {
  
  inline def apply(argument: Expression, operator: UnaryOperator): UnaryExpression = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], prefix = true)
    __obj.updateDynamic("type")("UnaryExpression")
    __obj.asInstanceOf[UnaryExpression]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UnaryExpression] (val x: Self) extends AnyVal {
    
    inline def setArgument(value: Expression): Self = StObject.set(x, "argument", value.asInstanceOf[js.Any])
    
    inline def setOperator(value: UnaryOperator): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    inline def setPrefix(value: `true`): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.estree.estreeStrings.UnaryExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
