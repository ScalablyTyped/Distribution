package typings.estree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwaitExpression
  extends StObject
     with BaseNode {
  
  var argument: Expression
  
  @JSName("type")
  var type_AwaitExpression: typings.estree.estreeStrings.AwaitExpression
}
object AwaitExpression {
  
  inline def apply(argument: Expression): AwaitExpression = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("AwaitExpression")
    __obj.asInstanceOf[AwaitExpression]
  }
  
  extension [Self <: AwaitExpression](x: Self) {
    
    inline def setArgument(value: Expression): Self = StObject.set(x, "argument", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.estree.estreeStrings.AwaitExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
