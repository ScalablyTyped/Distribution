package typings.firebaseFirestore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InclusiveBoolean extends StObject {
  
  var inclusive: Boolean
  
  var value: typings.firebaseFirestore.distLitePackagesFirestoreSrcProtosFirestoreProtoApiMod.Value
}
object InclusiveBoolean {
  
  inline def apply(
    inclusive: Boolean,
    value: typings.firebaseFirestore.distLitePackagesFirestoreSrcProtosFirestoreProtoApiMod.Value
  ): InclusiveBoolean = {
    val __obj = js.Dynamic.literal(inclusive = inclusive.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[InclusiveBoolean]
  }
  
  extension [Self <: InclusiveBoolean](x: Self) {
    
    inline def setInclusive(value: Boolean): Self = StObject.set(x, "inclusive", value.asInstanceOf[js.Any])
    
    inline def setValue(value: typings.firebaseFirestore.distLitePackagesFirestoreSrcProtosFirestoreProtoApiMod.Value): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
