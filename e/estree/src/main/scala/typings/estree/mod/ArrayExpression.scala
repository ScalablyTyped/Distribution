package typings.estree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArrayExpression
  extends StObject
     with BaseNode {
  
  var elements: js.Array[Expression | SpreadElement | Null]
  
  @JSName("type")
  var type_ArrayExpression: typings.estree.estreeStrings.ArrayExpression
}
object ArrayExpression {
  
  inline def apply(elements: js.Array[Expression | SpreadElement | Null]): ArrayExpression = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ArrayExpression")
    __obj.asInstanceOf[ArrayExpression]
  }
  
  extension [Self <: ArrayExpression](x: Self) {
    
    inline def setElements(value: js.Array[Expression | SpreadElement | Null]): Self = StObject.set(x, "elements", value.asInstanceOf[js.Any])
    
    inline def setElementsVarargs(value: (Expression | SpreadElement | Null)*): Self = StObject.set(x, "elements", js.Array(value*))
    
    inline def setType(value: typings.estree.estreeStrings.ArrayExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
