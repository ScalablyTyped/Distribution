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
  
  @scala.inline
  def apply(): ShowMode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShowMode]
  }
  
  @scala.inline
  implicit class ShowModeMutableBuilder[Self <: ShowMode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    @scala.inline
    def setFormat(value: format): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatFunction1(value: /* value */ Double | typings.std.Date => String): Self = StObject.set(x, "format", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setPosition(value: bottom | top): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    @scala.inline
    def setShowMode(value: always | onHover): Self = StObject.set(x, "showMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowModeUndefined: Self = StObject.set(x, "showMode", js.undefined)
  }
}
