package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.PositionConfig
import typings.devextreme.mod.DevExpress.common.PositionAlignment
import typings.devextreme.mod.DevExpress.core.FloatingActionButtonDirection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CloseIcon extends StObject {
  
  /**
    * 
    */
  var closeIcon: js.UndefOr[String] = js.undefined
  
  /**
    * 
    */
  var direction: js.UndefOr[FloatingActionButtonDirection] = js.undefined
  
  /**
    * 
    */
  var icon: js.UndefOr[String] = js.undefined
  
  /**
    * 
    */
  var label: js.UndefOr[String] = js.undefined
  
  /**
    * 
    */
  var maxSpeedDialActionCount: js.UndefOr[Double] = js.undefined
  
  /**
    * 
    */
  var position: js.UndefOr[PositionAlignment | PositionConfig | js.Function] = js.undefined
  
  /**
    * 
    */
  var shading: js.UndefOr[Boolean] = js.undefined
}
object CloseIcon {
  
  inline def apply(): CloseIcon = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CloseIcon]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CloseIcon] (val x: Self) extends AnyVal {
    
    inline def setCloseIcon(value: String): Self = StObject.set(x, "closeIcon", value.asInstanceOf[js.Any])
    
    inline def setCloseIconUndefined: Self = StObject.set(x, "closeIcon", js.undefined)
    
    inline def setDirection(value: FloatingActionButtonDirection): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setMaxSpeedDialActionCount(value: Double): Self = StObject.set(x, "maxSpeedDialActionCount", value.asInstanceOf[js.Any])
    
    inline def setMaxSpeedDialActionCountUndefined: Self = StObject.set(x, "maxSpeedDialActionCount", js.undefined)
    
    inline def setPosition(value: PositionAlignment | PositionConfig | js.Function): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setShading(value: Boolean): Self = StObject.set(x, "shading", value.asInstanceOf[js.Any])
    
    inline def setShadingUndefined: Self = StObject.set(x, "shading", js.undefined)
  }
}
