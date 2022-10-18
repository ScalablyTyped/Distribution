package typings.flutterwaveNode.mod

import typings.flutterwaveNode.anon.PageinfoTransfers
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransferListResponse
  extends StObject
     with BaseResponse {
  
  var data: PageinfoTransfers
}
object TransferListResponse {
  
  inline def apply(data: PageinfoTransfers, message: String, status: String): TransferListResponse = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransferListResponse]
  }
  
  extension [Self <: TransferListResponse](x: Self) {
    
    inline def setData(value: PageinfoTransfers): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
