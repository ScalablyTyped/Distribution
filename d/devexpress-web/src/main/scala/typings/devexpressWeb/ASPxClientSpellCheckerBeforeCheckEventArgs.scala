package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for an event that occurs before a spelling check is started. Represents the client-side equivalent of the BeforeCheckEventArgs class.
  */
trait ASPxClientSpellCheckerBeforeCheckEventArgs
  extends StObject
     with ASPxClientCancelEventArgs {
  
  /**
    * Gets the programmatic identifier assigned to the control which is going to be checked.
    */
  var controlId: String
}
object ASPxClientSpellCheckerBeforeCheckEventArgs {
  
  inline def apply(cancel: Boolean, controlId: String): ASPxClientSpellCheckerBeforeCheckEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], controlId = controlId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientSpellCheckerBeforeCheckEventArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ASPxClientSpellCheckerBeforeCheckEventArgs] (val x: Self) extends AnyVal {
    
    inline def setControlId(value: String): Self = StObject.set(x, "controlId", value.asInstanceOf[js.Any])
  }
}
