package typings.flutterwaveNode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VirtualCardsFetchTransactionsRequest extends StObject {
  
  var CardId: String
  
  var FromDate: String
  
  var PageIndex: String
  
  var PageSize: String
  
  var ToDate: String
}
object VirtualCardsFetchTransactionsRequest {
  
  inline def apply(CardId: String, FromDate: String, PageIndex: String, PageSize: String, ToDate: String): VirtualCardsFetchTransactionsRequest = {
    val __obj = js.Dynamic.literal(CardId = CardId.asInstanceOf[js.Any], FromDate = FromDate.asInstanceOf[js.Any], PageIndex = PageIndex.asInstanceOf[js.Any], PageSize = PageSize.asInstanceOf[js.Any], ToDate = ToDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualCardsFetchTransactionsRequest]
  }
  
  extension [Self <: VirtualCardsFetchTransactionsRequest](x: Self) {
    
    inline def setCardId(value: String): Self = StObject.set(x, "CardId", value.asInstanceOf[js.Any])
    
    inline def setFromDate(value: String): Self = StObject.set(x, "FromDate", value.asInstanceOf[js.Any])
    
    inline def setPageIndex(value: String): Self = StObject.set(x, "PageIndex", value.asInstanceOf[js.Any])
    
    inline def setPageSize(value: String): Self = StObject.set(x, "PageSize", value.asInstanceOf[js.Any])
    
    inline def setToDate(value: String): Self = StObject.set(x, "ToDate", value.asInstanceOf[js.Any])
  }
}
