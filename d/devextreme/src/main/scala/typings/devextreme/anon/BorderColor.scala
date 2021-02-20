package typings.devextreme.anon

import typings.devextreme.devextremeStrings.dash
import typings.devextreme.devextremeStrings.dot
import typings.devextreme.devextremeStrings.longDash
import typings.devextreme.devextremeStrings.solid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BorderColor extends StObject {
  
  var border: js.UndefOr[ColorDashStyle] = js.native
  
  var color: js.UndefOr[String] = js.native
  
  var dashStyle: js.UndefOr[dash | dot | longDash | solid] = js.native
  
  var hatching: js.UndefOr[Step] = js.native
  
  var width: js.UndefOr[Double] = js.native
}
object BorderColor {
  
  @scala.inline
  def apply(): BorderColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BorderColor]
  }
  
  @scala.inline
  implicit class BorderColorMutableBuilder[Self <: BorderColor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBorder(value: ColorDashStyle): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setDashStyle(value: dash | dot | longDash | solid): Self = StObject.set(x, "dashStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDashStyleUndefined: Self = StObject.set(x, "dashStyle", js.undefined)
    
    @scala.inline
    def setHatching(value: Step): Self = StObject.set(x, "hatching", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHatchingUndefined: Self = StObject.set(x, "hatching", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
