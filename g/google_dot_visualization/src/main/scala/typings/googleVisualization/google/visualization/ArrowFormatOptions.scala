package typings.googleVisualization.google.visualization

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArrowFormatOptions extends StObject {
  
  /**
    * A number indicating the base value, used to compare against the cell value. If the cell value is higher, the cell will include a green up arrow; if the cell value is lower, it will include a red down arrow; if the same, no arrow.
    */
  var base: js.UndefOr[Double] = js.undefined
}
object ArrowFormatOptions {
  
  inline def apply(): ArrowFormatOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArrowFormatOptions]
  }
  
  extension [Self <: ArrowFormatOptions](x: Self) {
    
    inline def setBase(value: Double): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
    
    inline def setBaseUndefined: Self = StObject.set(x, "base", js.undefined)
  }
}
