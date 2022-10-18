package typings.flutterwaveNode.mod

import typings.flutterwaveNode.anon.PageinfoCurrentpage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransferRetrieveStatusOfBulkResponse
  extends StObject
     with BaseResponse {
  
  var data: PageinfoCurrentpage
}
object TransferRetrieveStatusOfBulkResponse {
  
  inline def apply(data: PageinfoCurrentpage, message: String, status: String): TransferRetrieveStatusOfBulkResponse = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransferRetrieveStatusOfBulkResponse]
  }
  
  extension [Self <: TransferRetrieveStatusOfBulkResponse](x: Self) {
    
    inline def setData(value: PageinfoCurrentpage): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
