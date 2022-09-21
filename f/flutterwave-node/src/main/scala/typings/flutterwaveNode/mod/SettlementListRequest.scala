package typings.flutterwaveNode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SettlementListRequest extends StObject {
  
  var from: js.UndefOr[String] = js.undefined
  
  var page: js.UndefOr[String] = js.undefined
  
  var subaccountid: js.UndefOr[String] = js.undefined
  
  var to: js.UndefOr[String] = js.undefined
}
object SettlementListRequest {
  
  inline def apply(): SettlementListRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SettlementListRequest]
  }
  
  extension [Self <: SettlementListRequest](x: Self) {
    
    inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    inline def setPage(value: String): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
    
    inline def setSubaccountid(value: String): Self = StObject.set(x, "subaccountid", value.asInstanceOf[js.Any])
    
    inline def setSubaccountidUndefined: Self = StObject.set(x, "subaccountid", js.undefined)
    
    inline def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
  }
}
