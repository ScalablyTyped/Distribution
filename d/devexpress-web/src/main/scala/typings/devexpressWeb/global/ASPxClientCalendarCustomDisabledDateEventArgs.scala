package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientCalendar.CustomDisabledDate event.
  */
@JSGlobal("ASPxClientCalendarCustomDisabledDateEventArgs")
@js.native
open class ASPxClientCalendarCustomDisabledDateEventArgs protected ()
  extends StObject
     with typings.devexpressWeb.ASPxClientCalendarCustomDisabledDateEventArgs {
  /**
    * Initializes a new instance of the ASPxClientCalendarCustomDisabledDateEventArgs object.
    * @param date A DateTime object that is the currently processed date.
    */
  def this(date: js.Date) = this()
  
  /**
    * Gets the date processed in the calendar.
    */
  /* CompleteClass */
  var date: js.Date = js.native
  
  /**
    * Gets or sets a value specifying whether selection of the processed calendar date is disabled.
    */
  /* CompleteClass */
  var isDisabled: Boolean = js.native
}
