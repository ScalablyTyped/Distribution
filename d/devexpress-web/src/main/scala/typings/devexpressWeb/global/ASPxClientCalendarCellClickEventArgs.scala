package typings.devexpressWeb.global

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientDateEdit.CalendarCellClick event.
  */
@JSGlobal("ASPxClientCalendarCellClickEventArgs")
@js.native
class ASPxClientCalendarCellClickEventArgs protected ()
  extends typings.devexpressWeb.ASPxClientCalendarCellClickEventArgs {
  /**
    * Initializes a new instance of the ASPxClientCalendarCellClickEventArgs class.
    * @param date A DateTime object representing the clicked date cell.
    */
  def this(date: Date) = this()
  /**
    * Gets the date that relates to the processed calendar's cell click.
    */
  /* CompleteClass */
  override var date: Date = js.native
}

