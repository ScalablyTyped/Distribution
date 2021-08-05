package typings.devextreme.anon

import typings.devextreme.devextremeStrings.always
import typings.devextreme.devextremeStrings.bottom
import typings.devextreme.devextremeStrings.onHover
import typings.devextreme.devextremeStrings.top
import typings.devextreme.mod.DevExpress.ui.format
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShowMode extends StObject {
  
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  var format: js.UndefOr[typings.devextreme.mod.DevExpress.ui.format] = js.undefined
  
  var position: js.UndefOr[bottom | top] = js.undefined
  
  var showMode: js.UndefOr[always | onHover] = js.undefined
}
object ShowMode {
  
  inline def apply(): ShowMode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShowMode]
  }
  
  extension [Self <: ShowMode](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setFormat(value: format): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatFunction1(value: /* value */ Double | typings.std.Date => String): Self = StObject.set(x, "format", js.Any.fromFunction1(value))
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setPosition(value: bottom | top): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setShowMode(value: always | onHover): Self = StObject.set(x, "showMode", value.asInstanceOf[js.Any])
    
    inline def setShowModeUndefined: Self = StObject.set(x, "showMode", js.undefined)
  }
}
