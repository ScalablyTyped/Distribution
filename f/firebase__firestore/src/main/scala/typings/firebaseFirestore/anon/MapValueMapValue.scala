package typings.firebaseFirestore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MapValueMapValue extends StObject {
  
  var mapValue: typings.firebaseFirestore.distInternalMod.MapValue
}
object MapValueMapValue {
  
  inline def apply(mapValue: typings.firebaseFirestore.distInternalMod.MapValue): MapValueMapValue = {
    val __obj = js.Dynamic.literal(mapValue = mapValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapValueMapValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MapValueMapValue] (val x: Self) extends AnyVal {
    
    inline def setMapValue(value: typings.firebaseFirestore.distInternalMod.MapValue): Self = StObject.set(x, "mapValue", value.asInstanceOf[js.Any])
  }
}
