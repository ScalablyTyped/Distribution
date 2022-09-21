package typings.flutterwaveNode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VirtualCardsWithrawResponse
  extends StObject
     with BaseResponse {
  
  var Reference: String
}
object VirtualCardsWithrawResponse {
  
  inline def apply(Reference: String, message: String, status: String): VirtualCardsWithrawResponse = {
    val __obj = js.Dynamic.literal(Reference = Reference.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualCardsWithrawResponse]
  }
  
  extension [Self <: VirtualCardsWithrawResponse](x: Self) {
    
    inline def setReference(value: String): Self = StObject.set(x, "Reference", value.asInstanceOf[js.Any])
  }
}
