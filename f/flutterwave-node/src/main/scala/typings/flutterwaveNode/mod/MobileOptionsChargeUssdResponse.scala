package typings.flutterwaveNode.mod

import typings.flutterwaveNode.anon.Responsemessage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MobileOptionsChargeUssdResponse
  extends StObject
     with BaseResponse {
  
  var data: Responsemessage
}
object MobileOptionsChargeUssdResponse {
  
  inline def apply(data: Responsemessage, message: String, status: String): MobileOptionsChargeUssdResponse = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[MobileOptionsChargeUssdResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MobileOptionsChargeUssdResponse] (val x: Self) extends AnyVal {
    
    inline def setData(value: Responsemessage): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
