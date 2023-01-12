package typings.firebaseFirestore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `48` extends StObject {
  
  var arrayValue: typings.firebaseFirestore.distPackagesFirestoreSrcProtosFirestoreProtoApiMod.ArrayValue
}
object `48` {
  
  inline def apply(
    arrayValue: typings.firebaseFirestore.distPackagesFirestoreSrcProtosFirestoreProtoApiMod.ArrayValue
  ): `48` = {
    val __obj = js.Dynamic.literal(arrayValue = arrayValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[`48`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `48`] (val x: Self) extends AnyVal {
    
    inline def setArrayValue(value: typings.firebaseFirestore.distPackagesFirestoreSrcProtosFirestoreProtoApiMod.ArrayValue): Self = StObject.set(x, "arrayValue", value.asInstanceOf[js.Any])
  }
}
