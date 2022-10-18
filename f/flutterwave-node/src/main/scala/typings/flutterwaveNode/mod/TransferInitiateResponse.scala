package typings.flutterwaveNode.mod

import typings.flutterwaveNode.anon.Bankname
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransferInitiateResponse
  extends StObject
     with BaseResponse {
  
  var data: Bankname
}
object TransferInitiateResponse {
  
  inline def apply(data: Bankname, message: String, status: String): TransferInitiateResponse = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransferInitiateResponse]
  }
  
  extension [Self <: TransferInitiateResponse](x: Self) {
    
    inline def setData(value: Bankname): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
