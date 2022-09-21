package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientDateEdit.CalendarCellClick event.
  */
@JSGlobal("ASPxClientCalendarCellClickEventArgs")
@js.native
open class ASPxClientCalendarCellClickEventArgs protected ()
  extends StObject
     with typings.devexpressWeb.ASPxClientCalendarCellClickEventArgs {
  /**
    * Initializes a new instance of the ASPxClientCalendarCellClickEventArgs class.
    * @param date A DateTime object representing the clicked date cell.
    */
  def this(date: js.Date) = this()
  
  /**
    * Gets the date that relates to the processed calendar's cell click.
    */
  /* CompleteClass */
  var date: js.Date = js.native
}
