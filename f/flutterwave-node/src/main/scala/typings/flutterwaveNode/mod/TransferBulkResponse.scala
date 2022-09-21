package typings.flutterwaveNode.mod

import typings.flutterwaveNode.anon.Approver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransferBulkResponse
  extends StObject
     with BaseResponse {
  
  var data: Approver
}
object TransferBulkResponse {
  
  inline def apply(data: Approver, message: String, status: String): TransferBulkResponse = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransferBulkResponse]
  }
  
  extension [Self <: TransferBulkResponse](x: Self) {
    
    inline def setData(value: Approver): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
