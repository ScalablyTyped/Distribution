package typings.formatjsIcuMessageformatParser.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseElement[T /* <: TYPE */] extends StObject {
  
  var location: js.UndefOr[Location] = js.undefined
  
  var `type`: T
  
  var value: String
}
object BaseElement {
  
  inline def apply[T /* <: TYPE */](`type`: T, value: String): BaseElement[T] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseElement[T]]
  }
  
  extension [Self <: BaseElement[?], T /* <: TYPE */](x: Self & BaseElement[T]) {
    
    inline def setLocation(value: Location): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setType(value: T): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
