package typings.gijgo.Types

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// DateTimePicker
trait DateTimePickerSettings extends StObject {
  
  //Events
  var change: js.UndefOr[js.Function1[/* e */ js.Any, js.Any]] = js.undefined
  
  var datepicker: js.UndefOr[DatePickerSettings] = js.undefined
  
  var footer: js.UndefOr[Boolean] = js.undefined
  
  var format: js.UndefOr[String] = js.undefined
  
  var locale: js.UndefOr[String] = js.undefined
  
  var modal: js.UndefOr[Boolean] = js.undefined
  
  var size: js.UndefOr[String] = js.undefined
  
  var uiLibrary: js.UndefOr[String] = js.undefined
  
  var value: js.UndefOr[String] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
}
object DateTimePickerSettings {
  
  inline def apply(): DateTimePickerSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DateTimePickerSettings]
  }
  
  extension [Self <: DateTimePickerSettings](x: Self) {
    
    inline def setChange(value: /* e */ js.Any => js.Any): Self = StObject.set(x, "change", js.Any.fromFunction1(value))
    
    inline def setChangeUndefined: Self = StObject.set(x, "change", js.undefined)
    
    inline def setDatepicker(value: DatePickerSettings): Self = StObject.set(x, "datepicker", value.asInstanceOf[js.Any])
    
    inline def setDatepickerUndefined: Self = StObject.set(x, "datepicker", js.undefined)
    
    inline def setFooter(value: Boolean): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
    
    inline def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
    
    inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    inline def setModal(value: Boolean): Self = StObject.set(x, "modal", value.asInstanceOf[js.Any])
    
    inline def setModalUndefined: Self = StObject.set(x, "modal", js.undefined)
    
    inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setUiLibrary(value: String): Self = StObject.set(x, "uiLibrary", value.asInstanceOf[js.Any])
    
    inline def setUiLibraryUndefined: Self = StObject.set(x, "uiLibrary", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
