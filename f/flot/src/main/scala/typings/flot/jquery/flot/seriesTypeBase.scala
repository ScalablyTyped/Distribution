package typings.flot.jquery.flot

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait seriesTypeBase extends StObject {
  
  var fill: js.UndefOr[Any] = js.undefined
  
  //boolean or number
  var fillColor: js.UndefOr[Any] = js.undefined
  
  var lineWidth: js.UndefOr[Double] = js.undefined
  
  var show: js.UndefOr[Boolean] = js.undefined
}
object seriesTypeBase {
  
  inline def apply(): seriesTypeBase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[seriesTypeBase]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: seriesTypeBase] (val x: Self) extends AnyVal {
    
    inline def setFill(value: Any): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    inline def setFillColor(value: Any): Self = StObject.set(x, "fillColor", value.asInstanceOf[js.Any])
    
    inline def setFillColorUndefined: Self = StObject.set(x, "fillColor", js.undefined)
    
    inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    inline def setLineWidth(value: Double): Self = StObject.set(x, "lineWidth", value.asInstanceOf[js.Any])
    
    inline def setLineWidthUndefined: Self = StObject.set(x, "lineWidth", js.undefined)
    
    inline def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
    
    inline def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
  }
}
