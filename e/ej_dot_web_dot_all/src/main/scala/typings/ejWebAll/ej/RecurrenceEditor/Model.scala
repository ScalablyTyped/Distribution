package typings.ejWebAll.ej.RecurrenceEditor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Model extends js.Object {
  /** Triggers whenever any of the Recurrence Editor's value is changed.
    */
  var change: js.UndefOr[js.Function1[/* e */ ChangeEventArgs, Unit]] = js.native
  /** Accepts the custom CSS class name, that defines user-defined styles and themes to be applied on partial or complete elements of the Recurrence Editor.
    */
  var cssClass: js.UndefOr[String] = js.native
  /** Sets the date format for the datepickers available within the Recurrence Editor.
    */
  var dateFormat: js.UndefOr[String] = js.native
  /** When set to true, renders the Recurrence Editor options from Right-to-Left direction.
    * @Default {false}
    */
  var enableRTL: js.UndefOr[Boolean] = js.native
  /** When set to true, enables the spin button of numeric textboxes within the Recurrence Editor.
    * @Default {true}
    */
  var enableSpinners: js.UndefOr[Boolean] = js.native
  /** Sets the starting day of the week.
    * @Default {null}
    */
  var firstDayOfWeek: js.UndefOr[String] = js.native
  /** Defines the collection of recurrence frequencies within Recurrence Editor such as Never, Daily, Weekly, Monthly, Yearly and Every Weekday.
    * @Default {[never, daily, weekly, monthly, yearly, everyweekday]}
    */
  var frequencies: js.UndefOr[js.Array[_]] = js.native
  /** Sets the specific culture to the Recurrence Editor.
    * @Default {en-US}
    */
  var locale: js.UndefOr[String] = js.native
  /** Sets the maximum date limit to display on the datepickers used within the Recurrence Editor. Setting maxDate with specific date value disallows the datepickers within the
    * Recurrence Editor to navigate beyond that date.
    * @Default {new Date(2099, 12, 31)}
    */
  var maxDate: js.UndefOr[js.Any] = js.native
  /** Sets the minimum date limit to display on the datepickers defined within the Recurrence Editor. Setting minDate with specific date value disallows the datepickers within
    * Recurrence Editor to navigate beyond that date.
    * @Default {new Date(1900, 01, 01)}
    */
  var minDate: js.UndefOr[js.Any] = js.native
  /** Sets the active/current repeat type(frequency) on Recurrence Editor based on the index value provided. For example, setting the value 1 will initially set the repeat type as Daily
    * and display its related options.
    * @Default {0}
    */
  var selectedRecurrenceType: js.UndefOr[Double] = js.native
  /** Sets the start date of the recurrence. The Recurrence Editor initially displays the current date as its start date.
    * @Default {new Date()}
    */
  var startDate: js.UndefOr[js.Any] = js.native
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
    def setChange(value: /* e */ ChangeEventArgs => Unit): Self = this.set("change", js.Any.fromFunction1(value))
    @scala.inline
    def deleteChange: Self = this.set("change", js.undefined)
    @scala.inline
    def setCssClass(value: String): Self = this.set("cssClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCssClass: Self = this.set("cssClass", js.undefined)
    @scala.inline
    def setDateFormat(value: String): Self = this.set("dateFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDateFormat: Self = this.set("dateFormat", js.undefined)
    @scala.inline
    def setEnableRTL(value: Boolean): Self = this.set("enableRTL", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableRTL: Self = this.set("enableRTL", js.undefined)
    @scala.inline
    def setEnableSpinners(value: Boolean): Self = this.set("enableSpinners", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableSpinners: Self = this.set("enableSpinners", js.undefined)
    @scala.inline
    def setFirstDayOfWeek(value: String): Self = this.set("firstDayOfWeek", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFirstDayOfWeek: Self = this.set("firstDayOfWeek", js.undefined)
    @scala.inline
    def setFrequenciesVarargs(value: js.Any*): Self = this.set("frequencies", js.Array(value :_*))
    @scala.inline
    def setFrequencies(value: js.Array[_]): Self = this.set("frequencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFrequencies: Self = this.set("frequencies", js.undefined)
    @scala.inline
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    @scala.inline
    def setMaxDate(value: js.Any): Self = this.set("maxDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxDate: Self = this.set("maxDate", js.undefined)
    @scala.inline
    def setMinDate(value: js.Any): Self = this.set("minDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinDate: Self = this.set("minDate", js.undefined)
    @scala.inline
    def setSelectedRecurrenceType(value: Double): Self = this.set("selectedRecurrenceType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectedRecurrenceType: Self = this.set("selectedRecurrenceType", js.undefined)
    @scala.inline
    def setStartDate(value: js.Any): Self = this.set("startDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartDate: Self = this.set("startDate", js.undefined)
  }
  
}

