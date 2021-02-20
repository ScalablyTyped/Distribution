package typings.fundamentalReact

import org.scalablytyped.runtime.StringDictionary
import typings.fundamentalReact.anon.NextMonth
import typings.fundamentalReact.anon.State
import typings.react.mod.Component
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object datePickerMod {
  
  @JSImport("fundamental-react/lib/DatePicker/DatePicker", JSImport.Default)
  @js.native
  class default ()
    extends Component[DatePickerProps, js.Object, js.Any]
  
  type DatePicker = Component[DatePickerProps, js.Object, js.Any]
  
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
    implicit class DatePickerPropsMutableBuilder[Self <: DatePickerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBlockedDates(value: js.Array[Date]): Self = StObject.set(x, "blockedDates", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlockedDatesUndefined: Self = StObject.set(x, "blockedDates", js.undefined)
      
      @scala.inline
      def setBlockedDatesVarargs(value: Date*): Self = StObject.set(x, "blockedDates", js.Array(value :_*))
      
      @scala.inline
      def setButtonLabel(value: String): Self = StObject.set(x, "buttonLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonLabelUndefined: Self = StObject.set(x, "buttonLabel", js.undefined)
      
      @scala.inline
      def setButtonProps(value: StringDictionary[js.Any]): Self = StObject.set(x, "buttonProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonPropsUndefined: Self = StObject.set(x, "buttonProps", js.undefined)
      
      @scala.inline
      def setCompact(value: Boolean): Self = StObject.set(x, "compact", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompactUndefined: Self = StObject.set(x, "compact", js.undefined)
      
      @scala.inline
      def setDefaultValue(value: String): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      @scala.inline
      def setDisableAfterDate(value: Date): Self = StObject.set(x, "disableAfterDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableAfterDateUndefined: Self = StObject.set(x, "disableAfterDate", js.undefined)
      
      @scala.inline
      def setDisableBeforeDate(value: Date): Self = StObject.set(x, "disableBeforeDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableBeforeDateUndefined: Self = StObject.set(x, "disableBeforeDate", js.undefined)
      
      @scala.inline
      def setDisableFutureDates(value: Boolean): Self = StObject.set(x, "disableFutureDates", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableFutureDatesUndefined: Self = StObject.set(x, "disableFutureDates", js.undefined)
      
      @scala.inline
      def setDisablePastDates(value: Boolean): Self = StObject.set(x, "disablePastDates", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisablePastDatesUndefined: Self = StObject.set(x, "disablePastDates", js.undefined)
      
      @scala.inline
      def setDisableStyles(value: Boolean): Self = StObject.set(x, "disableStyles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableStylesUndefined: Self = StObject.set(x, "disableStyles", js.undefined)
      
      @scala.inline
      def setDisableWeekday(value: js.Array[String]): Self = StObject.set(x, "disableWeekday", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableWeekdayUndefined: Self = StObject.set(x, "disableWeekday", js.undefined)
      
      @scala.inline
      def setDisableWeekdayVarargs(value: String*): Self = StObject.set(x, "disableWeekday", js.Array(value :_*))
      
      @scala.inline
      def setDisableWeekends(value: Boolean): Self = StObject.set(x, "disableWeekends", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableWeekendsUndefined: Self = StObject.set(x, "disableWeekends", js.undefined)
      
      @scala.inline
      def setDisabledDates(value: js.Array[Date]): Self = StObject.set(x, "disabledDates", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledDatesUndefined: Self = StObject.set(x, "disabledDates", js.undefined)
      
      @scala.inline
      def setDisabledDatesVarargs(value: Date*): Self = StObject.set(x, "disabledDates", js.Array(value :_*))
      
      @scala.inline
      def setEnableRangeSelection(value: Boolean): Self = StObject.set(x, "enableRangeSelection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableRangeSelectionUndefined: Self = StObject.set(x, "enableRangeSelection", js.undefined)
      
      @scala.inline
      def setInputProps(value: StringDictionary[js.Any]): Self = StObject.set(x, "inputProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputPropsUndefined: Self = StObject.set(x, "inputProps", js.undefined)
      
      @scala.inline
      def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      @scala.inline
      def setLocalizedText(value: NextMonth): Self = StObject.set(x, "localizedText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocalizedTextUndefined: Self = StObject.set(x, "localizedText", js.undefined)
      
      @scala.inline
      def setOnBlur(value: /* hasDateFormattedDate */ typings.fundamentalReact.anon.Date => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      @scala.inline
      def setValidationState(value: State): Self = StObject.set(x, "validationState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidationStateUndefined: Self = StObject.set(x, "validationState", js.undefined)
    }
  }
}
