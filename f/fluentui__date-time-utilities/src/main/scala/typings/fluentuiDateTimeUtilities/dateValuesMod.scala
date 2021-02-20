package typings.fluentuiDateTimeUtilities

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dateValuesMod {
  
  @JSImport("@fluentui/date-time-utilities/lib/dateValues/dateValues", "DAYS_IN_WEEK")
  @js.native
  val DAYS_IN_WEEK: /* 7 */ Double = js.native
  
  @js.native
  sealed trait DateRangeType extends StObject
  @JSImport("@fluentui/date-time-utilities/lib/dateValues/dateValues", "DateRangeType")
  @js.native
  object DateRangeType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[DateRangeType with Double] = js.native
    
    @js.native
    sealed trait Day extends DateRangeType
    /* 0 */ val Day: typings.fluentuiDateTimeUtilities.dateValuesMod.DateRangeType.Day with Double = js.native
    
    @js.native
    sealed trait Month extends DateRangeType
    /* 2 */ val Month: typings.fluentuiDateTimeUtilities.dateValuesMod.DateRangeType.Month with Double = js.native
    
    @js.native
    sealed trait Week extends DateRangeType
    /* 1 */ val Week: typings.fluentuiDateTimeUtilities.dateValuesMod.DateRangeType.Week with Double = js.native
    
    @js.native
    sealed trait WorkWeek extends DateRangeType
    /* 3 */ val WorkWeek: typings.fluentuiDateTimeUtilities.dateValuesMod.DateRangeType.WorkWeek with Double = js.native
  }
  
  @js.native
  sealed trait DayOfWeek extends StObject
  @JSImport("@fluentui/date-time-utilities/lib/dateValues/dateValues", "DayOfWeek")
  @js.native
  object DayOfWeek extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[DayOfWeek with Double] = js.native
    
    @js.native
    sealed trait Friday extends DayOfWeek
    /* 5 */ val Friday: typings.fluentuiDateTimeUtilities.dateValuesMod.DayOfWeek.Friday with Double = js.native
    
    @js.native
    sealed trait Monday extends DayOfWeek
    /* 1 */ val Monday: typings.fluentuiDateTimeUtilities.dateValuesMod.DayOfWeek.Monday with Double = js.native
    
    @js.native
    sealed trait Saturday extends DayOfWeek
    /* 6 */ val Saturday: typings.fluentuiDateTimeUtilities.dateValuesMod.DayOfWeek.Saturday with Double = js.native
    
    @js.native
    sealed trait Sunday extends DayOfWeek
    /* 0 */ val Sunday: typings.fluentuiDateTimeUtilities.dateValuesMod.DayOfWeek.Sunday with Double = js.native
    
    @js.native
    sealed trait Thursday extends DayOfWeek
    /* 4 */ val Thursday: typings.fluentuiDateTimeUtilities.dateValuesMod.DayOfWeek.Thursday with Double = js.native
    
    @js.native
    sealed trait Tuesday extends DayOfWeek
    /* 2 */ val Tuesday: typings.fluentuiDateTimeUtilities.dateValuesMod.DayOfWeek.Tuesday with Double = js.native
    
    @js.native
    sealed trait Wednesday extends DayOfWeek
    /* 3 */ val Wednesday: typings.fluentuiDateTimeUtilities.dateValuesMod.DayOfWeek.Wednesday with Double = js.native
  }
  
  @js.native
  sealed trait FirstWeekOfYear extends StObject
  @JSImport("@fluentui/date-time-utilities/lib/dateValues/dateValues", "FirstWeekOfYear")
  @js.native
  object FirstWeekOfYear extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[FirstWeekOfYear with Double] = js.native
    
    @js.native
    sealed trait FirstDay extends FirstWeekOfYear
    /* 0 */ val FirstDay: typings.fluentuiDateTimeUtilities.dateValuesMod.FirstWeekOfYear.FirstDay with Double = js.native
    
    @js.native
    sealed trait FirstFourDayWeek extends FirstWeekOfYear
    /* 2 */ val FirstFourDayWeek: typings.fluentuiDateTimeUtilities.dateValuesMod.FirstWeekOfYear.FirstFourDayWeek with Double = js.native
    
    @js.native
    sealed trait FirstFullWeek extends FirstWeekOfYear
    /* 1 */ val FirstFullWeek: typings.fluentuiDateTimeUtilities.dateValuesMod.FirstWeekOfYear.FirstFullWeek with Double = js.native
  }
  
  @js.native
  sealed trait MonthOfYear extends StObject
  @JSImport("@fluentui/date-time-utilities/lib/dateValues/dateValues", "MonthOfYear")
  @js.native
  object MonthOfYear extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[MonthOfYear with Double] = js.native
    
    @js.native
    sealed trait April extends MonthOfYear
    /* 3 */ val April: typings.fluentuiDateTimeUtilities.dateValuesMod.MonthOfYear.April with Double = js.native
    
    @js.native
    sealed trait August extends MonthOfYear
    /* 7 */ val August: typings.fluentuiDateTimeUtilities.dateValuesMod.MonthOfYear.August with Double = js.native
    
    @js.native
    sealed trait December extends MonthOfYear
    /* 11 */ val December: typings.fluentuiDateTimeUtilities.dateValuesMod.MonthOfYear.December with Double = js.native
    
    @js.native
    sealed trait February extends MonthOfYear
    /* 1 */ val February: typings.fluentuiDateTimeUtilities.dateValuesMod.MonthOfYear.February with Double = js.native
    
    @js.native
    sealed trait January extends MonthOfYear
    /* 0 */ val January: typings.fluentuiDateTimeUtilities.dateValuesMod.MonthOfYear.January with Double = js.native
    
    @js.native
    sealed trait July extends MonthOfYear
    /* 6 */ val July: typings.fluentuiDateTimeUtilities.dateValuesMod.MonthOfYear.July with Double = js.native
    
    @js.native
    sealed trait June extends MonthOfYear
    /* 5 */ val June: typings.fluentuiDateTimeUtilities.dateValuesMod.MonthOfYear.June with Double = js.native
    
    @js.native
    sealed trait March extends MonthOfYear
    /* 2 */ val March: typings.fluentuiDateTimeUtilities.dateValuesMod.MonthOfYear.March with Double = js.native
    
    @js.native
    sealed trait May extends MonthOfYear
    /* 4 */ val May: typings.fluentuiDateTimeUtilities.dateValuesMod.MonthOfYear.May with Double = js.native
    
    @js.native
    sealed trait November extends MonthOfYear
    /* 10 */ val November: typings.fluentuiDateTimeUtilities.dateValuesMod.MonthOfYear.November with Double = js.native
    
    @js.native
    sealed trait October extends MonthOfYear
    /* 9 */ val October: typings.fluentuiDateTimeUtilities.dateValuesMod.MonthOfYear.October with Double = js.native
    
    @js.native
    sealed trait September extends MonthOfYear
    /* 8 */ val September: typings.fluentuiDateTimeUtilities.dateValuesMod.MonthOfYear.September with Double = js.native
  }
}
