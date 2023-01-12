package typings.firebaseFirestore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `18` extends StObject {
  
  var mapValue: typings.firebaseFirestore.distLiteFirestoreSrcProtosFirestoreProtoApiMod.MapValue
}
object `18` {
  
  inline def apply(mapValue: typings.firebaseFirestore.distLiteFirestoreSrcProtosFirestoreProtoApiMod.MapValue): `18` = {
    val __obj = js.Dynamic.literal(mapValue = mapValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[`18`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `18`] (val x: Self) extends AnyVal {
    
    inline def setMapValue(value: typings.firebaseFirestore.distLiteFirestoreSrcProtosFirestoreProtoApiMod.MapValue): Self = StObject.set(x, "mapValue", value.asInstanceOf[js.Any])
  }
}
