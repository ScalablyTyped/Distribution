package typings.devextreme.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CornerRadius extends StObject {
  
  /**
    * Colors the annotation&apos;s border.
    */
  var color: js.UndefOr[String] = js.undefined
  
  /**
    * Makes the annotation&apos;s corners rounded.
    */
  var cornerRadius: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the dash style of the annotation&apos;s border.
    */
  var dashStyle: js.UndefOr[typings.devextreme.mod.DevExpress.common.charts.DashStyle] = js.undefined
  
  /**
    * Specifies the opacity of the annotation&apos;s border.
    */
  var opacity: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the visibility of the annotation&apos;s border.
    */
  var visible: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the width of the annotation&apos;s border in pixels.
    */
  var width: js.UndefOr[Double] = js.undefined
}
object CornerRadius {
  
  inline def apply(): CornerRadius = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CornerRadius]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CornerRadius] (val x: Self) extends AnyVal {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setCornerRadius(value: Double): Self = StObject.set(x, "cornerRadius", value.asInstanceOf[js.Any])
    
    inline def setCornerRadiusUndefined: Self = StObject.set(x, "cornerRadius", js.undefined)
    
    inline def setDashStyle(value: typings.devextreme.mod.DevExpress.common.charts.DashStyle): Self = StObject.set(x, "dashStyle", value.asInstanceOf[js.Any])
    
    inline def setDashStyleUndefined: Self = StObject.set(x, "dashStyle", js.undefined)
    
    inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
