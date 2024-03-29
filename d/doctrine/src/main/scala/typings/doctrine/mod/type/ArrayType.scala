package typings.doctrine.mod.`type`

import typings.doctrine.mod.Type_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArrayType
  extends StObject
     with Type_ {
  
  var elements: js.Array[Type_]
  
  var `type`: typings.doctrine.doctrineStrings.ArrayType
}
object ArrayType {
  
  inline def apply(elements: js.Array[Type_]): ArrayType = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ArrayType")
    __obj.asInstanceOf[ArrayType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ArrayType] (val x: Self) extends AnyVal {
    
    inline def setElements(value: js.Array[Type_]): Self = StObject.set(x, "elements", value.asInstanceOf[js.Any])
    
    inline def setElementsVarargs(value: Type_ *): Self = StObject.set(x, "elements", js.Array(value*))
    
    inline def setType(value: typings.doctrine.doctrineStrings.ArrayType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
