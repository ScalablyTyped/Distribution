package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.common.TooltipShowMode
import typings.devextreme.mod.DevExpress.common.VerticalEdge
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShowMode extends StObject {
  
  /**
    * Specifies whether a tooltip is enabled.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies a tooltip&apos;s display format.
    */
  var format: js.UndefOr[typings.devextreme.mod.DevExpress.ui.Format] = js.undefined
  
  /**
    * Specifies whether a tooltip is over or under the slider.
    */
  var position: js.UndefOr[VerticalEdge] = js.undefined
  
  /**
    * Specifies when the UI component shows a tooltip.
    */
  var showMode: js.UndefOr[TooltipShowMode] = js.undefined
}
object ShowMode {
  
  inline def apply(): ShowMode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShowMode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ShowMode] (val x: Self) extends AnyVal {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setFormat(value: typings.devextreme.mod.DevExpress.ui.Format): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatFunction1(value: js.Date | Double => String): Self = StObject.set(x, "format", js.Any.fromFunction1(value))
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setPosition(value: VerticalEdge): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setShowMode(value: TooltipShowMode): Self = StObject.set(x, "showMode", value.asInstanceOf[js.Any])
    
    inline def setShowModeUndefined: Self = StObject.set(x, "showMode", js.undefined)
  }
}
