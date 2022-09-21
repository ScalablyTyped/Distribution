package typings.flutterwaveNode.mod

import typings.flutterwaveNode.anon.Appfee
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MobileMoneyZambiaResponse
  extends StObject
     with BaseResponse {
  
  var data: Appfee
}
object MobileMoneyZambiaResponse {
  
  inline def apply(data: Appfee, message: String, status: String): MobileMoneyZambiaResponse = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[MobileMoneyZambiaResponse]
  }
  
  extension [Self <: MobileMoneyZambiaResponse](x: Self) {
    
    inline def setData(value: Appfee): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
