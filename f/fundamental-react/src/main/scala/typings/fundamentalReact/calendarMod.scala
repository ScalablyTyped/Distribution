package typings.fundamentalReact

import org.scalablytyped.runtime.StringDictionary
import typings.fundamentalReact.anon.NextMonth
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object calendarMod {
  
  @JSImport("fundamental-react/lib/Calendar/Calendar", JSImport.Default)
  @js.native
  open class default ()
    extends Component[CalendarProps, js.Object, Any]
  
  type Calendar = Component[CalendarProps, js.Object, Any]
  
  trait CalendarBaseProps extends StObject {
    
    var blockedDates: js.UndefOr[js.Array[js.Date]] = js.undefined
    
    var disableAfterDate: js.UndefOr[js.Date] = js.undefined
    
    var disableBeforeDate: js.UndefOr[js.Date] = js.undefined
    
    var disableFutureDates: js.UndefOr[Boolean] = js.undefined
    
    var disablePastDates: js.UndefOr[Boolean] = js.undefined
    
    var disableStyles: js.UndefOr[Boolean] = js.undefined
    
    var disableWeekday: js.UndefOr[js.Array[String]] = js.undefined
    
    var disableWeekends: js.UndefOr[Boolean] = js.undefined
    
    var disabledDates: js.UndefOr[js.Array[js.Date]] = js.undefined
    
    var localizedText: js.UndefOr[NextMonth] = js.undefined
  }
  object CalendarBaseProps {
    
    inline def apply(): CalendarBaseProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CalendarBaseProps]
    }
    
    extension [Self <: CalendarBaseProps](x: Self) {
      
      inline def setBlockedDates(value: js.Array[js.Date]): Self = StObject.set(x, "blockedDates", value.asInstanceOf[js.Any])
      
      inline def setBlockedDatesUndefined: Self = StObject.set(x, "blockedDates", js.undefined)
      
      inline def setBlockedDatesVarargs(value: js.Date*): Self = StObject.set(x, "blockedDates", js.Array(value*))
      
      inline def setDisableAfterDate(value: js.Date): Self = StObject.set(x, "disableAfterDate", value.asInstanceOf[js.Any])
      
      inline def setDisableAfterDateUndefined: Self = StObject.set(x, "disableAfterDate", js.undefined)
      
      inline def setDisableBeforeDate(value: js.Date): Self = StObject.set(x, "disableBeforeDate", value.asInstanceOf[js.Any])
      
      inline def setDisableBeforeDateUndefined: Self = StObject.set(x, "disableBeforeDate", js.undefined)
      
      inline def setDisableFutureDates(value: Boolean): Self = StObject.set(x, "disableFutureDates", value.asInstanceOf[js.Any])
      
      inline def setDisableFutureDatesUndefined: Self = StObject.set(x, "disableFutureDates", js.undefined)
      
      inline def setDisablePastDates(value: Boolean): Self = StObject.set(x, "disablePastDates", value.asInstanceOf[js.Any])
      
      inline def setDisablePastDatesUndefined: Self = StObject.set(x, "disablePastDates", js.undefined)
      
      inline def setDisableStyles(value: Boolean): Self = StObject.set(x, "disableStyles", value.asInstanceOf[js.Any])
      
      inline def setDisableStylesUndefined: Self = StObject.set(x, "disableStyles", js.undefined)
      
      inline def setDisableWeekday(value: js.Array[String]): Self = StObject.set(x, "disableWeekday", value.asInstanceOf[js.Any])
      
      inline def setDisableWeekdayUndefined: Self = StObject.set(x, "disableWeekday", js.undefined)
      
      inline def setDisableWeekdayVarargs(value: String*): Self = StObject.set(x, "disableWeekday", js.Array(value*))
      
      inline def setDisableWeekends(value: Boolean): Self = StObject.set(x, "disableWeekends", value.asInstanceOf[js.Any])
      
      inline def setDisableWeekendsUndefined: Self = StObject.set(x, "disableWeekends", js.undefined)
      
      inline def setDisabledDates(value: js.Array[js.Date]): Self = StObject.set(x, "disabledDates", value.asInstanceOf[js.Any])
      
      inline def setDisabledDatesUndefined: Self = StObject.set(x, "disabledDates", js.undefined)
      
      inline def setDisabledDatesVarargs(value: js.Date*): Self = StObject.set(x, "disabledDates", js.Array(value*))
      
      inline def setLocalizedText(value: NextMonth): Self = StObject.set(x, "localizedText", value.asInstanceOf[js.Any])
      
      inline def setLocalizedTextUndefined: Self = StObject.set(x, "localizedText", js.undefined)
    }
  }
  
  trait CalendarProps
    extends StObject
       with CalendarBaseProps
       with /* x */ StringDictionary[Any] {
    
    var monthListProps: js.UndefOr[StringDictionary[Any]] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* date */ js.Date, Unit]] = js.undefined
    
    var tableBodyProps: js.UndefOr[StringDictionary[Any]] = js.undefined
    
    var tableHeaderProps: js.UndefOr[StringDictionary[Any]] = js.undefined
    
    var tableProps: js.UndefOr[StringDictionary[Any]] = js.undefined
    
    var yearListProps: js.UndefOr[StringDictionary[Any]] = js.undefined
  }
  object CalendarProps {
    
    inline def apply(): CalendarProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CalendarProps]
    }
    
    extension [Self <: CalendarProps](x: Self) {
      
      inline def setMonthListProps(value: StringDictionary[Any]): Self = StObject.set(x, "monthListProps", value.asInstanceOf[js.Any])
      
      inline def setMonthListPropsUndefined: Self = StObject.set(x, "monthListProps", js.undefined)
      
      inline def setOnChange(value: /* date */ js.Date => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setTableBodyProps(value: StringDictionary[Any]): Self = StObject.set(x, "tableBodyProps", value.asInstanceOf[js.Any])
      
      inline def setTableBodyPropsUndefined: Self = StObject.set(x, "tableBodyProps", js.undefined)
      
      inline def setTableHeaderProps(value: StringDictionary[Any]): Self = StObject.set(x, "tableHeaderProps", value.asInstanceOf[js.Any])
      
      inline def setTableHeaderPropsUndefined: Self = StObject.set(x, "tableHeaderProps", js.undefined)
      
      inline def setTableProps(value: StringDictionary[Any]): Self = StObject.set(x, "tableProps", value.asInstanceOf[js.Any])
      
      inline def setTablePropsUndefined: Self = StObject.set(x, "tableProps", js.undefined)
      
      inline def setYearListProps(value: StringDictionary[Any]): Self = StObject.set(x, "yearListProps", value.asInstanceOf[js.Any])
      
      inline def setYearListPropsUndefined: Self = StObject.set(x, "yearListProps", js.undefined)
    }
  }
}
