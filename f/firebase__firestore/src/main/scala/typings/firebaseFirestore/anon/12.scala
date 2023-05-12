package typings.firebaseFirestore.anon

import typings.firebaseFirestore.distLiteFirestoreSrcApiMod.AggregateField
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `12` extends StObject {
  
  var count: AggregateField[Double]
}
object `12` {
  
  inline def apply(count: AggregateField[Double]): `12` = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any])
    __obj.asInstanceOf[`12`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `12`] (val x: Self) extends AnyVal {
    
    inline def setCount(value: AggregateField[Double]): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
  }
}
