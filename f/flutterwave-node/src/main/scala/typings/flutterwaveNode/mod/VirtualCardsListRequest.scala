package typings.flutterwaveNode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VirtualCardsListRequest extends StObject {
  
  var page: js.UndefOr[String] = js.undefined
}
object VirtualCardsListRequest {
  
  inline def apply(): VirtualCardsListRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VirtualCardsListRequest]
  }
  
  extension [Self <: VirtualCardsListRequest](x: Self) {
    
    inline def setPage(value: String): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
  }
}
