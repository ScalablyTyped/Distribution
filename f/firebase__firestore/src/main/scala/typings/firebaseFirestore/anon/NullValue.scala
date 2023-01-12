package typings.firebaseFirestore.anon

import typings.firebaseFirestore.firebaseFirestoreStrings.NULL_VALUE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NullValue extends StObject {
  
  var nullValue: NULL_VALUE
}
object NullValue {
  
  inline def apply(): NullValue = {
    val __obj = js.Dynamic.literal(nullValue = "NULL_VALUE")
    __obj.asInstanceOf[NullValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NullValue] (val x: Self) extends AnyVal {
    
    inline def setNullValue(value: NULL_VALUE): Self = StObject.set(x, "nullValue", value.asInstanceOf[js.Any])
  }
}
