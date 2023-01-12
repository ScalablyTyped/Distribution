package typings.firebaseFirestore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IntegerValue extends StObject {
  
  var integerValue: String | Double
}
object IntegerValue {
  
  inline def apply(integerValue: String | Double): IntegerValue = {
    val __obj = js.Dynamic.literal(integerValue = integerValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntegerValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IntegerValue] (val x: Self) extends AnyVal {
    
    inline def setIntegerValue(value: String | Double): Self = StObject.set(x, "integerValue", value.asInstanceOf[js.Any])
  }
}
