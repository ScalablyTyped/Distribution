package typings.firebaseFirestore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MapValue extends StObject {
  
  var mapValue: typings.firebaseFirestore.distFirestoreSrcProtosFirestoreProtoApiMod.MapValue
}
object MapValue {
  
  inline def apply(mapValue: typings.firebaseFirestore.distFirestoreSrcProtosFirestoreProtoApiMod.MapValue): MapValue = {
    val __obj = js.Dynamic.literal(mapValue = mapValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapValue]
  }
  
  extension [Self <: MapValue](x: Self) {
    
    inline def setMapValue(value: typings.firebaseFirestore.distFirestoreSrcProtosFirestoreProtoApiMod.MapValue): Self = StObject.set(x, "mapValue", value.asInstanceOf[js.Any])
  }
}
