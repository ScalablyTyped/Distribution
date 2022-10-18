package typings.flutterwaveNode.mod

import typings.flutterwaveNode.anon.Address2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VirtualCardsGetResponse
  extends StObject
     with BaseResponse {
  
  var data: Address2
}
object VirtualCardsGetResponse {
  
  inline def apply(data: Address2, message: String, status: String): VirtualCardsGetResponse = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualCardsGetResponse]
  }
  
  extension [Self <: VirtualCardsGetResponse](x: Self) {
    
    inline def setData(value: Address2): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
