package typings.ejWebAll.ej.DateRangePicker

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Model extends js.Object {
  /** Fires when the DateRangePicker values get changed.
    */
  var Change: js.UndefOr[js.Function1[/* e */ ChangeEventArgs, Unit]] = js.native
  /** Used to allow or restrict the editing in DateRangePicker input field directly. By setting false to this API, You can only pick the date ranges from DateRangePicker popup.
    * @Default {true}
    */
  var allowEdit: js.UndefOr[Boolean] = js.native
  /** Fires before closing the DateRangePicker popup.
    */
  var beforeClose: js.UndefOr[js.Function1[/* e */ BeforeCloseEventArgs, Unit]] = js.native
  /** Fires before opening the DateRangePicker popup.
    */
  var beforeOpen: js.UndefOr[js.Function1[/* e */ BeforeOpenEventArgs, Unit]] = js.native
  /** Sets the specified text value to the available buttons (Reset, Cancel, Apply) in the DateRangePicker popup.
    * @Default {{ reset: Reset, cancel: Cancel, apply: Apply}}
    */
  var buttonText: js.UndefOr[js.Any] = js.native
  /** Fires when DateRangePicker popup is closed.
    */
  var close: js.UndefOr[js.Function1[/* e */ CloseEventArgs, Unit]] = js.native
  /** Fires when the DateRangePicker is created successfully.
    */
  var create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, Unit]] = js.native
  /** Sets the root CSS class for DateRangePicker theme, which is used to customize.
    */
  var cssClass: js.UndefOr[String] = js.native
  /** Formats the date value of the DateRangePicker in to the specified date format. If this API is not specified, dateFormat will be set based on the current culture of DateRangePicker.
    * @Default {MM/dd/yyyy}
    */
  var dateFormat: js.UndefOr[String] = js.native
  /** Fires when the DateRangePicker is destroyed successfully.
    */
  var destroy: js.UndefOr[js.Function1[/* e */ DestroyEventArgs, Unit]] = js.native
  /** Sustain the entire widget model of DateRangePicker even after form post or browser refresh
    * @Default {false}
    */
  var enablePersistence: js.UndefOr[Boolean] = js.native
  /** Allows to embed the Timepicker align with the calendars in the page, two timepicker will be render, for selecting start and end date.
    * @Default {false}
    */
  var enableTimePicker: js.UndefOr[Boolean] = js.native
  /** Enable or disable the DateRangePicker control.
    * @Default {true}
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /** Specifies the end date of the date ranges.
    * @Default {null}
    */
  var endDate: js.UndefOr[String | Date] = js.native
  /** Specifies the height of the DateRangePicker input.
    * @Default {28px}
    */
  var height: js.UndefOr[String | Double] = js.native
  /** Change the DateRangePicker calendar and date format based on given culture.
    * @Default {en-US}
    */
  var locale: js.UndefOr[String] = js.native
  /** Specifies the maximum date in the calendar that the user can select as a startDate or endDate.
    * @Default {new Date(2099, 11, 31)}
    */
  var maxDate: js.UndefOr[String | Date] = js.native
  /** Specifies the minimum date in the calendar that the user can select as a startDate or endDate.
    * @Default {new Date(1900, 00, 01)}
    */
  var minDate: js.UndefOr[String | Date] = js.native
  /** Fires when DateRangePicker popup is opened.
    */
  var open: js.UndefOr[js.Function1[/* e */ OpenEventArgs, Unit]] = js.native
  /** Used to add the preset ranges. Added ranges using this, will show in popup in right side for easy selection of different preset ranges.
    * @Default {null}
    */
  var ranges: js.UndefOr[js.Any] = js.native
  /** Fires when a date ranges is selected from the DateRangePicker popup.
    */
  var select: js.UndefOr[js.Function1[/* e */ SelectEventArgs, Unit]] = js.native
  /** Used to separate the two date strings of the value in the DateRangePicker popup.
    * @Default {-}
    */
  var separator: js.UndefOr[String] = js.native
  /** Shows/hides the date icon button at right side of textbox, which is used to open or close the DateRangePicker calendar popup.
    * @Default {true}
    */
  var showPopupButton: js.UndefOr[Boolean] = js.native
  /** DateRangePicker input and popup is displayed with rounded corner when this property is set to true.
    * @Default {false}
    */
  var showRoundedCorner: js.UndefOr[Boolean] = js.native
  /** Specifies the start date of the date ranges
    * @Default {null}
    */
  var startDate: js.UndefOr[String | Date] = js.native
  /** Formats the date value of the DateRangePicker in to the specified time format. If this API is not specified, timeFormat will be set based on the current culture of DateRangePicker.
    * @Default {HH:mm tt}
    */
  var timeFormat: js.UndefOr[String] = js.native
  /** Separated two date values in string format to sets the date ranges in calendars.
    * @Default {null}
    */
  var value: js.UndefOr[String] = js.native
  /** Specifies the water mark text to be displayed in input text.
    * @Default {Select Range}
    */
  var watermarkText: js.UndefOr[String] = js.native
  /** Specifies the width of the DateRangePicker input text.
    * @Default {160px}
    */
  var width: js.UndefOr[String | Double] = js.native
}

