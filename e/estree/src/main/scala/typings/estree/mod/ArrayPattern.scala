package typings.estree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArrayPattern
  extends StObject
     with BaseNode
     with Pattern {
  
  var elements: js.Array[Pattern]
  
  @JSName("type")
  var type_ArrayPattern: typings.estree.estreeStrings.ArrayPattern
}
object ArrayPattern {
  
  inline def apply(elements: js.Array[Pattern]): ArrayPattern = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ArrayPattern")
    __obj.asInstanceOf[ArrayPattern]
  }
  
  extension [Self <: ArrayPattern](x: Self) {
    
    inline def setElements(value: js.Array[Pattern]): Self = StObject.set(x, "elements", value.asInstanceOf[js.Any])
    
    inline def setElementsVarargs(value: Pattern*): Self = StObject.set(x, "elements", js.Array(value :_*))
    
    inline def setType(value: typings.estree.estreeStrings.ArrayPattern): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
