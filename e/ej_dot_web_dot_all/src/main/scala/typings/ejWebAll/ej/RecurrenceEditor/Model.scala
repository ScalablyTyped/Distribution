package typings.ejWebAll.ej.RecurrenceEditor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Model extends js.Object {
  /** Triggers whenever any of the Recurrence Editor's value is changed.
    */
  var change: js.UndefOr[js.Function1[/* e */ ChangeEventArgs, Unit]] = js.undefined
  /** Accepts the custom CSS class name, that defines user-defined styles and themes to be applied on partial or complete elements of the Recurrence Editor.
    */
  var cssClass: js.UndefOr[String] = js.undefined
  /** Sets the date format for the datepickers available within the Recurrence Editor.
    */
  var dateFormat: js.UndefOr[String] = js.undefined
  /** When set to true, renders the Recurrence Editor options from Right-to-Left direction.
    * @Default {false}
    */
  var enableRTL: js.UndefOr[Boolean] = js.undefined
  /** When set to true, enables the spin button of numeric textboxes within the Recurrence Editor.
    * @Default {true}
    */
  var enableSpinners: js.UndefOr[Boolean] = js.undefined
  /** Sets the starting day of the week.
    * @Default {null}
    */
  var firstDayOfWeek: js.UndefOr[String] = js.undefined
  /** Defines the collection of recurrence frequencies within Recurrence Editor such as Never, Daily, Weekly, Monthly, Yearly and Every Weekday.
    * @Default {[never, daily, weekly, monthly, yearly, everyweekday]}
    */
  var frequencies: js.UndefOr[js.Array[_]] = js.undefined
  /** Sets the specific culture to the Recurrence Editor.
    * @Default {en-US}
    */
  var locale: js.UndefOr[String] = js.undefined
  /** Sets the maximum date limit to display on the datepickers used within the Recurrence Editor. Setting maxDate with specific date value disallows the datepickers within the
    * Recurrence Editor to navigate beyond that date.
    * @Default {new Date(2099, 12, 31)}
    */
  var maxDate: js.UndefOr[js.Any] = js.undefined
  /** Sets the minimum date limit to display on the datepickers defined within the Recurrence Editor. Setting minDate with specific date value disallows the datepickers within
    * Recurrence Editor to navigate beyond that date.
    * @Default {new Date(1900, 01, 01)}
    */
  var minDate: js.UndefOr[js.Any] = js.undefined
  /** Sets the active/current repeat type(frequency) on Recurrence Editor based on the index value provided. For example, setting the value 1 will initially set the repeat type as Daily
    * and display its related options.
    * @Default {0}
    */
  var selectedRecurrenceType: js.UndefOr[Double] = js.undefined
  /** Sets the start date of the recurrence. The Recurrence Editor initially displays the current date as its start date.
    * @Default {new Date()}
    */
  var startDate: js.UndefOr[js.Any] = js.undefined
}

object Model {
  @scala.inline
  def apply(
    change: /* e */ ChangeEventArgs => Unit = null,
    cssClass: String = null,
    dateFormat: String = null,
    enableRTL: js.UndefOr[Boolean] = js.undefined,
    enableSpinners: js.UndefOr[Boolean] = js.undefined,
    firstDayOfWeek: String = null,
    frequencies: js.Array[_] = null,
    locale: String = null,
    maxDate: js.Any = null,
    minDate: js.Any = null,
    selectedRecurrenceType: Int | Double = null,
    startDate: js.Any = null
  ): Model = {
    val __obj = js.Dynamic.literal()
    if (change != null) __obj.updateDynamic("change")(js.Any.fromFunction1(change))
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass.asInstanceOf[js.Any])
    if (dateFormat != null) __obj.updateDynamic("dateFormat")(dateFormat.asInstanceOf[js.Any])
    if (!js.isUndefined(enableRTL)) __obj.updateDynamic("enableRTL")(enableRTL.asInstanceOf[js.Any])
    if (!js.isUndefined(enableSpinners)) __obj.updateDynamic("enableSpinners")(enableSpinners.asInstanceOf[js.Any])
    if (firstDayOfWeek != null) __obj.updateDynamic("firstDayOfWeek")(firstDayOfWeek.asInstanceOf[js.Any])
    if (frequencies != null) __obj.updateDynamic("frequencies")(frequencies.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (maxDate != null) __obj.updateDynamic("maxDate")(maxDate.asInstanceOf[js.Any])
    if (minDate != null) __obj.updateDynamic("minDate")(minDate.asInstanceOf[js.Any])
    if (selectedRecurrenceType != null) __obj.updateDynamic("selectedRecurrenceType")(selectedRecurrenceType.asInstanceOf[js.Any])
    if (startDate != null) __obj.updateDynamic("startDate")(startDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[Model]
  }
}

