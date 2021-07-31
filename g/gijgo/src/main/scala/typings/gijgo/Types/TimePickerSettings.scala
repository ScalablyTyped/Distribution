package typings.gijgo.Types

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// TimePicker
trait TimePickerSettings extends StObject {
  
  //Events
  var change: js.UndefOr[js.Function1[/* e */ js.Any, js.Any]] = js.undefined
  
  var close: js.UndefOr[js.Function1[/* e */ js.Any, js.Any]] = js.undefined
  
  var footer: js.UndefOr[Boolean] = js.undefined
  
  var format: js.UndefOr[String] = js.undefined
  
  var header: js.UndefOr[Boolean] = js.undefined
  
  var locale: js.UndefOr[String] = js.undefined
  
  var modal: js.UndefOr[Boolean] = js.undefined
  
  var mode: js.UndefOr[String] = js.undefined
  
  var open: js.UndefOr[js.Function1[/* e */ js.Any, js.Any]] = js.undefined
  
  var select: js.UndefOr[js.Function2[/* e */ js.Any, /* type */ String, js.Any]] = js.undefined
  
  var size: js.UndefOr[String] = js.undefined
  
  var uiLibrary: js.UndefOr[String] = js.undefined
  
  var value: js.UndefOr[String] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
}
object TimePickerSettings {
  
  @scala.inline
  def apply(): TimePickerSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimePickerSettings]
  }
  
  @scala.inline
  implicit class TimePickerSettingsMutableBuilder[Self <: TimePickerSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChange(value: /* e */ js.Any => js.Any): Self = StObject.set(x, "change", js.Any.fromFunction1(value))
    
    @scala.inline
    def setChangeUndefined: Self = StObject.set(x, "change", js.undefined)
    
    @scala.inline
    def setClose(value: /* e */ js.Any => js.Any): Self = StObject.set(x, "close", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
    
    @scala.inline
    def setFooter(value: Boolean): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
    
    @scala.inline
    def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setHeader(value: Boolean): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    @scala.inline
    def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    @scala.inline
    def setModal(value: Boolean): Self = StObject.set(x, "modal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModalUndefined: Self = StObject.set(x, "modal", js.undefined)
    
    @scala.inline
    def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    @scala.inline
    def setOpen(value: /* e */ js.Any => js.Any): Self = StObject.set(x, "open", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
    
    @scala.inline
    def setSelect(value: (/* e */ js.Any, /* type */ String) => js.Any): Self = StObject.set(x, "select", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
    
    @scala.inline
    def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setUiLibrary(value: String): Self = StObject.set(x, "uiLibrary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUiLibraryUndefined: Self = StObject.set(x, "uiLibrary", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
