package typings.firebaseFirestore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `57` extends StObject {
  
  var mapValue: typings.firebaseFirestore.distPrivateMod.MapValue
}
object `57` {
  
  inline def apply(mapValue: typings.firebaseFirestore.distPrivateMod.MapValue): `57` = {
    val __obj = js.Dynamic.literal(mapValue = mapValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[`57`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `57`] (val x: Self) extends AnyVal {
    
    inline def setMapValue(value: typings.firebaseFirestore.distPrivateMod.MapValue): Self = StObject.set(x, "mapValue", value.asInstanceOf[js.Any])
  }
}
