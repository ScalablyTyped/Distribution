package typings.gijgo.Types

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DatePickerSettings extends js.Object {
  
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
  implicit class DatePickerSettingsOps[Self <: DatePickerSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCalendarWeeks(value: Boolean): Self = this.set("calendarWeeks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCalendarWeeks: Self = this.set("calendarWeeks", js.undefined)
    
    @scala.inline
    def setChange(value: /* e */ js.Any => _): Self = this.set("change", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteChange: Self = this.set("change", js.undefined)
    
    @scala.inline
    def setClose(value: /* e */ js.Any => _): Self = this.set("close", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteClose: Self = this.set("close", js.undefined)
    
    @scala.inline
    def setDisableDatesVarargs(value: js.Any*): Self = this.set("disableDates", js.Array(value :_*))
    
    @scala.inline
    def setDisableDates(value: js.Array[_] | js.Function): Self = this.set("disableDates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableDates: Self = this.set("disableDates", js.undefined)
    
    @scala.inline
    def setDisableDaysOfWeekVarargs(value: Double*): Self = this.set("disableDaysOfWeek", js.Array(value :_*))
    
    @scala.inline
    def setDisableDaysOfWeek(value: js.Array[Double]): Self = this.set("disableDaysOfWeek", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableDaysOfWeek: Self = this.set("disableDaysOfWeek", js.undefined)
    
    @scala.inline
    def setFooter(value: Boolean): Self = this.set("footer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFooter: Self = this.set("footer", js.undefined)
    
    @scala.inline
    def setFormat(value: String): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    
    @scala.inline
    def setHeader(value: Boolean): Self = this.set("header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeader: Self = this.set("header", js.undefined)
    
    @scala.inline
    def setIcons(value: DatePickerIcons): Self = this.set("icons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIcons: Self = this.set("icons", js.undefined)
    
    @scala.inline
    def setIconsLibrary(value: String): Self = this.set("iconsLibrary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconsLibrary: Self = this.set("iconsLibrary", js.undefined)
    
    @scala.inline
    def setKeyboardNavigation(value: Boolean): Self = this.set("keyboardNavigation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyboardNavigation: Self = this.set("keyboardNavigation", js.undefined)
    
    @scala.inline
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    
    @scala.inline
    def setMaxDate(value: Date | String | js.Function): Self = this.set("maxDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxDate: Self = this.set("maxDate", js.undefined)
    
    @scala.inline
    def setMinDate(value: Date | String | js.Function): Self = this.set("minDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinDate: Self = this.set("minDate", js.undefined)
    
    @scala.inline
    def setModal(value: Boolean): Self = this.set("modal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModal: Self = this.set("modal", js.undefined)
    
    @scala.inline
    def setOpen(value: /* e */ js.Any => _): Self = this.set("open", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOpen: Self = this.set("open", js.undefined)
    
    @scala.inline
    def setSelect(value: (/* e */ js.Any, /* type */ String) => _): Self = this.set("select", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteSelect: Self = this.set("select", js.undefined)
    
    @scala.inline
    def setSelectOtherMonths(value: Boolean): Self = this.set("selectOtherMonths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectOtherMonths: Self = this.set("selectOtherMonths", js.undefined)
    
    @scala.inline
    def setShowOnFocus(value: Boolean): Self = this.set("showOnFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowOnFocus: Self = this.set("showOnFocus", js.undefined)
    
    @scala.inline
    def setShowOtherMonths(value: Boolean): Self = this.set("showOtherMonths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowOtherMonths: Self = this.set("showOtherMonths", js.undefined)
    
    @scala.inline
    def setShowRightIcon(value: Boolean): Self = this.set("showRightIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowRightIcon: Self = this.set("showRightIcon", js.undefined)
    
    @scala.inline
    def setSize(value: String): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setUiLibrary(value: String): Self = this.set("uiLibrary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUiLibrary: Self = this.set("uiLibrary", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    
    @scala.inline
    def setWeekStartDay(value: Double): Self = this.set("weekStartDay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWeekStartDay: Self = this.set("weekStartDay", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
