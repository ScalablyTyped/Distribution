package typings.devextreme.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackgroundColorCustomizeText extends StObject {
  
  /**
    * Paints the background of the label that belongs to the vertical crosshair line.
    */
  var backgroundColor: js.UndefOr[String] = js.undefined
  
  /**
    * Customizes the text displayed by the label that belongs to the vertical crosshair line.
    */
  var customizeText: js.UndefOr[js.Function1[/* info */ Point, String]] = js.undefined
  
  /**
    * Specifies font properties for the label of the vertical crosshair line.
    */
  var font: js.UndefOr[typings.devextreme.mod.DevExpress.viz.Font] = js.undefined
  
  /**
    * Formats the point argument before it is displayed in the crosshair label.
    */
  var format: js.UndefOr[typings.devextreme.mod.DevExpress.ui.Format] = js.undefined
  
  /**
    * Makes the label of the vertical crosshair line visible. Applies only if the crosshair feature is enabled and the vertical line is visible.
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}
object BackgroundColorCustomizeText {
  
  inline def apply(): BackgroundColorCustomizeText = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackgroundColorCustomizeText]
  }
  
  extension [Self <: BackgroundColorCustomizeText](x: Self) {
    
    inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    inline def setCustomizeText(value: /* info */ Point => String): Self = StObject.set(x, "customizeText", js.Any.fromFunction1(value))
    
    inline def setCustomizeTextUndefined: Self = StObject.set(x, "customizeText", js.undefined)
    
    inline def setFont(value: typings.devextreme.mod.DevExpress.viz.Font): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    inline def setFormat(value: typings.devextreme.mod.DevExpress.ui.Format): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatFunction1(value: js.Date | Double => String): Self = StObject.set(x, "format", js.Any.fromFunction1(value))
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
