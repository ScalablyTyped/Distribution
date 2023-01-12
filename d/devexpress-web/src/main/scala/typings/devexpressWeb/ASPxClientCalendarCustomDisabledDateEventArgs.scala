package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientCalendar.CustomDisabledDate event.
  */
trait ASPxClientCalendarCustomDisabledDateEventArgs
  extends StObject
     with ASPxClientEventArgs {
  
  /**
    * Gets the date processed in the calendar.
    */
  var date: js.Date
  
  /**
    * Gets or sets a value specifying whether selection of the processed calendar date is disabled.
    */
  var isDisabled: Boolean
}
object ASPxClientCalendarCustomDisabledDateEventArgs {
  
  inline def apply(date: js.Date, isDisabled: Boolean): ASPxClientCalendarCustomDisabledDateEventArgs = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], isDisabled = isDisabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientCalendarCustomDisabledDateEventArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ASPxClientCalendarCustomDisabledDateEventArgs] (val x: Self) extends AnyVal {
    
    inline def setDate(value: js.Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setIsDisabled(value: Boolean): Self = StObject.set(x, "isDisabled", value.asInstanceOf[js.Any])
  }
}
