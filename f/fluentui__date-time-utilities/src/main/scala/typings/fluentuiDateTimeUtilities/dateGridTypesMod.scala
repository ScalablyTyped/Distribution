package typings.fluentuiDateTimeUtilities

import typings.fluentuiDateTimeUtilities.dateValuesMod.DateRangeType
import typings.fluentuiDateTimeUtilities.dateValuesMod.DayOfWeek
import typings.fluentuiDateTimeUtilities.dateValuesMod.FirstWeekOfYear
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dateGridTypesMod {
  
  trait IAvailableDateOptions
    extends StObject
       with IRestrictedDatesOptions {
    
    /** Direction of search (`1` - search in future / `-1` search in past) */
    var direction: Double
    
    /** Date from which we start the search */
    var initialDate: js.Date
    
    /** Ideal available date */
    var targetDate: js.Date
  }
  object IAvailableDateOptions {
    
    inline def apply(direction: Double, initialDate: js.Date, targetDate: js.Date): IAvailableDateOptions = {
      val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], initialDate = initialDate.asInstanceOf[js.Any], targetDate = targetDate.asInstanceOf[js.Any])
      __obj.asInstanceOf[IAvailableDateOptions]
    }
    
    extension [Self <: IAvailableDateOptions](x: Self) {
      
      inline def setDirection(value: Double): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setInitialDate(value: js.Date): Self = StObject.set(x, "initialDate", value.asInstanceOf[js.Any])
      
      inline def setTargetDate(value: js.Date): Self = StObject.set(x, "targetDate", value.asInstanceOf[js.Any])
    }
  }
  
  trait IDay extends StObject {
    
    /** `Date.getDate()` value of current date */
    var date: String
    
    /** Is current date within restriction boundaries */
    var isInBounds: Boolean
    
    /** Is current date is in the same month as "today" date */
    var isInMonth: Boolean
    
    /** Is current date marked */
    var isMarked: Boolean
    
    /** Is current date is selected */
    var isSelected: Boolean
    
    /** Is current date is "today" date */
    var isToday: Boolean
    
    /** `Date.toString()` value of current date */
    var key: String
    
    /** `Date` object of current date */
    var originalDate: js.Date
  }
  object IDay {
    
    inline def apply(
      date: String,
      isInBounds: Boolean,
      isInMonth: Boolean,
      isMarked: Boolean,
      isSelected: Boolean,
      isToday: Boolean,
      key: String,
      originalDate: js.Date
    ): IDay = {
      val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], isInBounds = isInBounds.asInstanceOf[js.Any], isInMonth = isInMonth.asInstanceOf[js.Any], isMarked = isMarked.asInstanceOf[js.Any], isSelected = isSelected.asInstanceOf[js.Any], isToday = isToday.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], originalDate = originalDate.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDay]
    }
    
    extension [Self <: IDay](x: Self) {
      
      inline def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      inline def setIsInBounds(value: Boolean): Self = StObject.set(x, "isInBounds", value.asInstanceOf[js.Any])
      
      inline def setIsInMonth(value: Boolean): Self = StObject.set(x, "isInMonth", value.asInstanceOf[js.Any])
      
      inline def setIsMarked(value: Boolean): Self = StObject.set(x, "isMarked", value.asInstanceOf[js.Any])
      
      inline def setIsSelected(value: Boolean): Self = StObject.set(x, "isSelected", value.asInstanceOf[js.Any])
      
      inline def setIsToday(value: Boolean): Self = StObject.set(x, "isToday", value.asInstanceOf[js.Any])
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setOriginalDate(value: js.Date): Self = StObject.set(x, "originalDate", value.asInstanceOf[js.Any])
    }
  }
  
  trait IDayGridOptions
    extends StObject
       with IRestrictedDatesOptions {
    
    /**
      * The date range type indicating how  many days should be selected as the user
      * selects days
      */
    var dateRangeType: DateRangeType
    
    /**
      * The number of days to select while dateRangeType === DateRangeType.Day. Used in order to have multi-day
      * views.
      */
    var daysToSelectInDayView: js.UndefOr[Double] = js.undefined
    
    /**
      * The first day of the week for your locale.
      */
    var firstDayOfWeek: DayOfWeek
    
    /**
      * Defines when the first week of the year should start, FirstWeekOfYear.FirstDay,
      * FirstWeekOfYear.FirstFullWeek or FirstWeekOfYear.FirstFourDayWeek are the possible values
      */
    var firstWeekOfYear: FirstWeekOfYear
    
    /**
      * Which days in the generated grid should be marked.
      */
    var markedDays: js.UndefOr[js.Array[js.Date]] = js.undefined
    
    /**
      * The currently navigated date
      */
    var navigatedDate: js.Date
    
    /**
      * The currently selected date
      */
    var selectedDate: js.Date
    
    /**
      * Whether the calendar should show the week number (weeks 1 to 53) before each week row
      */
    var showWeekNumbers: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Value of today. If unspecified, current time in client machine will be used.
      */
    var today: js.UndefOr[js.Date] = js.undefined
    
    /**
      * How many weeks to show by default. If not provided, will show enough weeks to display the current
      * month, between 4 and 6 depending
      */
    var weeksToShow: js.UndefOr[Double] = js.undefined
    
    /**
      * The days that are selectable when `dateRangeType` is WorkWeek.
      * If `dateRangeType` is not WorkWeek this property does nothing.
      */
    var workWeekDays: js.UndefOr[js.Array[DayOfWeek]] = js.undefined
  }
  object IDayGridOptions {
    
    inline def apply(
      dateRangeType: DateRangeType,
      firstDayOfWeek: DayOfWeek,
      firstWeekOfYear: FirstWeekOfYear,
      navigatedDate: js.Date,
      selectedDate: js.Date
    ): IDayGridOptions = {
      val __obj = js.Dynamic.literal(dateRangeType = dateRangeType.asInstanceOf[js.Any], firstDayOfWeek = firstDayOfWeek.asInstanceOf[js.Any], firstWeekOfYear = firstWeekOfYear.asInstanceOf[js.Any], navigatedDate = navigatedDate.asInstanceOf[js.Any], selectedDate = selectedDate.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDayGridOptions]
    }
    
    extension [Self <: IDayGridOptions](x: Self) {
      
      inline def setDateRangeType(value: DateRangeType): Self = StObject.set(x, "dateRangeType", value.asInstanceOf[js.Any])
      
      inline def setDaysToSelectInDayView(value: Double): Self = StObject.set(x, "daysToSelectInDayView", value.asInstanceOf[js.Any])
      
      inline def setDaysToSelectInDayViewUndefined: Self = StObject.set(x, "daysToSelectInDayView", js.undefined)
      
      inline def setFirstDayOfWeek(value: DayOfWeek): Self = StObject.set(x, "firstDayOfWeek", value.asInstanceOf[js.Any])
      
      inline def setFirstWeekOfYear(value: FirstWeekOfYear): Self = StObject.set(x, "firstWeekOfYear", value.asInstanceOf[js.Any])
      
      inline def setMarkedDays(value: js.Array[js.Date]): Self = StObject.set(x, "markedDays", value.asInstanceOf[js.Any])
      
      inline def setMarkedDaysUndefined: Self = StObject.set(x, "markedDays", js.undefined)
      
      inline def setMarkedDaysVarargs(value: js.Date*): Self = StObject.set(x, "markedDays", js.Array(value*))
      
      inline def setNavigatedDate(value: js.Date): Self = StObject.set(x, "navigatedDate", value.asInstanceOf[js.Any])
      
      inline def setSelectedDate(value: js.Date): Self = StObject.set(x, "selectedDate", value.asInstanceOf[js.Any])
      
      inline def setShowWeekNumbers(value: Boolean): Self = StObject.set(x, "showWeekNumbers", value.asInstanceOf[js.Any])
      
      inline def setShowWeekNumbersUndefined: Self = StObject.set(x, "showWeekNumbers", js.undefined)
      
      inline def setToday(value: js.Date): Self = StObject.set(x, "today", value.asInstanceOf[js.Any])
      
      inline def setTodayUndefined: Self = StObject.set(x, "today", js.undefined)
      
      inline def setWeeksToShow(value: Double): Self = StObject.set(x, "weeksToShow", value.asInstanceOf[js.Any])
      
      inline def setWeeksToShowUndefined: Self = StObject.set(x, "weeksToShow", js.undefined)
      
      inline def setWorkWeekDays(value: js.Array[DayOfWeek]): Self = StObject.set(x, "workWeekDays", value.asInstanceOf[js.Any])
      
      inline def setWorkWeekDaysUndefined: Self = StObject.set(x, "workWeekDays", js.undefined)
      
      inline def setWorkWeekDaysVarargs(value: DayOfWeek*): Self = StObject.set(x, "workWeekDays", js.Array(value*))
    }
  }
  
  trait IRestrictedDatesOptions extends StObject {
    
    /**
      * If set the Calendar will not allow navigation to or selection of a date later than this value.
      */
    var maxDate: js.UndefOr[js.Date] = js.undefined
    
    /**
      * If set the Calendar will not allow navigation to or selection of a date earlier than this value.
      */
    var minDate: js.UndefOr[js.Date] = js.undefined
    
    /**
      * If set the Calendar will not allow selection of dates in this array.
      */
    var restrictedDates: js.UndefOr[js.Array[js.Date]] = js.undefined
  }
  object IRestrictedDatesOptions {
    
    inline def apply(): IRestrictedDatesOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IRestrictedDatesOptions]
    }
    
    extension [Self <: IRestrictedDatesOptions](x: Self) {
      
      inline def setMaxDate(value: js.Date): Self = StObject.set(x, "maxDate", value.asInstanceOf[js.Any])
      
      inline def setMaxDateUndefined: Self = StObject.set(x, "maxDate", js.undefined)
      
      inline def setMinDate(value: js.Date): Self = StObject.set(x, "minDate", value.asInstanceOf[js.Any])
      
      inline def setMinDateUndefined: Self = StObject.set(x, "minDate", js.undefined)
      
      inline def setRestrictedDates(value: js.Array[js.Date]): Self = StObject.set(x, "restrictedDates", value.asInstanceOf[js.Any])
      
      inline def setRestrictedDatesUndefined: Self = StObject.set(x, "restrictedDates", js.undefined)
      
      inline def setRestrictedDatesVarargs(value: js.Date*): Self = StObject.set(x, "restrictedDates", js.Array(value*))
    }
  }
}
