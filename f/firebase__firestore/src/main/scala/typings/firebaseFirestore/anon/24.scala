package typings.firebaseFirestore.anon

import typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiAggregateTypesMod.AggregateField
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `24` extends StObject {
  
  var count: AggregateField[Double]
}
object `24` {
  
  inline def apply(count: AggregateField[Double]): `24` = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any])
    __obj.asInstanceOf[`24`]
  }
  
  extension [Self <: `24`](x: Self) {
    
    inline def setCount(value: AggregateField[Double]): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
  }
}
