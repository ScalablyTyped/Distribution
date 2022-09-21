package typings.firebaseFirestore.anon

import typings.firebaseFirestore.firebaseFirestoreStrings.NaN
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `2` extends StObject {
  
  var doubleValue: NaN | Double
}
object `2` {
  
  inline def apply(doubleValue: NaN | Double): `2` = {
    val __obj = js.Dynamic.literal(doubleValue = doubleValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[`2`]
  }
  
  extension [Self <: `2`](x: Self) {
    
    inline def setDoubleValue(value: NaN | Double): Self = StObject.set(x, "doubleValue", value.asInstanceOf[js.Any])
  }
}
