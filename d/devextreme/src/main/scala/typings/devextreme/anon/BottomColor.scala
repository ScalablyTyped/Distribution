package typings.devextreme.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BottomColor extends StObject {
  
  /**
    * Shows/hides the bottom border of the pane. Applies only when the border.visible property is true.
    */
  var bottom: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the color of the pane border.
    */
  var color: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the dash style of the pane border.
    */
  var dashStyle: js.UndefOr[typings.devextreme.mod.DevExpress.common.charts.DashStyle] = js.undefined
  
  /**
    * Shows/hides the left border of the pane. Applies only when the border.visible property is true.
    */
  var left: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies how transparent the pane border should be.
    */
  var opacity: js.UndefOr[Double] = js.undefined
  
  /**
    * Shows/hides the right border of the pane. Applies only when the border.visible property is true.
    */
  var right: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Shows/hides the top border of the pane. Applies only when the border.visible property is true.
    */
  var top: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Shows the pane border.
    */
  var visible: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the width of the pane border in pixels.
    */
  var width: js.UndefOr[Double] = js.undefined
}
object BottomColor {
  
  inline def apply(): BottomColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BottomColor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BottomColor] (val x: Self) extends AnyVal {
    
    inline def setBottom(value: Boolean): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    inline def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setDashStyle(value: typings.devextreme.mod.DevExpress.common.charts.DashStyle): Self = StObject.set(x, "dashStyle", value.asInstanceOf[js.Any])
    
    inline def setDashStyleUndefined: Self = StObject.set(x, "dashStyle", js.undefined)
    
    inline def setLeft(value: Boolean): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
    
    inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    inline def setRight(value: Boolean): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    inline def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
    
    inline def setTop(value: Boolean): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
