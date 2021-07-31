package typings.devextreme.anon

import typings.devextreme.devextremeStrings.dash
import typings.devextreme.devextremeStrings.dot
import typings.devextreme.devextremeStrings.longDash
import typings.devextreme.devextremeStrings.solid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CornerRadius extends StObject {
  
  var color: js.UndefOr[String] = js.undefined
  
  var cornerRadius: js.UndefOr[Double] = js.undefined
  
  var dashStyle: js.UndefOr[dash | dot | longDash | solid] = js.undefined
  
  var opacity: js.UndefOr[Double] = js.undefined
  
  var visible: js.UndefOr[Boolean] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
}
object CornerRadius {
  
  @scala.inline
  def apply(): CornerRadius = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CornerRadius]
  }
  
  @scala.inline
  implicit class CornerRadiusMutableBuilder[Self <: CornerRadius] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setCornerRadius(value: Double): Self = StObject.set(x, "cornerRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCornerRadiusUndefined: Self = StObject.set(x, "cornerRadius", js.undefined)
    
    @scala.inline
    def setDashStyle(value: dash | dot | longDash | solid): Self = StObject.set(x, "dashStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDashStyleUndefined: Self = StObject.set(x, "dashStyle", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
