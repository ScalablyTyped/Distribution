package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.common.charts._TimeIntervalConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Days
  extends StObject
     with _TimeIntervalConfig {
  
  /**
    * Specifies the time interval measured in days. Accepts integer values. Available only for an axis/scale that displays date-time values.
    */
  var days: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the time interval measured in hours. Accepts integer values. Available only for an axis/scale that displays date-time values.
    */
  var hours: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the time interval measured in milliseconds. Accepts integer values. Available only for an axis/scale that displays date-time values.
    */
  var milliseconds: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the time interval measured in minutes. Accepts integer values. Available only for an axis/scale that displays date-time values.
    */
  var minutes: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the time interval measured in months. Accepts integer values. Available only for an axis/scale that displays date-time values.
    */
  var months: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the time interval measured in quarters. Accepts integer values. Available only for an axis/scale that displays date-time values.
    */
  var quarters: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the time interval measured in seconds. Accepts integer values. Available only for an axis/scale that displays date-time values.
    */
  var seconds: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the time interval measured in weeks. Accepts integer values. Available only for an axis/scale that displays date-time values.
    */
  var weeks: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the time interval measured in years. Accepts integer values. Available only for an axis/scale that displays date-time values.
    */
  var years: js.UndefOr[Double] = js.undefined
}
object Days {
  
  inline def apply(): Days = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Days]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Days] (val x: Self) extends AnyVal {
    
    inline def setDays(value: Double): Self = StObject.set(x, "days", value.asInstanceOf[js.Any])
    
    inline def setDaysUndefined: Self = StObject.set(x, "days", js.undefined)
    
    inline def setHours(value: Double): Self = StObject.set(x, "hours", value.asInstanceOf[js.Any])
    
    inline def setHoursUndefined: Self = StObject.set(x, "hours", js.undefined)
    
    inline def setMilliseconds(value: Double): Self = StObject.set(x, "milliseconds", value.asInstanceOf[js.Any])
    
    inline def setMillisecondsUndefined: Self = StObject.set(x, "milliseconds", js.undefined)
    
    inline def setMinutes(value: Double): Self = StObject.set(x, "minutes", value.asInstanceOf[js.Any])
    
    inline def setMinutesUndefined: Self = StObject.set(x, "minutes", js.undefined)
    
    inline def setMonths(value: Double): Self = StObject.set(x, "months", value.asInstanceOf[js.Any])
    
    inline def setMonthsUndefined: Self = StObject.set(x, "months", js.undefined)
    
    inline def setQuarters(value: Double): Self = StObject.set(x, "quarters", value.asInstanceOf[js.Any])
    
    inline def setQuartersUndefined: Self = StObject.set(x, "quarters", js.undefined)
    
    inline def setSeconds(value: Double): Self = StObject.set(x, "seconds", value.asInstanceOf[js.Any])
    
    inline def setSecondsUndefined: Self = StObject.set(x, "seconds", js.undefined)
    
    inline def setWeeks(value: Double): Self = StObject.set(x, "weeks", value.asInstanceOf[js.Any])
    
    inline def setWeeksUndefined: Self = StObject.set(x, "weeks", js.undefined)
    
    inline def setYears(value: Double): Self = StObject.set(x, "years", value.asInstanceOf[js.Any])
    
    inline def setYearsUndefined: Self = StObject.set(x, "years", js.undefined)
  }
}
