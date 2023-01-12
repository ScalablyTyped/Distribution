package typings.flutterwaveNode.mod

import typings.flutterwaveNode.anon.Cardhash
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VirtualCardsTerminateResponse
  extends StObject
     with BaseResponse {
  
  var data: Cardhash
}
object VirtualCardsTerminateResponse {
  
  inline def apply(data: Cardhash, message: String, status: String): VirtualCardsTerminateResponse = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualCardsTerminateResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VirtualCardsTerminateResponse] (val x: Self) extends AnyVal {
    
    inline def setData(value: Cardhash): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
