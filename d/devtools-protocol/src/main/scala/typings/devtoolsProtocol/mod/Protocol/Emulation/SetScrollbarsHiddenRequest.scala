package typings.devtoolsProtocol.mod.Protocol.Emulation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetScrollbarsHiddenRequest extends StObject {
  
  /**
    * Whether scrollbars should be always hidden.
    */
  var hidden: Boolean
}
object SetScrollbarsHiddenRequest {
  
  inline def apply(hidden: Boolean): SetScrollbarsHiddenRequest = {
    val __obj = js.Dynamic.literal(hidden = hidden.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetScrollbarsHiddenRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SetScrollbarsHiddenRequest] (val x: Self) extends AnyVal {
    
    inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
  }
}
