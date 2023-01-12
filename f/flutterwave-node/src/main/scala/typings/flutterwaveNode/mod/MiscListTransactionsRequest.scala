package typings.flutterwaveNode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MiscListTransactionsRequest extends StObject {
  
  var from: js.UndefOr[String] = js.undefined
  
  var page: js.UndefOr[String] = js.undefined
  
  var seckey: js.UndefOr[String] = js.undefined
  
  var to: js.UndefOr[String] = js.undefined
}
object MiscListTransactionsRequest {
  
  inline def apply(): MiscListTransactionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MiscListTransactionsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MiscListTransactionsRequest] (val x: Self) extends AnyVal {
    
    inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    inline def setPage(value: String): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
    
    inline def setSeckey(value: String): Self = StObject.set(x, "seckey", value.asInstanceOf[js.Any])
    
    inline def setSeckeyUndefined: Self = StObject.set(x, "seckey", js.undefined)
    
    inline def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
  }
}
