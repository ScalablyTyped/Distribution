package typings.flutterwaveNode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MiscGetBalHistRequest extends StObject {
  
  var currency: String
  
  var from: String
  
  var page: String
  
  var to: String
}
object MiscGetBalHistRequest {
  
  inline def apply(currency: String, from: String, page: String, to: String): MiscGetBalHistRequest = {
    val __obj = js.Dynamic.literal(currency = currency.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[MiscGetBalHistRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MiscGetBalHistRequest] (val x: Self) extends AnyVal {
    
    inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setPage(value: String): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
  }
}
