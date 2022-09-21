package typings.flutterwaveNode.mod

import typings.flutterwaveNode.anon.Acctalias
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StatusRequeryResponse
  extends StObject
     with BaseResponse {
  
  var data: Acctalias
}
object StatusRequeryResponse {
  
  inline def apply(data: Acctalias, message: String, status: String): StatusRequeryResponse = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatusRequeryResponse]
  }
  
  extension [Self <: StatusRequeryResponse](x: Self) {
    
    inline def setData(value: Acctalias): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
