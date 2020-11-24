package typings.devexpressWeb

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
  implicit class ASPxClientRichEditAutoCorrectEventArgsOps[Self <: ASPxClientRichEditAutoCorrectEventArgs] (val x: Self) extends AnyVal {
    
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
    def setHandled(value: Boolean): Self = this.set("handled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInterval(value: Interval): Self = this.set("interval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
  }
}
