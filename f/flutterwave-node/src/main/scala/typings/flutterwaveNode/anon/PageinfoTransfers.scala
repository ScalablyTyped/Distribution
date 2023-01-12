package typings.flutterwaveNode.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PageinfoTransfers extends StObject {
  
  var page_info: Currentpage
  
  var transfers: js.Array[Bankcode]
}
object PageinfoTransfers {
  
  inline def apply(page_info: Currentpage, transfers: js.Array[Bankcode]): PageinfoTransfers = {
    val __obj = js.Dynamic.literal(page_info = page_info.asInstanceOf[js.Any], transfers = transfers.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageinfoTransfers]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PageinfoTransfers] (val x: Self) extends AnyVal {
    
    inline def setPage_info(value: Currentpage): Self = StObject.set(x, "page_info", value.asInstanceOf[js.Any])
    
    inline def setTransfers(value: js.Array[Bankcode]): Self = StObject.set(x, "transfers", value.asInstanceOf[js.Any])
    
    inline def setTransfersVarargs(value: Bankcode*): Self = StObject.set(x, "transfers", js.Array(value*))
  }
}
