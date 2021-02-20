package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.ui.format
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BackgroundColorCustomizeText extends StObject {
  
  var backgroundColor: js.UndefOr[String] = js.native
  
  var customizeText: js.UndefOr[js.Function1[/* info */ Point, String]] = js.native
  
  var font: js.UndefOr[typings.devextreme.mod.DevExpress.viz.Font] = js.native
  
  var format: js.UndefOr[typings.devextreme.mod.DevExpress.ui.format] = js.native
  
  var visible: js.UndefOr[Boolean] = js.native
}
object BackgroundColorCustomizeText {
  
  @scala.inline
  def apply(): BackgroundColorCustomizeText = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackgroundColorCustomizeText]
  }
  
  @scala.inline
  implicit class BackgroundColorCustomizeTextMutableBuilder[Self <: BackgroundColorCustomizeText] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    @scala.inline
    def setCustomizeText(value: /* info */ Point => String): Self = StObject.set(x, "customizeText", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCustomizeTextUndefined: Self = StObject.set(x, "customizeText", js.undefined)
    
    @scala.inline
    def setFont(value: typings.devextreme.mod.DevExpress.viz.Font): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    @scala.inline
    def setFormat(value: format): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatFunction1(value: /* value */ Double | typings.std.Date => String): Self = StObject.set(x, "format", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
