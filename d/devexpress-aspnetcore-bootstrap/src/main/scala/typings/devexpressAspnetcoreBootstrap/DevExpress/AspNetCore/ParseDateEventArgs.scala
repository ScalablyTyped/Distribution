package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParseDateEventArgs
  extends StObject
     with EventArgs {
  
  val date: Date
  
  val handled: Boolean
  
  val value: String
}
object ParseDateEventArgs {
  
  @scala.inline
  def apply(date: Date, handled: Boolean, sender: Control, value: String): ParseDateEventArgs = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], handled = handled.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParseDateEventArgs]
  }
  
  @scala.inline
  implicit class ParseDateEventArgsMutableBuilder[Self <: ParseDateEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDate(value: Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHandled(value: Boolean): Self = StObject.set(x, "handled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
