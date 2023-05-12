package typings.devextreme.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomizeTextFormat extends StObject {
  
  /**
    * Specifies a callback function that returns the text to be displayed in scale markers.
    */
  var customizeText: js.UndefOr[js.Function1[/* markerValue */ `7`, String]] = js.undefined
  
  /**
    * Formats a value before it is displayed in a scale marker.
    */
  var format: js.UndefOr[typings.devextreme.mod.DevExpress.ui.Format] = js.undefined
}
object CustomizeTextFormat {
  
  inline def apply(): CustomizeTextFormat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomizeTextFormat]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CustomizeTextFormat] (val x: Self) extends AnyVal {
    
    inline def setCustomizeText(value: /* markerValue */ `7` => String): Self = StObject.set(x, "customizeText", js.Any.fromFunction1(value))
    
    inline def setCustomizeTextUndefined: Self = StObject.set(x, "customizeText", js.undefined)
    
    inline def setFormat(value: typings.devextreme.mod.DevExpress.ui.Format): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatFunction1(value: js.Date | Double => String): Self = StObject.set(x, "format", js.Any.fromFunction1(value))
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
  }
}
