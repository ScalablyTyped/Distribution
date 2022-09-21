package typings.firebaseFirestore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `13` extends StObject {
  
  var mapValue: typings.firebaseFirestore.protosFirestoreProtoApiMod.MapValue
}
object `13` {
  
  inline def apply(mapValue: typings.firebaseFirestore.protosFirestoreProtoApiMod.MapValue): `13` = {
    val __obj = js.Dynamic.literal(mapValue = mapValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[`13`]
  }
  
  extension [Self <: `13`](x: Self) {
    
    inline def setMapValue(value: typings.firebaseFirestore.protosFirestoreProtoApiMod.MapValue): Self = StObject.set(x, "mapValue", value.asInstanceOf[js.Any])
  }
}
