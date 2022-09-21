package typings.firebaseFirestore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `29` extends StObject {
  
  var mapValue: typings.firebaseFirestore.privateMod.MapValue
}
object `29` {
  
  inline def apply(mapValue: typings.firebaseFirestore.privateMod.MapValue): `29` = {
    val __obj = js.Dynamic.literal(mapValue = mapValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[`29`]
  }
  
  extension [Self <: `29`](x: Self) {
    
    inline def setMapValue(value: typings.firebaseFirestore.privateMod.MapValue): Self = StObject.set(x, "mapValue", value.asInstanceOf[js.Any])
  }
}
