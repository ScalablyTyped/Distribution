package typings.gijgo.Types

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DatePickerSettings extends StObject {
  
  var calendarWeeks: js.UndefOr[Boolean] = js.native
  
  //Events
  var change: js.UndefOr[js.Function1[/* e */ js.Any, _]] = js.native
  
  var close: js.UndefOr[js.Function1[/* e */ js.Any, _]] = js.native
  
  var disableDates: js.UndefOr[js.Array[_] | js.Function] = js.native
  
  var disableDaysOfWeek: js.UndefOr[js.Array[Double]] = js.native
  
  var footer: js.UndefOr[Boolean] = js.native
  
  var format: js.UndefOr[String] = js.native
  
  var header: js.UndefOr[Boolean] = js.native
  
  var icons: js.UndefOr[DatePickerIcons] = js.native
  
  var iconsLibrary: js.UndefOr[String] = js.native
  
  var keyboardNavigation: js.UndefOr[Boolean] = js.native
  
  var locale: js.UndefOr[String] = js.native
  
  var maxDate: js.UndefOr[Date | String | js.Function] = js.native
  
  var minDate: js.UndefOr[Date | String | js.Function] = js.native
  
  var modal: js.UndefOr[Boolean] = js.native
  
  var open: js.UndefOr[js.Function1[/* e */ js.Any, _]] = js.native
  
  var select: js.UndefOr[js.Function2[/* e */ js.Any, /* type */ String, _]] = js.native
  
  var selectOtherMonths: js.UndefOr[Boolean] = js.native
  
  var showOnFocus: js.UndefOr[Boolean] = js.native
  
  var showOtherMonths: js.UndefOr[Boolean] = js.native
  
  var showRightIcon: js.UndefOr[Boolean] = js.native
  
  var size: js.UndefOr[String] = js.native
  
  var uiLibrary: js.UndefOr[String] = js.native
  
  var value: js.UndefOr[String] = js.native
  
  var weekStartDay: js.UndefOr[Double] = js.native
  
  var width: js.UndefOr[Double] = js.native
}
object DatePickerSettings {
  
  @scala.inline
  def apply(): DatePickerSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatePickerSettings]
  }
  
  @scala.inline
  implicit class DatePickerSettingsMutableBuilder[Self <: DatePickerSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCalendarWeeks(value: Boolean): Self = StObject.set(x, "calendarWeeks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCalendarWeeksUndefined: Self = StObject.set(x, "calendarWeeks", js.undefined)
    
    @scala.inline
    def setChange(value: /* e */ js.Any => _): Self = StObject.set(x, "change", js.Any.fromFunction1(value))
    
    @scala.inline
    def setChangeUndefined: Self = StObject.set(x, "change", js.undefined)
    
    @scala.inline
    def setClose(value: /* e */ js.Any => _): Self = StObject.set(x, "close", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
    
    @scala.inline
    def setDisableDates(value: js.Array[_] | js.Function): Self = StObject.set(x, "disableDates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableDatesUndefined: Self = StObject.set(x, "disableDates", js.undefined)
    
    @scala.inline
    def setDisableDatesVarargs(value: js.Any*): Self = StObject.set(x, "disableDates", js.Array(value :_*))
    
    @scala.inline
    def setDisableDaysOfWeek(value: js.Array[Double]): Self = StObject.set(x, "disableDaysOfWeek", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableDaysOfWeekUndefined: Self = StObject.set(x, "disableDaysOfWeek", js.undefined)
    
    @scala.inline
    def setDisableDaysOfWeekVarargs(value: Double*): Self = StObject.set(x, "disableDaysOfWeek", js.Array(value :_*))
    
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
    def setIcons(value: DatePickerIcons): Self = StObject.set(x, "icons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconsLibrary(value: String): Self = StObject.set(x, "iconsLibrary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconsLibraryUndefined: Self = StObject.set(x, "iconsLibrary", js.undefined)
    
    @scala.inline
    def setIconsUndefined: Self = StObject.set(x, "icons", js.undefined)
    
    @scala.inline
    def setKeyboardNavigation(value: Boolean): Self = StObject.set(x, "keyboardNavigation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyboardNavigationUndefined: Self = StObject.set(x, "keyboardNavigation", js.undefined)
    
    @scala.inline
    def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    @scala.inline
    def setMaxDate(value: Date | String | js.Function): Self = StObject.set(x, "maxDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxDateUndefined: Self = StObject.set(x, "maxDate", js.undefined)
    
    @scala.inline
    def setMinDate(value: Date | String | js.Function): Self = StObject.set(x, "minDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinDateUndefined: Self = StObject.set(x, "minDate", js.undefined)
    
    @scala.inline
    def setModal(value: Boolean): Self = StObject.set(x, "modal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModalUndefined: Self = StObject.set(x, "modal", js.undefined)
    
    @scala.inline
    def setOpen(value: /* e */ js.Any => _): Self = StObject.set(x, "open", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
    
    @scala.inline
    def setSelect(value: (/* e */ js.Any, /* type */ String) => _): Self = StObject.set(x, "select", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSelectOtherMonths(value: Boolean): Self = StObject.set(x, "selectOtherMonths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectOtherMonthsUndefined: Self = StObject.set(x, "selectOtherMonths", js.undefined)
    
    @scala.inline
    def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
    
    @scala.inline
    def setShowOnFocus(value: Boolean): Self = StObject.set(x, "showOnFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowOnFocusUndefined: Self = StObject.set(x, "showOnFocus", js.undefined)
    
    @scala.inline
    def setShowOtherMonths(value: Boolean): Self = StObject.set(x, "showOtherMonths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowOtherMonthsUndefined: Self = StObject.set(x, "showOtherMonths", js.undefined)
    
    @scala.inline
    def setShowRightIcon(value: Boolean): Self = StObject.set(x, "showRightIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowRightIconUndefined: Self = StObject.set(x, "showRightIcon", js.undefined)
    
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
    def setWeekStartDay(value: Double): Self = StObject.set(x, "weekStartDay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeekStartDayUndefined: Self = StObject.set(x, "weekStartDay", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