object Model {
  @scala.inline
  def apply(): Model = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Model]
  }
  @scala.inline
  implicit class ModelOps[Self <: Model] (val x: Self) extends AnyVal {
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
    def setChange(value: /* e */ ChangeEventArgs => Unit): Self = this.set("Change", js.Any.fromFunction1(value))
    @scala.inline
    def deleteChange: Self = this.set("Change", js.undefined)
    @scala.inline
    def setAllowEdit(value: Boolean): Self = this.set("allowEdit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowEdit: Self = this.set("allowEdit", js.undefined)
    @scala.inline
    def setBeforeClose(value: /* e */ BeforeCloseEventArgs => Unit): Self = this.set("beforeClose", js.Any.fromFunction1(value))
    @scala.inline
    def deleteBeforeClose: Self = this.set("beforeClose", js.undefined)
    @scala.inline
    def setBeforeOpen(value: /* e */ BeforeOpenEventArgs => Unit): Self = this.set("beforeOpen", js.Any.fromFunction1(value))
    @scala.inline
    def deleteBeforeOpen: Self = this.set("beforeOpen", js.undefined)
    @scala.inline
    def setButtonText(value: js.Any): Self = this.set("buttonText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteButtonText: Self = this.set("buttonText", js.undefined)
    @scala.inline
    def setClose(value: /* e */ CloseEventArgs => Unit): Self = this.set("close", js.Any.fromFunction1(value))
    @scala.inline
    def deleteClose: Self = this.set("close", js.undefined)
    @scala.inline
    def setCreate(value: /* e */ CreateEventArgs => Unit): Self = this.set("create", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCreate: Self = this.set("create", js.undefined)
    @scala.inline
    def setCssClass(value: String): Self = this.set("cssClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCssClass: Self = this.set("cssClass", js.undefined)
    @scala.inline
    def setDateFormat(value: String): Self = this.set("dateFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDateFormat: Self = this.set("dateFormat", js.undefined)
    @scala.inline
    def setDestroy(value: /* e */ DestroyEventArgs => Unit): Self = this.set("destroy", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDestroy: Self = this.set("destroy", js.undefined)
    @scala.inline
    def setEnablePersistence(value: Boolean): Self = this.set("enablePersistence", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnablePersistence: Self = this.set("enablePersistence", js.undefined)
    @scala.inline
    def setEnableTimePicker(value: Boolean): Self = this.set("enableTimePicker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableTimePicker: Self = this.set("enableTimePicker", js.undefined)
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    @scala.inline
    def setEndDate(value: String | Date): Self = this.set("endDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndDate: Self = this.set("endDate", js.undefined)
    @scala.inline
    def setHeight(value: String | Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    @scala.inline
    def setMaxDate(value: String | Date): Self = this.set("maxDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxDate: Self = this.set("maxDate", js.undefined)
    @scala.inline
    def setMinDate(value: String | Date): Self = this.set("minDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinDate: Self = this.set("minDate", js.undefined)
    @scala.inline
    def setOpen(value: /* e */ OpenEventArgs => Unit): Self = this.set("open", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOpen: Self = this.set("open", js.undefined)
    @scala.inline
    def setRanges(value: js.Any): Self = this.set("ranges", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRanges: Self = this.set("ranges", js.undefined)
    @scala.inline
    def setSelect(value: /* e */ SelectEventArgs => Unit): Self = this.set("select", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSelect: Self = this.set("select", js.undefined)
    @scala.inline
    def setSeparator(value: String): Self = this.set("separator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeparator: Self = this.set("separator", js.undefined)
    @scala.inline
    def setShowPopupButton(value: Boolean): Self = this.set("showPopupButton", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowPopupButton: Self = this.set("showPopupButton", js.undefined)
    @scala.inline
    def setShowRoundedCorner(value: Boolean): Self = this.set("showRoundedCorner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowRoundedCorner: Self = this.set("showRoundedCorner", js.undefined)
    @scala.inline
    def setStartDate(value: String | Date): Self = this.set("startDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartDate: Self = this.set("startDate", js.undefined)
    @scala.inline
    def setTimeFormat(value: String): Self = this.set("timeFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeFormat: Self = this.set("timeFormat", js.undefined)
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    @scala.inline
    def setWatermarkText(value: String): Self = this.set("watermarkText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWatermarkText: Self = this.set("watermarkText", js.undefined)
    @scala.inline
    def setWidth(value: String | Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

