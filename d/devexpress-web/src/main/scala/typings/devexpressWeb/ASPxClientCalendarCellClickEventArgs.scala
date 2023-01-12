package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientDateEdit.CalendarCellClick event.
  */
trait ASPxClientCalendarCellClickEventArgs
  extends StObject
     with ASPxClientEventArgs {
  
  /**
    * Gets the date that relates to the processed calendar's cell click.
    */
  var date: js.Date
}
object ASPxClientCalendarCellClickEventArgs {
  
  inline def apply(date: js.Date): ASPxClientCalendarCellClickEventArgs = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientCalendarCellClickEventArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ASPxClientCalendarCellClickEventArgs] (val x: Self) extends AnyVal {
    
    inline def setDate(value: js.Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
  }
}
