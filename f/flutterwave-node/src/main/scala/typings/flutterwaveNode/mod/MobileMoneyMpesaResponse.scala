package typings.flutterwaveNode.mod

import typings.flutterwaveNode.anon.AuthModelUsed
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MobileMoneyMpesaResponse
  extends StObject
     with BaseResponse {
  
  var data: AuthModelUsed
}
object MobileMoneyMpesaResponse {
  
  inline def apply(data: AuthModelUsed, message: String, status: String): MobileMoneyMpesaResponse = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[MobileMoneyMpesaResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MobileMoneyMpesaResponse] (val x: Self) extends AnyVal {
    
    inline def setData(value: AuthModelUsed): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
