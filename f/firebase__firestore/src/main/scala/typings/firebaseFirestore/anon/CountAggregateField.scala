package typings.firebaseFirestore.anon

import typings.firebaseFirestore.distFirestoreSrcLiteApiAggregateTypesMod.AggregateField
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CountAggregateField extends StObject {
  
  var count: AggregateField[Double]
}
object CountAggregateField {
  
  inline def apply(count: AggregateField[Double]): CountAggregateField = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any])
    __obj.asInstanceOf[CountAggregateField]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CountAggregateField] (val x: Self) extends AnyVal {
    
    inline def setCount(value: AggregateField[Double]): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
  }
}
