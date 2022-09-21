package typings.flutterwaveNode.mod

import typings.flutterwaveNode.anon.Address1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VirtualCardsCreateResponse
  extends StObject
     with BaseResponse {
  
  var data: Address1
}
object VirtualCardsCreateResponse {
  
  inline def apply(data: Address1, message: String, status: String): VirtualCardsCreateResponse = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualCardsCreateResponse]
  }
  
  extension [Self <: VirtualCardsCreateResponse](x: Self) {
    
    inline def setData(value: Address1): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
