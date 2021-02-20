package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientRichEdit.AutoCorrect event.
  */
@js.native
trait ASPxClientRichEditAutoCorrectEventArgs extends ASPxClientEventArgs {
  
  /**
    * Specifies whether the event is handled.
    */
  var handled: Boolean = js.native
  
  /**
    * Gets the input string's interval.
    */
  var interval: Interval = js.native
  
  /**
    * Gets the input string to check whether it should be replaced.
    */
  var text: String = js.native
}
object ASPxClientRichEditAutoCorrectEventArgs {
  
  @scala.inline
  def apply(handled: Boolean, interval: Interval, text: String): ASPxClientRichEditAutoCorrectEventArgs = {
    val __obj = js.Dynamic.literal(handled = handled.asInstanceOf[js.Any], interval = interval.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientRichEditAutoCorrectEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientRichEditAutoCorrectEventArgsMutableBuilder[Self <: ASPxClientRichEditAutoCorrectEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHandled(value: Boolean): Self = StObject.set(x, "handled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInterval(value: Interval): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
