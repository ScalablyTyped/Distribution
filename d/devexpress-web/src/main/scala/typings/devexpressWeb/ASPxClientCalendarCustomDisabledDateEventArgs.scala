package typings.devexpressWeb

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientCalendar.CustomDisabledDate event.
  */
@js.native
trait ASPxClientCalendarCustomDisabledDateEventArgs extends ASPxClientEventArgs {
  
  /**
    * Gets the date processed in the calendar.
    */
  var date: Date = js.native
  
  /**
    * Gets or sets a value specifying whether selection of the processed calendar date is disabled.
    */
  var isDisabled: Boolean = js.native
}
object ASPxClientCalendarCustomDisabledDateEventArgs {
  
  @scala.inline
  def apply(date: Date, isDisabled: Boolean): ASPxClientCalendarCustomDisabledDateEventArgs = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], isDisabled = isDisabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientCalendarCustomDisabledDateEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientCalendarCustomDisabledDateEventArgsMutableBuilder[Self <: ASPxClientCalendarCustomDisabledDateEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDate(value: Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDisabled(value: Boolean): Self = StObject.set(x, "isDisabled", value.asInstanceOf[js.Any])
  }
}
