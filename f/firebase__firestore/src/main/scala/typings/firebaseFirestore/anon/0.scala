package typings.firebaseFirestore.anon

import typings.firebaseFirestore.distFirestoreSrcApiMod.AggregateField
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0` extends StObject {
  
  var count: AggregateField[Double]
}
object `0` {
  
  inline def apply(count: AggregateField[Double]): `0` = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any])
    __obj.asInstanceOf[`0`]
  }
  
  extension [Self <: `0`](x: Self) {
    
    inline def setCount(value: AggregateField[Double]): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
  }
}
