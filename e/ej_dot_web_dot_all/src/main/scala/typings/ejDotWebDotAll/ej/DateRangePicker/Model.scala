package typings.ejDotWebDotAll.ej.DateRangePicker

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Model extends js.Object {
  /** Fires when the DateRangePicker values get changed.
    */
  var Change: js.UndefOr[js.Function1[/* e */ ChangeEventArgs, Unit]] = js.undefined
  /** Used to allow or restrict the editing in DateRangePicker input field directly. By setting false to this API, You can only pick the date ranges from DateRangePicker popup.
    * @Default {true}
    */
  var allowEdit: js.UndefOr[Boolean] = js.undefined
  /** Fires before closing the DateRangePicker popup.
    */
  var beforeClose: js.UndefOr[js.Function1[/* e */ BeforeCloseEventArgs, Unit]] = js.undefined
  /** Fires before opening the DateRangePicker popup.
    */
  var beforeOpen: js.UndefOr[js.Function1[/* e */ BeforeOpenEventArgs, Unit]] = js.undefined
  /** Sets the specified text value to the available buttons (Reset, Cancel, Apply) in the DateRangePicker popup.
    * @Default {{ reset: Reset, cancel: Cancel, apply: Apply}}
    */
  var buttonText: js.UndefOr[js.Any] = js.undefined
  /** Fires when DateRangePicker popup is closed.
    */
  var close: js.UndefOr[js.Function1[/* e */ CloseEventArgs, Unit]] = js.undefined
  /** Fires when the DateRangePicker is created successfully.
    */
  var create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, Unit]] = js.undefined
  /** Sets the root CSS class for DateRangePicker theme, which is used to customize.
    */
  var cssClass: js.UndefOr[String] = js.undefined
  /** Formats the date value of the DateRangePicker in to the specified date format. If this API is not specified, dateFormat will be set based on the current culture of DateRangePicker.
    * @Default {MM/dd/yyyy}
    */
  var dateFormat: js.UndefOr[String] = js.undefined
  /** Fires when the DateRangePicker is destroyed successfully.
    */
  var destroy: js.UndefOr[js.Function1[/* e */ DestroyEventArgs, Unit]] = js.undefined
  /** Sustain the entire widget model of DateRangePicker even after form post or browser refresh
    * @Default {false}
    */
  var enablePersistence: js.UndefOr[Boolean] = js.undefined
  /** Allows to embed the Timepicker align with the calendars in the page, two timepicker will be render, for selecting start and end date.
    * @Default {false}
    */
  var enableTimePicker: js.UndefOr[Boolean] = js.undefined
  /** Enable or disable the DateRangePicker control.
    * @Default {true}
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  /** Specifies the end date of the date ranges.
    * @Default {null}
    */
  var endDate: js.UndefOr[String | Date] = js.undefined
  /** Specifies the height of the DateRangePicker input.
    * @Default {28px}
    */
  var height: js.UndefOr[String | Double] = js.undefined
  /** Change the DateRangePicker calendar and date format based on given culture.
    * @Default {en-US}
    */
  var locale: js.UndefOr[String] = js.undefined
  /** Specifies the maximum date in the calendar that the user can select as a startDate or endDate.
    * @Default {new Date(2099, 11, 31)}
    */
  var maxDate: js.UndefOr[String | Date] = js.undefined
  /** Specifies the minimum date in the calendar that the user can select as a startDate or endDate.
    * @Default {new Date(1900, 00, 01)}
    */
  var minDate: js.UndefOr[String | Date] = js.undefined
  /** Fires when DateRangePicker popup is opened.
    */
  var open: js.UndefOr[js.Function1[/* e */ OpenEventArgs, Unit]] = js.undefined
  /** Used to add the preset ranges. Added ranges using this, will show in popup in right side for easy selection of different preset ranges.
    * @Default {null}
    */
  var ranges: js.UndefOr[js.Any] = js.undefined
  /** Fires when a date ranges is selected from the DateRangePicker popup.
    */
  var select: js.UndefOr[js.Function1[/* e */ SelectEventArgs, Unit]] = js.undefined
  /** Used to separate the two date strings of the value in the DateRangePicker popup.
    * @Default {-}
    */
  var separator: js.UndefOr[String] = js.undefined
  /** Shows/hides the date icon button at right side of textbox, which is used to open or close the DateRangePicker calendar popup.
    * @Default {true}
    */
  var showPopupButton: js.UndefOr[Boolean] = js.undefined
  /** DateRangePicker input and popup is displayed with rounded corner when this property is set to true.
    * @Default {false}
    */
  var showRoundedCorner: js.UndefOr[Boolean] = js.undefined
  /** Specifies the start date of the date ranges
    * @Default {null}
    */
  var startDate: js.UndefOr[String | Date] = js.undefined
  /** Formats the date value of the DateRangePicker in to the specified time format. If this API is not specified, timeFormat will be set based on the current culture of DateRangePicker.
    * @Default {HH:mm tt}
    */
  var timeFormat: js.UndefOr[String] = js.undefined
  /** Separated two date values in string format to sets the date ranges in calendars.
    * @Default {null}
    */
  var value: js.UndefOr[String] = js.undefined
  /** Specifies the water mark text to be displayed in input text.
    * @Default {Select Range}
    */
  var watermarkText: js.UndefOr[String] = js.undefined
  /** Specifies the width of the DateRangePicker input text.
    * @Default {160px}
    */
  var width: js.UndefOr[String | Double] = js.undefined
}

