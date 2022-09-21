package typings.flutterwaveNode.mod

import typings.flutterwaveNode.anon.Address2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VirtualCardsListResponse
  extends StObject
     with BaseResponse {
  
  var data: js.Array[Address2]
}
object VirtualCardsListResponse {
  
  inline def apply(data: js.Array[Address2], message: String, status: String): VirtualCardsListResponse = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualCardsListResponse]
  }
  
  extension [Self <: VirtualCardsListResponse](x: Self) {
    
    inline def setData(value: js.Array[Address2]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataVarargs(value: Address2*): Self = StObject.set(x, "data", js.Array(value*))
  }
}
