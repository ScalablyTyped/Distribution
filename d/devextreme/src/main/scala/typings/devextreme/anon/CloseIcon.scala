package typings.devextreme.anon

import typings.devextreme.devextremeStrings.`left bottom`
import typings.devextreme.devextremeStrings.`left top`
import typings.devextreme.devextremeStrings.`right bottom`
import typings.devextreme.devextremeStrings.`right top`
import typings.devextreme.devextremeStrings.auto
import typings.devextreme.devextremeStrings.bottom
import typings.devextreme.devextremeStrings.center
import typings.devextreme.devextremeStrings.down
import typings.devextreme.devextremeStrings.left
import typings.devextreme.devextremeStrings.right
import typings.devextreme.devextremeStrings.top
import typings.devextreme.devextremeStrings.up
import typings.devextreme.mod.DevExpress.positionConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CloseIcon extends StObject {
  
  var closeIcon: js.UndefOr[String] = js.undefined
  
  var direction: js.UndefOr[auto | up | down] = js.undefined
  
  var icon: js.UndefOr[String] = js.undefined
  
  var label: js.UndefOr[String] = js.undefined
  
  var maxSpeedDialActionCount: js.UndefOr[Double] = js.undefined
  
  var position: js.UndefOr[
    bottom | center | left | (`left bottom`) | (`left top`) | right | (`right bottom`) | (`right top`) | top | positionConfig | js.Function
  ] = js.undefined
  
  var shading: js.UndefOr[Boolean] = js.undefined
}
object CloseIcon {
  
  inline def apply(): CloseIcon = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CloseIcon]
  }
  
  extension [Self <: CloseIcon](x: Self) {
    
    inline def setCloseIcon(value: String): Self = StObject.set(x, "closeIcon", value.asInstanceOf[js.Any])
    
    inline def setCloseIconUndefined: Self = StObject.set(x, "closeIcon", js.undefined)
    
    inline def setDirection(value: auto | up | down): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setMaxSpeedDialActionCount(value: Double): Self = StObject.set(x, "maxSpeedDialActionCount", value.asInstanceOf[js.Any])
    
    inline def setMaxSpeedDialActionCountUndefined: Self = StObject.set(x, "maxSpeedDialActionCount", js.undefined)
    
    inline def setPosition(
      value: bottom | center | left | (`left bottom`) | (`left top`) | right | (`right bottom`) | (`right top`) | top | positionConfig | js.Function
    ): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setShading(value: Boolean): Self = StObject.set(x, "shading", value.asInstanceOf[js.Any])
    
    inline def setShadingUndefined: Self = StObject.set(x, "shading", js.undefined)
  }
}
