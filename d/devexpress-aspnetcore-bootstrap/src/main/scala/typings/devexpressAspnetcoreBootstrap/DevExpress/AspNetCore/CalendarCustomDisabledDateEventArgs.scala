package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CalendarCustomDisabledDateEventArgs
  extends StObject
     with EventArgs {
  
  val date: js.Date
  
  var isDisabled: Boolean
}
object CalendarCustomDisabledDateEventArgs {
  
  inline def apply(date: js.Date, isDisabled: Boolean, sender: Control): CalendarCustomDisabledDateEventArgs = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], isDisabled = isDisabled.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalendarCustomDisabledDateEventArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CalendarCustomDisabledDateEventArgs] (val x: Self) extends AnyVal {
    
    inline def setDate(value: js.Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setIsDisabled(value: Boolean): Self = StObject.set(x, "isDisabled", value.asInstanceOf[js.Any])
  }
}
