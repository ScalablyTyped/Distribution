package typings.devtoolsProtocol.mod.Protocol.Input

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetIgnoreInputEventsRequest extends StObject {
  
  /**
    * Ignores input events processing when set to true.
    */
  var ignore: Boolean
}
object SetIgnoreInputEventsRequest {
  
  inline def apply(ignore: Boolean): SetIgnoreInputEventsRequest = {
    val __obj = js.Dynamic.literal(ignore = ignore.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetIgnoreInputEventsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SetIgnoreInputEventsRequest] (val x: Self) extends AnyVal {
    
    inline def setIgnore(value: Boolean): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
  }
}
