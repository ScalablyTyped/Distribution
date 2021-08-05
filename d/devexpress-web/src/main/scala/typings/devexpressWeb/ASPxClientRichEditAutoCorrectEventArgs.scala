package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientRichEdit.AutoCorrect event.
  */
trait ASPxClientRichEditAutoCorrectEventArgs
  extends StObject
     with ASPxClientEventArgs {
  
  /**
    * Specifies whether the event is handled.
    */
  var handled: Boolean
  
  /**
    * Gets the input string's interval.
    */
  var interval: Interval
  
  /**
    * Gets the input string to check whether it should be replaced.
    */
  var text: String
}
object ASPxClientRichEditAutoCorrectEventArgs {
  
  inline def apply(handled: Boolean, interval: Interval, text: String): ASPxClientRichEditAutoCorrectEventArgs = {
    val __obj = js.Dynamic.literal(handled = handled.asInstanceOf[js.Any], interval = interval.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientRichEditAutoCorrectEventArgs]
  }
  
  extension [Self <: ASPxClientRichEditAutoCorrectEventArgs](x: Self) {
    
    inline def setHandled(value: Boolean): Self = StObject.set(x, "handled", value.asInstanceOf[js.Any])
    
    inline def setInterval(value: Interval): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
