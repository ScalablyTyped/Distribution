package typings.flutterwaveNode.mod

import typings.flutterwaveNode.anon.Responsemessage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MobileMoneyFrancophoneResponse
  extends StObject
     with BaseResponse {
  
  var data: Responsemessage
}
object MobileMoneyFrancophoneResponse {
  
  inline def apply(data: Responsemessage, message: String, status: String): MobileMoneyFrancophoneResponse = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[MobileMoneyFrancophoneResponse]
  }
  
  extension [Self <: MobileMoneyFrancophoneResponse](x: Self) {
    
    inline def setData(value: Responsemessage): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
