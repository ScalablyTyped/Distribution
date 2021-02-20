package typings.googleMaps.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OpeningHours extends StObject {
  
  /** is a boolean value indicating if the place is open at the current time. */
  var open_now: Boolean = js.native
  
  /** is an array of opening periods covering seven days, starting from Sunday, in chronological order. */
  var periods: js.Array[OpeningPeriod] = js.native
  
  /**
    * is an array of seven strings representing the formatted opening hours for each day of the week.
    * If a `language` parameter was specified in the Place Details request, the Places Service will format
    * and localize the opening hours appropriately for that language. The ordering of the elements in this array
    * depends on the `language` parameter. Some languages start the week on Monday while others start on Sunday.
    */
  var weekday_text: js.Array[String] = js.native
}
object OpeningHours {
  
  @scala.inline
  def apply(open_now: Boolean, periods: js.Array[OpeningPeriod], weekday_text: js.Array[String]): OpeningHours = {
    val __obj = js.Dynamic.literal(open_now = open_now.asInstanceOf[js.Any], periods = periods.asInstanceOf[js.Any], weekday_text = weekday_text.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpeningHours]
  }
  
  @scala.inline
  implicit class OpeningHoursMutableBuilder[Self <: OpeningHours] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOpen_now(value: Boolean): Self = StObject.set(x, "open_now", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeriods(value: js.Array[OpeningPeriod]): Self = StObject.set(x, "periods", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeriodsVarargs(value: OpeningPeriod*): Self = StObject.set(x, "periods", js.Array(value :_*))
    
    @scala.inline
    def setWeekday_text(value: js.Array[String]): Self = StObject.set(x, "weekday_text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeekday_textVarargs(value: String*): Self = StObject.set(x, "weekday_text", js.Array(value :_*))
  }
}
