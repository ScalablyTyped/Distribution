package typings.firebaseFirestore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReferenceValue extends StObject {
  
  var referenceValue: String
}
object ReferenceValue {
  
  inline def apply(referenceValue: String): ReferenceValue = {
    val __obj = js.Dynamic.literal(referenceValue = referenceValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReferenceValue]
  }
  
  extension [Self <: ReferenceValue](x: Self) {
    
    inline def setReferenceValue(value: String): Self = StObject.set(x, "referenceValue", value.asInstanceOf[js.Any])
  }
}
