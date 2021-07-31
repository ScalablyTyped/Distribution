package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a whole calendar date, for example a date of birth. The time of
  * day and time zone are either specified elsewhere or are not significant.
  * The date is relative to the [Proleptic Gregorian
  * Calendar](https://en.wikipedia.org/wiki/Proleptic_Gregorian_calendar). The
  * date must be a valid calendar date between the year 1 and 9999.
  */
trait SchemaDate extends StObject {
  
  /**
    * Day of month. Must be from 1 to 31 and valid for the year and month.
    */
  var day: js.UndefOr[Double] = js.undefined
  
  /**
    * Month of date. Must be from 1 to 12.
    */
  var month: js.UndefOr[Double] = js.undefined
  
  /**
    * Year of date. Must be from 1 to 9999.
    */
  var year: js.UndefOr[Double] = js.undefined
}
object SchemaDate {
  
  @scala.inline
  def apply(): SchemaDate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDate]
  }
  
  @scala.inline
  implicit class SchemaDateMutableBuilder[Self <: SchemaDate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDay(value: Double): Self = StObject.set(x, "day", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDayUndefined: Self = StObject.set(x, "day", js.undefined)
    
    @scala.inline
    def setMonth(value: Double): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonthUndefined: Self = StObject.set(x, "month", js.undefined)
    
    @scala.inline
    def setYear(value: Double): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYearUndefined: Self = StObject.set(x, "year", js.undefined)
  }
}
