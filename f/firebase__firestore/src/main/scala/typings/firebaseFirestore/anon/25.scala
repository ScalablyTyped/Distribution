package typings.firebaseFirestore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `25` extends StObject {
  
  var arrayValue: typings.firebaseFirestore.srcProtosFirestoreProtoApiMod.ArrayValue
}
object `25` {
  
  inline def apply(arrayValue: typings.firebaseFirestore.srcProtosFirestoreProtoApiMod.ArrayValue): `25` = {
    val __obj = js.Dynamic.literal(arrayValue = arrayValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[`25`]
  }
  
  extension [Self <: `25`](x: Self) {
    
    inline def setArrayValue(value: typings.firebaseFirestore.srcProtosFirestoreProtoApiMod.ArrayValue): Self = StObject.set(x, "arrayValue", value.asInstanceOf[js.Any])
  }
}
