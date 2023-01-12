package typings.firebaseFirestore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArrayValueArrayValue extends StObject {
  
  var arrayValue: typings.firebaseFirestore.distLiteFirestoreSrcProtosFirestoreProtoApiMod.ArrayValue
}
object ArrayValueArrayValue {
  
  inline def apply(arrayValue: typings.firebaseFirestore.distLiteFirestoreSrcProtosFirestoreProtoApiMod.ArrayValue): ArrayValueArrayValue = {
    val __obj = js.Dynamic.literal(arrayValue = arrayValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrayValueArrayValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ArrayValueArrayValue] (val x: Self) extends AnyVal {
    
    inline def setArrayValue(value: typings.firebaseFirestore.distLiteFirestoreSrcProtosFirestoreProtoApiMod.ArrayValue): Self = StObject.set(x, "arrayValue", value.asInstanceOf[js.Any])
  }
}
