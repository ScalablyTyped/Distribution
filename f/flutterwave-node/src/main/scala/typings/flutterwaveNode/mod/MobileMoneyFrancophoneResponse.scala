package typings.flutterwaveNode.mod

import typings.flutterwaveNode.anon.DataResponsecode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MobileMoneyFrancophoneResponse
  extends StObject
     with BaseResponse {
  
  var data: DataResponsecode
}
object MobileMoneyFrancophoneResponse {
  
  inline def apply(data: DataResponsecode, message: String, status: String): MobileMoneyFrancophoneResponse = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[MobileMoneyFrancophoneResponse]
  }
  
  extension [Self <: MobileMoneyFrancophoneResponse](x: Self) {
    
    inline def setData(value: DataResponsecode): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
