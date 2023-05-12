package typings.firebaseFirestore.anon

import typings.firebaseFirestore.distPrivateMod.AggregateField
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `51` extends StObject {
  
  var count: AggregateField[Double]
}
object `51` {
  
  inline def apply(count: AggregateField[Double]): `51` = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any])
    __obj.asInstanceOf[`51`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `51`] (val x: Self) extends AnyVal {
    
    inline def setCount(value: AggregateField[Double]): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
  }
}
