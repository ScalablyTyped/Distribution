package typings.flutterwaveNode.mod

import typings.flutterwaveNode.anon.Transfers
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransferListResponse
  extends StObject
     with BaseResponse {
  
  var data: Transfers
}
object TransferListResponse {
  
  inline def apply(data: Transfers, message: String, status: String): TransferListResponse = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransferListResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TransferListResponse] (val x: Self) extends AnyVal {
    
    inline def setData(value: Transfers): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
