package typings.flot.jquery.flot

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait seriesTypeBase extends StObject {
  
  var fill: js.UndefOr[js.Any] = js.native
  
  //boolean or number
  var fillColor: js.UndefOr[js.Any] = js.native
  
  var lineWidth: js.UndefOr[Double] = js.native
  
  var show: js.UndefOr[Boolean] = js.native
}
object seriesTypeBase {
  
  @scala.inline
  def apply(): seriesTypeBase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[seriesTypeBase]
  }
  
  @scala.inline
  implicit class seriesTypeBaseMutableBuilder[Self <: seriesTypeBase] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFill(value: js.Any): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillColor(value: js.Any): Self = StObject.set(x, "fillColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillColorUndefined: Self = StObject.set(x, "fillColor", js.undefined)
    
    @scala.inline
    def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    @scala.inline
    def setLineWidth(value: Double): Self = StObject.set(x, "lineWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineWidthUndefined: Self = StObject.set(x, "lineWidth", js.undefined)
    
    @scala.inline
    def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
  }
}
