package typings.firebaseFirestore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Inclusive extends StObject {
  
  var inclusive: Boolean
  
  var value: typings.firebaseFirestore.distFirestoreSrcProtosFirestoreProtoApiMod.Value
}
object Inclusive {
  
  inline def apply(
    inclusive: Boolean,
    value: typings.firebaseFirestore.distFirestoreSrcProtosFirestoreProtoApiMod.Value
  ): Inclusive = {
    val __obj = js.Dynamic.literal(inclusive = inclusive.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Inclusive]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Inclusive] (val x: Self) extends AnyVal {
    
    inline def setInclusive(value: Boolean): Self = StObject.set(x, "inclusive", value.asInstanceOf[js.Any])
    
    inline def setValue(value: typings.firebaseFirestore.distFirestoreSrcProtosFirestoreProtoApiMod.Value): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
