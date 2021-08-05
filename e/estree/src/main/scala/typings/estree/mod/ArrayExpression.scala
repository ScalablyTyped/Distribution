package typings.estree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArrayExpression
  extends StObject
     with BaseNode
     with Expression {
  
  var elements: js.Array[Expression | SpreadElement]
  
  @JSName("type")
  var type_ArrayExpression: typings.estree.estreeStrings.ArrayExpression
}
object ArrayExpression {
  
  inline def apply(elements: js.Array[Expression | SpreadElement]): ArrayExpression = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ArrayExpression")
    __obj.asInstanceOf[ArrayExpression]
  }
  
  extension [Self <: ArrayExpression](x: Self) {
    
    inline def setElements(value: js.Array[Expression | SpreadElement]): Self = StObject.set(x, "elements", value.asInstanceOf[js.Any])
    
    inline def setElementsVarargs(value: (Expression | SpreadElement)*): Self = StObject.set(x, "elements", js.Array(value :_*))
    
    inline def setType(value: typings.estree.estreeStrings.ArrayExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
