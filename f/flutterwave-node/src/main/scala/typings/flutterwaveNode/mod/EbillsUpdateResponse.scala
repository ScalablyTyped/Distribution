package typings.flutterwaveNode.mod

import typings.flutterwaveNode.anon.Updated
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EbillsUpdateResponse
  extends StObject
     with BaseResponse {
  
  var data: Updated
}
object EbillsUpdateResponse {
  
  inline def apply(data: Updated, message: String, status: String): EbillsUpdateResponse = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[EbillsUpdateResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EbillsUpdateResponse] (val x: Self) extends AnyVal {
    
    inline def setData(value: Updated): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