object Model {
  @scala.inline
  def apply(
    Change: /* e */ ChangeEventArgs => Unit = null,
    allowEdit: js.UndefOr[Boolean] = js.undefined,
    beforeClose: /* e */ BeforeCloseEventArgs => Unit = null,
    beforeOpen: /* e */ BeforeOpenEventArgs => Unit = null,
    buttonText: js.Any = null,
    close: /* e */ CloseEventArgs => Unit = null,
    create: /* e */ CreateEventArgs => Unit = null,
    cssClass: String = null,
    dateFormat: String = null,
    destroy: /* e */ DestroyEventArgs => Unit = null,
    enablePersistence: js.UndefOr[Boolean] = js.undefined,
    enableTimePicker: js.UndefOr[Boolean] = js.undefined,
    enabled: js.UndefOr[Boolean] = js.undefined,
    endDate: String | Date = null,
    height: String | Double = null,
    locale: String = null,
    maxDate: String | Date = null,
    minDate: String | Date = null,
    open: /* e */ OpenEventArgs => Unit = null,
    ranges: js.Any = null,
    select: /* e */ SelectEventArgs => Unit = null,
    separator: String = null,
    showPopupButton: js.UndefOr[Boolean] = js.undefined,
    showRoundedCorner: js.UndefOr[Boolean] = js.undefined,
    startDate: String | Date = null,
    timeFormat: String = null,
    value: String = null,
    watermarkText: String = null,
    width: String | Double = null
  ): Model = {
    val __obj = js.Dynamic.literal()
    if (Change != null) __obj.updateDynamic("Change")(js.Any.fromFunction1(Change))
    if (!js.isUndefined(allowEdit)) __obj.updateDynamic("allowEdit")(allowEdit.asInstanceOf[js.Any])
    if (beforeClose != null) __obj.updateDynamic("beforeClose")(js.Any.fromFunction1(beforeClose))
    if (beforeOpen != null) __obj.updateDynamic("beforeOpen")(js.Any.fromFunction1(beforeOpen))
    if (buttonText != null) __obj.updateDynamic("buttonText")(buttonText.asInstanceOf[js.Any])
    if (close != null) __obj.updateDynamic("close")(js.Any.fromFunction1(close))
    if (create != null) __obj.updateDynamic("create")(js.Any.fromFunction1(create))
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass.asInstanceOf[js.Any])
    if (dateFormat != null) __obj.updateDynamic("dateFormat")(dateFormat.asInstanceOf[js.Any])
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction1(destroy))
    if (!js.isUndefined(enablePersistence)) __obj.updateDynamic("enablePersistence")(enablePersistence.asInstanceOf[js.Any])
    if (!js.isUndefined(enableTimePicker)) __obj.updateDynamic("enableTimePicker")(enableTimePicker.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (endDate != null) __obj.updateDynamic("endDate")(endDate.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (maxDate != null) __obj.updateDynamic("maxDate")(maxDate.asInstanceOf[js.Any])
    if (minDate != null) __obj.updateDynamic("minDate")(minDate.asInstanceOf[js.Any])
    if (open != null) __obj.updateDynamic("open")(js.Any.fromFunction1(open))
    if (ranges != null) __obj.updateDynamic("ranges")(ranges.asInstanceOf[js.Any])
    if (select != null) __obj.updateDynamic("select")(js.Any.fromFunction1(select))
    if (separator != null) __obj.updateDynamic("separator")(separator.asInstanceOf[js.Any])
    if (!js.isUndefined(showPopupButton)) __obj.updateDynamic("showPopupButton")(showPopupButton.asInstanceOf[js.Any])
    if (!js.isUndefined(showRoundedCorner)) __obj.updateDynamic("showRoundedCorner")(showRoundedCorner.asInstanceOf[js.Any])
    if (startDate != null) __obj.updateDynamic("startDate")(startDate.asInstanceOf[js.Any])
    if (timeFormat != null) __obj.updateDynamic("timeFormat")(timeFormat.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (watermarkText != null) __obj.updateDynamic("watermarkText")(watermarkText.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Model]
  }
}

