package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientDateEdit.ParseDate client-side event that parses a string entered into a date editor.
  */
trait ASPxClientParseDateEventArgs
  extends StObject
     with ASPxClientEventArgs {
  
  /**
    * Gets or sets the edit value of the date editor.
    */
  var date: js.Date
  
  /**
    * Gets or sets a value specifying whether the event was handled.
    */
  var handled: Boolean
  
  /**
    * Gets the value entered into the date editor by an end user.
    */
  var value: String
}
object ASPxClientParseDateEventArgs {
  
  inline def apply(date: js.Date, handled: Boolean, value: String): ASPxClientParseDateEventArgs = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], handled = handled.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientParseDateEventArgs]
  }
  
  extension [Self <: ASPxClientParseDateEventArgs](x: Self) {
    
    inline def setDate(value: js.Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setHandled(value: Boolean): Self = StObject.set(x, "handled", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
