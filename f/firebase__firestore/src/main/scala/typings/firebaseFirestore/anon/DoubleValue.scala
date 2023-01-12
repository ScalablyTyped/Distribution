package typings.firebaseFirestore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DoubleValue extends StObject {
  
  var doubleValue: String | Double
}
object DoubleValue {
  
  inline def apply(doubleValue: String | Double): DoubleValue = {
    val __obj = js.Dynamic.literal(doubleValue = doubleValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[DoubleValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DoubleValue] (val x: Self) extends AnyVal {
    
    inline def setDoubleValue(value: String | Double): Self = StObject.set(x, "doubleValue", value.asInstanceOf[js.Any])
  }
}
