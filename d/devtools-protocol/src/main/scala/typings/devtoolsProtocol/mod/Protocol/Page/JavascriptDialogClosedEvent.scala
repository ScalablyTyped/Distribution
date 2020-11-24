package typings.devtoolsProtocol.mod.Protocol.Page

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JavascriptDialogClosedEvent extends js.Object {
  
  /**
    * Whether dialog was confirmed.
    */
  var result: Boolean = js.native
  
  /**
    * User input in case of prompt.
    */
  var userInput: String = js.native
}
object JavascriptDialogClosedEvent {
  
  @scala.inline
  def apply(result: Boolean, userInput: String): JavascriptDialogClosedEvent = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any], userInput = userInput.asInstanceOf[js.Any])
    __obj.asInstanceOf[JavascriptDialogClosedEvent]
  }
  
  @scala.inline
  implicit class JavascriptDialogClosedEventOps[Self <: JavascriptDialogClosedEvent] (val x: Self) extends AnyVal {
    
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
    def setResult(value: Boolean): Self = this.set("result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserInput(value: String): Self = this.set("userInput", value.asInstanceOf[js.Any])
  }
}
