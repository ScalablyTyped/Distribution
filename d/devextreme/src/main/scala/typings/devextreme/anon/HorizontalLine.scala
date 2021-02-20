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
trait HorizontalLine extends StObject {
  
  var color: js.UndefOr[String] = js.native
  
  var dashStyle: js.UndefOr[dash | dot | longDash | solid] = js.native
  
  var enabled: js.UndefOr[Boolean] = js.native
  
  var horizontalLine: js.UndefOr[DashStyle | Boolean] = js.native
  
  var label: js.UndefOr[BackgroundColorCustomizeText] = js.native
  
  var opacity: js.UndefOr[Double] = js.native
  
  var verticalLine: js.UndefOr[DashStyle | Boolean] = js.native
  
  var width: js.UndefOr[Double] = js.native
}
object HorizontalLine {
  
  @scala.inline
  def apply(): HorizontalLine = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HorizontalLine]
  }
  
  @scala.inline
  implicit class HorizontalLineMutableBuilder[Self <: HorizontalLine] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setDashStyle(value: dash | dot | longDash | solid): Self = StObject.set(x, "dashStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDashStyleUndefined: Self = StObject.set(x, "dashStyle", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    @scala.inline
    def setHorizontalLine(value: DashStyle | Boolean): Self = StObject.set(x, "horizontalLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHorizontalLineUndefined: Self = StObject.set(x, "horizontalLine", js.undefined)
    
    @scala.inline
    def setLabel(value: BackgroundColorCustomizeText): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    @scala.inline
    def setVerticalLine(value: DashStyle | Boolean): Self = StObject.set(x, "verticalLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerticalLineUndefined: Self = StObject.set(x, "verticalLine", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
