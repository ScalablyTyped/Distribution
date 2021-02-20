package typings.gijgo.Types

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// DateTimePicker
@js.native
trait DateTimePickerSettings extends StObject {
  
  //Events
  var change: js.UndefOr[js.Function1[/* e */ js.Any, _]] = js.native
  
  var datepicker: js.UndefOr[DatePickerSettings] = js.native
  
  var footer: js.UndefOr[Boolean] = js.native
  
  var format: js.UndefOr[String] = js.native
  
  var locale: js.UndefOr[String] = js.native
  
  var modal: js.UndefOr[Boolean] = js.native
  
  var size: js.UndefOr[String] = js.native
  
  var uiLibrary: js.UndefOr[String] = js.native
  
  var value: js.UndefOr[String] = js.native
  
  var width: js.UndefOr[Double] = js.native
}
object DateTimePickerSettings {
  
  @scala.inline
  def apply(): DateTimePickerSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DateTimePickerSettings]
  }
  
  @scala.inline
  implicit class DateTimePickerSettingsMutableBuilder[Self <: DateTimePickerSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChange(value: /* e */ js.Any => _): Self = StObject.set(x, "change", js.Any.fromFunction1(value))
    
    @scala.inline
    def setChangeUndefined: Self = StObject.set(x, "change", js.undefined)
    
    @scala.inline
    def setDatepicker(value: DatePickerSettings): Self = StObject.set(x, "datepicker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatepickerUndefined: Self = StObject.set(x, "datepicker", js.undefined)
    
    @scala.inline
    def setFooter(value: Boolean): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
    
    @scala.inline
    def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    @scala.inline
    def setModal(value: Boolean): Self = StObject.set(x, "modal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModalUndefined: Self = StObject.set(x, "modal", js.undefined)
    
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
