package typings.flutterwaveNode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransferListRequest extends StObject {
  
  var page: js.UndefOr[String] = js.undefined
  
  var status: js.UndefOr[String] = js.undefined
}
object TransferListRequest {
  
  inline def apply(): TransferListRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransferListRequest]
  }
  
  extension [Self <: TransferListRequest](x: Self) {
    
    inline def setPage(value: String): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
