package typings.documentdb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RangeOptions extends StObject {
  
  /** The high value in the range. */
  var high: js.Any = js.native
  
  /** The low value in the range. */
  var low: js.Any = js.native
}
object RangeOptions {
  
  @scala.inline
  def apply(high: js.Any, low: js.Any): RangeOptions = {
    val __obj = js.Dynamic.literal(high = high.asInstanceOf[js.Any], low = low.asInstanceOf[js.Any])
    __obj.asInstanceOf[RangeOptions]
  }
  
  @scala.inline
  implicit class RangeOptionsMutableBuilder[Self <: RangeOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHigh(value: js.Any): Self = StObject.set(x, "high", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLow(value: js.Any): Self = StObject.set(x, "low", value.asInstanceOf[js.Any])
  }
}
