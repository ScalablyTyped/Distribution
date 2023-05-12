package typings.firebaseFirestore.anon

import typings.firebaseFirestore.distPackagesFirestoreSrcApiMod.AggregateField
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `40` extends StObject {
  
  var count: AggregateField[Double]
}
object `40` {
  
  inline def apply(count: AggregateField[Double]): `40` = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any])
    __obj.asInstanceOf[`40`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `40`] (val x: Self) extends AnyVal {
    
    inline def setCount(value: AggregateField[Double]): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
  }
}
