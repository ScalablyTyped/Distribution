package typings.estree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwaitExpression
  extends StObject
     with BaseNode
     with Expression {
  
  var argument: Expression
  
  @JSName("type")
  var type_AwaitExpression: typings.estree.estreeStrings.AwaitExpression
}
object AwaitExpression {
  
  @scala.inline
  def apply(argument: Expression): AwaitExpression = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("AwaitExpression")
    __obj.asInstanceOf[AwaitExpression]
  }
  
  @scala.inline
  implicit class AwaitExpressionMutableBuilder[Self <: AwaitExpression] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArgument(value: Expression): Self = StObject.set(x, "argument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typings.estree.estreeStrings.AwaitExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
