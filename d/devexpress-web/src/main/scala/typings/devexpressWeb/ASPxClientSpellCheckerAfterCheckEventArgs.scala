package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the client event that occurs after a spelling check is complete.
  */
trait ASPxClientSpellCheckerAfterCheckEventArgs
  extends StObject
     with ASPxClientEventArgs {
  
  /**
    * Gets the text that has been checked.
    */
  var checkedText: String
  
  /**
    * Gets the programmatic identifier assigned to the control which has been checked.
    */
  var controlId: String
  
  /**
    * Gets a value specifying whether spell checking is finished or stopped by the user.
    */
  var reason: String
}
object ASPxClientSpellCheckerAfterCheckEventArgs {
  
  inline def apply(checkedText: String, controlId: String, reason: String): ASPxClientSpellCheckerAfterCheckEventArgs = {
    val __obj = js.Dynamic.literal(checkedText = checkedText.asInstanceOf[js.Any], controlId = controlId.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientSpellCheckerAfterCheckEventArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ASPxClientSpellCheckerAfterCheckEventArgs] (val x: Self) extends AnyVal {
    
    inline def setCheckedText(value: String): Self = StObject.set(x, "checkedText", value.asInstanceOf[js.Any])
    
    inline def setControlId(value: String): Self = StObject.set(x, "controlId", value.asInstanceOf[js.Any])
    
    inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
  }
}
