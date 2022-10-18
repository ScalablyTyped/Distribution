package typings.firebaseFirestore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValueValue extends StObject {
  
  var inclusive: Boolean
  
  var value: typings.firebaseFirestore.distPackagesFirestoreSrcProtosFirestoreProtoApiMod.Value
}
object ValueValue {
  
  inline def apply(
    inclusive: Boolean,
    value: typings.firebaseFirestore.distPackagesFirestoreSrcProtosFirestoreProtoApiMod.Value
  ): ValueValue = {
    val __obj = js.Dynamic.literal(inclusive = inclusive.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueValue]
  }
  
  extension [Self <: ValueValue](x: Self) {
    
    inline def setInclusive(value: Boolean): Self = StObject.set(x, "inclusive", value.asInstanceOf[js.Any])
    
    inline def setValue(value: typings.firebaseFirestore.distPackagesFirestoreSrcProtosFirestoreProtoApiMod.Value): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
