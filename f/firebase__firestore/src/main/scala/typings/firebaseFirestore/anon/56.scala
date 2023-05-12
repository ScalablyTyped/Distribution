package typings.firebaseFirestore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `56` extends StObject {
  
  var mapValue: typings.firebaseFirestore.distPrivateMod.MapValue
}
object `56` {
  
  inline def apply(mapValue: typings.firebaseFirestore.distPrivateMod.MapValue): `56` = {
    val __obj = js.Dynamic.literal(mapValue = mapValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[`56`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `56`] (val x: Self) extends AnyVal {
    
    inline def setMapValue(value: typings.firebaseFirestore.distPrivateMod.MapValue): Self = StObject.set(x, "mapValue", value.asInstanceOf[js.Any])
  }
}
