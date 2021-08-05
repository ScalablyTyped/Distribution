package typings.flot.jquery.flot

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait barsOptions
  extends StObject
     with seriesTypeBase {
  
  var align: js.UndefOr[String] = js.undefined
  
  var barWidth: js.UndefOr[Double] = js.undefined
  
  var horizontal: js.UndefOr[Boolean] = js.undefined
}
object barsOptions {
  
  inline def apply(): barsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[barsOptions]
  }
  
  extension [Self <: barsOptions](x: Self) {
    
    inline def setAlign(value: String): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    inline def setBarWidth(value: Double): Self = StObject.set(x, "barWidth", value.asInstanceOf[js.Any])
    
    inline def setBarWidthUndefined: Self = StObject.set(x, "barWidth", js.undefined)
    
    inline def setHorizontal(value: Boolean): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
    
    inline def setHorizontalUndefined: Self = StObject.set(x, "horizontal", js.undefined)
  }
}
