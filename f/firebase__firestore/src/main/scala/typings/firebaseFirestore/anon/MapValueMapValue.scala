package typings.firebaseFirestore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MapValueMapValue extends StObject {
  
  var mapValue: typings.firebaseFirestore.internalMod.MapValue
}
object MapValueMapValue {
  
  inline def apply(mapValue: typings.firebaseFirestore.internalMod.MapValue): MapValueMapValue = {
    val __obj = js.Dynamic.literal(mapValue = mapValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapValueMapValue]
  }
  
  extension [Self <: MapValueMapValue](x: Self) {
    
    inline def setMapValue(value: typings.firebaseFirestore.internalMod.MapValue): Self = StObject.set(x, "mapValue", value.asInstanceOf[js.Any])
  }
}
