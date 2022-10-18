package typings.flutterwaveNode.mod

import typings.flutterwaveNode.anon.DataResponsecode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MobileOptionsChargeUssdResponse
  extends StObject
     with BaseResponse {
  
  var data: DataResponsecode
}
object MobileOptionsChargeUssdResponse {
  
  inline def apply(data: DataResponsecode, message: String, status: String): MobileOptionsChargeUssdResponse = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[MobileOptionsChargeUssdResponse]
  }
  
  extension [Self <: MobileOptionsChargeUssdResponse](x: Self) {
    
    inline def setData(value: DataResponsecode): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
