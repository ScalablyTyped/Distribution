package typings.fundamentalReact.datePickerMod

import org.scalablytyped.runtime.StringDictionary
import typings.fundamentalReact.anon.NextMonth
import typings.fundamentalReact.anon.State
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  buttonLabel :string | undefined,   buttonProps :{[x: string] : any} | undefined,   compact :boolean | undefined,   defaultValue :string | undefined,   enableRangeSelection :boolean | undefined,   inputProps :{[x: string] : any} | undefined,   locale :string | undefined,   onBlur :(hasDateFormattedDate : {  date :std.Date,   formattedDate :string}): void | undefined,   validationState :{  state :'error' | 'warning' | 'information' | 'success' | undefined,   text :string | undefined} | undefined, [x: string] : any} & fundamental-react.fundamental-react/lib/Calendar/Calendar.CalendarBaseProps */
@js.native
trait DatePickerProps
  extends /* x */ StringDictionary[js.Any] {
  var blockedDates: js.UndefOr[js.Array[Date]] = js.native
  var buttonLabel: js.UndefOr[String] = js.native
  var buttonProps: js.UndefOr[StringDictionary[js.Any]] = js.native
  var compact: js.UndefOr[Boolean] = js.native
  var defaultValue: js.UndefOr[String] = js.native
  var disableAfterDate: js.UndefOr[Date] = js.native
  var disableBeforeDate: js.UndefOr[Date] = js.native
  var disableFutureDates: js.UndefOr[Boolean] = js.native
  var disablePastDates: js.UndefOr[Boolean] = js.native
  var disableStyles: js.UndefOr[Boolean] = js.native
  var disableWeekday: js.UndefOr[js.Array[String]] = js.native
  var disableWeekends: js.UndefOr[Boolean] = js.native
  var disabledDates: js.UndefOr[js.Array[Date]] = js.native
  var enableRangeSelection: js.UndefOr[Boolean] = js.native
  var inputProps: js.UndefOr[StringDictionary[js.Any]] = js.native
  var locale: js.UndefOr[String] = js.native
  var localizedText: js.UndefOr[NextMonth] = js.native
  var onBlur: js.UndefOr[
    js.Function1[/* hasDateFormattedDate */ typings.fundamentalReact.anon.Date, Unit]
  ] = js.native
  var validationState: js.UndefOr[State] = js.native
}

object DatePickerProps {
  @scala.inline
  def apply(): DatePickerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatePickerProps]
  }
  @scala.inline
  implicit class DatePickerPropsOps[Self <: DatePickerProps] (val x: Self) extends AnyVal {
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
    def setBlockedDatesVarargs(value: Date*): Self = this.set("blockedDates", js.Array(value :_*))
    @scala.inline
    def setBlockedDates(value: js.Array[Date]): Self = this.set("blockedDates", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBlockedDates: Self = this.set("blockedDates", js.undefined)
    @scala.inline
    def setButtonLabel(value: String): Self = this.set("buttonLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteButtonLabel: Self = this.set("buttonLabel", js.undefined)
    @scala.inline
    def setButtonProps(value: StringDictionary[js.Any]): Self = this.set("buttonProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteButtonProps: Self = this.set("buttonProps", js.undefined)
    @scala.inline
    def setCompact(value: Boolean): Self = this.set("compact", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompact: Self = this.set("compact", js.undefined)
    @scala.inline
    def setDefaultValue(value: String): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultValue: Self = this.set("defaultValue", js.undefined)
    @scala.inline
    def setDisableAfterDate(value: Date): Self = this.set("disableAfterDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableAfterDate: Self = this.set("disableAfterDate", js.undefined)
    @scala.inline
    def setDisableBeforeDate(value: Date): Self = this.set("disableBeforeDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableBeforeDate: Self = this.set("disableBeforeDate", js.undefined)
    @scala.inline
    def setDisableFutureDates(value: Boolean): Self = this.set("disableFutureDates", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableFutureDates: Self = this.set("disableFutureDates", js.undefined)
    @scala.inline
    def setDisablePastDates(value: Boolean): Self = this.set("disablePastDates", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisablePastDates: Self = this.set("disablePastDates", js.undefined)
    @scala.inline
    def setDisableStyles(value: Boolean): Self = this.set("disableStyles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableStyles: Self = this.set("disableStyles", js.undefined)
    @scala.inline
    def setDisableWeekdayVarargs(value: String*): Self = this.set("disableWeekday", js.Array(value :_*))
    @scala.inline
    def setDisableWeekday(value: js.Array[String]): Self = this.set("disableWeekday", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableWeekday: Self = this.set("disableWeekday", js.undefined)
    @scala.inline
    def setDisableWeekends(value: Boolean): Self = this.set("disableWeekends", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableWeekends: Self = this.set("disableWeekends", js.undefined)
    @scala.inline
    def setDisabledDatesVarargs(value: Date*): Self = this.set("disabledDates", js.Array(value :_*))
    @scala.inline
    def setDisabledDates(value: js.Array[Date]): Self = this.set("disabledDates", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabledDates: Self = this.set("disabledDates", js.undefined)
    @scala.inline
    def setEnableRangeSelection(value: Boolean): Self = this.set("enableRangeSelection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableRangeSelection: Self = this.set("enableRangeSelection", js.undefined)
    @scala.inline
    def setInputProps(value: StringDictionary[js.Any]): Self = this.set("inputProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputProps: Self = this.set("inputProps", js.undefined)
    @scala.inline
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    @scala.inline
    def setLocalizedText(value: NextMonth): Self = this.set("localizedText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocalizedText: Self = this.set("localizedText", js.undefined)
    @scala.inline
    def setOnBlur(value: /* hasDateFormattedDate */ typings.fundamentalReact.anon.Date => Unit): Self = this.set("onBlur", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnBlur: Self = this.set("onBlur", js.undefined)
    @scala.inline
    def setValidationState(value: State): Self = this.set("validationState", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValidationState: Self = this.set("validationState", js.undefined)
  }
  
}

