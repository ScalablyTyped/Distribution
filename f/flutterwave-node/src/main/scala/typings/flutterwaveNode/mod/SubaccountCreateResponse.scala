package typings.flutterwaveNode.mod

import typings.flutterwaveNode.anon.Accountbank
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubaccountCreateResponse
  extends StObject
     with BaseResponse {
  
  var data: Accountbank
}
object SubaccountCreateResponse {
  
  inline def apply(data: Accountbank, message: String, status: String): SubaccountCreateResponse = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubaccountCreateResponse]
  }
  
  extension [Self <: SubaccountCreateResponse](x: Self) {
    
    inline def setData(value: Accountbank): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
