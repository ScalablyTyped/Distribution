package typings.gijgo.Types

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DatePickerSettings extends StObject {
  
  var calendarWeeks: js.UndefOr[Boolean] = js.undefined
  
  //Events
  var change: js.UndefOr[js.Function1[/* e */ js.Any, js.Any]] = js.undefined
  
  var close: js.UndefOr[js.Function1[/* e */ js.Any, js.Any]] = js.undefined
  
  var disableDates: js.UndefOr[js.Array[js.Any] | js.Function] = js.undefined
  
  var disableDaysOfWeek: js.UndefOr[js.Array[Double]] = js.undefined
  
  var footer: js.UndefOr[Boolean] = js.undefined
  
  var format: js.UndefOr[String] = js.undefined
  
  var header: js.UndefOr[Boolean] = js.undefined
  
  var icons: js.UndefOr[DatePickerIcons] = js.undefined
  
  var iconsLibrary: js.UndefOr[String] = js.undefined
  
  var keyboardNavigation: js.UndefOr[Boolean] = js.undefined
  
  var locale: js.UndefOr[String] = js.undefined
  
  var maxDate: js.UndefOr[Date | String | js.Function] = js.undefined
  
  var minDate: js.UndefOr[Date | String | js.Function] = js.undefined
  
  var modal: js.UndefOr[Boolean] = js.undefined
  
  var open: js.UndefOr[js.Function1[/* e */ js.Any, js.Any]] = js.undefined
  
  var select: js.UndefOr[js.Function2[/* e */ js.Any, /* type */ String, js.Any]] = js.undefined
  
  var selectOtherMonths: js.UndefOr[Boolean] = js.undefined
  
  var showOnFocus: js.UndefOr[Boolean] = js.undefined
  
  var showOtherMonths: js.UndefOr[Boolean] = js.undefined
  
  var showRightIcon: js.UndefOr[Boolean] = js.undefined
  
  var size: js.UndefOr[String] = js.undefined
  
  var uiLibrary: js.UndefOr[String] = js.undefined
  
  var value: js.UndefOr[String] = js.undefined
  
  var weekStartDay: js.UndefOr[Double] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
}
object DatePickerSettings {
  
  inline def apply(): DatePickerSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatePickerSettings]
  }
  
  extension [Self <: DatePickerSettings](x: Self) {
    
    inline def setCalendarWeeks(value: Boolean): Self = StObject.set(x, "calendarWeeks", value.asInstanceOf[js.Any])
    
    inline def setCalendarWeeksUndefined: Self = StObject.set(x, "calendarWeeks", js.undefined)
    
    inline def setChange(value: /* e */ js.Any => js.Any): Self = StObject.set(x, "change", js.Any.fromFunction1(value))
    
    inline def setChangeUndefined: Self = StObject.set(x, "change", js.undefined)
    
    inline def setClose(value: /* e */ js.Any => js.Any): Self = StObject.set(x, "close", js.Any.fromFunction1(value))
    
    inline def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
    
    inline def setDisableDates(value: js.Array[js.Any] | js.Function): Self = StObject.set(x, "disableDates", value.asInstanceOf[js.Any])
    
    inline def setDisableDatesUndefined: Self = StObject.set(x, "disableDates", js.undefined)
    
    inline def setDisableDatesVarargs(value: js.Any*): Self = StObject.set(x, "disableDates", js.Array(value :_*))
    
    inline def setDisableDaysOfWeek(value: js.Array[Double]): Self = StObject.set(x, "disableDaysOfWeek", value.asInstanceOf[js.Any])
    
    inline def setDisableDaysOfWeekUndefined: Self = StObject.set(x, "disableDaysOfWeek", js.undefined)
    
    inline def setDisableDaysOfWeekVarargs(value: Double*): Self = StObject.set(x, "disableDaysOfWeek", js.Array(value :_*))
    
    inline def setFooter(value: Boolean): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
    
    inline def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
    
    inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setHeader(value: Boolean): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    inline def setIcons(value: DatePickerIcons): Self = StObject.set(x, "icons", value.asInstanceOf[js.Any])
    
    inline def setIconsLibrary(value: String): Self = StObject.set(x, "iconsLibrary", value.asInstanceOf[js.Any])
    
    inline def setIconsLibraryUndefined: Self = StObject.set(x, "iconsLibrary", js.undefined)
    
    inline def setIconsUndefined: Self = StObject.set(x, "icons", js.undefined)
    
    inline def setKeyboardNavigation(value: Boolean): Self = StObject.set(x, "keyboardNavigation", value.asInstanceOf[js.Any])
    
    inline def setKeyboardNavigationUndefined: Self = StObject.set(x, "keyboardNavigation", js.undefined)
    
    inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    inline def setMaxDate(value: Date | String | js.Function): Self = StObject.set(x, "maxDate", value.asInstanceOf[js.Any])
    
    inline def setMaxDateUndefined: Self = StObject.set(x, "maxDate", js.undefined)
    
    inline def setMinDate(value: Date | String | js.Function): Self = StObject.set(x, "minDate", value.asInstanceOf[js.Any])
    
    inline def setMinDateUndefined: Self = StObject.set(x, "minDate", js.undefined)
    
    inline def setModal(value: Boolean): Self = StObject.set(x, "modal", value.asInstanceOf[js.Any])
    
    inline def setModalUndefined: Self = StObject.set(x, "modal", js.undefined)
    
    inline def setOpen(value: /* e */ js.Any => js.Any): Self = StObject.set(x, "open", js.Any.fromFunction1(value))
    
    inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
    
    inline def setSelect(value: (/* e */ js.Any, /* type */ String) => js.Any): Self = StObject.set(x, "select", js.Any.fromFunction2(value))
    
    inline def setSelectOtherMonths(value: Boolean): Self = StObject.set(x, "selectOtherMonths", value.asInstanceOf[js.Any])
    
    inline def setSelectOtherMonthsUndefined: Self = StObject.set(x, "selectOtherMonths", js.undefined)
    
    inline def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
    
    inline def setShowOnFocus(value: Boolean): Self = StObject.set(x, "showOnFocus", value.asInstanceOf[js.Any])
    
    inline def setShowOnFocusUndefined: Self = StObject.set(x, "showOnFocus", js.undefined)
    
    inline def setShowOtherMonths(value: Boolean): Self = StObject.set(x, "showOtherMonths", value.asInstanceOf[js.Any])
    
    inline def setShowOtherMonthsUndefined: Self = StObject.set(x, "showOtherMonths", js.undefined)
    
    inline def setShowRightIcon(value: Boolean): Self = StObject.set(x, "showRightIcon", value.asInstanceOf[js.Any])
    
    inline def setShowRightIconUndefined: Self = StObject.set(x, "showRightIcon", js.undefined)
    
    inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setUiLibrary(value: String): Self = StObject.set(x, "uiLibrary", value.asInstanceOf[js.Any])
    
    inline def setUiLibraryUndefined: Self = StObject.set(x, "uiLibrary", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setWeekStartDay(value: Double): Self = StObject.set(x, "weekStartDay", value.asInstanceOf[js.Any])
    
    inline def setWeekStartDayUndefined: Self = StObject.set(x, "weekStartDay", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
