package typings.devextreme.anon

import typings.devextreme.devextremeStrings.bottom
import typings.devextreme.devextremeStrings.top
import typings.devextreme.mod.DevExpress.ui.format
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FormatPosition extends StObject {
  
  var format: js.UndefOr[typings.devextreme.mod.DevExpress.ui.format] = js.undefined
  
  var position: js.UndefOr[bottom | top] = js.undefined
  
  var visible: js.UndefOr[Boolean] = js.undefined
}
object FormatPosition {
  
  @scala.inline
  def apply(): FormatPosition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FormatPosition]
  }
  
  @scala.inline
  implicit class FormatPositionMutableBuilder[Self <: FormatPosition] (val x: Self) extends AnyVal {
    
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
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
