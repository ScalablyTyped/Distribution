package typings.firebaseFirestore.anon

import typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiAggregateTypesMod.AggregateField
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `39` extends StObject {
  
  var count: AggregateField[Double]
}
object `39` {
  
  inline def apply(count: AggregateField[Double]): `39` = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any])
    __obj.asInstanceOf[`39`]
  }
  
  extension [Self <: `39`](x: Self) {
    
    inline def setCount(value: AggregateField[Double]): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
  }
}
