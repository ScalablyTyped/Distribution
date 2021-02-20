package typings.fundamentalReact

import org.scalablytyped.runtime.StringDictionary
import typings.fundamentalReact.anon.NextMonth
import typings.react.mod.Component
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object calendarMod {
  
  @JSImport("fundamental-react/lib/Calendar/Calendar", JSImport.Default)
  @js.native
  class default ()
    extends Component[CalendarProps, js.Object, js.Any]
  
  type Calendar = Component[CalendarProps, js.Object, js.Any]
  
  @js.native
  trait CalendarBaseProps extends StObject {
    
    var blockedDates: js.UndefOr[js.Array[Date]] = js.native
    
    var disableAfterDate: js.UndefOr[Date] = js.native
    
    var disableBeforeDate: js.UndefOr[Date] = js.native
    
    var disableFutureDates: js.UndefOr[Boolean] = js.native
    
    var disablePastDates: js.UndefOr[Boolean] = js.native
    
    var disableStyles: js.UndefOr[Boolean] = js.native
    
    var disableWeekday: js.UndefOr[js.Array[String]] = js.native
    
    var disableWeekends: js.UndefOr[Boolean] = js.native
    
    var disabledDates: js.UndefOr[js.Array[Date]] = js.native
    
    var localizedText: js.UndefOr[NextMonth] = js.native
  }
  object CalendarBaseProps {
    
    @scala.inline
    def apply(): CalendarBaseProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CalendarBaseProps]
    }
    
    @scala.inline
    implicit class CalendarBasePropsMutableBuilder[Self <: CalendarBaseProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBlockedDates(value: js.Array[Date]): Self = StObject.set(x, "blockedDates", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlockedDatesUndefined: Self = StObject.set(x, "blockedDates", js.undefined)
      
      @scala.inline
      def setBlockedDatesVarargs(value: Date*): Self = StObject.set(x, "blockedDates", js.Array(value :_*))
      
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
      def setLocalizedText(value: NextMonth): Self = StObject.set(x, "localizedText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocalizedTextUndefined: Self = StObject.set(x, "localizedText", js.undefined)
    }
  }
  
  /* Inlined {  monthListProps :{[x: string] : any} | undefined,   tableBodyProps :{[x: string] : any} | undefined,   tableHeaderProps :{[x: string] : any} | undefined,   tableProps :{[x: string] : any} | undefined,   yearListProps :{[x: string] : any} | undefined,   onChange :(date : std.Date): void | undefined, [x: string] : any} & fundamental-react.fundamental-react/lib/Calendar/Calendar.CalendarBaseProps */
  @js.native
  trait CalendarProps
    extends /* x */ StringDictionary[js.Any] {
    
    var blockedDates: js.UndefOr[js.Array[Date]] = js.native
    
    var disableAfterDate: js.UndefOr[Date] = js.native
    
    var disableBeforeDate: js.UndefOr[Date] = js.native
    
    var disableFutureDates: js.UndefOr[Boolean] = js.native
    
    var disablePastDates: js.UndefOr[Boolean] = js.native
    
    var disableStyles: js.UndefOr[Boolean] = js.native
    
    var disableWeekday: js.UndefOr[js.Array[String]] = js.native
    
    var disableWeekends: js.UndefOr[Boolean] = js.native
    
    var disabledDates: js.UndefOr[js.Array[Date]] = js.native
    
    var localizedText: js.UndefOr[NextMonth] = js.native
    
    var monthListProps: js.UndefOr[StringDictionary[js.Any]] = js.native
    
    var onChange: js.UndefOr[js.Function1[/* date */ Date, Unit]] = js.native
    
    var tableBodyProps: js.UndefOr[StringDictionary[js.Any]] = js.native
    
    var tableHeaderProps: js.UndefOr[StringDictionary[js.Any]] = js.native
    
    var tableProps: js.UndefOr[StringDictionary[js.Any]] = js.native
    
    var yearListProps: js.UndefOr[StringDictionary[js.Any]] = js.native
  }
  object CalendarProps {
    
    @scala.inline
    def apply(): CalendarProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CalendarProps]
    }
    
    @scala.inline
    implicit class CalendarPropsMutableBuilder[Self <: CalendarProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBlockedDates(value: js.Array[Date]): Self = StObject.set(x, "blockedDates", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlockedDatesUndefined: Self = StObject.set(x, "blockedDates", js.undefined)
      
      @scala.inline
      def setBlockedDatesVarargs(value: Date*): Self = StObject.set(x, "blockedDates", js.Array(value :_*))
      
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
      def setLocalizedText(value: NextMonth): Self = StObject.set(x, "localizedText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocalizedTextUndefined: Self = StObject.set(x, "localizedText", js.undefined)
      
      @scala.inline
      def setMonthListProps(value: StringDictionary[js.Any]): Self = StObject.set(x, "monthListProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMonthListPropsUndefined: Self = StObject.set(x, "monthListProps", js.undefined)
      
      @scala.inline
      def setOnChange(value: /* date */ Date => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setTableBodyProps(value: StringDictionary[js.Any]): Self = StObject.set(x, "tableBodyProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableBodyPropsUndefined: Self = StObject.set(x, "tableBodyProps", js.undefined)
      
      @scala.inline
      def setTableHeaderProps(value: StringDictionary[js.Any]): Self = StObject.set(x, "tableHeaderProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableHeaderPropsUndefined: Self = StObject.set(x, "tableHeaderProps", js.undefined)
      
      @scala.inline
      def setTableProps(value: StringDictionary[js.Any]): Self = StObject.set(x, "tableProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTablePropsUndefined: Self = StObject.set(x, "tableProps", js.undefined)
      
      @scala.inline
      def setYearListProps(value: StringDictionary[js.Any]): Self = StObject.set(x, "yearListProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYearListPropsUndefined: Self = StObject.set(x, "yearListProps", js.undefined)
    }
  }
}
