package typings.flutterwaveNode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VirtualCardsGetRequest extends StObject {
  
  var id: String
}
object VirtualCardsGetRequest {
  
  inline def apply(id: String): VirtualCardsGetRequest = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualCardsGetRequest]
  }
  
  extension [Self <: VirtualCardsGetRequest](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
