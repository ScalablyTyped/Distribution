package typings.flutterwaveNode.mod

import typings.flutterwaveNode.anon.Accountnumber
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransferInitiateResponse
  extends StObject
     with BaseResponse {
  
  var data: Accountnumber
}
object TransferInitiateResponse {
  
  inline def apply(data: Accountnumber, message: String, status: String): TransferInitiateResponse = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransferInitiateResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TransferInitiateResponse] (val x: Self) extends AnyVal {
    
    inline def setData(value: Accountnumber): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
