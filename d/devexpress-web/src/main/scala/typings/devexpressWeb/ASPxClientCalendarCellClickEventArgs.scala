package typings.devexpressWeb

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientDateEdit.CalendarCellClick event.
  */
@js.native
trait ASPxClientCalendarCellClickEventArgs extends ASPxClientEventArgs {
  
  /**
    * Gets the date that relates to the processed calendar's cell click.
    */
  var date: Date = js.native
}
object ASPxClientCalendarCellClickEventArgs {
  
  @scala.inline
  def apply(date: Date): ASPxClientCalendarCellClickEventArgs = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientCalendarCellClickEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientCalendarCellClickEventArgsOps[Self <: ASPxClientCalendarCellClickEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDate(value: Date): Self = this.set("date", value.asInstanceOf[js.Any])
  }
}
