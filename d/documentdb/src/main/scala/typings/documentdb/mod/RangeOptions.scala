package typings.documentdb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RangeOptions extends StObject {
  
  /** The high value in the range. */
  var high: js.Any
  
  /** The low value in the range. */
  var low: js.Any
}
object RangeOptions {
  
  inline def apply(high: js.Any, low: js.Any): RangeOptions = {
    val __obj = js.Dynamic.literal(high = high.asInstanceOf[js.Any], low = low.asInstanceOf[js.Any])
    __obj.asInstanceOf[RangeOptions]
  }
  
  extension [Self <: RangeOptions](x: Self) {
    
    inline def setHigh(value: js.Any): Self = StObject.set(x, "high", value.asInstanceOf[js.Any])
    
    inline def setLow(value: js.Any): Self = StObject.set(x, "low", value.asInstanceOf[js.Any])
  }
}
