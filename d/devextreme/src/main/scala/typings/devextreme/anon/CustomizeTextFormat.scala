package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.ui.format
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomizeTextFormat extends StObject {
  
  var customizeText: js.UndefOr[js.Function1[/* markerValue */ `26`, String]] = js.undefined
  
  var format: js.UndefOr[typings.devextreme.mod.DevExpress.ui.format] = js.undefined
}
object CustomizeTextFormat {
  
  inline def apply(): CustomizeTextFormat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomizeTextFormat]
  }
  
  extension [Self <: CustomizeTextFormat](x: Self) {
    
    inline def setCustomizeText(value: /* markerValue */ `26` => String): Self = StObject.set(x, "customizeText", js.Any.fromFunction1(value))
    
    inline def setCustomizeTextUndefined: Self = StObject.set(x, "customizeText", js.undefined)
    
    inline def setFormat(value: format): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatFunction1(value: /* value */ Double | typings.std.Date => String): Self = StObject.set(x, "format", js.Any.fromFunction1(value))
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
  }
}
