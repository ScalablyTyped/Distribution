package typings.documentdb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RangeOptions extends StObject {
  
  /** The high value in the range. */
  var high: Any
  
  /** The low value in the range. */
  var low: Any
}
object RangeOptions {
  
  inline def apply(high: Any, low: Any): RangeOptions = {
    val __obj = js.Dynamic.literal(high = high.asInstanceOf[js.Any], low = low.asInstanceOf[js.Any])
    __obj.asInstanceOf[RangeOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RangeOptions] (val x: Self) extends AnyVal {
    
    inline def setHigh(value: Any): Self = StObject.set(x, "high", value.asInstanceOf[js.Any])
    
    inline def setLow(value: Any): Self = StObject.set(x, "low", value.asInstanceOf[js.Any])
  }
}
