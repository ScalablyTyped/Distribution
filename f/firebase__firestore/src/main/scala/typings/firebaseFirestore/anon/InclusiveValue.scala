package typings.firebaseFirestore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InclusiveValue extends StObject {
  
  var inclusive: Boolean
  
  var value: typings.firebaseFirestore.distLiteFirestoreSrcProtosFirestoreProtoApiMod.Value
}
object InclusiveValue {
  
  inline def apply(
    inclusive: Boolean,
    value: typings.firebaseFirestore.distLiteFirestoreSrcProtosFirestoreProtoApiMod.Value
  ): InclusiveValue = {
    val __obj = js.Dynamic.literal(inclusive = inclusive.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[InclusiveValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InclusiveValue] (val x: Self) extends AnyVal {
    
    inline def setInclusive(value: Boolean): Self = StObject.set(x, "inclusive", value.asInstanceOf[js.Any])
    
    inline def setValue(value: typings.firebaseFirestore.distLiteFirestoreSrcProtosFirestoreProtoApiMod.Value): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
