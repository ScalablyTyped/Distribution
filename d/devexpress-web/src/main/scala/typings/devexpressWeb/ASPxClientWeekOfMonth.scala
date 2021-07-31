package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains number of weeks in a month in which the event occurs.
  */
trait ASPxClientWeekOfMonth extends StObject {
  
  /**
    * The recurring event will occur once a month, on the specified day or days of the first week in the month.
    */
  var First: Double
  
  /**
    * The recurring event will occur once a month, on the specified day or days of the fourth week in the month.
    */
  var Fourth: Double
  
  /**
    * The recurring event will occur once a month, on the specified day or days of the last week in the month.
    */
  var Last: Double
  
  /**
    * There isn't any recurrence rule based on the weeks in a month.
    */
  var None: Double
  
  /**
    * The recurring event will occur once a month, on the specified day or days of the second week in the month.
    */
  var Second: Double
  
  /**
    * The recurring event will occur once a month, on the specified day or days of the third week in the month.
    */
  var Third: Double
}
object ASPxClientWeekOfMonth {
  
  @scala.inline
  def apply(First: Double, Fourth: Double, Last: Double, None: Double, Second: Double, Third: Double): ASPxClientWeekOfMonth = {
    val __obj = js.Dynamic.literal(First = First.asInstanceOf[js.Any], Fourth = Fourth.asInstanceOf[js.Any], Last = Last.asInstanceOf[js.Any], None = None.asInstanceOf[js.Any], Second = Second.asInstanceOf[js.Any], Third = Third.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientWeekOfMonth]
  }
  
  @scala.inline
  implicit class ASPxClientWeekOfMonthMutableBuilder[Self <: ASPxClientWeekOfMonth] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFirst(value: Double): Self = StObject.set(x, "First", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFourth(value: Double): Self = StObject.set(x, "Fourth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLast(value: Double): Self = StObject.set(x, "Last", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNone(value: Double): Self = StObject.set(x, "None", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecond(value: Double): Self = StObject.set(x, "Second", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThird(value: Double): Self = StObject.set(x, "Third", value.asInstanceOf[js.Any])
  }
}
