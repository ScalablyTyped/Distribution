package typings.devtoolsProtocol.mod.Protocol.Page

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JavascriptDialogClosedEvent extends StObject {
  
  /**
    * Whether dialog was confirmed.
    */
  var result: Boolean
  
  /**
    * User input in case of prompt.
    */
  var userInput: String
}
object JavascriptDialogClosedEvent {
  
  inline def apply(result: Boolean, userInput: String): JavascriptDialogClosedEvent = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any], userInput = userInput.asInstanceOf[js.Any])
    __obj.asInstanceOf[JavascriptDialogClosedEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JavascriptDialogClosedEvent] (val x: Self) extends AnyVal {
    
    inline def setResult(value: Boolean): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    inline def setUserInput(value: String): Self = StObject.set(x, "userInput", value.asInstanceOf[js.Any])
  }
}
