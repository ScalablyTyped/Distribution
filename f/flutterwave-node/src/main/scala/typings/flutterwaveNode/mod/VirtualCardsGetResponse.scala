package typings.flutterwaveNode.mod

import typings.flutterwaveNode.anon.Bincheckname
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VirtualCardsGetResponse
  extends StObject
     with BaseResponse {
  
  var data: Bincheckname
}
object VirtualCardsGetResponse {
  
  inline def apply(data: Bincheckname, message: String, status: String): VirtualCardsGetResponse = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualCardsGetResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VirtualCardsGetResponse] (val x: Self) extends AnyVal {
    
    inline def setData(value: Bincheckname): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
