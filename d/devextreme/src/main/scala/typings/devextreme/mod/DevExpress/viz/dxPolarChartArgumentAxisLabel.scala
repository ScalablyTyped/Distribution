package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.anon.ValueValueText
import typings.devextreme.mod.DevExpress.ui.Format
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxPolarChartArgumentAxisLabel
  extends StObject
     with dxPolarChartCommonAxisSettingsLabel {
  
  /**
    * Specifies the text for a hint that appears when a user hovers the mouse pointer over a label on the argument axis.
    */
  var customizeHint: js.UndefOr[js.Function1[/* argument */ ValueValueText, String]] = js.undefined
  
  /**
    * Specifies a callback function that returns the text to be displayed by argument axis labels.
    */
  var customizeText: js.UndefOr[js.Function1[/* argument */ ValueValueText, String]] = js.undefined
  
  /**
    * Formats a value before it is displayed in an axis label.
    */
  var format: js.UndefOr[Format] = js.undefined
}
object dxPolarChartArgumentAxisLabel {
  
  inline def apply(): dxPolarChartArgumentAxisLabel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxPolarChartArgumentAxisLabel]
  }
  
  extension [Self <: dxPolarChartArgumentAxisLabel](x: Self) {
    
    inline def setCustomizeHint(value: /* argument */ ValueValueText => String): Self = StObject.set(x, "customizeHint", js.Any.fromFunction1(value))
    
    inline def setCustomizeHintUndefined: Self = StObject.set(x, "customizeHint", js.undefined)
    
    inline def setCustomizeText(value: /* argument */ ValueValueText => String): Self = StObject.set(x, "customizeText", js.Any.fromFunction1(value))
    
    inline def setCustomizeTextUndefined: Self = StObject.set(x, "customizeText", js.undefined)
    
    inline def setFormat(value: Format): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatFunction1(value: js.Date | Double => String): Self = StObject.set(x, "format", js.Any.fromFunction1(value))
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
  }
}
