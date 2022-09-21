package typings.devextreme.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColorOffset extends StObject {
  
  /**
    * Specifies the color of the scroll bar.
    */
  var color: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the spacing between the scroll bar and the chart&apos;s plot in pixels.
    */
  var offset: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the opacity of the scroll bar.
    */
  var opacity: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the position of the scroll bar in the chart.
    */
  var position: js.UndefOr[typings.devextreme.mod.DevExpress.common.Position] = js.undefined
  
  /**
    * Specifies whether the scroll bar is visible or not.
    */
  var visible: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the width of the scroll bar in pixels.
    */
  var width: js.UndefOr[Double] = js.undefined
}
object ColorOffset {
  
  inline def apply(): ColorOffset = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColorOffset]
  }
  
  extension [Self <: ColorOffset](x: Self) {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    inline def setPosition(value: typings.devextreme.mod.DevExpress.common.Position): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
