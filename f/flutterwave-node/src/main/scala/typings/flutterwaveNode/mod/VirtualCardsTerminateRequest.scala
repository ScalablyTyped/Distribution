package typings.flutterwaveNode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VirtualCardsTerminateRequest extends StObject {
  
  var id: String
}
object VirtualCardsTerminateRequest {
  
  inline def apply(id: String): VirtualCardsTerminateRequest = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualCardsTerminateRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VirtualCardsTerminateRequest] (val x: Self) extends AnyVal {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
