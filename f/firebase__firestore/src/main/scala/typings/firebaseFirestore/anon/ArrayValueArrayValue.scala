package typings.firebaseFirestore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArrayValueArrayValue extends StObject {
  
  var arrayValue: typings.firebaseFirestore.protosFirestoreProtoApiMod.ArrayValue
}
object ArrayValueArrayValue {
  
  inline def apply(arrayValue: typings.firebaseFirestore.protosFirestoreProtoApiMod.ArrayValue): ArrayValueArrayValue = {
    val __obj = js.Dynamic.literal(arrayValue = arrayValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrayValueArrayValue]
  }
  
  extension [Self <: ArrayValueArrayValue](x: Self) {
    
    inline def setArrayValue(value: typings.firebaseFirestore.protosFirestoreProtoApiMod.ArrayValue): Self = StObject.set(x, "arrayValue", value.asInstanceOf[js.Any])
  }
}
