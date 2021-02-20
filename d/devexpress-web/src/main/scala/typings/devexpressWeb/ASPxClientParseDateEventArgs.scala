package typings.devexpressWeb

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientDateEdit.ParseDate client-side event that parses a string entered into a date editor.
  */
@js.native
trait ASPxClientParseDateEventArgs extends ASPxClientEventArgs {
  
  /**
    * Gets or sets the edit value of the date editor.
    */
  var date: Date = js.native
  
  /**
    * Gets or sets a value specifying whether the event was handled.
    */
  var handled: Boolean = js.native
  
  /**
    * Gets the value entered into the date editor by an end user.
    */
  var value: String = js.native
}
object ASPxClientParseDateEventArgs {
  
  @scala.inline
  def apply(date: Date, handled: Boolean, value: String): ASPxClientParseDateEventArgs = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], handled = handled.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientParseDateEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientParseDateEventArgsMutableBuilder[Self <: ASPxClientParseDateEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDate(value: Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHandled(value: Boolean): Self = StObject.set(x, "handled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
